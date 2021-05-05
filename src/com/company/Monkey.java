package com.company;

public class Monkey {
    private Color color;


    public Monkey(String color) {
    }

    public Monkey() {
    }

    public void voice() {
        System.out.println("Голос!");
    }


    public Monkey(Color color) {
        this.color = color;

    }

    public Monkey(int age) {
    }

    public Color getColor() {
        return color;
    }

    public String getInfo() {
        return "Color - " + color;
    }
}
