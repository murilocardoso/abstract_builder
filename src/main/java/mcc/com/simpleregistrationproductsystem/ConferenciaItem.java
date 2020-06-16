package mcc.com.simpleregistrationproductsystem;

import java.math.BigDecimal;
import java.util.UUID;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class ConferenciaItem {
	private final String id;
	private final String produto;
	private final BigDecimal quantidadeDeclarada;
	
	public ConferenciaItem(String id, String produto, BigDecimal quantidadeDeclarada) {
		super();
		this.id = id;
		this.produto = produto;
		this.quantidadeDeclarada = quantidadeDeclarada;
	}
	
	public ConferenciaItem of(String produto, BigDecimal quantidadeDeclarada) {
		return new ConferenciaItem(UUID.randomUUID().toString(), produto, quantidadeDeclarada);
	}
	
	public String id() {
		return id;
	}
	public String produto() {
		return produto;
	}
	public BigDecimal quantidadeDeclarada() {
		return quantidadeDeclarada;
	}
	
	
}
