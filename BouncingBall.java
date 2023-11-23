import java.awt.Color;
import java.util.Random;

public class BouncingBall extends Ball {
    int dy;

    public BouncingBall(int x, int y, int dy, int width, int height, Color color) {
        super(x, y, width, height, color);
        this.dy = dy;
    }

    public void update(int windowWidth, int windowHeight, int frame) {
        this.y -= this.dy;
        if (this.y < 55 || this.y > windowHeight - 135 - this.height) {
            this.dy = -this.dy;
            Random rand = new Random();
            this.color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        }

    }
}