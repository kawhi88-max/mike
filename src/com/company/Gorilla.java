package com.company;

public class Gorilla extends Monkey  {
    private String breed;


    public String getBreed() {
        return breed;
    }

    public Gorilla(Color color, String breed ) {
        super(color);
        this.breed = breed;
    }

    public Gorilla(Color color) {
        super(color);
    }

    public void moving (String movingType , int distance) {
        for (int i = 0; i < distance; i++) {
            System.out.println("He moved: " + (i + 1) + " meter.");
        }
    }

    public void moving( int distance ,String movingType) {
        for (int i = 0; i < distance; i++) {
            System.out.println("He moved: " + (i + 1) + " meter.");
        }
    }

    public String getInfo(){
        return super.getInfo()+" \n порода - " +breed;
    }

}
