import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Picture extends JPanel {
    private int canvasWidth;
    private int canvasHeight;
    private ArrayList<GraphicsObject> objects;

    public Picture(int width, int height) {
        this.canvasWidth = width;
        this.canvasHeight = height;
        this.objects = new ArrayList();
    }

    public void addObject(GraphicsObject obj) {
        this.objects.add(obj);
    }

    public void showCanvas() {
        JFrame frame = new JFrame("Picture");
        frame.getContentPane().add(this, "Center");
        frame.setDefaultCloseOperation(3);
        Dimension dim = new Dimension(this.canvasWidth, this.canvasHeight);
        frame.getContentPane().setPreferredSize(dim);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint() {
        this.paint(this.getGraphics());
    }

    public void paint(Graphics g) {
        Iterator var2 = this.objects.iterator();

        while(var2.hasNext()) {
            GraphicsObject obj = (GraphicsObject)var2.next();
            obj.draw(g);
        }

    }

    public void update(int frame) {
        Iterator var2 = this.objects.iterator();

        while(var2.hasNext()) {
            GraphicsObject obj = (GraphicsObject)var2.next();
            obj.update(this.canvasWidth, this.canvasHeight, frame);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        int msPerFrame = 50;
        Picture pic = new Picture(560, 560);
        pic.addObject(new Background(0, 0, 135, 206, 235, 560, 430));
        pic.addObject(new Background(0, 430, 34, 139, 34, 560, 300));
        pic.addObject(new Background(0, 0, 16, 16, 16, 560, 50));
        pic.addObject(new MovingQuote(570, 30, "Will it ever stop?!"));
        pic.addObject(new Trees(400, 250, 255, 102, 0));
        pic.addObject(new BouncingBall(280, 350, 10, 75, 75, new Color(255, 0, 0)));
        pic.addObject(new BouncingBall(100, 250, 5, 10, 10, new Color(0, 255, 0)));
        pic.addObject(new BouncingBall(200, 100, 7, 30, 30, new Color(0, 0, 255)));
        pic.showCanvas();
        pic.paint();
        int frame = 0;

        while(true) {
            pic.paint();
            pic.update(frame);
            ++frame;
            Thread.sleep((long)msPerFrame);
        }
    }
}