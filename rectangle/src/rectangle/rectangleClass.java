package rectangle;

import java.util.Scanner;

public class rectangleClass {

    public int length, width;
    public double perimeter, area;
    Scanner computerKeyboardInput = new Scanner(System.in);

    public double //this is what it's returning
            getPerimeter()//this is what we're shoving in
    {
        return this.perimeter;
    }

    public double getArea() {
        return this.area;
    }

    public int getLenth() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    public void setLength() {

    }

    public void setWidth() {

    }

    public boolean isSquare() {
        return length == width;
    }
}
