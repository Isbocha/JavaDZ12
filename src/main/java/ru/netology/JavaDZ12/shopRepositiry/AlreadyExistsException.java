package ru.netology.JavaDZ12.shopRepositiry;

public class AlreadyExistsException extends RuntimeException {
    public AlreadyExistsException(String s) {
        super(s);
    }
}
