package mcc.com.simpleregistrationproductsystem;

import java.util.UUID;

public class ConferenciaIndustria extends Conferencia {
	
	private ConferenciaIndustria(Builder builder) {
		super(builder);
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder extends Conferencia.Builder<Builder> {
		
		private Builder() { };
		
		@Override
		public ConferenciaIndustria build() {
			return new ConferenciaIndustria(this);
		}

		@Override
		protected Builder self() {
			return this;
		}
	}
	
	@Override
	protected Contagem buildContagemSegmento(String produto, Integer quantidade, String endereco) {
		return ContagemIndustria.builder()
				                .id(UUID.randomUUID().toString())
				                .conferencia(this.id())
				                .produto(produto)
				                .quantidade(quantidade)
				                .endereco(endereco)
				                .build();
	}
}
