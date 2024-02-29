import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product products[] = {
                new Product("Nvidia RTX 2060 Super OC", "MSI", 16000, 3, 12),
                new Product("Nvidia RTX 3070", "Palit", 35000, 2, 10),
                new Product("Nvidia GTX 1660 Ti", "Inno3D", 13000, 4, 3),
                new Product("AMD RX 6600 XT", "Gigabyte", 20000, 2, 13),
                new Product("AMD RX 580", "Sapphire", 7000, 3, 15)
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название товара: ");
        String input = scanner.nextLine();
        Product.printProduct(input, products);
    }
}
class Product
{
    public String name;
    public String manufacturer;
    public int price;
    public int shelfLife;
    public int amount;
    Product (String name, String manufacturer, int price, int shelfLife, int amount)
    {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.shelfLife = shelfLife;
        this.amount = amount;
    }
    public static void printProduct(String inputName, Product [] products)
    {
        for(Product product : products) {
            if (product.name.equals(inputName)) {
                System.out.printf("Наименование: %s\n", product.name);
                System.out.printf("Производитель: %s\n", product.manufacturer);
                System.out.printf("Цена: %d рублей\n", product.price);
                System.out.printf("Срок хранения: %d года\n", product.shelfLife);
                System.out.printf("Количество: %d шт.\n", product.amount);
            }
        }
    }
}