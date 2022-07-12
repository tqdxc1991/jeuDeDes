public class Joueur {
    public String nom;
    public int score;

    /**
     * initialise la valeur du nom du joueur à partir du paramètre nom,
     * initialise le score du joueur à 0
     * @param nom des jouer
     */
    public Joueur(String nom){
        this.setNom(nom);
        this.setScore(0);
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score += score;
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
     * @param gogo le goblet de joueur
     */
    public void jouer(Gobelet gogo){
        //chaque fois le joueur lance, il a un nouvel score
        this.setScore(gogo.lancer());

    }

    /**
     * affiche en console le score du joueur
     */
    public void afficher_score(){
        System.out.println(this.getNom()+ " a eu " + this.getScore());

    }

    @Override
    public String toString() {
        return "Joueur{" + "nom='" + nom + '\'' +
                ", score=" + score +
                '}';
    }
}
