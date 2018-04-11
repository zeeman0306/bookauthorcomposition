package composition;

public class BookMain {

    public static void main(String[] args) {

        Book whereTheWildThingsAre = new Book("Where the Wild Things Are", new Author("MauriceSendak", "harpercollins.com", 'm'), 25, 2000000);

        System.out.println(whereTheWildThingsAre.getName() + " is by " + whereTheWildThingsAre.getAuthor().getName());
        System.out.println(whereTheWildThingsAre.getAuthor().createBookEmail());

        whereTheWildThingsAre.Invoicefrom();
    }
}
