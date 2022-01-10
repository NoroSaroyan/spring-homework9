package ru.gb.inventory.mail;

import ru.gb.inventory.mail.message.AttachmentMailMessage;
import ru.gb.inventory.mail.message.EmailMessage;

public interface EmailService {
    void send(EmailMessage message);
    void send(AttachmentMailMessage message);

}