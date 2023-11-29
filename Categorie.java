import java.util.ArrayList;

public class Categorie {
    private ArrayList<Abonne> liste = new ArrayList<Abonne>();
    private float prix;

    public Categorie(float prix) {
        this.prix = prix;
    }

    public void ajouter(Abonne a) throws RedondanceException {
        for (Abonne ab : liste) {
            if (ab.getCin() == a.getCin())
                throw new RedondanceException();
        }
        liste.add(a);
    }

    public void retirer(String CIN) {
        int cin;
        try {
            cin = Integer.parseInt(CIN);
        } catch (NumberFormatException e) {
            cin = 0;
        }
        for (Abonne ab : liste) {
            if (ab.getCin() == cin) {
                liste.remove(ab);
            }
        }

    }

    public int nbAbonne() {
        return liste.size();
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "liste=" + liste +
                ", prix=" + prix +
                '}';
    }

    public boolean estPresent(Abonne a) {
        for (Abonne ab : liste) {
            if (ab.getCin() == a.getCin())
                return true;
        }
        return false;
    }

    public float recette() {
        return liste.size() * prix;
    }
}
