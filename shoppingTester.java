public class ShoppingTester {


    public static void main(String[] args) {


        /*
        @param declares a new shopper
        and adds the scanner class
         */


        Shopping shoppingCart = new Shopping();


        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to Shop.inc!");
        System.out.println("You have $500 to spend. Let's start shopping.");
        System.out.println("Hygiene(COST = $5): Toothbrush, Toothpaste, mouthwash, Soap, Shampoo");
        System.out.println("Hardware(COST = $100): Drills, Screwdrivers, Screws, Bolts");
        System.out.println("Furniture(COST = $150): Chairs, Nightstands, Mattress, Couches, Tables");
        System.out.println("Clothes(COST = $100): Red T-Shirt, Cargo Pants, Cubs Hat, Adidas Jacket, Nike Shoes, Fremd Sweatshirt");
        System.out.println("Food(COST = $30): Pizza, Burgers, Fries, Steak, Sushi, Brisket, Rice, Pork, Chicken, Salad");


        boolean exit = false;


        /*
            @param the boolean exit is if the user wants to exit the tester
            its false because the user starts off not exiting the tester
            @param while the user doesn't exit, the code will run values that will make the user not exit
         */


        while (!exit) {


            System.out.println("\nOptions:");
            System.out.println("1. Add item to cart");
            System.out.println("2. View Most Recently Bought Item");
            System.out.println("3. View items by category(also at top)");
            System.out.println("4. Exit Shop.Inc");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Ask Worker to Restock Store");




            System.out.print("Enter your choice: ");




            int choice = getIntInput(scanner);


            /*
            @param if the user picks choice 1, they will access the addToCart method and
            the same applies with the other else if statements with values 2-4
            but if the user does any other value besides 1-5, a message will pop up saying "invalid input"
             */


            if (choice == 1) {
                shoppingCart.addToCart();
            }


            else if (choice == 2) {
                shoppingCart.displayMostRecent();
            }


            else if (choice == 3) {
                shoppingCart.displayItems();
            }


            else if (choice == 4) {
                System.out.println("Thank you for shopping at Shop.inc!");
                exit = true;
            }


            else if (choice == 5) {
                System.out.println("$20 has been added!");
                Shopping.money += 20;
                System.out.println("New money amount: " + Shopping.money);
            }
            else if (choice == 6) {
                Shopping.totalAvailableItems = 100;
                System.out.println("Store has been restocked! New stock: " + Shopping.totalAvailableItems);
            }
            else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }


    private static int getIntInput(Scanner scanner) {


        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine();
        }


        return scanner.nextInt();
    }
