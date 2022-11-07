import processing.core.PApplet;

public class Main extends PApplet{
    public static PApplet app;
    final int s = 600;
    final int x = s/2;
    final int y = s/2;
    final int size = 5;
    final int change = 15;
    public boolean coleur = true;

    public static void main(String[] args){
        PApplet.main("Main");
    }

    public Main(){
        app = this;
    }

    public void settings() {

        size(s, s);
    }

    public void draw(){
        background(200, 200, 200);
        fractal1(x, y, size, coleur);
        fractal2(x, y, size, coleur);
        fractal3(x, y, size, coleur);
        fractal4(x, y, size, coleur);

    }
    public void fractal1(int xco, int yco, int siz, boolean color){
        Main.app.noStroke();
        if (color) {
            Main.app.fill(random(255), random(255), 200);
        } else {
            Main.app.fill (random(255), 0, random(255));
        }
        Main.app.circle(xco, yco, siz);
        if (siz < 1500){
            fractal1(xco - change, yco - change, siz + (change*2), !color);

        }
    }
    public void fractal2(int xco, int yco, int siz, boolean color) {
        Main.app.noStroke();
        if (color) {
            Main.app.fill(random(255), random(255), 200);
        } else {
            Main.app.fill(random(255), 0, random(255));
        }
        Main.app.circle(xco, yco, siz);
        if (siz < 1500) {
            fractal2(xco + change, yco - change, siz + (change*2), !color);
        }
    }

    public void fractal3(int xco, int yco, int siz, boolean color) {
        Main.app.noStroke();
        if (color) {
            Main.app.fill(random(255), random(255), 200);
        } else {
            Main.app.fill(random(255), 0, random(255));
        }
        Main.app.circle(xco, yco, siz);
        if (siz < 1500) {
            fractal3(xco + change, yco + change, siz + (change*2), !color);
        }
    }

    public void fractal4(int xco, int yco, int siz, boolean color) {
        Main.app.noStroke();
        if (color) {
            Main.app.fill(random(255), random(255), 200);
        } else {
            Main.app.fill(random(255), 0, random(255));
        }
        Main.app.circle(xco, yco, siz);
        if (siz < 1500) {
            fractal4(xco - change, yco + change, siz + (change*2), !color);
        }
    }


}
