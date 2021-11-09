package br.com.alura.microservice.loja.controller;

import br.com.alura.microservice.loja.controller.dto.CompraDto;
import br.com.alura.microservice.loja.service.CompraService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compra")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CompraController {

    private CompraService compraService;

    @PostMapping
    public void realizaCompra(@RequestBody CompraDto compraDto){
        compraService.realizaCompra(compraDto);
    }

}
