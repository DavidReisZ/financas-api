
import java.time.LocalDate;

import java.util.ArrayList;

public class Main {
     public static void main(String[] args) {

        Categoria categoria1 = new Categoria("Alimentacao");
         System.out.println(categoria1.getNome());

        Categoria categoria2 = new Categoria("Transporte");
        System.out.println(categoria2.getNome());

         Categoria categoria3 = new Categoria("Salario");
         System.out.println(categoria3.getNome());


         Transacao almoco = new Transacao("Almoco" , 25.00, LocalDate.of(2026, 10, 5), TipoTransacao.DESPESA, categoria1);
         System.out.println(almoco.getDescricao());
         System.out.println("valor: "+ almoco.getValor());
         System.out.println("categoria: "+ almoco.getCategoria().getNome());

         Transacao onibus = new Transacao("Onibus", 4.50, LocalDate.of(2026, 10, 6), TipoTransacao.DESPESA, categoria2);
         System.out.println(onibus.getDescricao());
         System.out.println("valor: "+ onibus.getValor());
         System.out.println("categoria: "+ onibus.getCategoria().getNome());


         Transacao salario = new Transacao("Salario", 1800.00, LocalDate.of(2026, 10, 5), TipoTransacao.RECEITA, categoria3);
         System.out.println(salario.getDescricao());
         System.out.println("valor: "+ salario.getValor());
         System.out.println("categoria: "+ salario.getCategoria().getNome());

        Carteira carteira = new Carteira();
        carteira.adicionar(salario);
         carteira.adicionar(almoco);
         carteira.adicionar(onibus);
         System.out.println("saldo: " + carteira.calcularSaldo());

    }






}
