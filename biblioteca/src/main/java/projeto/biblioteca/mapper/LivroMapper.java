package projeto.biblioteca.mapper;

import projeto.biblioteca.model.Livro;
import projeto.biblioteca.model.dto.LivroDTO;
import org.springframework.stereotype.Component;
import java.util.stream.Collectors;
import java.util.List;

@Component
public class LivroMapper {
	
	public Livro toEntity(LivroDTO dto) {
		Livro entidade = new Livro();
		entidade.setIdLivro(dto.getIdLivro());
		entidade.setNome(dto.getNome());
		entidade.setAutor(dto.getAutor());
		entidade.setEditora(dto.getEditora());
		return entidade;
	}
	
	public LivroDTO toDto(Livro entidade) {
		LivroDTO dto = new LivroDTO();
		dto.setIdLivro(entidade.getIdLivro());
		dto.setNome(entidade.getNome());
		dto.setAutor(entidade.getAutor());
		dto.setEditora(entidade.getEditora());
		return dto;
	}
	
	public List<LivroDTO> toDto(List<Livro> lista) {
		return lista.stream().map(this::toDto).collect(Collectors.toList());
	}

}
