public class Pizza extends Food implements Extra {

    private int size;
    
    public Pizza(String name, int size) {
        super(name);
        this.size = size;
        setPrice();
    }

    @Override
    public float discount() {
        if(getPrice() >= 30) return 0.05f;
        else return 0;
    }

    @Override
    public float delivery() {
        if(size >= 50) return 8;
        else return 6;
    }

    @Override
    public float delivery(int tip) {
        if(size >= 50) return 8 + tip;
        else return 6 + tip;
    }

    @Override
    public void setPrice() {
        setPrice(size - 10);
    }
    
}
