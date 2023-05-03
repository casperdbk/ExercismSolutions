package Acronym;

class Acronym {

    private final String acronym;

    Acronym(String phrase) {

        StringBuilder shortened = new StringBuilder();

        String formatted = phrase.replaceAll("'", "").replaceAll("[ ,_-]+", " ").replaceAll("(\\B[a-zA-Z]*)? *", "").toUpperCase();

        this.acronym = formatted;

    }

    String get() {
        return this.acronym;
    }

}
