package br.com.gameloa.agendamento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //esta anotação diz que a classe usuário é uma classe armazenável em banco
@Table(name="tbl_usuario") // a anotação @table permite definir o nome da tabela que existe no banco
public class usuario {
	
	@Id // @Id indica que o atributo corresponte a uma PK na tabela
	@GeneratedValue(strategy=GenerationType.IDENTITY) //indica que o campo da tabela é auto increment
	@Column(name="id_user") // define o nome da coluna na tabela
	private int id;
	
	@Column(name="nome",length = 100)
	private String nome;
	
	@Column(name="email",length = 100)
	private String email;
	
	@Column(name="racf",length = 7)
	private String racf;
	
	@Column(name="senha",length = 50)
	private String senha;
	
	@Column(name="linkFoto",length = 255)
	private String linkFoto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRacf() {
		return racf;
	}

	public void setRacf(String racf) {
		this.racf = racf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLinkFoto() {
		return linkFoto;
	}

	public void setLinkFoto(String linkFoto) {
		this.linkFoto = linkFoto;
	}
	
	
	
	
}
