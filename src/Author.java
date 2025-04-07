public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public char getGender(){
        return gender;
    }
    public String toString(){
        return name + " (" + gender + ") " + "at " + email;
    }

    public static void main(String[] args) {
        Author a = new Author("Philip K Dick", "pkd@gmail.com", 'm');
        System.out.println(a);
    }
}