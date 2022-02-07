import processing.core.PApplet;

public class Main extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static int[] ballPositions = new int[4];

    public static void main(String[] args) {
        PApplet.main("Main", args);
    }

    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for (int i = 0; i < 4; i++) {
            drawCircle(i);
            repositionBall(i);
        }
    }

    private void repositionBall(int i) {
        ballPositions[i]+=i+1;
    }

    private void drawCircle(int i) {
        ellipse(ballPositions[i], HEIGHT * (1 + i) / 5, 20, 20);
    }

}