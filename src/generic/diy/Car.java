package generic.diy;

public class Car {
    private String name;
    private int price;
    private String production;

    public void printList() {
        System.out.printf("%s   |       %d       |       %s\n", getName(), getPrice(), getProduction());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public Car(String name, int price, String production) {
        this.name = name;
        this.price = price;
        this.production = production;
    }
}
