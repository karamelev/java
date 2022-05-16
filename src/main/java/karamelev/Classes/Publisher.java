package karamelev.Classes;

public enum Publisher {
    AST, ECSMO, MIF, ROSMEN;

    public static void printAll() {
        int i = 1;
        for (Publisher publisher : Publisher.values()) {
            System.out.println(i + ". " + publisher.toString());
            i++;
        }
    }

    public static Publisher getPublisherByNumber(int number) {
        return Publisher.values()[number - 1];
    }

    public static int getLength () {
        return Publisher.values().length;
    }
}
