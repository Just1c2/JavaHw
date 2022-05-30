package trainning.shop;

import  java.util.ArrayList;
import  java.util.Comparator;
import  java.util.List;

public class Repository {

    List<Product> listProducts = new ArrayList<>();

    public Repository() {
        listProducts.add(new Product("01", "Bánh Doraemon 3 vị", Category.FOOD, 100, 3500, 57));
        listProducts.add(new Product("02", "Xúc xích sườn non", Category.FOOD, 150, 3500, 12));
        listProducts.add(new Product("03", "Thanh cua", Category.FOOD, 100, 5000, 85));
        listProducts.add(new Product("04", "Bánh khoai môn", Category.FOOD, 200, 42000, 78));
        listProducts.add(new Product("05", "Thìa Inox", Category.HOUSEWARE, 100, 8000, 4));
        listProducts.add(new Product("06", "Nước hoa", Category.COSMETICS, 100, 33500, 88));
        listProducts.add(new Product("07", "Áo thun", Category.FASHION, 100, 333500, 57));
    }
    public void show() {
        listProducts.forEach(product -> System.out.println(product));
    }

    public void sortProductByName() {
        listProducts.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
    }

    public void filterProductByPrice() {
        listProducts.stream().filter(product -> product.getPrice() > 10000).forEach(product -> System.out.println(product));
    }

    public void countProductByAmountSale() {
        long count = listProducts.stream().filter(product -> product.getAmountSale() >= 50).count();
        System.out.println("Số lượng sản phẩm bán được từ 50 trở lên: " + count);
    }
}
