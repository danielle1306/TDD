package tipos_funcionario;

import funcionario.funcionario;

public class Supervisor extends funcionario {

	public Supervisor(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}
	
	@Override
	public double bonificacao() {
		double bonificao = 5000.0;
		
		this.setSalario(getSalario() + bonificao);
		return getSalario();
	}
}
