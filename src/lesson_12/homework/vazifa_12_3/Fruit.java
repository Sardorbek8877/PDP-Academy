package lesson_12.homework.vazifa_12_3;

public class Fruit {

    private String name;
    private String type;
    private int sale;

    public Fruit() {
    }

    public Fruit(String name, String type, int sale) {
        this.name = name;
        this.type = type;
        this.sale = sale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", sale=" + sale +
                '}';
    }
}
