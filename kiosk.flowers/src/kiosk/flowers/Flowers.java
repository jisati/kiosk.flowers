package kiosk.flowers;

public abstract class Flowers {
	 protected String color;
	    protected int num;

	    Flowers(String color, int num) {
	        this.color = color;
	        this.num = num;
	    }

	    void printColor() {
	        System.out.println("Color: " + color);
	    }

	    void printNumFlowers() {
	        System.out.println("Number of Flowers: " + num);
	    }
}
