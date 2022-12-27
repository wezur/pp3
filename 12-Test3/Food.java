public abstract class Food {
    private String name;
    private float price; 

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract void setPrice();
}
