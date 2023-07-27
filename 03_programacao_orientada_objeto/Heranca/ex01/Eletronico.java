class Eletronico extends Produto {
    private String voltagem;

    public Eletronico(String nome, double preco, String voltagem) {
        super(nome, preco);
        this.voltagem = voltagem;
    }

    @Override
    public void detalhes() {
        System.out.println("Eletrônico: " + getNome() + ", Voltagem: " + voltagem + ", Preço: R$" + getPreco());
    }
}
