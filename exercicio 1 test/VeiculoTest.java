package desafiosPooTdd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VeiculoTest {
	private Veiculo veiculo;
	
	@Before
	public void setup() {
		veiculo = new Veiculo("renault", "kwid", "DAD3212", "laranja", 60, true, 20, 40, 40000);
	}
	
	@Test
	public void primeiro() throws Exception { //verifica se o ambiente está funcionando
		
	}
	
	@Test
	public void deveCriarClasseVeiculo() throws Exception {
		//verifica se a classe existe
		
	}	
	
	@Test
	public void testMetodoDeveAcelerar() throws Exception {
		veiculo = new Veiculo("renault", "kwid", "DAD3212", "laranja", 60, true, 20, 40, 40);
		veiculo.acelerar();
		assertEquals(60, veiculo.getVelocidade());		
		
	}
	@Test
	public void deveAbastecerCarro() throws Exception {
		veiculo.abastecer(20);//coloco no parâmentro quando a pessoa pode escolher o valor.
		assertEquals(40, veiculo.getLitrosCombustivel());
		
	}
	@Test
	public void deveFrearCarro() throws Exception {
		veiculo.frear();
		assertEquals(20, veiculo.getVelocidade());
		
	}
	@Test
	public void devePintarCarro() throws Exception {
		veiculo.pintar("vermelho");
		assertEquals("vermelho", veiculo.getCor());
	}
	
	@Test
	public void deveLigarCarro() throws Exception {
		veiculo.ligar();
		assertEquals(true, veiculo.isLigado());
		
	}
	@Test
	public void devePermanecerLigadoCarroEmVelocidade() throws Exception {
		veiculo.desligar();
		assertEquals(true, veiculo.isLigado());//não pode desligar pq está com velocidade.
	}
	@Test
	public void deveDesligarCarro() throws Exception {
		veiculo = new Veiculo("renault", "kwid", "DAD3212", "laranja", 60, true, 20, 0, 40000);
		veiculo.desligar();
		assertEquals(false, veiculo.isLigado());//Agora, com velocidade 0, ele deve ser capaz de desligar
		
	}
}


















