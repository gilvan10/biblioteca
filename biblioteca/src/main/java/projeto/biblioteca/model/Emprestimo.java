package projeto.biblioteca.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
//import java.time.LocalDateTime; No Banco o tipo de dado Date trabalha com data e Time com horas
import java.util.Date;

@Entity
@Table(name = "tb_emprestimos")
public class Emprestimo {
	
	//IDENTITY DESIGNA PARA O BANCO DE DADOS GERAR O ID AUTOINCREMENTO
	@Id
	@Column(name = "id_emprestimo")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEmprestimo;
	
	@Column(name = "data_emprestimo")
	private Date dataEmprestimo;
	
	@Column(name = "data_devolucao")
	private Date dataDevolucao;
	
	@Column(name = "livro_devolvido")
	private boolean livroDevolvido;
	
	@ManyToOne
	@JoinColumn(name = "usuarios_id_usuario")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "livros_id_livro")
	private Livro livro;
	
	public Long getIdEmprestimo() {
		return idEmprestimo;
	}
	public void setIdEmprestimo(Long idEmprestimo) {
		this.idEmprestimo = idEmprestimo;
	}
	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public boolean isLivroDevolvido() {
		return livroDevolvido;
	}
	public void setLivroDevolvido(boolean livroDevolvido) {
		this.livroDevolvido = livroDevolvido;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	} 

}
