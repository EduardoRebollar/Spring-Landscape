import java.awt.Color;
import java.awt.Graphics;

public class Ball extends GraphicsObject {
    int width;
    int height;
    Color color;

    public Ball(int x, int y, int width, int height, Color color) {
        super(x, y);
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillOval(this.x, this.y, this.width, this.height);
    }

    public void update(int windowWidth, int windowHeight, int frame) {
    }
}