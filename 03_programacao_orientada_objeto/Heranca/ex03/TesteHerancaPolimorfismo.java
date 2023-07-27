public class TesteHerancaPolimorfismo {
    public static void emitirSonsAnimais(Animal[] animais) {
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }

    public static void main(String[] args) {
        Animal[] animais = {new Cachorro(), new Gato(), new Vaca()};

        emitirSonsAnimais(animais);
    }
}