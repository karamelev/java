package karamelev.Classes;

public enum Author {
    MARSEL_PROUST("Marsel Proust"),
    JAMES_JOYSE("James Joyse"),
    MIGEL_DE_CERVANTES("Migel de Cervantes"),
    HERMAN_MELVILLE("Herman Melville"),
    WILLIAM_SHAKESPEARE("William Shakespeare"),
    HOMER("Homer"),
    GUSTAVE_FLAUBERT("Gustav Flaubert"),
    DANTE_ALIGHIERI("Dante Alighieri"),
    LEO_TOLSTOY("Leo Tolstoy");

    private String realName;

    Author(String realName) {
        this.realName = realName;
    }

    public static void printAll() {
        int i = 1;
        for (Author author : Author.values()) {
            System.out.println(i + ". " + author.toString());
            i++;
        }
    }

    public static Author getAuthorByNumber(int number) {
        return Author.values()[number - 1];
    }

    public static int getLength () {
        return Author.values().length;
    }

    @Override
    public String toString() {
        return realName;
    }
}
