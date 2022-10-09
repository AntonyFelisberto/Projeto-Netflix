package telas;

import dao.Inserir;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Dados;

public class EnviarImagem extends javax.swing.JFrame {

    BufferedImage imagem;//,img;
    File caminhoVideo;
    byte[] videoBytes,audioBytes,img;
    public EnviarImagem() {
        initComponents();
    }
           
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnImagem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblImagem = new javax.swing.JLabel();
        blnEnviar = new javax.swing.JButton();
        comentarios = new javax.swing.JTextField();
        titulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tipo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnImagem1 = new javax.swing.JButton();
        classificacao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoEstilizado = new javax.swing.JTextArea();
        idImagem = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnImagem2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        comentario = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnImagem.setText("Selecionar Imagem");
        btnImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagemActionPerformed(evt);
            }
        });

        jLabel1.setText("Imagem");

        blnEnviar.setText("Enviar");
        blnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blnEnviarActionPerformed(evt);
            }
        });

        jLabel2.setText("comentario");

        jLabel3.setText("titulo");

        jLabel4.setText("tipo filme");

        btnImagem1.setText("Selecionar video");
        btnImagem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagem1ActionPerformed(evt);
            }
        });

        jLabel5.setText("idade min");

        jLabel6.setText("video estilizado (CASO NÃO TENHA COMO BAIXAR O VIDEO OU ELE SEJA PESADO) ");

        campoEstilizado.setColumns(20);
        campoEstilizado.setRows(5);
        jScrollPane1.setViewportView(campoEstilizado);

        idImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idImagemActionPerformed(evt);
            }
        });

        jLabel7.setText("estilizado");

        jLabel8.setText("id imagem foreign (verificar aviso)");

        btnImagem2.setText("Selecionar audio");
        btnImagem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagem2ActionPerformed(evt);
            }
        });

        jLabel9.setText("comentario audio");

        comentario.setColumns(20);
        comentario.setRows(5);
        jScrollPane2.setViewportView(comentario);

        jLabel10.setText("tipos de filme:M-maiores F-filme A-anime D-desenho P-aulas | comentario: comentario sobre o filme | idade:minimo de idade que precisa ter| id imagem: com que imagem tem conexao (colocar numero) | estilizado: filme que pegou de outro site ou drive ");

        jLabel11.setText("CASO A IMAGEM NÃO FOR SELECIONADA ELE NÃO VAI INSERIR NENHUM DADO NA TABELA DELA (ISSO SERVE PARA FAZER A FOREIGN KEY DE SERIES E TEMPORADAS DOS ANIMES), CASO DEIXE SEM IMAGEM INSIRA A FOREIGN KEY PARA CONECTAR OS VIDEOS");

        jLabel12.setText("video");

        jLabel13.setText("audio");

        jLabel14.setText("QUANDO FOR UTILIZAR VIDEOS ESTILIZADOS VOCE TEM QUE IR NO DRIVE OU YOUTUBE PEGAR O LINK DE INCORPORAÇÃO E COPIAR APENAS O QUE ESTA DENTRO DO SET EX:<iframe src=\"https://www.youtube.com/embed/z0L37D7-wfk\" COPIE SÓ src=\"....\"");

        jLabel15.setText("QUANDO FOR UTILIZAR A QUESTÃO DAS IMAGENS POR FOREIGN  KEY NÃO COLOQUE A IMAGEN, A APLICAÇÃO VAI SETALA COMO NULL  .");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(lblImagem))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(comentarios, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                            .addComponent(tipo)
                                            .addComponent(classificacao)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(98, 98, 98)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(btnImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(jLabel1)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(241, 241, 241)
                                        .addComponent(btnImagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(168, 168, 168)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(275, 275, 275)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(322, 322, 322)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(203, 203, 203)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(idImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(blnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(328, 328, 328)
                                        .addComponent(jLabel12)))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(btnImagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(113, 113, 113)
                                        .addComponent(jLabel9))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(136, 136, 136)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 1396, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(7, 7, 7)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnImagem1)
                            .addComponent(btnImagem))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(lblImagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comentarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btnImagem2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(blnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagemActionPerformed
//        MODO ANTIGO DE ARMAZENAR IMAGEM 
//        JFileChooser selecionarImagem = new JFileChooser();     //instanciando o selecionador
//        int res = selecionarImagem.showOpenDialog(null);        //abrindo seleção
//
//        if (res == JFileChooser.APPROVE_OPTION) {               //se opção correta
//            File arquivo = selecionarImagem.getSelectedFile();  //pega arquivo
//            File caminhoImagem = new File(arquivo.getAbsolutePath());   //pega o caminho da imagem e armazena
//            try {
//                img = ImageIO.read(caminhoImagem); //le o arquivo da imagem
//                Integer largura = img.getWidth();                               //pega a largura
//                Integer altura = img.getHeight();                               //pega a altura
//                imagem = ManipularImagem.setImagemDimensao(arquivo.getAbsolutePath(), 250, 400); //envia pro metodo que vai definir tamanho da imagem (define o tamanho que vai ser a imagem armazenada no banco),//essa imagem aparece na tela
//                lblImagem.setIcon(new ImageIcon(imagem));                   //cria um Icon e mostra a imagem
//            } catch (IOException ex) {
//                Logger.getLogger(EnviarImagem.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Voce nao selecionou nenhum arquivo.");
//        }
        
        
        
        JFileChooser selecionarImagem = new JFileChooser();     //instanciando o selecionador
        int res = selecionarImagem.showOpenDialog(null);        //abrindo seleção
        if (res == JFileChooser.APPROVE_OPTION) {               //se opção correta
            File arquivo = selecionarImagem.getSelectedFile();  //pega arquivo
            File caminhoImagem = new File(arquivo.getAbsolutePath());   //pega o caminho do audio e armazena  
            String  caminhoDoArquivoSelecionado=caminhoImagem.toString();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
          try {
                FileInputStream fis = new FileInputStream(new File(caminhoDoArquivoSelecionado));
                byte[] buf = new byte[100000000];
                //caso o primeiro buf não funcione utilize este pois ele gera menos memoria, porem a resolução pode ficar pior
//              byte[] buf = new byte[1024];
                int n;
                while (-1 != (n = fis.read(buf))){
                    baos.write(buf, 0, n);
                }
                img = baos.toByteArray();
                 JOptionPane.showMessageDialog(rootPane, img);
            }catch (FileNotFoundException ex) {
                Logger.getLogger(EnviarImagem.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "imagem não armazenado");
            }catch (IOException ex) {
                Logger.getLogger(EnviarImagem.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "imagem não armazenado");
            }
        }
    }//GEN-LAST:event_btnImagemActionPerformed




    private void blnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blnEnviarActionPerformed
         try {
             Dados pegarDados = new Dados();
             Inserir inserirDados = new Inserir();
             
             
             //imagem - modo antigo
//           pegarDados.setImagem(Bytes.getImgBytes(imagem));         //converte a imagem em bytes e armazena na variavel, lembrando o tamnho da imagem vai ser o mesmo que foi definido na linha 128
             
            //imagem - modo novo
             pegarDados.setImagem(img);              
             
             if(titulo.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Digite um titulo para a imagem/videos"); 
                 throw new RuntimeException("Digite um titulo para o imagem/videos");
             }else{
                pegarDados.setTitulo(titulo.getText());
             }
             
             pegarDados.setComentario(comentarios.getText());
             
             if(tipo.getText().isEmpty()){
                 JOptionPane.showMessageDialog(rootPane, "coloque o tipo para continuar");
                 throw new RuntimeException("coloque o tipo para continuar");
             }else{
                 pegarDados.setTipo(tipo.getText());
             }
             
             if(classificacao.getText().isEmpty()){
                 JOptionPane.showMessageDialog(rootPane, "coloque 0 ou maior na classificação indicativa para continuar");
                 throw new RuntimeException("coloque 0 ou maior na classificação indicativa para continuar");
             }else{
                 pegarDados.setClassificacao(Integer.parseInt(classificacao.getText()));
             }
             
             
             //video
             if(titulo.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Digite um titulo para o imagem/videos"); 
                 throw new RuntimeException("Digite um titulo para o imagem/videos");
             }else{
                pegarDados.setTituloVideo(titulo.getText());
             }
             
             pegarDados.setVideos(videoBytes);
             
             if(img==null && idImagem.getText().isEmpty()){
                  JOptionPane.showMessageDialog(rootPane, "ERRO INSIRA PELO MENOS A IMAGEM (PRA UM NOVO FILME OU SERIE)\n OU A ID IMAGEM FOREIGN KEY(PRA COLOCAR O FILME EM UMA IMAGEM QUE JA EXISTE)");
                  throw new RuntimeException("ERRO INSIRA PELO MENOS A IMAGEM (PRA UM NOVO FILME OU SERIE)\n OU A ID IMAGEM FOREIGN KEY(PRA COLOCAR O FILME EM UMA IMAGEM QUE JA EXISTE)");
             }else if(idImagem.getText().isEmpty()){
                  pegarDados.setIdImagemVideo(0);
             }else{
                 pegarDados.setIdImagemVideo(Integer.parseInt(idImagem.getText()));
             }
             
             pegarDados.setUrl(campoEstilizado.getText());
             
             //audio
             pegarDados.setcomentarioDoAudio(comentario.getText());
             pegarDados.setAudio(audioBytes);
             
             Boolean armazenado = inserirDados.inserir(pegarDados);  //armazena no banco
             if(armazenado){
                 JOptionPane.showMessageDialog(rootPane, "dados armazenados com sucesso");
                 img=null;
                 videoBytes=null;
                 campoEstilizado.setText("");
             }
             else{
                JOptionPane.showMessageDialog(rootPane, "dados não armazenados");
             }   
         } catch (HeadlessException ex) {
             Logger.getLogger(EnviarImagem.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_blnEnviarActionPerformed

    private void btnImagem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagem1ActionPerformed
        //ATENÇÃO PARA ARMAZENAR UM VIDEO MUITO GRANDE COMO DE UM GIGA É EXIGIDA MEMÓRIA NO COMPUTADOR SENÃO ACONTECERA O ERRO java.lang.OutOfMemoryError: Java heap space, ISSO PODE SER UM ERRO DA MAQUINA E NAO CODIGO // existem videos que mostram como corrigi lo eis um : https://www.youtube.com/watch?v=vmI8rdV9EOo
        JFileChooser selecionarVideo = new JFileChooser();     //instanciando o selecionador
        int res = selecionarVideo.showOpenDialog(null);        //abrindo seleção
        if (res == JFileChooser.APPROVE_OPTION) {               //se opção correta
            File arquivo = selecionarVideo.getSelectedFile();  //pega arquivo
            File caminhoImagem = new File(arquivo.getAbsolutePath());   //pega o caminho do video e armazena  
            String  caminhoDoArquivoSelecionado=caminhoImagem.toString();
          ByteArrayOutputStream baos = new ByteArrayOutputStream();
          try {
                FileInputStream fis = new FileInputStream(new File(caminhoDoArquivoSelecionado));
                byte[] buf = new byte[100000000];
                //caso o primeiro buf não funcione utilize este pois ele gera menos memoria, porem a resolução pode ficar pior
//              byte[] buf = new byte[1024];
                int n;
                while (-1 != (n = fis.read(buf))){
                    baos.write(buf, 0, n);
                }
                videoBytes = baos.toByteArray();
                JOptionPane.showMessageDialog(rootPane, videoBytes);
            }catch (FileNotFoundException ex) {
                Logger.getLogger(EnviarImagem.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "video não armazenado");
            }catch (IOException ex) {
                Logger.getLogger(EnviarImagem.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "video não armazenado");
            }
        }
    }//GEN-LAST:event_btnImagem1ActionPerformed

    private void idImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idImagemActionPerformed
       
    }//GEN-LAST:event_idImagemActionPerformed

    private void btnImagem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagem2ActionPerformed
        //ATENÇÃO PARA ARMAZENAR UM AUDIO MUITO GRANDE COMO DE UM GIGA É EXIGIDA MEMÓRIA NO COMPUTADOR SENÃO ACONTECERA O ERRO java.lang.OutOfMemoryError: Java heap space, ISSO PODE SER UM ERRO DA MAQUINA E NAO CODIGO
        JFileChooser selecionarAudio = new JFileChooser();     //instanciando o selecionador
        int res = selecionarAudio.showOpenDialog(null);        //abrindo seleção
        if (res == JFileChooser.APPROVE_OPTION) {               //se opção correta
            File arquivo = selecionarAudio.getSelectedFile();  //pega arquivo
            File caminhoImagem = new File(arquivo.getAbsolutePath());   //pega o caminho do audio e armazena  
            String  caminhoDoArquivoSelecionado=caminhoImagem.toString();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
          try {
                FileInputStream fis = new FileInputStream(new File(caminhoDoArquivoSelecionado));
                byte[] buf = new byte[100000000];
                //caso o primeiro buf não funcione utilize este pois ele gera menos memoria, porem a resolução pode ficar pior
//              byte[] buf = new byte[1024];
                int n;
                while (-1 != (n = fis.read(buf))){
                    baos.write(buf, 0, n);
                }
                audioBytes = baos.toByteArray();
                 JOptionPane.showMessageDialog(rootPane, audioBytes);
            }catch (FileNotFoundException ex) {
                Logger.getLogger(EnviarImagem.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "audio não armazenado");
            }catch (IOException ex) {
                Logger.getLogger(EnviarImagem.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "audio não armazenado");
            }
        }
    }//GEN-LAST:event_btnImagem2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blnEnviar;
    private javax.swing.JButton btnImagem;
    private javax.swing.JButton btnImagem1;
    private javax.swing.JButton btnImagem2;
    private javax.swing.JTextArea campoEstilizado;
    private javax.swing.JTextField classificacao;
    private javax.swing.JTextArea comentario;
    private javax.swing.JTextField comentarios;
    private javax.swing.JTextField idImagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JTextField tipo;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}
