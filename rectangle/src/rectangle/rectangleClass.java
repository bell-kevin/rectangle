package rectangle;

import java.util.Scanner;

public class rectangleClass {

    public int length, width, perimeter, area;
    Scanner computerKeyboardInput = new Scanner(System.in);

    public int getPerimeter() {
        return this.perimeter;
    }

    public int getArea() {
        return this.area;
    }

    public int getLenth() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    void setLength() {
        System.out.print("Please enter length: ");
        length = computerKeyboardInput.nextInt();
    }

    void setWidth() {
        System.out.print("Please enter width: ");
        width = computerKeyboardInput.nextInt();
    }

    public boolean isSquare() {
        if (length == width) {
            System.out.println("This paper is a square: " + this.length + " x " + this.width);
            return true;
        } else {
            System.out.println("This paper is a rectangle: " + this.length + " x " + this.width);
            return false;
        }
    }

    void printRectangleData() {
        perimeter = 2 * length + 2 * width;
        System.out.println("Perimeter: " + this.perimeter);
        area = length * width;
        System.out.print("Area: " + this.area + "\n");
    }
}
