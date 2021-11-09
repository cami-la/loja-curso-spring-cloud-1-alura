package br.com.alura.microservice.loja.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class EnderecoClienteDto {
    private String rua;
    private int numero;
    private String estado;
}
