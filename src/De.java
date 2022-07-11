import java.util.*;
public class De {
    public int valeur;
    De(){
        this.setValeur(0);
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public int getValeur() {
        return this.valeur;
    }

    /**
     * changer la valeur du dé
     * @return un nombre aléatoire entre 1 et 6
     */
    public int lancer(){
        Random r = new Random();
        int numeroLance = r.nextInt(6)+1;
        System.out.println(numeroLance);
        return numeroLance;
    }
}
