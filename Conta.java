class Conta{
	
//Atributos da classe conta
        String numeroConta;
        public Long numeroAgencia;
        String nomeCliente;

        String dataNascimento;
        Double saldoConta;

//Métodos da classe ser conta
        public void sacarValor(Double valorSaque){
                saldoConta = saldoConta - valorSaque;
        }
        
        public void transferirValor(Conta contaDestino, Double valorTranferir){
                contaDestino.saldoConta = contaDestino.saldoConta + valorTranferir;
                saldoConta = saldoConta - valorTranferir;
        }

        public void cancelarConta(){     
        }

        public void consultarExtrato() {
                
        }

        public Double consultarSaldo(){
                return saldoConta;
        }

        // simula qual seria o montante final se o valor de saldoConta fosse investido por determinado numero de meses, a uma taxa específica
        public Double simularRendimento(Double jurosMes, Integer meses){
                for(Integer i = 1; i <= meses; i++){
                        saldoConta = saldoConta + saldoConta*jurosMes;
                }
                return saldoConta;
        }




}