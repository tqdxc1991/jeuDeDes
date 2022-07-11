import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Le jeu de dés commence!");

        System.out.println("saisir le nombre de dés");
        int nb_des = scanner.nextInt();

        System.out.println("saisir le nombre de tour");
        int nb_tours = scanner.nextInt();

        System.out.println("saisir le nombre des joueurs");
        int nb_jouerus = scanner.nextInt();

        String[] noms = new String[nb_jouerus];
        for(int i = 0; i< noms.length;i++){
            System.out.println("saisir un nom");
            noms[i] = scanner.next();
        }

        Partie testPartie = new Partie(nb_tours,nb_des);

        testPartie.initialiser(noms);


        testPartie.lancer();

        testPartie.afficher_gagnant();

    }
}