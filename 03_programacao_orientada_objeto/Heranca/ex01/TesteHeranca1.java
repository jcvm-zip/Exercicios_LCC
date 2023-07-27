public class TesteHeranca1 {
    public static void imprimirDetalhesProdutos(Produto[] produtos) {
        for (Produto produto : produtos) {
            produto.detalhes();
        }
    }

    public static void main(String[] args) {
        Produto[] produtos = {
            new Livro("Dom Casmurro", 25.90, "Machado de Assis"),
            new Eletronico("Smartphone", 1200.0, "220V"),
            new Comida("Chocolate", 5.50, "30/09/2023")
        };

        imprimirDetalhesProdutos(produtos);
    }
}