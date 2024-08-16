package projeto.biblioteca.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projeto.biblioteca.model.Livro;
import projeto.biblioteca.model.dto.LivroDTO;
import projeto.biblioteca.mapper.LivroMapper;
import projeto.biblioteca.repository.LivroRepository;
import java.util.List;

@Service
public class LivroService {
	
	final LivroRepository repository;
	final LivroMapper mapper;
	
	public LivroService(LivroRepository repository, LivroMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}
	
	@Transactional(readOnly = true )
	public List<LivroDTO> findAll() {
		List<Livro> livros = this.repository.findAll();
		return this.mapper.toDto(livros);
	}

	@Transactional
	public LivroDTO save(LivroDTO dto) {
		Livro livro = this.mapper.toEntity(dto);
		this.repository.save(livro);
		return this.mapper.toDto(livro);
	}

}
