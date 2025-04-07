public class Book {
    private Author author;
    private String name;
    private double price;
    private int qty;

    public Book(String name, Author author, double price,  int qty){
        this.name = name;
        this.price = price;
        this.author = author;
        this.qty = qty;
    }

    public Author getAuthor(){
        return author;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public String toString(){
        return "'" + name + "' by " + author.toString();
    }
}