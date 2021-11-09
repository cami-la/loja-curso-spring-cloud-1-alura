package br.com.alura.microservice.loja.controller.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class CompraDto {

    private List<ItemDaCompraDto> itens;
    private EnderecoClienteDto endereco;

}
