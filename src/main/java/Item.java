public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    // getPrice() -> Method return price value of item
    public int getPrice() { return price; }

    @Override
    public String toString(){
        return  name + ":"
                + price
                + "\n"
                ;
    }
}
