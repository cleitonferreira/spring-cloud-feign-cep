package br.com.desafio.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.desafio.model.CepResponse;
 
@FeignClient(name = "cepService", url = "https://api.postmon.com.br")
public interface CepService {
 
 @RequestMapping("/v1/cep/{cep}")
 CepResponse getCep(@PathVariable("cep") String cep);
}
