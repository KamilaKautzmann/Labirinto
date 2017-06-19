import java.util.Random;

import com.senac.SimpleJava.Graphics.Image;

public class Porta {
	static Random sT = new Random();
	private int corPorta = 0;
	private int destino = -1;
	private int sorteioSituacao = 0;
	private Armadilha armadilha;
	private Inimigo inimigo;
	private Image porta;

	
	public Porta(){
		this.sortearArmadilha(); //quando cria porta ja coloca se tem armadilha ou não
		this.InimigoPorta();// quando cria porta ja coloca se tem inimigo ou não
		//this.Situacao(); // Sortear situação da porta quando inicia
	}
		
	public int getDestino() {
		return destino;
	}

	public Armadilha getArmadilha(){
		return this.armadilha;
	}
	
	public void setDestino(int destino) {
		this.destino = destino;
	}

	public void Situacao() { // sortear se a porta ta fechada ou nao
		this.sorteioSituacao = sT.nextInt(2);

		if (this.sorteioSituacao == 0) {
			System.out.println("A porta possui cadeado! É necessario uma chave para abri-lo.");
		} else {
			System.out.println("Porta Aberta!");
		}

	}// final da AituaçãoF

	private void sortearArmadilha() { // sortear tem armadilha ou não
		
		String codigoDesarma = "";
		int sorteioArmadilha = 0;
		sorteioArmadilha = sT.nextInt(2);

		if (sorteioArmadilha == 1) {
			this.armadilha = new Armadilha();
		}
	
		
		
	}	

	public void InimigoPorta() { 

		int sorteioInimigo = 0;// Sortear inimigo
		sorteioInimigo = sT.nextInt(2);

		if (sorteioInimigo == 1) {
		
		int sorteioNomeInimigo = sT.nextInt(3); // Chamar o inimigo e atribuir as caracteristicas dele
		switch (sorteioNomeInimigo){
		case 1: this.inimigo = new Inimigo("Goblin",20.0,2.0,80.0);
			break;
		case 2: this.inimigo = new Inimigo("Orc",20.0,4.0,75.0);
			break;
		case 3: this.inimigo = new Inimigo("Goblin",20.0,6.0,50.0);
			break;
		default:
			break;
		}
			
		
	}//inimigoPorta

		
		
		
	}// inimigoPorta

}// porta
