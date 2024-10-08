package projeto.biblioteca.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import projeto.biblioteca.model.dto.LivroDTO;
import projeto.biblioteca.service.LivroService;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value = "/livro")
public class LivroController {
	
	@Autowired
	final LivroService service;
	
	public LivroController(LivroService service) {
	  this.service = service;
	}

	@GetMapping(produces =  MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<LivroDTO>> findAll(){
		return ResponseEntity.ok(this.service.findAll());
	}
	//@Valid
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<LivroDTO> save(@RequestBody LivroDTO dto) {
		return ResponseEntity.ok(this.service.save(dto));
	}

}
