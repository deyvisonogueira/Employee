package model;

public abstract class Empregado {
	private String nome;
	private String fone;

	public Empregado(String pNome, String pFone) {
		this.nome = pNome;
		this.fone = pFone;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String pNome) {
		this.nome = pNome;
	}

	public void setFone(String pFone) {
		this.fone = pFone;
	}

	public String getFone() {
		return this.fone;
	}
	
	//Método Abstrato
	public abstract double salario();

	//public String dadosFormatados(){		
		//return String.format("Nome: %s\nFone: %s\n",
				//this.nome, this.fone);
	//}

}
