import java.util.Arrays;

public class Station {
    private int id;
    private String nom;
    private int nbVehicules=0;
    Vehicule[] vehicules = new Vehicule[10];

    public Station() {
    }

    public Station(int id, String nom, Vehicule[] vehicules) {
        this.id = id;
        this.nom = nom;
        this.vehicules = vehicules;
    }

    public void ajouterVehicule(Vehicule v) {
        if (nbVehicules < 10) {
            if (!enCoursDeTraitement(v)) {
                this.vehicules[nbVehicules] = v;
                nbVehicules++;
                System.out.println("Vehicule ajouté");
            } else {
                System.out.println("Ce vehicule est déjà en cours de traitement");
            }

            } else {
                System.out.println("La station est pleine");
            }

        }


    private boolean enCoursDeTraitement(Vehicule v) {
        for (int i = 0; i < nbVehicules; i++) {
            if (vehicules[i] != null && vehicules[i].getId() == v.getId()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Station{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbVehicules=" + nbVehicules +
                ", vehicules=" + Arrays.toString(vehicules) +
                '}';
    }


    public int NbrVoitureEssence() {
        int s = 0;
        for (Vehicule v : vehicules) {
            if (v != null && (enCoursDeTraitement(v)) && (v.getTypeDeCarburant().equals("essence") )){
                s += 1;
            }
        }
        return s;
    }
    public int NbrVoitureNoire() {
        int s = 0;
        for (Vehicule v : vehicules) {

                if (v != null && (enCoursDeTraitement(v))  && v instanceof Voiture && (((Voiture) v).getCouleur().equals("Noire") )) {
                    s += 1;
                }

        }
        return s;
    }
}