public class Voiture extends Vehicule{
    private String couleur;



    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Voiture(int id, String marque, String typeDeCarburant) {
        super(id, marque, typeDeCarburant);
    }

    public Voiture(int id, String marque, String typeDeCarburant, String couleur) {
        super(id, marque, typeDeCarburant);
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "couleur='" + couleur + '\'' +
                '}';
    }
}
