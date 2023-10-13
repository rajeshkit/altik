package Lsp;

public class Orange extends Apple{
    @Override
    public String getColor() {
        return "Orange";
    }

    public static void main(String[] args) {
        Apple apple = new Orange();
        System.out.println(apple.getColor());
    }
}
