package mcc.com.simpleregistrationproductsystem;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.EqualsAndHashCode.Include;

@Data
@EqualsAndHashCode
public abstract class Produto {
	
	@Include
	private final String id;
	private final String nome;
	
	Produto(Builder<?> builder) {
		this.id = builder.id;
		this.nome = builder.nome;
	}

    @ToString
	abstract static class Builder<T extends Builder<T>> {
		
		private String id;
		private String nome;
		
		protected Builder() {};
		
		public T id(String id) {
			this.id = id;
			return self();
		}
		
		public T nome(String nome) {
			this.nome = nome;
			return self();
		}
		
		abstract Produto build();
		
		abstract T self();
	}
}
