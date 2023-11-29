public class Abonne {
    private String nom;
    private String prenom;
    private Integer cin;

    public Abonne(String nom, String prenom, Integer cin) {
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Integer getCin() {
        return cin;
    }

    @Override
    public String toString() {
        return "Abonne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", cin=" + cin +
                '}';
    }
}
