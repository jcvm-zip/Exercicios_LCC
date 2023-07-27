public class TestePolimorfismoEx01 {
    public static void imprimirAreas(FormaGeometrica[] formas) {
        for (FormaGeometrica forma : formas) {
            double area = forma.calcularArea();
            System.out.println("Área: " + area);
        }
    }

    public static void main(String[] args) {

        FormaGeometrica circulo = new Circulo(5);
        FormaGeometrica quadrado = new Quadrado(4);
        FormaGeometrica triangulo = new Triangulo(3, 6);

        FormaGeometrica[] formas = {circulo, quadrado, triangulo};

        imprimirAreas(formas);
    }
}