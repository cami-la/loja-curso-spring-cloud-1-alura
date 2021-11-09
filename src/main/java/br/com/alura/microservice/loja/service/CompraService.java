package br.com.alura.microservice.loja.service;

import br.com.alura.microservice.loja.controller.dto.CompraDto;
import br.com.alura.microservice.loja.controller.dto.InfoFornecedorDto;
import br.com.alura.microservice.loja.client.FornecedorClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CompraService {

    @Autowired
    private FornecedorClient fornecedorClient;

    public void realizaCompra(CompraDto compraDto) {

        InfoFornecedorDto infoPorEstado = fornecedorClient.getInfoPorEstado(compraDto.getEndereco().getEstado());

        System.out.println(infoPorEstado.getEndereco());
    }
}
