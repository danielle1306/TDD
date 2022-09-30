import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LivroTest {
	
	private Livro livro1, livro2;
	
	@Before
	
	public void setup() {
		livro1 = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "Fantasia", 300);
		livro2 = new Livro("Java Poo", 20, 50, "GFT", "educativo", 500);
	}
	@Test
	public void deveCalcularImpostoZeroParaTemaEducativo() throws Exception {// 0.1 é a margem de erro necessária para obj double e float.
		assertEquals(0, livro2.calcularImposto(), 0.1);//coloco o método dentro do parênteses pq esse valor só fica dentro do próprio método.
	}
	@Test
	public void deveCalcularImpostoParaDemaisTemas() throws Exception {
		assertEquals(4, livro1.calcularImposto(), 0.1);
		
	}
	
	}


