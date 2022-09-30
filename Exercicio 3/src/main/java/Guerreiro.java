import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem{

    private List<String> habilidade;

    public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> habilidade) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        this.habilidade = new ArrayList<String>();
    }

    public List<String> getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(List<String> habilidade) {
        this.habilidade = habilidade;
    }

    public void lvlUp(){
        super.setVida(super.getVida() + 20);
        super.setMana(super.getMana() + 10);
        super.setXp(super.getXp() + 10);
        super.setInteligencia(super.getInteligencia() + 10);
        super.setForca(super.getForca() + 20);
        super.setLevel(super.getLevel() + 1);
    }

    public int attack(){
        Random random = new Random();
        return (this.getForca() * this.getLevel() + random.nextInt(301));
    }

    public void aprenderHabilidade(String habilidade){
        if(habilidade == " "){
            throw new IllegalArgumentException("Não é possível inserir habilidade sem nome");
        }
        this.habilidade.add(habilidade);
    }

    @Override
    public String toString() {
        return "Guerreiro{" +
                "habilidade=" + habilidade +
                ", nome='" + getNome() +
                ", vida=" + getVida() +
                ", mana=" + getMana() +
                ", xp=" + getXp() +
                ", inteligencia=" + getInteligencia() +
                ", forca=" + getForca() +
                ", level=" + getLevel() +
                "} ";
    }
}
