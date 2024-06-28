package com.codigorupestre.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codigorupestre.model.Transfer;
import com.codigorupestre.service.TransferService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/transfer")
public class TransferAPI {
	
	@Autowired
	private TransferService service;
	
	@PostMapping
	public ResponseEntity<?> createTransfer(@RequestBody Transfer transfer){
		log.info("Enviado transferencia {} ", transfer);
		
		service.sendTransfer(transfer);
		
		return new ResponseEntity<>("Transferencia enviada", HttpStatus.OK);
	}

}
