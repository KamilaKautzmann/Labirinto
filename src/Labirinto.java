import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Labirinto {

	private Sala sala[] = new Sala[32];
	private int salaAtual = 0;
	static Random sT = new Random();

	public Labirinto() {

		this.lerArquivo();
		System.out.println("Jogo iniciou!");

		int sorteioSalaAtual = 0;// Sortear sala atual
		do {
			sorteioSalaAtual = sT.nextInt(31);
		} while (sorteioSalaAtual == 0);
			
		this.salaAtual = sorteioSalaAtual;
		
		
		
		
	}// final construtor labirinto

	public int getSalaAtual() {
		return salaAtual;
	}

	public void setSalaAtual(int salaAtual) {
		this.salaAtual = salaAtual;
	}

	private void lerArquivo() { // lendo o TXT
		int contador = 1;
		String linha = "";

		Scanner arquivo = null;

		File filename = new File("D:/Kamila Kautzmann/Documentos/Java/AlgoritimosII/Jogo_Labirinto/Labirinto.txt");

		try {
			arquivo = new Scanner(new FileInputStream(filename));
			this.sala[0] = new Sala();

			while (arquivo.hasNext()) {
				linha = arquivo.nextLine();
				this.sala[contador] = this.criarSala(linha);
				contador++;
				// System.out.print(arquivo);
			}
		} catch (IOException e) {
			System.err.println("Não foi possivel abrir o arquivo!" + filename);
			e.printStackTrace();
		}

	}// final do ler arquivo

	private Sala criarSala(String arquivoLinha) throws IOException {

		Sala sala = new Sala();

		String[] arrayLinha = arquivoLinha.split(" "); // pega uma linha do
														// labirinto e divide
														// cada palavra numa
														// posição do array;
		String atributo = "";

		for (int i = 0; i < arrayLinha.length; i++) { // arrayLinha.length passa
														// todas as posições do
														// array;

			if (i % 2 == 0) {
				atributo = arrayLinha[i]; // primeira posição do array
			} else {
				switch (atributo) {
				case "room":
					sala.setNumeroSala(Integer.parseInt((arrayLinha[i])));// segunda
																			// posição
																			// do
																			// array
					break;
				case "south":
					sala.setDestinoPorta("portaSul", (Integer.parseInt(arrayLinha[i]))); // colocando
																							// o
																							// que
																							// ta
																							// no
																							// arquivo
																							// e
																							// setando
																							// no
																							// atributo
																							// de
																							// porta
					break;
				case "north":
					sala.setDestinoPorta("portaNorte", Integer.parseInt(arrayLinha[i]));
					break;
				case "east":
					sala.setDestinoPorta("portaLeste", Integer.parseInt(arrayLinha[i]));
					break;
				case "west":
					sala.setDestinoPorta("portaOeste", Integer.parseInt(arrayLinha[i]));
					break;
				default:
					break;
				}

			}

		}

		return sala;

	}

}// class Labirinto