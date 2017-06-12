
public class Inimigo {

	private String nome="";
	private double energia=0.0;
	private double dano =0.0;
	private double chance = 0.0;
	private Armas arma;
	
	
	public Inimigo(String nome, double energia, double dano, double chance){ // contrutor do inimigo
		this.nome = nome;
		this.energia = energia;
		this.dano = dano;
		this.chance = chance;
		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getEnergia() {
		return energia;
	}
	public void setEnergia(double energia) {
		this.energia = energia;
	}
	public double getDano() {
		return dano;
	}
	public void setDano(double dano) {
		this.dano = dano;
	}
	public double getChance() {
		return chance;
	}
	public void setChance(double chance) {
		this.chance = chance;
	}
	public Armas getArma() {
		return arma;
	}
	public void setArma(Armas arma) {
		this.arma = arma;
	}
	
	
	/*
	public int goblin = 0 ; //80% de chance de acerto, causa 2 pontos de dano
	public int orc = 0; //75% de chance de acerto, causa 4 pontos de dano
	public int troll = 0; //  50% de chance de acerto, causa 6 pontos de dano.
	*/

	
	
	
}
