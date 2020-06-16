package mcc.com.simpleregistrationproductsystem;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
public class ContagemIndustria extends Contagem {
	
	private ContagemIndustria(Builder builder) {
		super(builder);
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder extends Contagem.Builder<Builder> {
		
		private Builder() { };
		
		@Override
		public ContagemIndustria build() {
			return new ContagemIndustria(this);
		}

		@Override
		protected Builder self() {
			return this;
		}
	}
}
