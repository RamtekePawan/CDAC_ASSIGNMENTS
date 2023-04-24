package Org.main;

enum Dish{
	DISH1(Dish1,10.00),
	DISH2(Dish2,15.00),
	DISH3(Dish3,20.00),
	DISH4(Dish4,30.00);
	
	private String dishName;
	private double price;
	
	Dish(String dishName,double price){
		this.dishName = dishName;
		this.price = price ;
	}
	
	public String getDishName() {
		return dishName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
//============================================================================
class Program2{
	public static void main(String[] args) {
		System.out.println("Welcome to Restaurant XYZ Menu Ordering System");
		int orderingValue = Dish.values().length;
		boolean placeOrder = true;
		
		while(placeOrder) {
			printMenu();
		}
	}
	
	static void printMenu() {
		System.out.println("MENU");
//		Dish[] dish = Dish.values();
		for (Dish dish : Dish.values()) {
			System.out.printf("%d.%-6s -$%-5f\n",dish.ordinal()+1 ,dish.getDishName(),dish.getPrice());
		}
	}
}