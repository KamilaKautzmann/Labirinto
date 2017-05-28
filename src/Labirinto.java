import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Labirinto {

	public void run() {

		File filename = new File("D:/Kamila Kautzmann/Documentos/Java/AlgoritimosII/Jogo_Labirinto/Labirinto.txt");

		try {
			FileInputStream ler = new FileInputStream(filename);
		
			int conteudo;

			while ((conteudo = ler.read()) != -1) {
				System.out.print((char) conteudo);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}// run

	
}// class Labirinto