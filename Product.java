public class Product {

    private String name;
    private double price;
    private int quantity;
    private String category;


    public Product(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String productDetails(){
        return "The name of the product is " + name + " the price of the product is " + price + " the stock of the product is " + quantity + " the category of the product is " + category;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        if (quantity <= 0) {
            System.out.println("No stock inserted");
        } else {
            return quantity;
        }
        return 0;
    }


    public String getCategory() {
        return category;
    }
}
