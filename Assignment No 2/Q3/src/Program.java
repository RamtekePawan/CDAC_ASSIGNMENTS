
class Book{
    private String title;
    private String author;
    private String publisher;
    private int isbn;
    private int year;
    private int price;
    private int quantity;

    Book(){
        this("Spriing", "RK","Publi", 1234,2020,500,10 );
    }
    Book(String title,String auther, String publisher,int isbn,int year,int price,int quantity ){
        this.title = title;
        this.auther = auther;
        this.publisher = publisher;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
        this.quantity = quantity;  
    }
    
    
    public int increaseQuantity( int quantity){
        return (this.quantity + quantity);
    }
    public int decreaseQuantity(int quantity){
        return (this.quantity-quantity);
    }

    public int getInventoryValue(){
        return (this.price * this.quantity);
    }

}

class Program{
    public static void main(String[] args) {
        Book b = new Book();
        b.Book("Spriing", "RK","Publi", 1234,2020,500,10);
        b.increaseQuantity(10);
        
        System.out.println(b.decreaseQuantity(20));
    }
}