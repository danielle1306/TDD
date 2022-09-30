import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class VeiculoTest {

    private Veiculo veiculo;

    @Before
    public void setup(){
        veiculo = new Veiculo("renaut", "Sandero", "GHJ8765", "preto", 5000
                , true, 20, 50, 35000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void validaCenarioDeExcessaoNaInstanciaDeCarroDesligadoEComVelocidadeAcimaDeZero(){
        veiculo = new Veiculo("renaut", "Sandero", "GHJ8765", "preto", 5000
                , false, 20, 10, 35000);
    }

    @Test
    public void naoDeveAcelerarVeiculoDesligado(){
        veiculo = new Veiculo("renaut", "Sandero", "GHJ8765", "preto", 5000, false, 20, 0, 35000);
        veiculo.acelerar();
        assertFalse(veiculo.isLigado());
        assertEquals(0, veiculo.getVelocidade());
    }

    @Test
    public void deveAceleraAumentandoAVelocidadeEm20(){
        veiculo.acelerar();
        assertEquals(70, veiculo.getVelocidade());
    }

    @Test
    public void deveAbastecerVeiculo(){
        veiculo.abastecer(10);
        assertEquals(30, veiculo.getLitrosCombustivel());
    }

    @Test
    public void deveLimitarAbastecerVeiculoComValorDoTamque(){
        veiculo.abastecer(50);
        assertEquals(60, veiculo.getLitrosCombustivel());
    }

    @Test
    public void naoDeveFrearVeiculoDesligado(){
        veiculo = new Veiculo("renaut", "Sandero", "GHJ8765", "preto", 5000, false, 20, 0, 35000);
        veiculo.frear();
        assertFalse(veiculo.isLigado());
        assertEquals(0, veiculo.getVelocidade());
    }

    @Test
    public void deveFrearDiminuindoAVelocidadeEm20(){
        veiculo.frear();
        assertEquals(30, veiculo.getVelocidade());
    }

    @Test
    public void deveLimitarDiminuirVelocidadeAZero(){
        veiculo = new Veiculo("renaut", "Sandero", "GHJ8765", "preto", 5000, true, 20, 15, 35000);
        veiculo.frear();
        assertEquals(0, veiculo.getVelocidade());
    }

    @Test
    public void deveMudarACordoVeiculo(){
        veiculo.pintar("azul");
        assertEquals("azul", veiculo.getCor());
    }

    @Test
    public void deveLigarOVeiculoDesligado(){
        veiculo = new Veiculo("renaut", "Sandero", "GHJ8765", "preto", 5000, false, 20, 0, 35000);
        veiculo.ligar();
        assertTrue(veiculo.isLigado());
    }

    @Test
    public void deveDesligarOVeiculoLigadoEVelocidadeZero() {
        veiculo = new Veiculo("renaut", "Sandero", "GHJ8765", "preto", 5000, true, 20, 0, 35000);
        veiculo.desligar();
        assertFalse(veiculo.isLigado());
    }


    @Test
    public void naoDesligarCarroEmMovimento(){
        veiculo.desligar();
        assertTrue(veiculo.isLigado());
        assertEquals(50, veiculo.getVelocidade());
    }
}
