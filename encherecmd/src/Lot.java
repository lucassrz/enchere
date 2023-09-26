public class Lot {
    private String name;
    private double minimumPrice;
    private double currentPrice;
    private double poid;
    private String proprietaire;

    public Lot(String name, double minimumPrice, double poid, String proprietaire) {
        this.name = name;
        this.minimumPrice = minimumPrice;
        this.currentPrice = minimumPrice;
        this.poid = poid;
        this.proprietaire = proprietaire;
    }

    public String getName() {
        return name;
    }

    public double getMinimumPrice() {
        return minimumPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getPoid() {
        return poid;
    }

    public String getProprietaire() {
        return proprietaire;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }
}
