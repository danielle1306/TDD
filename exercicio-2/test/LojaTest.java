import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import exercicio2.Livro;
import exercicio2.VideoGame;

public class LojaTest {
	private Livro livro1;
	private Livro livro2;
	private VideoGame videoGame;
	private List<Livro> livros;
	private List<VideoGame>videoGames;
	private Loja loja;

	
	@Before
	public void setup() {//só quero criar a classe, então não preciso criar nada dentro da lista ainda.
		livros = new ArrayList<> ();//sempre tenho que colocar o <> depois de ArrayList.
		videoGames = new ArrayList<> ();
		loja = new Loja("Papirus", 001234, livros, videoGames);
		livro1 = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "Fantasia", 300);
		livro2 = new Livro("Java Poo", 20, 50, "GFT", "educativo", 500);
		videoGame = new VideoGame("PS4", 1800, 100, "Sony", "Slim", true);
	}
	@Test
	public void testMetodoListarLivro() throws Exception {
		loja.listarLivro();
		
		
	}
	@Test
	public void testMetodoListarLivroComDados() throws Exception {
		livros.add(livro1);
		loja.listarLivro();
		
	}
	@Test
	public void testMetodoListarVideoGames() throws Exception {
		videoGames.add(videoGame);
		loja.listarVideoGames();
		
	}
	@Test
	public void testMetodoCalcularPatrimonio() throws Exception {
		loja.calcularPatrimonio();
		
	}
}
