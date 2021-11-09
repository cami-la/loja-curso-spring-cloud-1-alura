package br.com.alura.microservice.loja.controller.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ItemDaCompraDto {

    private long id;
    private int quantidade;

}
