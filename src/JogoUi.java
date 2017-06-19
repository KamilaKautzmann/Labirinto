import com.senac.SimpleJava.Graphics.Canvas;
import com.senac.SimpleJava.Graphics.GraphicApplication;
import com.senac.SimpleJava.Graphics.Image;
import com.senac.SimpleJava.Graphics.Point;
import com.senac.SimpleJava.Graphics.Resolution;
import com.senac.SimpleJava.Graphics.events.MouseEvent;
import com.senac.SimpleJava.Graphics.events.MouseObserver;
import com.senac.SimpleJava.Graphics.Color;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JogoUi extends GraphicApplication implements MouseObserver {

	private List<Point> points = new ArrayList<>();
	private Jogador jogador;
	private Labirinto labirinto;
	private Sala sala;

	private String fundo = "";
	private String portaVerde = "";
	private String portaVermelha = "";
	private String portaAmarela = "";
	private String portaAzul = "";
	private String chaveAzul = "";
	private String chaveAmarela = "";
	private String chaveVerde = "";
	private String chaveVermelho = "";
	private String escada = "";
	private String armadilha = "";

	public JogoUi() {

		this.labirinto = new Labirinto();
		this.jogador = new Jogador();
		this.sala = new Sala();
		this.jogador.setNome("Kamila");

	}

	public void run() {

		super.run();

	}

	@Override
	protected void draw(Canvas canvas) {
		canvas.setResolution(Resolution.HIGHRES);

		if (this.jogador.getEnergia() == 0) {
			canvas.putText(0, 0, 60, "Você morreu!");
			return;
		}

		if (this.labirinto.getSalaAtual() != 0) {

			this.fundo = "D:\\Kamila Kautzmann\\Documentos\\Java\\AlgoritimosII\\Jogo_Labirinto\\Sala.png";
			this.portaVerde = "D:\\Kamila Kautzmann\\Documentos\\Java\\AlgoritimosII\\Jogo_Labirinto\\portaVerde.png";
			this.portaAmarela = "D:\\Kamila Kautzmann\\Documentos\\Java\\AlgoritimosII\\Jogo_Labirinto\\portaAmarelo.png";
			this.portaAzul = "D:\\Kamila Kautzmann\\Documentos\\Java\\AlgoritimosII\\Jogo_Labirinto\\portaAzul.png";
			this.portaVermelha = "D:\\Kamila Kautzmann\\Documentos\\Java\\AlgoritimosII\\Jogo_Labirinto\\portaVermelho.png";
			this.chaveVerde = "D:\\Kamila Kautzmann\\Documentos\\Java\\AlgoritimosII\\Jogo_Labirinto\\chaveVerde.png";
			this.chaveAmarela = "D:\\Kamila Kautzmann\\Documentos\\Java\\AlgoritimosII\\Jogo_Labirinto\\chaveAmarela.png";
			this.chaveAzul = "D:\\Kamila Kautzmann\\Documentos\\Java\\AlgoritimosII\\Jogo_Labirinto\\chaveAzul.png";
			this.chaveVermelho = "D:\\Kamila Kautzmann\\Documentos\\Java\\AlgoritimosII\\Jogo_Labirinto\\chaveVermelha.png";
			this.escada = "D:\\Kamila Kautzmann\\Documentos\\Java\\AlgoritimosII\\Jogo_Labirinto\\escada.png";
			this.armadilha = "D:\\Kamila Kautzmann\\Documentos\\Java\\AlgoritimosII\\Jogo_Labirinto\\armadilha.png";

			String nome = "Jogador:" + this.jogador.getNome(); // chama o
																// jogador
			String salaAtual = "Sala Atual: " + this.labirinto.getSalaAtual(); // chama
																				// sala
																				// atual

			Image image, pVerde, pAmarela, pAzul, pVermelha, cVerde, cAmarela, cAzul, cVermelho, escada, armadilha;

			try {
				image = new Image(this.fundo);
				escada = new Image(this.escada);
				pVerde = new Image(this.portaVerde);
				pVermelha = new Image(this.portaVermelha);
				pAzul = new Image(this.portaAzul);
				pAmarela = new Image(this.portaAmarela);
				cVerde = new Image(this.chaveVerde);
				cVermelho = new Image(this.chaveVermelho);
				cAzul = new Image(this.chaveAzul);
				cAmarela = new Image(this.chaveAmarela);
				// desenhoSala
				canvas.drawImage(image, 0, 0);
				// desenhoPorta
				canvas.drawImage(pVerde, -237, 40);
				if (this.labirinto.getObjSalaAtual().getPortaOeste().getArmadilha() != null
						&& this.labirinto.getObjSalaAtual().getPortaOeste().getArmadilha().getSituacaoArmadilha()) {
					armadilha = new Image(this.armadilha);
					canvas.drawImage(armadilha, 65, 250);
				}
				canvas.drawImage(pVermelha, 524, 40);
				if (this.labirinto.getObjSalaAtual().getPortaLeste().getArmadilha() != null
						&& this.labirinto.getObjSalaAtual().getPortaLeste().getArmadilha().getSituacaoArmadilha()) {
					armadilha = new Image(this.armadilha);
					canvas.drawImage(armadilha, 645, 250);
				}
				canvas.drawImage(pAzul, 153, -237);
				if (this.labirinto.getObjSalaAtual().getPortaNorte().getArmadilha() != null
						&& this.labirinto.getObjSalaAtual().getPortaNorte().getArmadilha().getSituacaoArmadilha()) {
					armadilha = new Image(this.armadilha);
					canvas.drawImage(armadilha, 360, 30);
				}
				canvas.drawImage(pAmarela, 155, 330);
				if (this.labirinto.getObjSalaAtual().getPortaSul().getArmadilha() != null
						&& this.labirinto.getObjSalaAtual().getPortaSul().getArmadilha().getSituacaoArmadilha()) {
					armadilha = new Image(this.armadilha);
					canvas.drawImage(armadilha, 360, 485);
				}
				// desenhoChave
				canvas.drawImage(cVerde, 680, 500);
				canvas.drawImage(cVermelho, 650, 500);
				canvas.drawImage(cAzul, 620, 500);
				canvas.drawImage(cAmarela, 590, 500);
				// desenhoEscada
				canvas.drawImage(escada, 620, 5);
				canvas.drawImage(escada, 100, 540);

			} catch (IOException e) {
				e.printStackTrace();
			}

			canvas.putText(65, 40, 15, nome);
			canvas.putText(65, 60, 15, salaAtual);
		} else {
			canvas.putText(0, 0, 60, "Você Venceu!");
		}
	}

	@Override
	protected void loop() {

	}

	@Override
	protected void setup() {
		addMouseObserver(MouseEvent.CLICK, this);
		addMouseObserver(MouseEvent.DOUBLECLICK, this);

		Resolution res = Resolution.LOWRES;
		setResolution(res);
		setFramesPerSecond(240);
		setTitle("Labirinto");

	}

	@Override
	public void notify(MouseEvent event, int button, Point point) { // verificando
																	// os pontos
																	// da porta
		if (event == MouseEvent.CLICK) {
			System.out.println(point.x + "------" + point.y);
			// click da porta norte
			if (point.x >= 42 && point.x <= 56 && point.y >= 0 && point.y <= 4) {
				if (this.labirinto.getObjSalaAtual().getPortaNorte().getArmadilha() != null && this.labirinto
						.getObjSalaAtual().getPortaNorte().getArmadilha().getSituacaoArmadilha() == true) {
					this.jogador.setEnergia(0);
					redraw();
				} else {
					this.abrirPorta("N");
				}
			}
			 System.out.println("Você clicou na porta norte!");
		}
		if (point.x >= 91 && point.x <= 95 && point.y >= 28 && point.y <= 42) {
			if (this.labirinto.getObjSalaAtual().getPortaLeste().getArmadilha() != null
					&& this.labirinto.getObjSalaAtual().getPortaLeste().getArmadilha().getSituacaoArmadilha() == true) {
				this.jogador.setEnergia(0);
				redraw();
			} else {
				this.abrirPorta("L");
			}
			System.out.println("Você clicou na porta leste!");
		}
		if (point.x >= 41 && point.x <= 56 && point.y >= 68 && point.y <= 71) {
			if (this.labirinto.getObjSalaAtual().getPortaSul().getArmadilha() != null
					&& this.labirinto.getObjSalaAtual().getPortaSul().getArmadilha().getSituacaoArmadilha() == true) {
				this.jogador.setEnergia(0);
				redraw();
			} else {
				this.abrirPorta("S");
			}
			System.out.println("Você clicou na porta sul!");
		}
		if (point.x >= 0 && point.x <= 4 && point.y >= 27 && point.y <= 42) {
			if (this.labirinto.getObjSalaAtual().getPortaOeste().getArmadilha() != null
					&& this.labirinto.getObjSalaAtual().getPortaOeste().getArmadilha().getSituacaoArmadilha() == true) {
				this.jogador.setEnergia(0);
				redraw();
			} else {
				this.abrirPorta("O");
			}
			System.out.println("Você clicou na porta oeste!");
		}
		if (point.x >= 75 && point.x <= 80 && point.y >= 1 && point.y <= 6) {
			this.abrirPorta("EC");
			System.out.println("Você clicou na escada para subir!");
		}
		if (point.x >= 13 && point.x <= 17 && point.y >= 65 && point.y <= 70) {
			this.abrirPorta("EB");
			System.out.println("Você clicou na escada para descer!");
		}
		if (point.x >= 9 && point.x <= 17 && point.y >= 32 && point.y <= 36
				&& this.labirinto.getObjSalaAtual().getPortaOeste().getArmadilha() != null) {
			this.labirinto.getObjSalaAtual().getPortaOeste().getArmadilha().setSituacaoArmadilha(false);
			redraw();
		}
		if (point.x >= 44 && point.x <= 52 && point.y >= 60 && point.y <= 64
				&& this.labirinto.getObjSalaAtual().getPortaSul().getArmadilha() != null) {
			this.labirinto.getObjSalaAtual().getPortaSul().getArmadilha().setSituacaoArmadilha(false);
			redraw();
		}
		if (point.x >= 44 && point.x <= 52 && point.y >= 6 && point.y <= 10
				&& this.labirinto.getObjSalaAtual().getPortaNorte().getArmadilha() != null) {
			this.labirinto.getObjSalaAtual().getPortaNorte().getArmadilha().setSituacaoArmadilha(false);
			redraw();
		}
		if (point.x >= 78 && point.x <= 86 && point.y >= 32 && point.y <= 36
				&& this.labirinto.getObjSalaAtual().getPortaLeste().getArmadilha() != null) {
			this.labirinto.getObjSalaAtual().getPortaLeste().getArmadilha().setSituacaoArmadilha(false);
			redraw();
		}
		

	}
	
	public void abrirPorta(String porta) {
		int destino = 0;

		switch (porta) {
		case "N":
			destino = this.labirinto.getObjSalaAtual().getPortaNorte().getDestino(); // Seleciona
																						// o
																						// conteudo
																						// da
																						// sala
																						// atual,
																						// seleciona
																						// se
																						// a
																						// porta
																						// tem
																						// destino
			if (destino != -1) { // verificando se o destino é diferente de -1
				this.labirinto.setSalaAtual(destino);
				System.out.println("Essa sala manda para " + destino);
				redraw();
			} else {
				System.out.println("Essa sala nao manda para lugar nenhum!");
			}
			break;

		case "S":
			destino = this.labirinto.getObjSalaAtual().getPortaSul().getDestino(); // Seleciona
																					// o
																					// conteudo
																					// da
																					// sala
																					// atual,
																					// seleciona
																					// se
																					// a
																					// porta
																					// tem
																					// destino
			if (destino != -1) { // verificando se o destino é diferente de -1
				this.labirinto.setSalaAtual(destino);
				System.out.println("Essa sala manda para " + destino);
				redraw();
			} else {
				System.out.println("Essa sala nao manda para lugar nenhum!");
			}
			break;

		case "L":
			destino = this.labirinto.getObjSalaAtual().getPortaLeste().getDestino(); // Seleciona
																						// o
																						// conteudo
																						// da
																						// sala
																						// atual,
																						// seleciona
																						// se
																						// a
																						// porta
																						// tem
																						// destino
			if (destino != -1) { // verificando se o destino é diferente de -1
				this.labirinto.setSalaAtual(destino);
				System.out.println("Essa sala manda para " + destino);
				redraw();
			} else {
				System.out.println("Essa sala nao manda para lugar nenhum!");
			}
			break;

		case "O":
			destino = this.labirinto.getObjSalaAtual().getPortaOeste().getDestino(); // Seleciona
																						// o
																						// conteudo
																						// da
																						// sala
																						// atual,
																						// seleciona
																						// se
																						// a
																						// porta
																						// tem
																						// destino
			if (destino != -1) { // verificando se o destino é diferente de -1
				this.labirinto.setSalaAtual(destino);
				System.out.println("Essa sala manda para " + destino);
				redraw();
			} else {
				System.out.println("Essa sala nao manda para lugar nenhum!");
			}
			break;

		case "EC":
			destino = this.labirinto.getObjSalaAtual().getescadaCima().getDestino();
			if (destino != -1) { // verificando se o destino é diferente de -1
				this.labirinto.setSalaAtual(destino);
				System.out.println("Essa escada manda para " + destino);
				redraw();
			} else {
				System.out.println("Essa sala nao manda para lugar nenhum!");
			}
			break;

		case "EB":
			destino = this.labirinto.getObjSalaAtual().getescadaBaixo().getDestino();
			if (destino != -1) { // verificando se o destino é diferente de -1
				this.labirinto.setSalaAtual(destino);
				System.out.println("Essa escada manda para " + destino);
				redraw();
			} else {
				System.out.println("Essa sala nao manda para lugar nenhum!");
			}
			break;
		default:
			break;
		}

	}

}
