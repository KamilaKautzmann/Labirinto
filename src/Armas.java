
public class Armas extends Item{

	private double chanceAcerto = 0.0;
	private double dano= 0.0;
	
	
		
	public Armas (String nome, double dano, double chanceAcerto){ // contrutor do inimigo
		this.dano = dano;
		this.chanceAcerto = chanceAcerto;
		this.nome = nome;		
	}




	public double getChanceAcerto() {
		return chanceAcerto;
	}



	public void setChanceAcerto(double chanceAcerto) {
		this.chanceAcerto = chanceAcerto;
	}



	public double getDano() {
		return dano;
	}



	public void setDano(double dano) {
		this.dano = dano;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	/*
	public int Adaga = 0; //75% de chance de acerto, adiciona 1 de dano;
	public int Faca = 0; //80% de chance de acerto, adiciona 2 pontos de dano;
	public int Espada = 0; //85% de chance de acerto, adiciona 3 pontos de dano;
	public int EspadaLonga = 0; //65% de chance de acerto, adiciona 5 pontos de dano
	*/
	
	
	
	
}
