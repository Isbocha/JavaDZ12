package ru.netology.JavaDZ12.shopRepositiry;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String s) {
        super(s);
    }
}
