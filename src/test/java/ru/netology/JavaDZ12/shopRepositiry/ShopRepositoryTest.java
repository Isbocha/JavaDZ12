package ru.netology.JavaDZ12.shopRepositiry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {
    Product item1 = new Product(1, "рубашка", 100);
    Product item2 = new Product(2, "джинсы", 200);
    Product item3 = new Product(3, "платье", 300);
    Product item4 = new Product(4, "футболка", 400);
    Product item5 = new Product(2, "пиджак", 500);
    Product item6 = new Product(4, "пиджак", 500);

    @Test
    public void shouldRemoveTest() {
        ShopRepository repo = new ShopRepository();
        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        repo.add(item4);

        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.remove(7);
        });
    }

    @Test
    public void shouldAddTest() {
        ShopRepository repo = new ShopRepository();
        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        Product[] expected = {item1, item2, item3};
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddDoubleID() {
        ShopRepository repo = new ShopRepository();
        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        repo.add(item4);
        Assertions.assertThrows(AlreadyExistsException.class, () -> {
            repo.add(item5);
        });
    }

    @Test
    public void shouldAddDoubleID2() {
        ShopRepository repo = new ShopRepository();
        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        repo.add(item4);
        Assertions.assertThrows(AlreadyExistsException.class, () -> {
            repo.add(item6);
        });
    }
}

