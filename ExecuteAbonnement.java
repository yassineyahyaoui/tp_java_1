public class ExecuteAbonnement {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!\n");

        Abonne a = new Abonne("Yahyaoui", "Mohamed Yassine", 1234);
        Categorie c = new Categorie(5);
        try {
            c.ajouter(a);
        } catch(RedondanceException e) {
            e.printStackTrace();
        }

        Abonnements abonnements = new Abonnements();
        abonnements.ajouter("Silver", a);

        float recetteTotale = abonnements.calculRecette();
        System.out.println("Recette totale: " + recetteTotale);

        boolean estPresent = abonnements.estPresent(a);
        System.out.println("Abonné présent dans l'ensemble des abonnements : " + estPresent);
    }
}
