import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

public class MotivatingQuote extends GraphicsObject {
    String quote;

    public MotivatingQuote(int x, int y, String quote) {
        super(x, y);
        this.quote = quote;
    }

    public void draw(Graphics g) {
        new Random();
        g.setColor(Color.WHITE);
        g.setFont(new Font("TimesRoman", 0, 20));
        g.drawString(this.quote, this.x, this.y);
    }
}