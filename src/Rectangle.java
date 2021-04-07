public class Rectangle {
    double width;
    double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    double getArea( ){
        return width * height;
    }
    double  getPerimeter(){
        return ( width + height ) * 2;
    }
    void display (){
        System.out.println("Hình của bạn có chiều dài là : "+ width);
        System.out.println("chiều rộng là : "+ height);
        System.out.println("Diện Tích của hình: "+ getArea());
        System.out.println("Diện Tích của hình: "+ getPerimeter());
    }
}
