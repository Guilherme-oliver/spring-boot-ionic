package com.guilhermeoliveira.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.guilhermeoliveira.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
