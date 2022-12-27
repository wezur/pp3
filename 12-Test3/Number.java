public class Number {
    private int system;
    private String value;

    public Number(int system, String value) {
        this.system = system;
        this.value = value;
    }

    public int getSystem() {
        return system;
    }

    public void setSystem(int value) {
        system = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int get10() {
        if (!check()) return -1;

        int value10 = 0;
        
        String[] digits = value.split("");

        int power = 0;

        for(int i = digits.length-1; i >= 0; i--) {
            value10 += Integer.parseInt(digits[i]) * Math.pow(system, power);
            power++;
        }

        return value10;
    }

    private boolean check() {
        int max_digit = system-1;
        String[] digits = value.split("");

        for (String string : digits) {
            if(Integer.parseInt(string) > max_digit) return false;
        }
        return true;
    }
}
