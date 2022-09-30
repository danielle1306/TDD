
public class Livro extends Produto implements CalcularImposto {
	
	private String autor;
	
	private String tema;
	
	private int quantidadePag;
	
	

	//CONSTRUTOR
	public Livro(String nome, double preco, int quantidade, String autor, String tema, int quantidadePag) {
		super(nome, preco, quantidade);
		this.autor = autor;
		this.tema = tema;
		this.quantidadePag = quantidadePag;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

		
	public int getQuantidadePag() {
		return quantidadePag;
	}

	public void setQuantidadePag(int quantidadePag) {
		this.quantidadePag = quantidadePag;
}

	@Override
	public double calcularImposto() {
		double imposto;
		if (this.tema.equals("educativo")) {
		//if (getTema() == "educativo") {
			System.out.println("Taxa de imposto é zero\n " +  super.getPreco() "\n" + super.getNome());
			imposto = 0;
		
		 } else {
			 imposto = this.getPreco() * 0.1;
		System.out.println ("O imposto é: R$ "  + imposto);
	}
		return imposto;
	}

	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", tema=" + tema + ", quantidadePag=" + quantidadePag + ", getNome()="
				+ getNome() + ", getPreco()=" + getPreco() + ", getQuantidade()=" + getQuantidade() + "]";//posso mudar os parâmetros e até a config deles.
	}
	

}
