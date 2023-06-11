class Conta {

        // Atributos da classe conta
        String numeroConta;
        public Long numeroAgencia;
        String nomeCliente;

        String dataNascimento;
        Double saldoConta;

        // Métodos da classe conta
        public Conta abrirConta(
                String numeroConta,
                long numeroAgencia,
                String nomeCliente,
                String dataNascimento
        ) {

        }

        public void sacarValor(Double valorSaque) {
        }

        public void transferirValor(Conta contaDestino, Double valorTranferir) {

        }

        public void sacarValor() {
        }

        public void transferirValor() {
        }

        public void cancelarConta() {     
        }

        public void consultarExtrato() {

        }

        public Double consultarSaldo() {
                return saldoConta;
        }

        // simula qual seria o montante final se o valor de saldoConta fosse investido por determinado numero de meses, a uma taxa específica
        public Double simularRendimento(Double jurosMes, Integer meses) {
                return saldoConta;
        }
}