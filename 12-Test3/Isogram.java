import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean isogram(String text) {
        String[] arr = text.split("");
        Set<String> set = new HashSet<String>(Arrays.asList(arr));
        return arr.length == set.size();
    }
}
