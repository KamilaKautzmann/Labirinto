
public class Jogador {

	private String nome ="";
	private double energia = 20;
	private double chanceAcerto = 75.0;
	private Item[] itens;
	
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
	public double getChanceAcerto() {
		return chanceAcerto;
	}
	public void setChanceAcerto(double chanceAcerto) {
		this.chanceAcerto = chanceAcerto;
	}
	public Item[] getItens() {
		return itens;
	}
	public void setItens(Item[] itens) {
		this.itens = itens;
	}  
	
	
}
