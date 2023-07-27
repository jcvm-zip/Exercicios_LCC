
public class TesteHeranca {
    public static void calcularSalarioFuncionarios(Funcionario[] funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome() + ", Salário: " + funcionario.calcularSalario());
        }
    }

    public static void main(String[] args) {
        Funcionario gerente = new Gerente("João", 5000);
        Funcionario vendedor = new Vendedor("Maria", 3000);

        Funcionario[] funcionarios = {gerente, vendedor};

        calcularSalarioFuncionarios(funcionarios);
    }
}