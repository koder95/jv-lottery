package core.basesyntax;

public class NumberSupplier {

    private final Random random = new Random();

    public int getRandomNumber(int bound) {
        return random.nextInt(bound);
    }

    public int getRandomNumber() {
        return getRandomNumber(100);
    }
}
