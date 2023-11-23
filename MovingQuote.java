public class MovingQuote extends MotivatingQuote {
    public MovingQuote(int x, int y, String quote) {
        super(x, y, quote);
    }

    public void update(int windowWidth, int windowHeight, int frame) {
        this.x -= 10;
    }
}
