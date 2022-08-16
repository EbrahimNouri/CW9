public class Fruit implements Boxable{
    private String name;
    private String colour;
    private String country;
    private double weight;

    public Fruit(String name, String colour, String country, double weight) {
        this.name = name;
        this.colour = colour;
        this.country = country;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", country='" + country + '\'' +
                ", weight=" + weight +
                '}';
    }
}
