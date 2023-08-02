/*
Faça um programa em Python que abra e reproduza o áudio de um arquivo MP3.

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ex021 {
    public static void main(String[] args) {
        String arquivoMP3 = "caminho_do_arquivo.mp3";

        try {
            FileInputStream fileInputStream = new FileInputStream(arquivoMP3);
            Player player = new Player(fileInputStream);

            System.out.println("Reproduzindo áudio...");
            player.play();

        } catch (FileNotFoundException | JavaLayerException e) {
            e.printStackTrace();
        }
    }
}
 */