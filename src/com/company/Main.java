package com.company;

public class Main {

    public static void main(String[] args) {
        Name name = new Name("Mike");
        Name nameC = new Name("Alex");
        Gorilla objectA = new Gorilla(Color.BLACK ,"Горная");
        objectA.moving("Лезить на дерево" , 6);
        System.out.println(objectA.getInfo());


        Kids objectB = new Kids(10, 173,new Name("Muhtar") , "Западная" , Color.GRAY);
        objectB.moving(8 , "Передвигается на четырёх лапах");
        System.out.println(objectB.getInfo());


        Kids objectC = new Kids(12, 168, nameC , "Восточная" , Color.BLACK);
        objectC.moving(10 , "Перепрыгивать через деревья");
        System.out.println(objectC.getInfo());

        objectC.copyMethod(objectB);
        System.out.println(objectC.getInfo());


        
    }
}
