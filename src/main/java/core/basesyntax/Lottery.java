package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_VALUE = 100;
    private final ColorSupplier randomColor = new ColorSupplier();
    
    private final Random random = new Random();
    public Ball getRandomBall() {
        return new Ball(randomColor.getRandomColor(), random.nextInt(MAX_VALUE));
    }
}
