import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VideoGameTest {
	private VideoGame videoGame;
	
	@Before
	
	public void setup() {
		videoGame = new VideoGame("PS4", 1800, 100, "Sony", "Slim", true);
	}
	
	@Test
	public void deveCriarClasseVideoGame() throws Exception {
		
		
	}
	@Test
	public void deveCalcularIMpostoVideoGameUsado() throws Exception {
		assertEquals(450, videoGame.calcularImposto(), 0.1);
	}
	@Test
	public void deveTestarImpostoVideoGameNovo() throws Exception {
		videoGame = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
		assertEquals(810, videoGame.calcularImposto(), 0.1);
	}

}
