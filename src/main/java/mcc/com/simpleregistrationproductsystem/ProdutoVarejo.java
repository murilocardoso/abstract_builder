package mcc.com.simpleregistrationproductsystem;

public class ProdutoVarejo extends Produto {

	ProdutoVarejo(Builder builder) {
		super(builder);
	}
	
	public static class Builder extends Produto.Builder<Builder> {

		@Override
		Produto build() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		Builder self() {
			return this;
		}
		
	}
}
