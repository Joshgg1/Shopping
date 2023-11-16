import java.util.Scanner;


public class Shopping {


    public static int money;
    private static int totalItemsAvailable = 100;
    private int numItems;
    private String category;
    private String item;
    private double totalCost;
    //Private variables




    public Shopping() {
        money = 500;
        numItems = 0;
        category = "";
        item = "";
        totalCost = 0;
    }




    public int getMoney() {
        return money;
    }




    public void setMoney(int money) {
        this.money = money;
    }




    public int getNumItems() {
        return numItems;
    }




    public void setNumItems(int numItems) {
        this.numItems = numItems;
    }




    public String getCategory() {
        return category;
    }




    public void setCategory(String category) {
        this.category = category;
    }




    public String getItem() {
        return item;
    }




    public void setItem(String item) {
        this.item = item;
    }




    public double getTotalCost() {
        return totalCost;
    }




    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }


    /*
   @param this method uses if else statements to determine what category the user will choose
   @param For example, if the user chooses hardware, then they are given multiple items to pick from
   and each category has a different value which subtracts a different amount
   For example, food is 30 while hygiene is 5
   @param otherwise
    */
    public void addToCart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the item you want to add to your cart:");
        String userItem = scanner.nextLine().toLowerCase();




        if ("toothbrush".equals(userItem) || "toothpaste".equals(userItem) || "mouthwash".equals(userItem) || "soap".equals(userItem) || "shampoo".equals(userItem)) {
            if (getMoney() <= 0) {
                System.out.println("You ran out of money.");
                return;
            }
            else if (totalAvailableItems > 0) {
                totalAvailableItems--;
            }
            else if(totalAvailableItems<= 0) {
                System.out.println("Sorry, the store is out of stock!");
                return;
            }


            else {
                setCategory("Hygiene");
                setItem(userItem);
                setTotalCost(getTotalCost() + 5);
                setMoney(money - 5);// Set the price for hygiene items
                setNumItems(getNumItems() + 1);
                System.out.println("Item added to cart!");
            }


        }


        else if ("drills".equals(userItem) || "screwdrivers".equals(userItem) || "screws".equals(userItem) || "bolts".equals(userItem)) {


            if (getMoney() <= 0) {
                System.out.println("You ran out of money.");
                return;
            }
            else if (totalAvailableItems > 0) {
                totalAvailableItems--;
            }
            else if(totalAvailableItems<= 0) {
                System.out.println("Sorry, the store is out of stock!");
                return;
            }


            else {
                setCategory("Hardware");
                setItem(userItem);
                setTotalCost(getTotalCost() + 100);
                setMoney(money - 100);
                setNumItems(getNumItems() + 1);
                System.out.println("Item added to cart!");
            }


        }


        else if ("chairs".equals(userItem) || "nightstands".equals(userItem) || "mattress".equals(userItem) || "couches".equals(userItem) || "tables".equals(userItem)) {


            if (getMoney() <= 0) {
                System.out.println("You ran out of money.");
                return;
            }
            else if (totalAvailableItems > 0) {
                totalAvailableItems--;
            }
            else if(totalAvailableItems<= 0) {
                System.out.println("Sorry, the store is out of stock!");
                return;
            }


            else {
                setCategory("Furniture");
                setItem(userItem);
                setTotalCost(getTotalCost() + 150);
                setMoney(money - 150);// Set the price for furniture items
                setNumItems(getNumItems() + 1);
                System.out.println("Item added to cart!");
            }


        }


        else if ("red t-shirt".equals(userItem) || "cargo pants".equals(userItem) || "cubs hat".equals(userItem) || "adidas jacket".equals(userItem) || "nike shoes".equals(userItem) || "fremd sweatshirt".equals(userItem)) {


            if (getMoney() <= 0) {
                System.out.println("You ran out of money bud.");
                return;
            }
            else if (totalAvailableItems > 0) {
                totalAvailableItems--;
            }
            else if(totalAvailableItems<= 0) {
                System.out.println("Sorry, the store is out of stock!");
                return;
            }


            else {
                setCategory("Clothes");
                setItem(userItem);
                setTotalCost(getTotalCost() + 100); // Set the price for clothes items
                setMoney(money - 100);
                setNumItems(getNumItems() + 1);
                System.out.println("Item added to cart!");
            }


        }


        else if ("pizza".equals(userItem) || "burgers".equals(userItem) || "fries".equals(userItem) || "steak".equals(userItem) || "sushi".equals(userItem) || "brisket".equals(userItem) || "rice".equals(userItem) || "pork".equals(userItem) || "chicken".equals(userItem) || "salad".equals(userItem)) {


            if (getMoney() <= 0) {
                System.out.println("You ran out of money bud, inflation is tuff");
                return;
            }
            else if (totalAvailableItems > 0) {
                totalAvailableItems--;
            }
            else if(totalAvailableItems<= 0) {
                System.out.println("Sorry, the store is out of stock!");
                return;
            }


            else {
                setCategory("Food");
                setItem(userItem);
                setTotalCost(getTotalCost() + 30);
                setMoney(money - 30);// Set the price for food items
                setNumItems(getNumItems() + 1);
                System.out.println("Item added to cart!");
            }


        }


        else {
            System.out.println("Invalid item entered.");
            return;
        }


       
    }


        /*
        @param this is for option 3 as it shows the last item the user bought, how many items they bought, and the remaning amount
        */
    public void displayMostRecent() {


        if ((getNumItems()) <= 0) {
            System.out.println("You haven't bought anything yet!");
        }


        else {
            System.out.println("Your Most Recently Added Item:");
            System.out.println("Category\tItem\t\t\tPrice");
            System.out.println("-----------------------------------------");
            System.out.printf("%-15s%-25s$%.2f\n", getCategory(), getItem(), getTotalCost());
            System.out.println("-----------------------------------------");
            System.out.printf("Total cost:\t\t\t$%.2f\n", getTotalCost());
            System.out.println("Items Bought: " + getNumItems());
            System.out.println("Money remaining: $" + getMoney());
        }


    }


    public void displayItems() {
        System.out.println("Welcome to Shop.inc!");
        System.out.println("You have $500 to spend. Let's start shopping.");
        System.out.println("Hygiene(COST = $5): Toothbrush, Toothpaste, mouthwash, Soap, Shampoo");
        System.out.println("Hardware(COST = $100): Drills, Screwdrivers, Screws, Bolts");
        System.out.println("Furniture(COST = $150): Chairs, Nightstands, Mattress, Couches, Tables");
        System.out.println("Clothes(COST = $100): Red T-Shirt, Cargo Pants, Cubs Hat, Adidas Jacket, Nike Shoes, Fremd Sweatshirt");
        System.out.println("Food(COST = $30): Pizza, Burgers, Fries, Steak, Sushi, Brisket, Rice, Pork, Chicken, Salad");
        /*
        @param Displays the category, cost, and the items in the category
        @param This is used for when option 3 selected
        */
    }
}
/*
@author Josh George & Kazi Rahman
        Period 2 Desteph
 */
