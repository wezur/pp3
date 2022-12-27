public class Numbers implements Ok {
    private int[] numbers;

    public Numbers(int[] numbers) {
        this.numbers = numbers;
    }


    @Override
    public boolean ok() {
        for(int i = 0; i < numbers.length; i++) {
            if(i%2 != numbers[i]%2) return false;
        }
        return true;
    }
    
}
