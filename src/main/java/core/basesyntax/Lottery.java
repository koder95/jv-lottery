package core.basesyntax;

public class Lottery {

    private final ColorSupplier randomColor = new ColorSupplier();
    private final NumberSupplier randomNumber = new NumberSupplier();
    
    public Ball getRandomBall() {
        return new Ball(randomColor.getRandomColor(), randomNumber.getRandomNumber());
    }
}
