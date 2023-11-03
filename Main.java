public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Julietta", 31, true);
        Person person2 = new Person("John" , 22, false);
        Person person3 = new Person("Jessica" , 17, false);

        System.out.println("LIST OF PEOPLE : ");
        System.out.println(person1.detailsPerson());
        System.out.println(person2.detailsPerson());
        System.out.println(person3.detailsPerson());


        System.out.println("----------------------------------------------------------------------------------");

        Product product1 = new Product("Rtx4090 GPU", 3532.75, 1, "PC Component");
        Product product2 = new Product("Samsung QLED", 2999.50, 0, "House Utility");
        Product product3 = new Product("Remington M700 Sniper", 2109.99, 555, "Hunting");
        System.out.println(product1.productDetails());
        System.out.println(product2.productDetails());
        System.out.println(product3.productDetails());

        System.out.println("----------------------------------------------------");


        Bottle bottle1 = new Bottle(500,350, true);
        System.out.println("Empty capacity is " + bottle1.getEmptyCapacity() );
        bottle1.drinkAmount(70);
        bottle1.getAvailableLiquid();
        bottle1.getEmptyCapacity();
        bottle1.openBottle();
        bottle1.closeBottle();
        bottle1.openBottle();
        bottle1.drinkAmount(10);
        bottle1.drinkAmount(19);
        bottle1.openBottle();



    }


}