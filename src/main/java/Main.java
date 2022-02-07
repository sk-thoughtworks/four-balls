import processing.core.PApplet;

public class Main extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static Ball[] balls = new Ball[4];

    public static void main(String[] args) {
        PApplet.main("Main", args);
    }

    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for (int i = 1; i <= 4; i++) {
            balls[i-1] = new Ball(HEIGHT*i/5, i);
        }
    }

    @Override
    public void draw() {
        for (int i = 0; i < 4; i++) {
            balls[i].drawCircle();
            balls[i].reposition();
        }
    }

    class Ball{
        private final int radius;
        private final int height;
        private final int speed;
        private int position;

        Ball(int height, int speed) {
            this.height = height;
            this.speed = speed;
            position = 0;
            radius = 20;
        }

        void drawCircle() {
            ellipse(position, height, radius, radius);
        }

        void reposition(){
            this.position+=this.speed;
        }
    }
}