package grassignment.entity;

public class Product {
    private int id;
    private String proName;
    private String proDesc;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProDesc() {
        return proDesc;
    }

    public void setProDesc(String proDesc) {
        this.proDesc = proDesc;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(int id, String proName, String proDesc, int price) {
        this.id = id;
        this.proName = proName;
        this.proDesc = proDesc;
        this.price = price;
    }

    public void printInfoProduct() {
        System.out.printf("%d | %s | %s | %d \n", getId(), getProName(), getProDesc(), getPrice());
    }
}
