import java.util.Random;

public class Sala {

	private Porta portaSul;
	private Porta portaNorte;
	private Porta portaLeste;
	private Porta portaOeste;
	private Item[] itens;
	private int numeroSala=0;

	
	static Random sT = new Random();
	
	public Sala(){ //construtor da porta na sala
		
		this.portaSul = new Porta();
		this.portaNorte = new Porta();
		this.portaLeste = new Porta();
		this.portaOeste = new Porta();
	}

	public int getNumeroSala() {
		return numeroSala;
	}

	public void setNumeroSala(int numeroSala) {
		this.numeroSala = numeroSala;
	}
	
	public void setDestinoPorta(String porta, int destinoPorta){ //colocar o destino da porta
		
		switch (porta) {
		case "portaSul": this.portaSul.setDestino(destinoPorta);
			break;
		case "portaNorte": this.portaNorte.setDestino(destinoPorta);
			break;
		case "portaLeste": this.portaLeste.setDestino(destinoPorta);
			break;
		case "portaOeste": this.portaOeste.setDestino(destinoPorta);
			break;
		default:
			break;
		}
		
		
	}
	
	public void ArmaSala() { // sortear tem arma ou não e chama o construtor

		int sorteioArmaSala = 0;
		sorteioArmaSala = sT.nextInt(2);

		if (sorteioArmaSala == 1) {
		int tamanhoItens = this.itens.length;
		int sorteioNomeArma = sT.nextInt(4); // Chamar arma e atribuir as caracteristicas dele
		switch (sorteioNomeArma){
		case 1: this.itens[tamanhoItens] = new Armas("Adaga",1.0,75.0);
			break;
		case 2: this.itens[tamanhoItens] = new Armas("Faca",2.0,80.0);
			break;
		case 3: this.itens[tamanhoItens] = new Armas("Espada",3.0,85.0);
			break;
		case 4: this.itens[tamanhoItens] = new Armas("Espada Longa",5.0,65.0);
		break;
		default:
			break;
		}
			
		}
}//ArmaSala

	public void ArmaduraSala(){// sortear tem armadilha ou não e chama o construtor
		
	int sorteioArmaduraSala = 0;// Sortear inimigo
	sorteioArmaduraSala = sT.nextInt(2);

	if (sorteioArmaduraSala == 1) {
		int tamanhoItens = this.itens.length;	
	int sorteioArmadura = sT.nextInt(3); // Chamar o inimigo e atribuir as caracteristicas dele
	switch (sorteioArmadura){
	case 1: this.itens[tamanhoItens] = new Armadura("Armadura de Couro",2.0);
		break;
	case 2: this.itens[tamanhoItens] = new Armadura("Armadura de Metaal",3.0);
		break;
	case 3: this.itens[tamanhoItens] = new Armadura("Armadura de Mithril",5.0);
		break;
	default:
		break;
	}
		
	}
	
}//final do inimigo
	
	private void sortearEscudo() { // sortear tem escudo ou não e chama o construtor
		
		int sorteioEscudo = 0;
		sorteioEscudo = sT.nextInt(2);
		int tamanhoItens = this.itens.length;
		if (sorteioEscudo == 0) {
			this.itens[tamanhoItens] = new Escudo("Escudo",25.0);
		}
	
	}// final do sortear escudo 
	
}// final Sala
