package projeto.biblioteca.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projeto.biblioteca.model.Emprestimo;
import projeto.biblioteca.model.dto.EmprestimoDTO;
import projeto.biblioteca.mapper.EmprestimoMapper;
import projeto.biblioteca.repository.EmprestimoRepository;
import java.util.List;

@Service
public class EmprestimoService {
	
	final EmprestimoRepository repository;
	final EmprestimoMapper mapper;
	
	public EmprestimoService(EmprestimoRepository repository, EmprestimoMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}
	
	@Transactional(readOnly = true )
	public List<EmprestimoDTO> findAll() {
		List<Emprestimo> emprestimos = this.repository.findAll();
		return this.mapper.toDto(emprestimos);
	}

	@Transactional
	public EmprestimoDTO save(EmprestimoDTO dto) {
		Emprestimo emprestimo = this.mapper.toEntity(dto);
		this.repository.save(emprestimo);
		return this.mapper.toDto(emprestimo);
	}

}
