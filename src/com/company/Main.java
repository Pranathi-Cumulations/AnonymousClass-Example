package com.company;

interface Movable{
    void move();
        }
public class Main {

    public static void main(String[] args) {
        Movable humanMovement = new Movable(){
            @Override
            public void move() {
                System.out.println("Walks");
            }
        };

        Movable carMovement = new Movable() {
            @Override
            public void move() {
                System.out.println("engine");
            }
        };

        Movable biCycleMovement = new Movable() {
            @Override
            public void move() {
                System.out.println("Mechanical energy by humans");
            }
        };

        humanMovement.move();
        carMovement.move();
        biCycleMovement.move();


    }
}
