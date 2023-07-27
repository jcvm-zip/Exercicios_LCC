public class TestePolimorfismoEx03 {
    public static void tocarInstrumentos(InstrumentoMusical[] instrumentos) {
        for (InstrumentoMusical instrumento : instrumentos) {
            instrumento.tocar();
        }
    }

    public static void main(String[] args) {
        InstrumentoMusical[] instrumentos = {new Violino(), new Flauta(), new Piano()};

        tocarInstrumentos(instrumentos);
    }
}