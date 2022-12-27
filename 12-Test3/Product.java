public class Product implements Comparable<Product> {
    private String name;
    private float price;

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        return name.compareTo(o.getName());
    }
}
