class Comida extends Produto {
    private String dataValidade;

    public Comida(String nome, double preco, String dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    @Override
    public void detalhes() {
        System.out.println("Comida: " + getNome() + ", Data de Validade: " + dataValidade + ", Preço: R$" + getPreco());
    }
}