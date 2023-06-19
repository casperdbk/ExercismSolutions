package Series;

import java.util.ArrayList;
import java.util.List;

public class Series {
    private String string;
    Series(String string) {
        this.string = string;
    }

    List<String> slices(int num) {
        if (num > string.length()) {
            throw new IllegalArgumentException("Slice size is too big.");
        } else if (num < 1) {
            throw new IllegalArgumentException("Slize size is too small.");
        }
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < string.toCharArray().length; i++) {
            if (i + num <= string.toCharArray().length) {
                String substring = string.substring(i, i + num);
                strings.add(substring);
            }
        }
        return strings;
    }
}
