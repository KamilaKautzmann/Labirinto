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
	private String fundo ="";
	private Jogador jogador;
	private Labirinto labirinto;
	private Sala sala;
	
	public JogoUi(){
		
		this.labirinto = new Labirinto();
		this.jogador = new Jogador();
		this.sala = new Sala();
		this.jogador.setNome("Kamila");
						
	}
	
	
	public void run(){
			
		super.run(); 
		
	}

	@Override
	protected void draw(Canvas canvas) {
	canvas.setResolution(Resolution.MODE_X);
	this.fundo = "D:\\Kamila Kautzmann\\Documentos\\Java\\AlgoritimosII\\Jogo_Labirinto\\Sala.png";
			
		String nome = "Jogador:" + this.jogador.getNome();	
		String salaAtual = "Sala Atual: "+this.labirinto.getSalaAtual(); 
		Point point = new Point(0,0); // classe ponto
		
		
		 //canvas.setBackground(Color.RED);
		// canvas.putPixel(0,0,Color.BLACK);
		 Image image;
		try {
			image = new Image(this.fundo);
			canvas.drawImage(image, 0,  0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
		 
		 canvas.putPixel(184,112,Color.RED);
		 
		 //canvas.putPixel(5,112,Color.RED);
		 //canvas.putPixel(5,74,Color.RED);
		 Point pontoUmOeste = new Point(5,74);
		 Point pontoDoisOeste = new Point(5, 112);
		 canvas.putPixel(pontoUmOeste);
		 canvas.putPixel(pontoDoisOeste);
		 canvas.drawLine(pontoUmOeste, pontoDoisOeste);
		 
		 //canvas.drawLine(5, 74, 5, 112); //desenho da porta oeste
		 canvas.putPixel(184,112,Color.RED);
		 canvas.putText(195, 15, 12, nome);
		 canvas.putText(195, 30, 12, salaAtual);
		 		
	}

	private Color Color() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void loop() {
			
	}

	@Override
	protected void setup() {
		addMouseObserver(MouseEvent.CLICK, this);
		addMouseObserver(MouseEvent.DOUBLECLICK, this);
		setResolution(Resolution.MSX);
		setFramesPerSecond(120);
	}

	@Override
	public void notify(MouseEvent event, int button, Point point) {
		
		
		if (event == MouseEvent.CLICK) {
			if(point.x == 5 && (point.y>=74 && point.y<=112)){
			System.out.println("Você clicou na porta oeste!");
			}
			
		}
		//redraw();
	}

		
	
}
