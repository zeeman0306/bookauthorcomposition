package composition;

public class Author {

    private String name;
    private String domainName;
    private char gender;


    public Author(String name, String domainName, char gender){
        this.name = name;
        this.domainName = domainName;
        this.gender = gender;
    }


    private String getDomainName(){
     return domainName ;
    }

    public String createBookEmail(){
        return this.name + "@" + this.domainName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
