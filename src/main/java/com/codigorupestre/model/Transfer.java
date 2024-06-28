package com.codigorupestre.model;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class Transfer implements Serializable {
	
	private static final long serialVersionUID = 4414677168780328292L;
	
	private String serviceOrigin;
	private String 	cardNumber;
	private String bank;
	private BigDecimal amount;

}
