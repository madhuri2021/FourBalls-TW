import processing.core.PApplet;



public static final int W = 640;
public static final int H = 480;
public static final int D = 20;

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

public static void main(String[] args) {
        PApplet.main("tp", args);
        }

@Override
public void settings() {
        super.settings();
        size(W, H);
        }

@Override
public void draw() {
        drawCircle(a+=1,H/5, D, D);
        drawCircle(b+=2,H/5 * 2, D, D);
        drawCircle(c+=3,H/5 * 3, D, D);
        drawCircle(d=4,H/5 * 4, D,D);

        }

private void drawCircle(int w, int h, int d1, int d2) {
        ellipse(w, h, d1, d2);
        }
