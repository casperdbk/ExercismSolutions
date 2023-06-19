package SqueakyClean;

class SqueakyClean {
    static String clean(String identifier) {
        char[] chars = identifier.toCharArray();
        StringBuilder fixed = new StringBuilder();
        boolean next = false;
        for (char aChar : chars) {
            if (Character.isLetter(aChar) && notGreek(aChar)) {
                if (next) {
                    fixed.append(Character.toUpperCase(aChar));
                    next = false;
                }
                else {
                    fixed.append(aChar);
                }
            } else if (Character.isISOControl(aChar)) {
                fixed.append("CTRL");
            } else if (Character.isWhitespace(aChar)) {
                fixed.append("_");
            } else if (aChar == '-') {
                next = true;
                System.out.println("fsdlfhsdkjfsdhk");
                System.out.println(next);
            }
        }
        return fixed.toString();
    }

    private static boolean notGreek(int aChar) {
        return aChar < 945 || aChar > 969;
    }


}