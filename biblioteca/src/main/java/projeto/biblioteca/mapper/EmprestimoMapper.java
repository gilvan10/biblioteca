package projeto.biblioteca.mapper;

import projeto.biblioteca.model.Emprestimo;
import projeto.biblioteca.model.Usuario;
import projeto.biblioteca.model.Livro;
import projeto.biblioteca.model.dto.EmprestimoDTO;
import projeto.biblioteca.model.dto.LivroDTO;
import projeto.biblioteca.model.dto.UsuarioDTO;
import org.springframework.stereotype.Component;
import java.util.stream.Collectors;
import java.util.List;

@Component
public class EmprestimoMapper {
	
	public Emprestimo toEntity(EmprestimoDTO dto) {
		Emprestimo entidade = new Emprestimo();
		entidade.setIdEmprestimo(dto.getIdEmprestimo());
		entidade.setDataEmprestimo(dto.getDataEmprestimo());
		entidade.setDataDevolucao(dto.getDataDevolucao());
		entidade.setLivroDevolvido(dto.isLivroDevolvido());//is é o mesmo que o get
		Livro livro = new Livro();
		livro.setIdLivro(dto.getLivro().getIdLivro());
		livro.setNome(dto.getLivro().getNome());
		livro.setAutor(dto.getLivro().getAutor());
		livro.setEditora(dto.getLivro().getEditora());
		Usuario usuario = new Usuario();
		usuario.setIdUsuario(dto.getUsuario().getIdUsuario());
		usuario.setNome(dto.getUsuario().getNome());
		usuario.setEmail(dto.getUsuario().getEmail());
		usuario.setSenha(dto.getUsuario().getSenha());
		entidade.setLivro(livro);
		entidade.setUsuario(usuario);
		return entidade;
	}
	
	public EmprestimoDTO toDto(Emprestimo entidade) {
		EmprestimoDTO dto = new EmprestimoDTO();
		dto.setIdEmprestimo(entidade.getIdEmprestimo());
		dto.setDataEmprestimo(entidade.getDataEmprestimo());
		dto.setDataDevolucao(entidade.getDataDevolucao());
		dto.setLivroDevolvido(entidade.isLivroDevolvido());
		LivroDTO livroDTO = new LivroDTO();
		livroDTO.setIdLivro(entidade.getLivro().getIdLivro());
		livroDTO.setNome(entidade.getLivro().getNome());
		livroDTO.setAutor(entidade.getLivro().getAutor());
		livroDTO.setEditora(entidade.getLivro().getEditora());
		UsuarioDTO usuarioDTO = new UsuarioDTO();
		usuarioDTO.setIdUsuario(entidade.getUsuario().getIdUsuario());
		usuarioDTO.setNome(entidade.getUsuario().getNome());
		usuarioDTO.setEmail(entidade.getUsuario().getEmail());
		usuarioDTO.setSenha(entidade.getUsuario().getSenha());
		dto.setLivro(livroDTO);
		dto.setUsuario(usuarioDTO);
		return dto;
	}
	
	public List<EmprestimoDTO> toDto(List<Emprestimo> lista) {
		return lista.stream().map(this::toDto).collect(Collectors.toList());
	}

}
