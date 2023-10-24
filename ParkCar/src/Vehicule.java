import java.util.Objects;

public class Vehicule {
    private int id;
    private String marque;
    private String typeDeCarburant;


    public Vehicule(int id, String marque, String typeDeCarburant) {
        this.id = id;
        this.marque = marque;
        this.typeDeCarburant = typeDeCarburant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getTypeDeCarburant() {
        return typeDeCarburant;
    }

    public void setTypeDeCarburant(String typeDeCarburant) {
        this.typeDeCarburant = typeDeCarburant;
    }


    public String toString() {
        return "Vehicule{" +
                "id=" + id +
                ", marque='" + marque + '\'' +
                ", typeDeCarburant='" + typeDeCarburant + '\'' +
                '}';
    }

    public boolean equals(Vehicule v) {
        if ((this.id == v.getId()) && (this.marque == v.getMarque())){
            return true;
        }
        return false;
    }




}
