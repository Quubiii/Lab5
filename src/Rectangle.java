public class Rectangle {
    public int width;
    public int height;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void getArea() {
        int area = width * height;
        System.out.println("Area: " + area);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void getPerimeter() {
        int perimeter = 2 * width + 2 * height;
        System.out.println("Perimeter: " + perimeter);
    }
}
