import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem{

    private List<String> magia;

    public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> magia) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        this.magia = new ArrayList<String>();
        this.magia.addAll(magia);
    }

    public List<String> getMagia() {
        return magia;
    }

    public void setMagia(List<String> magia) {
        this.magia = magia;
    }

    public void lvlUp(){
        super.setVida(super.getVida() + 10);
        super.setMana(super.getMana() + 20);
        super.setXp(super.getXp() + 10);
        super.setInteligencia(super.getInteligencia() + 20);
        super.setForca(super.getForca() + 10);
        super.setLevel(super.getLevel() + 1);
    }

    public int attack(){
        Random random = new Random();
        return (this.getInteligencia() * this.getLevel() + random.nextInt(301));
    }

    public void aprenderMagia(String magia){
        if(magia == " "){
            throw new IllegalArgumentException("Não é possível inserir magia sem nome");
        }
        this.magia.add(magia);
    }

    @Override
    public String toString() {
        return "Mago{" + "magia=" + magia +
                ", nome='" + getNome() +
                ", vida=" + getVida() +
                ", mana=" + getMana() +
                ", xp=" + getXp() +
                ", inteligencia=" + getInteligencia() +
                ", forca=" + getForca() +
                ", level=" + getLevel() +
                '}';
    }
}
