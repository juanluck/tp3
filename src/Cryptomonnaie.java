public class Cryptomonnaie{
    private String nom;
    private double valeurDeJeton ;

    public Cryptomonnaie(String nom, double valeurDeJeton){
        this.nom = nom;
        this.valeurDeJeton = valeurDeJeton;
    }

    public String getNom() {
        return nom;
    }

    public double getValeurDeJeton() {
        return valeurDeJeton;
    }

    @Override
    public String toString() {
        return nom+":"+valeurDeJeton;
    }
}