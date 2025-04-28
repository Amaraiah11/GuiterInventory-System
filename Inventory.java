public class Inventory {
    public static Guitar[] inventory = new Guitar[10];

    public static void main(String[] args) {
        String[] defaultNames = {
                "Lucy", "Red Special", "Trigger","Blackie", "Vanessa", "Beau","BB", "Molly", "Gretsch White Falcon","Maggie"
        };

        // Insert guitars
        for (int i = 0; i < inventory.length; i++) {
            inventory[i] = new Guitar(defaultNames[i], 1000+i);
        }

        // Display the inventory
        System.out.println("\nGuitar Inventory:");
        for (Guitar guitar : inventory) {
            System.out.println("Guitar name :  " + guitar.getName() + ", Price: \u20B9" + guitar.getPrice());
        }
    }
}

class Guitar {
    private String name;
    private int price;

    // Constructor
    public Guitar(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}\