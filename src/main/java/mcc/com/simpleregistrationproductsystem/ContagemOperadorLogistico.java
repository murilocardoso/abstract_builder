package mcc.com.simpleregistrationproductsystem;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
public class ContagemOperadorLogistico extends Contagem {
	
	private String depositante;
	
	private ContagemOperadorLogistico(Builder builder) {
		super(builder);
		this.depositante = builder.depositante;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder extends Contagem.Builder<Builder> {
		
		private String depositante;

		private Builder() { };
		
		public Builder depositante(String depositante) {
			this.depositante = depositante;
			return this;
		}
		
		@Override
		public ContagemOperadorLogistico build() {
			return new ContagemOperadorLogistico(this);
		}

		@Override
		protected Builder self() {
			return this;
		}
	}
	
	public String depositante() {
		return this.depositante;
	}
}
