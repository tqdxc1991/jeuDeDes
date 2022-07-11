import java.sql.SQLOutput;
import java.util.*;

public class Partie {
    public List<Joueur> mesJouers = new ArrayList<>();
    public int nb_tours;
    public Gobelet mongobelet;

    /**
     * crée l'objet Partie en récupérant le nombre de tours et nombre de dés
     * @param nb_tours
     * @param nb_des
     */
    public Partie(int nb_tours,int nb_des){
        this.nb_tours = nb_tours;
        this.mongobelet = new Gobelet(nb_des);
    }

    /**
     *  : permet d'inscrire des joueurs dans la partie
     * @param noms
     */
    public void initialiser(String ...noms){
        for(String nom : noms){
            this.mesJouers.add(new Joueur(nom));
            System.out.println(nom +" a participé dans le jeu!");
        }

    }

    /**
     *  lance la partie : chaque joueur joue à tour de rôle pendant les n tours. Une
     * fois la partie terminée, affiche le gagnant.
     */
    public List<Joueur> lancer(){
        List<Joueur> gagnants = new ArrayList<>();

        for(int i = 0; i < this.nb_tours; i++){
            //chaque tour on accumu les score de chaque jouer
            for(Joueur jojo : this.mesJouers){
                jojo.jouer(this.mongobelet);
                jojo.afficher_score();
            }

        }

        int max = 0;
        for(Joueur jojo : this.mesJouers){
            if(jojo.getScore() > max){
                max = jojo.getScore();
                gagnants.set(0,jojo);

            }
            else if(jojo.getScore() == max){
                max = jojo.getScore();
                gagnants.add(jojo);
            }

        }


        System.out.println(gagnants.get(0));
        return gagnants;
    }

    public void afficher_gagnant(){
        List<Joueur> gagnants = this.lancer();
        //afficher le gagnant
        System.out.println(Arrays.toString(gagnants.toArray()));
    }

}
