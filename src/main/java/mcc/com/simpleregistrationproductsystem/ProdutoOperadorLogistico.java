package mcc.com.simpleregistrationproductsystem;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ProdutoOperadorLogistico extends Produto {
	private final String depositante;
	
	public ProdutoOperadorLogistico(Builder builder) {
		super(builder);
		this.depositante = builder.depositante;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder extends Produto.Builder<Builder> {
		
		private String depositante;
		
		private Builder() { };
		
		public Builder depositante(String depositante) {
			this.depositante = depositante;
			return this;
		}
		
		@Override
		public Produto build() {
			return new ProdutoOperadorLogistico(this);
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
