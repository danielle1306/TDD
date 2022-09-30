package tipos_funcionario;

import funcionario.funcionario;

public class Vendedor extends funcionario{

	public Vendedor(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}
	
	@Override
	public double bonificacao() {
		double bonificao = 3000.0;
		
		this.setSalario(getSalario() + bonificao);
		return getSalario();
	}
	
}
