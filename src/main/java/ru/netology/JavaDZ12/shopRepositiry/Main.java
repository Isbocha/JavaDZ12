package ru.netology.JavaDZ12.shopRepositiry;

public class Main {
    public static void main(String[] args) {
        ShopRepository repo = new ShopRepository();
        repo.add(new Product(1, "рубашка", 100));
        repo.add(new Product(2, "джинсы", 200));
        repo.add(new Product(3, "платье", 300));
        repo.add(new Product(4, "футболка", 400));
        try {
            repo.findById(9);
            System.out.println("Hello 1");
        } catch (NotFoundException s) {
            System.out.println("ERROR 1");
        }
        try {
            repo.add(new Product(2, "обувь", 700));
            System.out.println("Hello 2");
        } catch (AlreadyExistsException s) {
            System.out.println("ERROR 2");
        }
    }

}