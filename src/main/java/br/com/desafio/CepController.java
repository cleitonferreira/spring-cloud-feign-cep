package br.com.desafio;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.model.CepResponse;
import br.com.desafio.service.CepService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("v1/cep")
public class CepController {

	private final CepService cepService;

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{cep}", method = RequestMethod.GET)
	public CepResponse getCep(@PathVariable String cep) {
		return cepService.getCep(cep);
	}

	
	@GetMapping("/find")
	public CepResponse findById() {
		return cepService.getCep("22071000");
	}
}
