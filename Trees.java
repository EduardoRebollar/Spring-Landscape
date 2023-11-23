import java.awt.Color;
import java.awt.Graphics;

public class Trees extends GraphicsObject {
    int red;
    int green;
    int blue;

    public Trees(int x, int y, int red, int green, int blue) {
        super(x, y);
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public void draw(Graphics g) {
        g.setColor(new Color(96, 76, 60));
        g.fillRoundRect(this.x + 50, this.y + 40, 40, 170, 50, 50);
        g.setColor(new Color(this.red, this.green, this.blue));
        g.fillOval(this.x, this.y, 80, 80);
        g.setColor(new Color(this.red, this.green, this.blue));
        g.fillOval(this.x + 60, this.y, 80, 80);
        g.setColor(new Color(this.red, this.green, this.blue));
        g.fillOval(this.x + 30, this.y - 50, 80, 80);
    }
}