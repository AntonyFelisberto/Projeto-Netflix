/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package METODOS;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Antony
 */
public class EnviarEmail {
        public boolean enviarGmail(String email) {
        boolean retorno = false;
        //Get the session object  
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session s = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {

                        return new PasswordAuthentication("cinemaone764@gmail.com", "cinemaone80");//email e senha usuário que vai enviar a mensagem
                    }
                });

        //compose message  
        try {
            MimeMessage message = new MimeMessage(s);
            message.setFrom(new InternetAddress("cinemaone764@gmail.com"/*QUEM ENVIA A MENSAGEM*/));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(email/*DESTINATARIO DO EMAIL: PODE COLOCAR QUALQUER EMAIL QUE ELE VAI ENVIAR, POREM É POSSIVEL QUE ESTEJA NA CAIXA DE SPAM*/));

            message.setSubject("BEM VINDO");
            message.setContent("BEM VINDO", "text/html; charset=utf-8");

            //send message  
            Transport.send(message);

            retorno = true;

        } catch (MessagingException e) {
            retorno = false;
            e.printStackTrace();
        }
        return retorno;
    }
}
