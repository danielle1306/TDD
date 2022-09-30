package exercicio7;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import tipos_funcionario.Vendedor;
import tipos_funcionario.Gerente;
import tipos_funcionario.Supervisor;

public class teste {
	
	private Vendedor vendedor;
	private Gerente gerente;
	private Supervisor supervisor;
	private double salario;

	@Before
	public void setup() {
		vendedor = new Vendedor("Lucas", 29, 1000);
		supervisor = new Supervisor("Maria", 32, 2000);
		gerente = new Gerente("Ana", 39, 3000);
	}

	
	@Test
	public void testarMetodoBonificacaoVendedor() throws Exception {
		salario = vendedor.getSalario();
		vendedor.bonificacao();
		assertEquals((salario +3000.0),vendedor.getSalario(), 0.0001 );
	}
	
	@Test
	public void testarMetodoBonificacaoSupervisor() throws Exception {
		salario = supervisor.getSalario();
		supervisor.bonificacao();
		assertEquals((salario + 5000.0),supervisor.getSalario(), 0.0001 );
	}
	
	@Test
	public void testarMetodoBonificacaoGerente() throws Exception {
		salario = gerente.getSalario();
		gerente.bonificacao();
		assertEquals((salario + 10000.0),gerente.getSalario(), 0.0001 );
	}
}
