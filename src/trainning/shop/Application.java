package trainning.shop;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {
        Repository repository = new Repository();
        Scanner scanner = new Scanner(System.in);
        Menu.mainMenu();
        int choose = scanner.nextInt();
        switch (choose) {
            case 8:
                System.exit(0);
                break;
            case 1:
                System.out.println("DANH SÁCH SẢN PHẨM");
                repository.show();
                break;
            case 2:
                System.out.println("Các sản phẩm có giá trị trên 10.000 là: ");
                repository.filterProductByPrice();
                break;
            case 3:
                repository.countProductByAmountSale();
                break;
            case 4:
                repository.filterProductByType();
                System.out.println("Sản phẩm xếp theo loại: ");
                repository.show();
                break;
            case 6:
                repository.printMaxAmountSale();
                break;
            case 7:
                repository.sortProductByName();
                System.out.println("Sản phẩm sau khi sắp xếp: ");
                repository.show();
        }
    }
}
