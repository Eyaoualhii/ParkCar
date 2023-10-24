public class Main {
    public static void main(String[] args) {

        Vehicule[] vehicules = new Vehicule[10];

        Station station = new Station(1, "Ma Station", vehicules);

        Voiture voiture1 = new Voiture(1, "Toyota", "Essence", "Noire");
        Voiture voiture2 = new Voiture(2, "Honda", "Diesel", "Blanche");
        Camion camion1 = new Camion(3, "Volvo", "Essence", 2);

        station.ajouterVehicule(voiture1);
        station.ajouterVehicule(voiture2);
        station.ajouterVehicule(camion1);

        System.out.println(station);
        int nbrVoitureEssence = station.NbrVoitureEssence();
        int nbrVoitureNoire = station.NbrVoitureNoire();

        System.out.println("Nombre de voitures essence en cours de traitement : " + nbrVoitureEssence);
        System.out.println("Nombre de voitures noires en cours de traitement : " + nbrVoitureNoire);
    }
}