package kiosk.flowers;

public class Tulips extends Flowers{
	Tulips(String color, int num) {
        super(color, num);
    }

    void printColor() {
        System.out.println("Color of Tulips: " + color);
    }
}
