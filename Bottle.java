public class Bottle {
    private final int totalCapacity;
    private int availableLiquid;
    private boolean open;

    public Bottle(int totalCapacity, int availableLiquid, boolean open) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
    }

    public boolean hasMaxLiquid() {
        return totalCapacity == availableLiquid;
    }

    public int getAvailableLiquid() {
        return availableLiquid;
    }

    public int getEmptyCapacity() {
        return totalCapacity - availableLiquid;
    }

    public void openBottle() {

        System.out.println();
        if (open) {
            System.out.println("Bottle is already open");
        } else {
            System.out.println("Bottle has been opened");
            this.open = true;
        }
    }

    public void closeBottle() {
        if (!open) {
            System.out.println("Bottle is already closed");
            return;
        }
        System.out.println("Bottle has been closed");
        this.open = false;
    }

    public void drinkAmount(int amount) {
        if (!open) {
            System.out.println("Bottle is closed, you can't drink from it");
            return;
        }
        if (availableLiquid >= amount) {
            System.out.println(String.format("I drank from the bottle %d and i still got %d", amount, (availableLiquid - amount)));
            availableLiquid = availableLiquid - amount;
        } else {
            System.out.println("Not enough liquid in the bottle");
        }
    }
}