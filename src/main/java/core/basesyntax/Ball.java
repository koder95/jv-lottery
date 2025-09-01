package core.basesyntax;

public class Ball {
    
    private final String color;
    private final int number;
    
    public Ball(String color, int number) {
        this.color = color;
        this.number = number > 100 ? 100 : number < 0 ? 0 : number;
    }

    @Override
    public String toString() {
        return "The ball is " + color + ". The number is " + number + " on the ball.";
    }
}
