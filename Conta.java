class Conta {

        // Atributos da classe conta
        String numeroConta;
        long numeroAgencia;
        String nomeCliente;
        String dataNascimento;
        double saldoConta = 0.0;

        public Conta(
                String numeroConta,
                long numeroAgencia,
                String nomeCliente,
                String dataNascimento
        ) {
                this.numeroConta = numeroConta;
                this.numeroAgencia = numeroAgencia;
                this.nomeCliente = nomeCliente;
                this.dataNascimento = dataNascimento;
        }

        public  String mostrarNumeroConta(){
                return numeroConta;
        }

        public long mostrarNumeroAgencia(){
                return numeroAgencia;
        }

        public String alterarNumeroAgencia(long novoNumeroAgencia){
                return "Mensagem";
        }

        public String mostrarNomeCliente(){
                return nomeCliente;
        }

        public String alterarNomeCliente(String novoNomeCliente){
                return "Mensagem";
        }

        public String mostrarDataNascimento(){
                return dataNascimento;
        }

        public String alterarDataNascimento(String novaDataNascimento){
                return "Mensagem";
        }

        public String sacarValor(double valorSaque) {
                return "Mensagem";
        }

        public String transferirValor(Conta contaDestino, Double valorTranferir) {
                return "Mensagem";
        }

        public String sacarValor(Double valorSacar) {
                return "Mensagem";
        }

        public String cancelarConta(String senha) {
                return "Mensagem";  
        }

        public String consultarExtrato() {
                return "Extrato";
        }

        public Double consultarSaldo() {
                return saldoConta;
        }
        // simula qual seria o montante final se o valor de saldoConta fosse investido por determinado numero de meses, a uma taxa específica
        public String simularRendimento(double jurosMes, int meses) {
                return "Mensagem - Valor do montante final da simulação";
        }
}