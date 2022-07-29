import processing.core.PApplet;

public class Procedural extends PApplet{

    public static final int W = 640;
    public static final int H = 480;
    int a=0;
    int b=0;
    int c=0;
    int d=0;

    @Override
    public void settings() {
        super.settings();
        size(W, H);
    }

    @Override
    public void draw() {
        ellipse(a,H/5,20,20);
        ellipse(b,(H*2)/5,20,20);
        ellipse(c,(H*3)/5,20,20);
        ellipse(d,(H*4)/5,20,20);
        a=1;
        b+=2;
        c+=3;
        d+=4;
        //super.draw();
    }

    public static void main(String[] args){
        PApplet.main("Procedural",args);
    }
}

