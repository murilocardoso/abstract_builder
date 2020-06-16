package mcc.com.simpleregistrationproductsystem;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ProdutoIndustria extends Produto {
	
	public ProdutoIndustria(Builder builder) {
		super(builder);
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder extends Produto.Builder<Builder> {
		
		private Builder() { };
		
		@Override
		public Produto build() {
			return new ProdutoIndustria(this);
		}

		@Override
		protected Builder self() {
			return this;
		}
	}
}
