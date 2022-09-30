import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RpgTest {

    Mago m1,m2;
    Guerreiro g1,g2;

    @Before
    public void setup(){
        List<String> magias = new ArrayList<String>();
        m1 = new Mago("Raspitn", 100, 300, 2000, 200, 80, 1, magias);
        m2 = new Mago("Harry Potter", 80, 200, 1800, 150, 60, 1, magias);
        List<String> habilidade = new ArrayList<String>();
        g1 = new Guerreiro("Kratos", 300, 30, 3000, 100, 480, 1, habilidade);
        g2 = new Guerreiro("Xena", 300, 30, 3000, 180, 480, 1, habilidade);
    }

    @Test
    public void deveContarNumeroTotalDePersonagensCriados(){
        assertEquals(4, Personagem.getNumPersonagem());
    }

    @Test
    public void magoDeveSubirDeLevelIncrementandoAtributos(){
        m1.lvlUp();
        assertEquals(110, m1.getVida());
        assertEquals(320, m1.getMana());
        assertEquals(2010, m1.getXp(), 0.0001);
        assertEquals(220, m1.getInteligencia());
        assertEquals(90, m1.getForca());
        assertEquals(2, m1.getLevel());
    }

    @Test
    public void cadaMagoDeveAprenderNovaMagiaDiferenteDeOutroPersonagem(){
        m1.aprenderMagia("Invocar os Mortos");
        m2.aprenderMagia("Tempestade de Gelo");
        m2.aprenderMagia("Bola de Fogo");
        assertEquals(1, m1.getMagia().size());
        assertTrue(m1.getMagia().contains("Invocar os Mortos"));
        assertEquals(2, m2.getMagia().size());
        assertTrue(m2.getMagia().contains("Tempestade de Gelo"));
        assertTrue(m2.getMagia().contains("Bola de Fogo"));
    }

    @Test
    public void GuerreiroDeveSubirDeLevelIncrementandoAtributos(){
        g1.lvlUp();
        assertEquals(320, g1.getVida());
        assertEquals(40, g1.getMana());
        assertEquals(3010, g1.getXp(), 0.0001);
        assertEquals(110, g1.getInteligencia());
        assertEquals(500, g1.getForca());
        assertEquals(2, g1.getLevel());
    }

    @Test
    public void cadaGuerreiroDeveAprenderNovaHabilidadeDiferenteDeOutroPersonagem(){
        g1.aprenderHabilidade("Pancada de Escudo");
        g2.aprenderHabilidade("Fingir de Morto");
        g2.aprenderHabilidade("Esmagar");
        assertEquals(1, g1.getHabilidade().size());
        assertTrue(g1.getHabilidade().contains("Pancada de Escudo"));
        assertEquals(2, g2.getHabilidade().size());
        assertTrue(g2.getHabilidade().contains("Fingir de Morto"));
        assertTrue(g2.getHabilidade().contains("Esmagar"));
    }

}
