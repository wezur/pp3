public class Logic {
    private boolean[] booleans;

    public Logic(boolean[] booleans) {
        this.booleans = booleans;
    }

    public int opposite() {
        int count = 0;

        for(int i = 1; i < booleans.length - 1; i++) {
            if((booleans[i+1] != booleans[i]) && (booleans[i-1] != booleans[i])) {
                count++;
            }
        }

        return count;
    }
}
