package src;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("12345", "000-1",
                "Gustavo", "12-11-2003", 0.00, true);
        Conta conta2 = new Conta("12346", "000-1",
                "Gustavo Ferreira", "12-11-2003", 0.00, true);

        try {
            conta.depositar(10.00);

            System.out.println(conta.consultarExtrato());

            conta.sacar(5.00);

            conta.transferirValor(conta2, 2.00);

            System.out.println(conta.consultarExtrato());

            System.out.println(conta2.consultarExtrato());

            conta.cancelarConta();

            System.out.println(conta.consultarExtrato());

            conta.depositar(10.00);

        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
