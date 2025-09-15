package com.ismd.avaliacao.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String Remetente;

    public String sendEmail(String Destinatario, String Assunto, String Mensagem){


        try{
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

            simpleMailMessage.setFrom(Remetente);
            simpleMailMessage.setTo(Destinatario);
            simpleMailMessage.setSubject(Assunto);
            simpleMailMessage.setText(Mensagem);

            javaMailSender.send(simpleMailMessage);
            return "Email enviado com sucess0";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
