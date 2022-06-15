package com.anemogai.ace.underwear.community.service;

public interface EmailService {

    public void sendEmail(String toAddress, String subject, String message);

    public void sendEmailWithAttachment(String toAddress, String subject, String message, String attachment);
}
