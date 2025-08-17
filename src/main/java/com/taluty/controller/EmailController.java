package com.taluty.controller;

import com.taluty.service.EmailService;
import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@RestController
@RequestMapping("/api/email")
@RequiredArgsConstructor
public class EmailController {

    private final EmailService emailService;

    @PostMapping("/enviar")
    public ResponseEntity<String> enviarHtml(
            @RequestParam("to") String to,
            @RequestParam("subject") String subject,
            @RequestParam("htmlFile") MultipartFile htmlFile) {

        try {
            // Leer el contenido del archivo como String
            String htmlContent = new String(htmlFile.getBytes(), StandardCharsets.UTF_8);
            emailService.enviarCorreoHtml(to, subject, htmlContent);
            return ResponseEntity.ok("¡Correo enviado con éxito!");
        } catch (IOException | MessagingException e) {
            return ResponseEntity.status(500).body("Error al enviar el correo: " + e.getMessage());
        }
    }
}
