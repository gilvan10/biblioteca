package projeto.biblioteca.mapper;

import projeto.biblioteca.model.Usuario;
import projeto.biblioteca.model.dto.UsuarioDTO;
import org.springframework.stereotype.Component;
import java.util.stream.Collectors;
import java.util.List;

@Component
public class UsuarioMapper {
	
	public Usuario toEntity(UsuarioDTO dto) {
		Usuario entidade = new Usuario();
		entidade.setIdUsuario(dto.getIdUsuario());
		entidade.setNome(dto.getNome());
		entidade.setEmail(dto.getEmail());
		entidade.setSenha(dto.getSenha());
		return entidade;
	}
	
	public UsuarioDTO toDto(Usuario entidade) {
		UsuarioDTO dto = new UsuarioDTO();
		dto.setIdUsuario(entidade.getIdUsuario());
		dto.setNome(entidade.getNome());
		dto.setEmail(entidade.getEmail());
		dto.setSenha(entidade.getSenha());
		return dto;
	}
	
	public List<UsuarioDTO> toDto(List<Usuario> lista) {
		return lista.stream().map(this::toDto).collect(Collectors.toList());
	}

}
