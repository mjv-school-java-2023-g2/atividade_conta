class Conta{

        //Atributos da classe conta
        String numeroConta;
        public Long numeroAgencia;
        String nomeCliente;

        String dataNascimento;
        Double saldoConta;

        //Métodos da classe ser conta
        public Conta abrirConta(
                String numeroConta,
                long numeroAgencia,
                String nomeCliente,
                String dataNascimento
        ) {

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


}