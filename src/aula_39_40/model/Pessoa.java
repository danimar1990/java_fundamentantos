package aula_39_40.model;

import java.math.BigDecimal;
import java.sql.Date;

public class Pessoa {
	private Integer idPessoa;
	private String nomePessoa;
	private Date dataNascimento;
	private BigDecimal salario;

	public Pessoa() {

	}

	public Pessoa(Integer idPessoa, String nomePessoa, Date dataNascimento, BigDecimal salario) {
		this.idPessoa = idPessoa;
		this.nomePessoa = nomePessoa;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Pessoa [idPessoa=" + idPessoa + ", nomePessoa=" + nomePessoa + ", dataNascimento=" + dataNascimento
				+ ", salario=" + salario + "]";
	}

	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

}
