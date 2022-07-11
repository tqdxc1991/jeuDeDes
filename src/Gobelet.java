import java.util.*;
public class Gobelet {
    public int valeur;
    public List<De> mesDes;

    /**
     * initialise la valeur du gobelet à 0,
     * génère le nombre de dés nécessaires à la partie et les ajoute au tableau des
     * @param nb_des
     */
    public Gobelet(int nb_des){
        this.setValeur(0);
        for(int i = 0;i < nb_des;i++){
            mesDes.add(new De());
        }

    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public int getValeur() {
        return this.valeur;
    }

    /**
     * change la valeur des dés du gobelet ;
     * met à jour la valeur du gobelet
     */
    public void lancer(){
        int sum = 0;
        for(De monDe : this.mesDes){
            sum += monDe.lancer();
        }
        this.setValeur(sum);
    }

    public void afficher(){

    }
}
