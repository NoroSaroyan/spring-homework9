package ru.gb.inventory.mail.message;

public record EmailMessage( String to, String subject, String text) {
}