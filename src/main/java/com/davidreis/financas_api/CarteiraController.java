package com.davidreis.financas_api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CarteiraController {
    private final Carteira carteira;

    @GetMapping("/saldo")
    public double saldo(){
       return carteira.calcularSaldo();
    }

    @GetMapping("/transacoes")
    public ArrayList<Transacao> transacoes(){
        return carteira.listar();
    }
    @PostMapping("/transacoes")
    public void adicionar(@RequestBody Transacao transacao){
        carteira.adicionar(transacao);
    }

    public CarteiraController(Carteira carteira) {
        this.carteira = carteira;
    }


}


