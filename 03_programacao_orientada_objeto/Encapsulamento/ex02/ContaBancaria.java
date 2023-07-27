public class ContaBancaria {
    private double saldo;

    public ContaBancaria() {
        saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("O valor do depósito deve ser maior que zero.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
        } else {
            System.out.println("O valor do saque deve ser maior que zero.");
        }
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.depositar(1000);
        conta.sacar(500);
        conta.sacar(600);
        System.out.println("Saldo atual: R$" + conta.getSaldo());
    }
}
