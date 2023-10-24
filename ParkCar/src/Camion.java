public class Camion extends Vehicule{
    private int nbrPlace;

    public Camion(int id, String marque, String typeDeCarburant) {
        super(id, marque, typeDeCarburant);
    }

    public Camion(int id, String marque, String typeDeCarburant, int nbrPlace) {
        super(id, marque, typeDeCarburant);
        this.nbrPlace = nbrPlace;
    }

    public int getNbrPlace() {
        return nbrPlace;
    }

    public void setNbrPlace(int nbrPlace) {
        this.nbrPlace = nbrPlace;
    }


}
