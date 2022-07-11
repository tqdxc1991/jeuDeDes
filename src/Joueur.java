public class Joueur {
    public String nom;
    public int score;

    /**
     * initialise la valeur du nom du joueur à partir du paramètre nom,
     * initialise le score du joueur à 0
     * @param nom
     */
    public Joueur(String nom){
        this.setNom(nom);
        this.setScore(0);
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * prend en paramètre le gobelet de la partie, lance le gobelet, met à
     * jour le score du joueur en fonction du résultat du lancé
     * @param gogo
     */
    public int jouer(Gobelet gogo){
        this.setScore(gogo.lancer());
        return gogo.lancer();
    }

    /**
     * affiche en console le score du joueur
     */
    public void afficher_score(){
        System.out.println(this.getScore());

    }
}
