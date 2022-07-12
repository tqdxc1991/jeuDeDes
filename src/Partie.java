import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Partie {
    public List<Joueur> mesJouers = new ArrayList<>();
    public int nb_tours;
    public Gobelet mongobelet;

    /**
     * crée l'objet Partie en récupérant le nombre de tours et nombre de dés
     * @param nb_des le nombre de des
     * @param nb_tours le nombre de tours
     */
    public Partie(int nb_tours,int nb_des){
        this.nb_tours = nb_tours;
        this.mongobelet = new Gobelet(nb_des);
    }

    /**
     *  : permet d'inscrire des joueurs dans la partie
     * @param noms tableau de noms des joueurs
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
    public void lancer(){
        List<Joueur> gagnants = new ArrayList<>();
        //initialiser la liste avec une premier valeur
        gagnants.add(this.mesJouers.get(0));

        for(int i = 0; i < this.nb_tours; i++){
            System.out.println("Tour numero :"+ (i+1));
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


        this.afficher_gagnant(gagnants);

    }

    public void afficher_gagnant(List<Joueur> gagnants){

        //afficher le gagnant
        System.out.println("le gagnant est : "+ Arrays.toString(gagnants.toArray()));
    }

}
