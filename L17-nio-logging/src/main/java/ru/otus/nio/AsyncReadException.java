package ru.otus.nio;

public class AsyncReadException extends RuntimeException {
    public AsyncReadException(Throwable cause) {
        super(cause);
    }
}
