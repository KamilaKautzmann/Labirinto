
public class Porta {

	private String pAzul = "";
	private String pVerde = "";
	private String pVermelho = "";
	private String pAmarelo = "";
	private String tipo = "";
	
	
	public Porta(String PortaAzul, String PortaVerde, String PortaAmarelo, String PortaVermelho, String tipo){
		this.pAzul = PortaAzul; 
		this.pVerde = PortaVerde;
		this.pVermelho = PortaVermelho;
		this.pAmarelo = PortaAmarelo;
		this.tipo = tipo;
					
			
		
		int numeroPorta = (int)(Math.random()*4);
		
		}
				
		
	public static String Cadeado(String tipo){
		if (tipo == "Fechado"){
		System.out.println("É necessario uma chave para abrir essa porta.");
		}else{
		System.out.println("Porta aberta!");
	}
		return tipo;
	
	}// final do cadeado	
		
	
}// porta
