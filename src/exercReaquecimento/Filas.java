package exercReaquecimento;

import java.util.ArrayList;
import java.util.Calendar;

public class Filas {
	private ArrayList<Pessoa> fila = new ArrayList<Pessoa>();
	private Caixa[] filaCaixas = new Caixa[10];
	
	public Filas() {
		for(int i =0; i<10;i++) {
			Caixa c = new Caixa();
			filaCaixas[i] = c;
		}
	}
	
	public Caixa[] getFilaCaixas() {
		return this.filaCaixas;
	}
	public ArrayList<Pessoa> getFilaPessoas() {
		return this.fila;
	}
	
	public void adicionaPessoa(Pessoa pes) {
		fila.add(pes);
	}
	
	public void mostraPessoasFila() {
		for(Pessoa p : fila) {
			System.out.println("Nome:"+ p.getNome() +"\n" + "Idade: "+ p.getIdade() +"\n");
		}
	}
	
	public void mostraCaixas() {
		for(int i =0; i<10;i++) {
			System.out.println((filaCaixas[i].getLivre()== true ?"Caixa Vazio - " +i : "Caixa Ocupado - "+i +" - Nome: " + filaCaixas[i].getPessoa().getNome() ) +"\n");
		}
	}
	
	public void organizaFilas() {
		
		for(int i = fila.size()-1; i>=0;i--){    // percorrendo arrayList de tras pra frente, ou seja, dos primeiros que chegaram até o último
			
			if(fila.get(i).getIdade() < 65){
				for(int j = 5; j<filaCaixas.length; j++) {  // percorre os caixas livres para todas as idades, caso livre, aloca pessoa  
					if(filaCaixas[j].getLivre() == true) {
						filaCaixas[j].setPessoa(fila.get(i));
						filaCaixas[j].setLivre(false);
						break;
					}
				}
			}else if(fila.get(i).getIdade() > 65)  {
				for(int k=0; k<5; k++) {
					if(filaCaixas[k].getLivre() == true) {
						filaCaixas[k].setPessoa(fila.get(i));
						filaCaixas[k].setLivre(false);
						break;
					}
				}
				
			}
		}
		//
	}
	
	public void limpaFila() {
		fila.removeAll(fila);
	}
}
