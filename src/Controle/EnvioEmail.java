package Controle;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Authenticator;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;


/**
 * @author Fabiano
 */
public class EnvioEmail {

    String MensagemGmail;
    String Assunto;
    String emailEmitente;
    String senhaEmailEmitente;
    String emailDestinatario;
    static Session sessao;
    
      
    public String getEmailEmitente() {
        return emailEmitente;
    }

    public void setEmailEmitente(String emailEmitente) {
        this.emailEmitente = emailEmitente;
    }

    public String getSenhaEmailEmitente() {
        return senhaEmailEmitente;
    }

    public void setSenhaEmailEmitente(String senhaEmailEmitente) {
        this.senhaEmailEmitente = senhaEmailEmitente;
    }

    public String getEmailDestinatario() {
        return emailDestinatario;
    }

    public void setEmailDestinatario(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }
    
    public String getMensagemGmail() {
    return MensagemGmail;
    }

      public void setMensagemGmail(String MensagemGmail) {
        this.MensagemGmail = MensagemGmail;
    }
    
    public String getAssunto() {
        return Assunto;
    }

    public EnvioEmail() {
    }

    public void setAssunto(String Assunto) {
        this.Assunto = Assunto;
    }

  
    
    
    /* Contexto com Variaveis fixas para Teste de Classe
      String emailEmitente = "fabiano.fesilva@gmail.com";
      String senhaEmailEmitente = "vanessalindona";
      String emailDestinatario = "vanessa.silvaliveira@gmail.com";
      String MensagemGmail = " Testando o envio de mensagens pelo aplicativo criado por Fabiano Ferreira da Silva em 27/12/2020!";
    */

    
      
      //Importando as Classes para o envio do email
      
      public void envioEmailGMAIL(){
          
      /*
          Fonte de Pesquisa:
          https://www.botecodigital.dev.br/java/enviando-e-mail-em-java-com-api-commons-email-da-apache/
          http://commons.apache.org/proper/commons-email/userguide.html
          https://www.devmedia.com.br/utilizando-a-api-commons-email-para-enviar-e-mails/3306
          
        oBJETO.setHostName( "smtp.gmail.com" );
        oBJETO.setSslSmtpPort( "465" );
        oBJETO.setStartTLSRequired(true);
        oBJETO.setSSLOnConnect(true);
          */
      //Serviço que ira Gerenciar o envio
      SimpleEmail servicoemail = new SimpleEmail();
      servicoemail.setSSLOnConnect(true);
      servicoemail.setHostName("smtp.gmail.com");
      servicoemail.setSmtpPort(465);
      servicoemail.setAuthenticator(new DefaultAuthenticator(getEmailEmitente(),getSenhaEmailEmitente()));
      servicoemail.setSSLOnConnect(true);
      
      try{
        servicoemail.setFrom(getEmailEmitente());
        servicoemail.setSubject(getAssunto());
        servicoemail.setMsg(getMensagemGmail());
        servicoemail.addTo(getEmailDestinatario());
        //Comando para gravar DEBUG no Prompt
        servicoemail.setDebug(true); 
        
        //Comando para envio
        servicoemail.send();
        System.out.println("Email Enviado com Sucesso");

        } catch(Exception e){
        e.printStackTrace();
        // Caso retorne algum erro ele estoura a exception no prompt de comando
        }
      
      }

 
        public void envioEmailOUTLOOK(){

         /* servicoemail.setFrom(getEmailDestinatario());
        servicoemail.setSubject(getAssunto());
        servicoemail.setMsg(MensagemGmail);
        servicoemail.addTo(emailDestinatario);
        servicoemail.send();
         https://www.guj.com.br/t/envio-email-javamail-hotmail-resolvido/88153/2
         https://www.youtube.com/watch?v=a_ep8rLusdU
         */

             /** Parâmetros de conexão com servidor Hotmail */  
            
    
    Properties propiedades = new Properties();              
    propiedades.put("mail.transport.protocol", "smtp");  
    propiedades.put("mail.smtp.host", "smtp.office365.com");  
    propiedades.put("mail.smtp.socketFactory.port", "587");  
    propiedades.put("mail.smtp.socketFactory.fallback", "false");  
    propiedades.put("mail.smtp.starttls.enable", "true");  
    propiedades.put("mail.smtp.auth", "true");  
    propiedades.put("mail.smtp.port", "587");  

    
   sessao = Session.getDefaultInstance(propiedades,
        new Authenticator() {  
            protected PasswordAuthentication getPasswordAuthentication()   
                {  
                    return new PasswordAuthentication(getEmailEmitente(), getSenhaEmailEmitente());  
                }  
            });  

    /** Ativa Debug para sessão */  
    sessao.setDebug(true);  
   enviaHotmail();
           }
    
   public void enviaHotmail(){ 
       
         	try {  
        Message menssagem = new MimeMessage(sessao);  
        menssagem.setFrom(new InternetAddress(getEmailEmitente())); //Remetente  
        menssagem.setRecipients(Message.RecipientType.TO,   
                          InternetAddress.parse(getEmailDestinatario())); //Destinatário(s)  
        menssagem.setSubject(getAssunto());//Assunto  
        menssagem.setText(getMensagemGmail());  
        /**Método para enviar a mensagem criada*/  
        Transport.send(menssagem);


   } catch (MessagingException e) {  
        throw new RuntimeException(e);  
  }  
         
     }  
        
        public void envioAnexo(){
            
        }
        
    }   
     
     




      
      
      
      
             
      

