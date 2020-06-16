package mcc.com.simpleregistrationproductsystem;

import java.util.UUID;

public class ConferenciaOperadorLogistico extends Conferencia {
	
	private String depositante;
	
	private ConferenciaOperadorLogistico(Builder builder) {
		super(builder);
		this.depositante = builder.depositante;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder extends Conferencia.Builder<Builder> {
		
		private String depositante;
		
		private Builder() { };
		
		public Builder depositante(String depositante) {
			this.depositante = depositante;
			return this;
		}
		
		@Override
		public ConferenciaOperadorLogistico build() {
			return new ConferenciaOperadorLogistico(this);
		}

		@Override
		protected Builder self() {
			return this;
		}
	}
	
	public String depositante() {
		return this.depositante;
	}

	@Override
	protected Contagem buildContagemSegmento(String produto, Integer quantidade, String endereco) {
		return ContagemOperadorLogistico.builder()
                                        .id(UUID.randomUUID().toString())
                                        .depositante(this.depositante())
						                .conferencia(this.id())
						                .produto(produto)
						                .quantidade(quantidade)
						                .endereco(endereco)
						                .build();
	}

}
