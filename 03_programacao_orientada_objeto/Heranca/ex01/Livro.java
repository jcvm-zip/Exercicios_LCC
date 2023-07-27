class Livro extends Produto {
    private String autor;

    public Livro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public void detalhes() {
        System.out.println("Livro: " + getNome() + ", Autor: " + autor + ", Preço: R$" + getPreco());
    }
}
