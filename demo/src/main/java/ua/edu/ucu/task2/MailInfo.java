package ua.edu.ucu.task2;

public class MailInfo {
    private MailCode mailCode;
    private Client client;

    public String generateText(){
        return mailCode.generateText(client);
    }
}
