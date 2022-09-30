package tipos_funcionario;

import funcionario.funcionario;

public class Gerente extends funcionario {

	public Gerente(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}

	@Override
	public double bonificacao() {
		double bonificao = 10000.0;
		
		this.setSalario(getSalario() + bonificao);
		return getSalario();
	}
	
}
