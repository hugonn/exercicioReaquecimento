package exercReaquecimento;

public class Caixa {
	private Pessoa pessoa;
	private Boolean livre;
	
	public Caixa() {
		livre = true;
		pessoa = null;
	};
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
		livre = false;
	}

	public Boolean getLivre() {
		return livre;
	}

	public void setLivre(Boolean livre) {
		this.livre = livre;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}
}
