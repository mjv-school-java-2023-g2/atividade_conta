package src;

class Conta {

        // Atributos da classe conta
        private String numeroConta;
        private String numeroAgencia;
        private String nomeCliente;
        private String dataNascimento;
        private Double saldoConta;
        private Boolean status;

        public Conta(String numeroConta, String numeroAgencia, String nomeCliente,
                     String dataNascimento, Double saldoConta, Boolean status) {
                this.numeroConta = numeroConta;
                this.numeroAgencia = numeroAgencia;
                this.nomeCliente = nomeCliente;
                this.dataNascimento = dataNascimento;
                this.saldoConta = saldoConta;
                this.status = status;
        }

        public String getNumeroConta() {
                checkContaStatus(this);
                return numeroConta;
        }

        // Métodos da classe conta
        public Double sacar(Double valor) {
                checkContaStatus(this);
                if (valor > saldoConta) {
                        throw new RuntimeException("Saldo insuficiente");
                }
                saldoConta = saldoConta - valor;
                return valor;
        }

        public Double depositar(Double valor){
                checkContaStatus(this);
                if (valor < 0){
                        throw new RuntimeException("Valor inválido");
                }
                saldoConta = saldoConta + valor;
                return saldoConta;
        }

        public String transferirValor(Conta contaDestino, Double valor) {
                checkContaStatus(this);
                try {
                        contaDestino.depositar(sacar(valor));
                        return "valor depositado com sucesso para a conta: "+contaDestino.numeroConta;
                }catch (Exception exception){
                        return exception.getMessage();
                }
        }

        public String cancelarConta() {
                checkContaStatus(this);
               status = false;
               return "Conta desativada com sucesso";
        }

        public String consultarExtrato() {
                checkContaStatus(this);
                return  "numero da Conta: " + numeroConta + "|" +
                        "numero da Agência: " + numeroAgencia + "|" +
                        "saldo: R$" + saldoConta;
        }

        public Double consultarSaldo() {
                checkContaStatus(this);
                return saldoConta;
        }

        // simula qual seria o montante final se o valor de saldoConta fosse investido por determinado numero de meses, a uma taxa específica
        public Double simularRendimento(Double jurosMes, Integer meses) {
                checkContaStatus(this);
                return saldoConta;
        }

        private void checkContaStatus(Conta conta){
                if (!this.status){
                        throw new RuntimeException("Conta desativada");
                }
        }

}