
public class Armadilha {

	private String codDesarmar;
	private boolean situacaoArmadilha = true;
	
	public String getCodDesarmar() {
		return codDesarmar;
	}

	public void setCodDesarmar(String codDesarmar) {
		this.codDesarmar = codDesarmar;
	} 
	
	public Armadilha(){
		this.codDesarmar = "XXXXXX";
		
	}

	public boolean isSituacaoArmadilha() {
		return situacaoArmadilha;
	}

	public void setSituacaoArmadilha(boolean situacaoArmadilha) {
		this.situacaoArmadilha = situacaoArmadilha;
	}
	
	

}