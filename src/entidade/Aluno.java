package entidade;

/**
 *
 * @author Matheus Silva
 */

public class Aluno {
	
	private String nome;
	private String cpf;
	private String ra;
     
     public Aluno(String nome, String cpf, String ra){
	     this.nome = nome;
	     this.cpf = cpf;
	     this.ra = ra;
     }

	public Aluno() {
		
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the ra
	 */
	public String getRa() {
		return ra;
	}

	/**
	 * @param ra the ra to set
	 */
	public void setRa(String ra) {
		this.ra = ra;
	}
     
}
