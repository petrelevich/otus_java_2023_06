package ru.otus.proxy.security;

@SuppressWarnings("java:S106")
public final class SecurityAccessImpl implements SecurityAccess {
    @Override
    public void access() {
        System.out.println("access to bank account");
    }
}
