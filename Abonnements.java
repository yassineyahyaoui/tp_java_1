import java.util.Map;
import java.util.TreeMap;

public class Abonnements {
    private TreeMap<String, Categorie> abonnement = new TreeMap<String, Categorie>();

    public Abonnements() {
        abonnement.put("Silver", new Categorie(30));
        abonnement.put("Bronze", new Categorie(20));
        abonnement.put("Gold", new Categorie(50));
    }

    public void ajouter(String c, Abonne a) {
        try {
            abonnement.get(c).ajouter(a);
        } catch (RedondanceException e) {
            e.printStackTrace();
        }
    }

    public void retirer(String c, int cin) {
        abonnement.get(c).retirer(String.valueOf(cin));
    }

    public void retirerAbonne(Abonne a) {
        for (Categorie c : abonnement.values()) {
            if (c.estPresent(a))
                c.retirer(String.valueOf(a.getCin()));
        }
    }

    public float calculRecette() {
        float recetteTotale = 0;
        for (Map.Entry<String, Categorie> entry : abonnement.entrySet()) {
            Categorie categorie = entry.getValue();
            recetteTotale += categorie.recette();
        }
        return recetteTotale;
    }

    public boolean estPresent(Abonne a) {
        for (Categorie c : abonnement.values()) {
            if (c.estPresent(a)) {
                return true;
            }
        }
        return false;
    }
}
