package desafiosPooTdd;

public class Veiculo {
	//ATRIBUTOS
	
		private String marca;
		
		private String modelo;
		
	    private String placa;
		
		private String cor;
		
		private float km;
		
		private boolean isLigado;
		
		private int litrosCombustivel;
		
		private int velocidade;
		
		private double preco;

				
		//MÉTODO CONSTRUTOR	
		public Veiculo() {
			super();
			// TODO Auto-generated constructor stub
		}
			
		public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
				int litrosCombustivel, int velocidade, double preco) {
			super();
			this.marca = marca;
			this.modelo = modelo;
			this.placa = placa;
			this.cor = cor;
			this.km = km;
			this.isLigado = isLigado;
			this.litrosCombustivel = litrosCombustivel;
			this.velocidade = velocidade;
			this.preco = preco;
			
		}
		
		
		//MÉTODOS ACESSORES - GETTERS AND SETTERS

		


		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getPlaca() {
			return placa;
		}

		public void setPlaca(String placa) {
			this.placa = placa;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public float getKm() {
			return km;
		}

		public void setKm(float km) {
			this.km = km;
		}

		public boolean isLigado() {
			return isLigado;
		}

		public void setLigado(boolean isLigado) {
			this.isLigado = isLigado;
		}

		public int getLitrosCombustivel() {
			return litrosCombustivel;
		}

		public void setLitrosCombustivel(int litrosCombustivel) {
			this.litrosCombustivel = litrosCombustivel;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}
		
		public int getVelocidade() {
			return velocidade;
		}


		public void setVelocidade(int velocidade) {
			this.velocidade = velocidade;
		}


				
	public int acelerar() {
		if (isLigado) {
			this.velocidade += 20;
		} else {
			System.out.println("O carro está desligado");
		}
		return this.velocidade;
		
	}

	public int abastecer(int combustivel) {
		int totalCombustivel = this.litrosCombustivel + combustivel;
		if (totalCombustivel >= 60) {
			this.litrosCombustivel = 60;
		} else {
		this.litrosCombustivel = totalCombustivel;
		
		}
		return this.litrosCombustivel;
	}
	

	public int frear() {
		int velocidadeFinal = this.velocidade - 20;//já faz o cálculo de decremento da velocidade. mesmo negativo
	
		if (isLigado) {
			if (velocidadeFinal < 0) {
					this.velocidade = 0;
			} else {
				this.velocidade = velocidadeFinal;
			}
			
		} else {
				System.out.println("O carro está desligado ou estacionado");
			}
		
		return this.velocidade;	//pega o cálculo que foi feito ao longo do caminho.	
	}
	
	public void pintar(String corEscolhida) {
		this.cor = corEscolhida;
		
	}

	public void ligar() {
		if(isLigado) {
			System.out.println("O carro está ligado");
			
		} else {
			this.isLigado = true;
		 }
	
	
	
     }

	public void desligar() {
		if(!isLigado) {
			System.out.println("O carro já está desligado");
		} else {
			if (this.velocidade > 0) {
				System.out.println("O carro não podeser desligado pois está em movimento");
			} else {
				this.isLigado = false;
			}
		}
	}

		
		
		
}
