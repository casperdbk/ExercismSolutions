package ReverseString;

class ReverseString {

    String reverse(String inputString) {
        StringBuilder builder = new StringBuilder();
        return builder.append(inputString).reverse().toString();
    }

}