package exercReaquecimento;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class testeClasses {
	
	private Filas gerenciadorF;
	private Caixa[] filaCaixas;
	@Before
	public void criaFila() throws Exception{
		 gerenciadorF = new Filas();
	     filaCaixas = new Caixa[10];
	}

	@Test
	public void testPessoa() {
		Pessoa pes = new Pessoa("Hugo",25);
		
		assertNotNull(pes);
	}
	
	@Test
	public void testCaixa() {
		Caixa cx = new Caixa();
		
		assertNotNull(cx);
	}
	
	@Test
	public void testFilaPessoas() {
		Pessoa pes = new Pessoa("Hugo",25);
		Pessoa pes2 = new Pessoa("Hugo2",26);
		Pessoa pes3 = new Pessoa("Hugo3",27);
		Pessoa pes4 = new Pessoa("Hugo4",28);
		
		gerenciadorF.adicionaPessoa(pes);
		gerenciadorF.adicionaPessoa(pes2);
		gerenciadorF.adicionaPessoa(pes3);
		gerenciadorF.adicionaPessoa(pes4);
		
		assertEquals(4, gerenciadorF.getFilaPessoas().size());
	}
	
	@Test
	public void testIdade65() {
		Pessoa pes = new Pessoa("Hugo",70);
		gerenciadorF.adicionaPessoa(pes);
		gerenciadorF.organizaFilas();
		Pessoa pes2 = gerenciadorF.getFilaCaixas()[0].getPessoa();
		
		assertEquals("Hugo", pes2.getNome());
	}
	@Test
	public void testIdadeMenor65() {
		Pessoa pes = new Pessoa("Hugo",25);
		gerenciadorF.adicionaPessoa(pes);
		gerenciadorF.organizaFilas();
		Pessoa pes2 = gerenciadorF.getFilaCaixas()[5].getPessoa();
		
		assertEquals("Hugo", pes2.getNome());
	}

}
