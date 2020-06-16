package mcc.com.simpleregistrationproductsystem;

import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Include;
import lombok.ToString;

@EqualsAndHashCode
public abstract class Conferencia {
	
	@Include
	private String id;
	private String descricao;
	private String depositante;
	private String unidade;
	private SituacaoConferencia situacao;
	private List<ConferenciaItem> itens;
	
	protected Conferencia(Builder<?> builder) {
		this.id = builder.id;
		this.descricao = builder.descricao;
		this.depositante = builder.depositante;
		this.unidade = builder.unidade;
		this.itens = builder.itens;
		this.situacao = SituacaoConferencia.NAO_INICIADA;
	}
	
	public void iniciar() {
		if (!this.situacao.equals(SituacaoConferencia.NAO_INICIADA))
			throw new IllegalStateException();
		
		this.situacao = SituacaoConferencia.INICIADA;
	}
	
	public final Contagem contarProduto(String produto, Integer quantidade, String endereco) {
		if (!this.situacao.equals(SituacaoConferencia.INICIADA))
			throw new IllegalStateException();
		
		var contagem = 	buildContagemSegmento(produto, quantidade, endereco);
		
		return contagem;
	}
	
	protected abstract Contagem buildContagemSegmento(String produto, Integer quantidade, String endereco);
	
	public final Contagem reabrirContagme(String produto, Integer quantidade, String endereco) {
		if (!this.situacao.equals(SituacaoConferencia.INICIADA))
			throw new IllegalStateException();
		
		var contagem = 	buildContagemSegmento(produto, quantidade, endereco);
		
		return contagem;
	}
	
	protected abstract Contagem buildContagemSegmento(String produto, Integer quantidade, String endereco);
		
    @ToString
	abstract static class Builder<T extends Builder<T>> {

		private String id;
		private String descricao;
		private String depositante;
		private String unidade;
		private List<ConferenciaItem> itens = new ArrayList<>();
		
		protected Builder() {};
		
		public T id(String id) {
			this.id = id;
			return self();
		}
		
		public T descricao(String descricao) {
			this.descricao = descricao;
			return self();
		}
		
		public T depositante(String depositante) {
			this.depositante = depositante;
			return self();
		}
		
		public T unidade(String unidade) {
			this.unidade = unidade;
			return self();
		}
		
		public T item(ConferenciaItem item) {
			this.itens.add(item);
			return self();
		}
		
		abstract Conferencia build();
		
		abstract T self();
	}

	public String id() {
		return id;
	}
	
	public String descricao() {
		return descricao;
	}
	
	public String depositante() {
		return depositante;
	}
	
	public String unidade() {
		return unidade;
	}
	
	public List<ConferenciaItem>  itens() {
		return this.itens;
	}
}
