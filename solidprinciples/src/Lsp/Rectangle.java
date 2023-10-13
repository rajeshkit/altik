package Lsp;

public class Rectangle {
    private double height;
    private double width;
    public void setHeight(double h) { height = h; }
    public void setWidth(double w) { width = w; }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getArea(){
        return width*height;
    }

}
class Square extends Rectangle {
    public void setHeight(double h) {
        super.setHeight(h);
        super.setWidth(h);
    }
    public void setWidth(double w) {
        super.setHeight(w);
        super.setWidth(w);
    }

    @Override
    public double getArea() {
        return super.getHeight()*super.getWidth();
    }



}