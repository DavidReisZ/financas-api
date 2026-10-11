import java.util.ArrayList;

public class Carteira {

    private ArrayList<Transacao> transacoes = new ArrayList<>();

        public void adicionar(Transacao transacao) {
            transacoes.add(transacao);


        }
        public double calcularSaldo(){
            double saldo = 0;

            for(Transacao transacao : transacoes){

                if(transacao.getTipo() == TipoTransacao.RECEITA){
                    saldo = saldo + transacao.getValor();


                }else{
                    saldo = saldo - transacao.getValor();
                }
            }
            return saldo;
        }

        public double calcularDespesasDoMes(int mes){
            double total = 0;

            for(Transacao transacao : transacoes){

                if (transacao.getTipo() == TipoTransacao.DESPESA && transacao.getData().getMonthValue() == mes){
                    total = total + transacao.getValor();
                }
            }
            return total;
        }

    }


