package com.thiago.produtos.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;


/*Adicionamos a seguinte:
 * As anotações de validation
 * - @NotBlank 
 * - @NotNull*/

@Entity
public class Tv {
	
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	  	
	  	@NotBlank(message = "Nome é Obrigatório!")
	    private String nome;
	  	
	  	@NotBlank(message = "Marca é Obrigatório!")
	    private String marca;
	  	
	  	@NotBlank(message = "Modelo é obrigatório!")
	    private String modelo;
	  	
	  	@NotNull(message = "Preço é obrigatorio")
	  	@Positive(message = "O preço deve ser positivo")
	    private BigDecimal preco;
	  	
	  	@NotNull(message = "Data de lançamento é obrigatória!")
	    private LocalDate dataLancamento;
	  	
	  	@NotNull(message = "Estoque é obrigatório!")
	    @Positive(message = "O estoque deve ser maior que [0]!")
	  	private int estoque;
	  	
	  	@NotNull(message = "Campo de descriçao é obrigatório!")
	    private String descricao;
	  	
	  	@NotNull(message = "Tamanho de Tela é obrigatório!")
	    private double tamanhoTela;
	  	
	  	@NotNull(message = "Resulução é obrigatório!")
	    private String resolucao;
	  	
	  	@NotNull(message = "Tipo de tela é obrigatório!")
	    private String tipoTela;
	  	
	  	@NotNull(message = "SmatTv é obrigatorio!")
	    private boolean smartTv;
	  	
	  	@NotNull(message = "Conexóes é obrigatório!")
	    private String conexoes;
	
	public Tv() {}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public LocalDate getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getTamanhoTela() {
		return tamanhoTela;
	}
	public void setTamanhoTela(double tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}
	public String getResolucao() {
		return resolucao;
	}
	public void setResolucao(String resolucao) {
		this.resolucao = resolucao;
	}
	public String getTipoTela() {
		return tipoTela;
	}
	public void setTipoTela(String tipoTela) {
		this.tipoTela = tipoTela;
	}
	public boolean isSmartTv() {
		return smartTv;
	}
	public void setSmartTv(boolean smartTv) {
		this.smartTv = smartTv;
	}
	public String getConexoes() {
		return conexoes;
	}
	public void setConexoes(String conexoes) {
		this.conexoes = conexoes;
	}

	public Tv(Long id, String nome, String marca, String modelo, BigDecimal preco, LocalDate dataLancamento,
			int estoque, String descricao, double tamanhoTela, String resolucao, String tipoTela, boolean smartTv,
			String conexoes) {
		super();
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
		this.dataLancamento = dataLancamento;
		this.estoque = estoque;
		this.descricao = descricao;
		this.tamanhoTela = tamanhoTela;
		this.resolucao = resolucao;
		this.tipoTela = tipoTela;
		this.smartTv = smartTv;
		this.conexoes = conexoes;
	}

	
	
	
}
