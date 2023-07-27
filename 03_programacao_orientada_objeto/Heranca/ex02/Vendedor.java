
class Vendedor extends Funcionario {
    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 1.05;
    }
}
