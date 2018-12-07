package at.htl.exam01.document;

public class Main {



    public static void main(String[] args) {

        Document[] documents = new Document[3];

        documents[0] =  new Book( "Rowlings","Harry Potter und der Stein der Weisen" );
        documents[1] = new Book("Toliken", "LordOfTheRings");
        documents[2] = new E_Mail("Susi", "Bewerbung", "CoolCompany");

        for (int i = 0; i < documents.length; i++) {
            System.out.println(documents[i]);
        }

    }


}
