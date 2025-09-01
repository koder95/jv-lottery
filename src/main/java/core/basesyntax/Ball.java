package core.basesyntax;

public class Ball {
    
    private final Color color;
    private final int number;
    
    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "The ball is " + color.name().toLowerCase() + ". The number is " + number + " on the ball.";
    }
}
