package DiamondPrinter;

import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {
        List<String> diamond = new ArrayList<>();
        int diff = a - (int)'A';
        if (diff == 0) {
            diamond.add("A");
            return diamond;
        }
        int edges = 1;
        int spaces = diff;
        for (int i = 0; i <= diff; i++) {
            StringBuilder builder = new StringBuilder();
            char nextchar = (char) ('A' + i);
            if (nextchar == 'A') {
                append(spaces, builder, nextchar);
                builder.append(" ".repeat(spaces));
            }
            else {
                append(spaces, builder, nextchar);
                append(edges, builder, nextchar);
                builder.append(" ".repeat(spaces));
                edges += 2;

            }
            spaces -= 1;
            diamond.add(builder.toString());
        }
        spaces = 1;
        edges -= 4;
        for (int i = diff-1; i >= 0; i--) {
            StringBuilder builder = new StringBuilder();
            char nextchar = (char) ('A' + i);
            if (nextchar == 'A') {
                append(spaces, builder, nextchar);
                builder.append(" ".repeat(spaces));
            }
            else {
                append(spaces, builder, nextchar);
                append(edges, builder, nextchar);
                builder.append(" ".repeat(spaces));
                edges -= 2;

            }
            spaces += 1;
            diamond.add(builder.toString());
        }
        return diamond;
    }

    private static void append(int spaces, StringBuilder builder, char nextchar) {
        builder.append(" ".repeat(spaces));
        builder.append(nextchar);
    }

}
