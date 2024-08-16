package projeto.biblioteca.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projeto.biblioteca.model.Usuario;
import projeto.biblioteca.model.dto.UsuarioDTO;
import projeto.biblioteca.mapper.UsuarioMapper;
import projeto.biblioteca.repository.UsuarioRepository;
import java.util.List;

@Service
public class UsuarioService {
	
	final UsuarioRepository repository;
	final UsuarioMapper mapper;
	
	public UsuarioService(UsuarioRepository repository, UsuarioMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}
	
	@Transactional(readOnly = true )
	public List<UsuarioDTO> findAll() {
		List<Usuario> usuarios = this.repository.findAll();
		return this.mapper.toDto(usuarios);
	}

	@Transactional
	public UsuarioDTO save(UsuarioDTO dto) {
		Usuario usuario = this.mapper.toEntity(dto);
		this.repository.save(usuario);
		return this.mapper.toDto(usuario);
	}

}
