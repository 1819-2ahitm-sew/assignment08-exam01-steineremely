package at.htl.exam01.document;

public class E_Mail extends Document{
    private String subjekt;
    private String to;

    public E_Mail(String author, String subjekt, String to){

    }

    public String getSubjekt() {
        return subjekt;
    }

    public String getTo() {
        return to;
    }
}
