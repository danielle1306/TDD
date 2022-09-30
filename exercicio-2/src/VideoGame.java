
public class VideoGame extends Produto implements CalcularImposto {
	private String marca;
	private String modelo;
	private boolean isUsado;

	
	public VideoGame(String nome, double preco, int quantidade, String marca, String modelo, boolean isUsado) {
		super(nome, preco, quantidade);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}
	

	
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

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}



	@Override
	public double calcularImposto() {
		double imposto;
		if (this.isUsado) {
			imposto = super.getPreco() * 0.25;
		} else {
			imposto = super.getPreco() * 0.45;
		}
		return imposto;
	}



	@Override
	public String toString() {
		return "VideoGame [marca=" + marca + ", modelo=" + modelo + ", isUsado=" + isUsado + ", getNome()=" + getNome()
				+ ", getPreco()=" + getPreco() + ", getQuantidade()=" + getQuantidade() + "]";
	}
	

}
