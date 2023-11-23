import java.awt.Color;
import java.awt.Graphics;

public class Background extends GraphicsObject {
    int red;
    int green;
    int blue;
    int width;
    int height;

    public Background(int x, int y, int red, int green, int blue, int width, int height) {
        super(x, y);
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics g) {
        g.setColor(new Color(this.red, this.green, this.blue));
        g.fillRect(this.x, this.y, this.width, this.height);
    }
}