package rectangle;

import java.util.Scanner;

public class rectangleClass {

    public int length, width, perimeter, area;
    Scanner computerKeyboardInput = new Scanner(System.in);

    public int getPerimeter() {
        return this.perimeter;
    } // end accessor method

    public int getArea() {
        return this.area;
    }// end accessor method

    public int getLenth() {
        return this.length;
    }// end accessor method

    public int getWidth() {
        return this.width;
    }// end accessor method

    void setLength() {
        System.out.print("Please enter length: ");
        length = computerKeyboardInput.nextInt();
    } // end mutator method

    void setWidth() {
        System.out.print("Please enter width: ");
        width = computerKeyboardInput.nextInt();
    } // end mutator method

    public boolean isSquare() {
        if (length == width) {
            System.out.println("This paper is a square: " + this.length + " x " + this.width);
            return true;
        } else {
            System.out.println("This paper is a rectangle: " + this.length + " x " + this.width);
            return false;
        } // end if/else condition
    } // end isSquare method

    void printRectangleData() {
        perimeter = 2 * length + 2 * width;
        System.out.println("Perimeter: " + this.perimeter);
        area = length * width;
        System.out.print("Area: " + this.area + "\n");
    } // end printRectangleData method
} // end rectangleClass class
