package DAO;

import METODOS.Inserts;
import METODOS.Sql;
import MODEL.Registro;
import java.sql.Connection;
import MODEL.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Calendar;
import METODOS.EnviarEmail;

public class Inserir {
    private Connection conectarAoBanco;
    private PreparedStatement realizarEstatusSql;
    private Statement realizarEstatusSqlConcatenado;
    private ResultSet verificarQuery;
    public Inserir(){
        conectarAoBanco=new Conexao().conectar();
    }
    public boolean inserirNoBanco(Usuario user){
        String data;
        Integer anoAtual,anoDeNascimento,mes,dia;
        Calendar c = Calendar.getInstance();
        
        anoAtual=c.get(Calendar.YEAR);
        mes=c.get(Calendar.MONTH);
        dia=c.get(Calendar.DAY_OF_MONTH);
        
        anoDeNascimento=anoAtual-user.getIdade(); 
        data=String.format("%d-%d-%d", anoDeNascimento,mes,dia);
//         SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
//            Date date1 = dateFormat.parse("2019-09-16");
//            Date date2 = dateFormat.parse("2020-01-25");
//            System.out.println("Date-1: " + 
//                               dateFormat.format(date1));
//            System.out.println("Date-2: " +
//                               dateFormat.format(date2));
//            if(date1.before(date2)){
//                System.out.println(
//                    "Date-1 is before Date-2");
//            } 
        try{
          Sql query=Sql.SELECT;
          String verificarDadosDeCadastro=String.format(query.getCodigo(),user.getCpf());
          realizarEstatusSqlConcatenado=conectarAoBanco.createStatement();
          verificarQuery=realizarEstatusSqlConcatenado.executeQuery(verificarDadosDeCadastro);
          if(verificarQuery.next()){
              return false;
          }else{
            Inserts inserirDados=Inserts.INSERT;
            String sql=inserirDados.getInserirUsuario();
            realizarEstatusSql=conectarAoBanco.prepareStatement(sql);
            realizarEstatusSql.setString(1,user.getUser());
            realizarEstatusSql.setString(2,user.getSenha());
            realizarEstatusSql.setString(3,user.getCpf());
            realizarEstatusSql.setString(4,user.getEmail());
            realizarEstatusSql.setString(5,user.getTelefone());
            realizarEstatusSql.setString(6,data);
            Registro.setIdade(user.getIdade());
            realizarEstatusSql.execute();
            realizarEstatusSql.close();
            new EnviarEmail().enviarGmail(user.getEmail());
            return true;
          }
        }catch(SQLException erro){
            throw new RuntimeException("erro ao inserir dados",erro);
        }
    }
}
