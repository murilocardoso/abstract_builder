package mcc.com.simpleregistrationproductsystem;

import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Include;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public abstract class Contagem {
	
	@Include
	private final String id;
	private final String conferencia;
	private final String produto;
	private final Integer quantidade;
	private final String endereco;
	
	protected Contagem(Builder<?> builder) {
		this.id = builder.id;
		this.conferencia = builder.conferencia;
		this.produto = builder.produto;
		this.quantidade = builder.quantidade;
		this.endereco = builder.endereco;
	}
	
    @ToString
	abstract static class Builder<T extends Builder<T>> {

		private String id;
		private String conferencia;
		private String produto;
		private Integer quantidade;
		private String endereco;
		
		protected Builder() {};
		
		public T id(String id) {
			this.id = id;
			return self();
		}
		
		public T conferencia(String conferencia) {
			this.conferencia = conferencia;
			return self();
		}
		
		public T produto(String produto) {
			this.produto = produto;
			return self();
		}
		
		public T quantidade(Integer quantidade) {
			this.quantidade = quantidade;
			return self();
		}
		
		public T endereco(String endereco) {
			this.endereco = endereco;
			return self();
		}
		
		abstract Contagem build();
		
		abstract T self();
	}
    
    @ToString
	abstract static class BuilderReabertura<T extends Builder<T>> {

		private Contagem contagem;

		protected BuilderReabertura() {};
		
		public T contagemReabrindo(Contagem contagem) {
			this.contagem = contagem;
			return self();
		}
		
		protected Contagem build() {
			// if contagem something
			return this.contagem;
		};
		
		abstract T self();
	}
	
	public String id() {
		return id;
	}
	
	public String conferencia() {
		return conferencia;
	}
	
	public String produto() {
		return produto;
	}
	
	public Integer quantidade() {
		return quantidade;
	}
	
	public String endereco() {
		return endereco;
	}
}
