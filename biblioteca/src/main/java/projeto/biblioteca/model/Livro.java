package projeto.biblioteca.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "tb_livros")
public class Livro {
	
	//IDENTITY DESIGNA PARA O BANCO DE DADOS GERAR O ID AUTOINCREMENTO
	@Id
	@Column(name = "id_livro")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idLivro;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "autor")
	private String autor;
	
	@Column(name = "editora")
	private String editora;
	
	public Long getIdLivro() {
		return idLivro;
	}
	public void setIdLivro(Long idLivro) {
		this.idLivro = idLivro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}

}
