package com.codigorupestre.service.impl;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codigorupestre.model.Transfer;
import com.codigorupestre.service.TransferService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TransferServiceImpl implements TransferService {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Override
	public void sendTransfer(Transfer transfer) {
		
		rabbitTemplate.convertAndSend("x.transfers.oxxo", null, transfer);
		
		log.info("Transferencia enviada {} ", transfer);
	}

}
