public class Veiculo {

    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private float km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;
    private double preço;


    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado, int litrosCombustivel, int velocidade, double preço) {
        if(!isLigado && velocidade>0){
            throw new IllegalArgumentException("O Veículo não pode estar desligado e com velocidade acima de Zero");
        } else {
            this.marca = marca;
            this.modelo = modelo;
            this.placa = placa;
            this.cor = cor;
            this.km = km;
            this.isLigado = isLigado;
            this.litrosCombustivel = litrosCombustivel;
            this.velocidade = velocidade;
            this.preço = preço;
        }
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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
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

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }


    public int acelerar() {
        if(!isLigado) {
            System.out.println("Ligue o veículo primeiro");
        } else {
            if(this.litrosCombustivel == 0){
                System.out.println("Você esté sem combustível, abasteça o veículo");
            }
            this.velocidade += 20;
        }
        return this.velocidade;

    }

    public int abastecer(int combustivel){
        int totalCombustivel = this.litrosCombustivel + combustivel;
        if(totalCombustivel >= 60){
            this.litrosCombustivel = 60;
        } else{
            this.litrosCombustivel = totalCombustivel;
        }
        return this.litrosCombustivel;
    }

    public int frear() {
        if(!isLigado) {
            System.out.println("O veículo já está desligado");
        } else {
            int velocidadeFinal = this.velocidade - 20;
            if(velocidadeFinal < 0){
                this.velocidade = 0;
            } else {
                this.velocidade = velocidadeFinal;
            }
        }
        return this.velocidade;
    }

    public void pintar(String cor) {
        this.cor = cor;
    }

    public void ligar(){
        if(!isLigado){
            this.isLigado = true;
        } else {
            System.out.println("O veículo já está ligado");
        }
    }

    public void desligar() {
        if(isLigado) {
            if(this.velocidade>0){
                System.out.println("Impossível desligar o veículo, ele ainda está em movimento");
            } else {
                this.isLigado = false;
            }
        } else {
            System.out.println("O veículo já está desligado");
        }
    }
}
