import java.util.*;
public class Gobelet {
    public int valeur;
    public List<De> mesDes = new ArrayList<>();

    /**
     * initialise la valeur du gobelet à 0,
     * génère le nombre de dés nécessaires à la partie et les ajoute au tableau des
     * @param nb_des nombre de des dans une gobelet
     */
    public Gobelet(int nb_des){
        this.setValeur(0);
        for(int i = 0;i < nb_des;i++){
            De newde = new De();
            this.mesDes.add(newde);
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
     * @return le somme de points de des
     */
    public int lancer(){
        int sum = 0;
        for(De monDe : this.mesDes){
            monDe.lancer();
            sum += monDe.getValeur();
        }
        this.setValeur(sum);
        return sum;
    }

    public void afficher_score(){
        System.out.println(getValeur());

    }
}
