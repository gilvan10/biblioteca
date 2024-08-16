package projeto.biblioteca.model.dto;

//import java.time.LocalDateTime;//Data e Hora
import java.util.Date;//Data

public class EmprestimoDTO {
	
	private Long idEmprestimo;
	private Date dataEmprestimo;
	private Date dataDevolucao;
	private boolean livroDevolvido;
	private UsuarioDTO usuario;
	private LivroDTO livro;
	
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
	public UsuarioDTO getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}
	public LivroDTO getLivro() {
		return livro;
	}
	public void setLivro(LivroDTO livro) {
		this.livro = livro;
	} 
	
}
