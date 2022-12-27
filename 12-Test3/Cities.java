import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cities {
    private String[] cities;

    public Cities filter(char c) {
        List<String> new_cities = new ArrayList<>();
        for (String string : cities) {
            if(string.contains(String.valueOf(c))) new_cities.add(string);
        }
        String[] arr = new String[new_cities.size()];
        arr = new_cities.toArray(arr);
        return new Cities(arr);
    }

    public String cities() {
        String output = "";

        for (String string : cities) {
            output += string;
        }

        return output;
    }

    public Cities(String[] cities) {
        this.cities = cities;
    }
}
