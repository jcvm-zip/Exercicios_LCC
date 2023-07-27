public class TestePolimorfismoEx02 {
    public static void acelerarVeiculos(Veiculo[] veiculos) {
        for (Veiculo veiculo : veiculos) {
            veiculo.acelerar();
        }
    }

    public static void main(String[] args) {
        Veiculo[] veiculos = {new Carro(), new Moto()};

        acelerarVeiculos(veiculos);
    }
}