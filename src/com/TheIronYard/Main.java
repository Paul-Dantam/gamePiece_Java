package com.TheIronYard;

public class Main {

    public static void main(String[] args) {

        GamePiece knight = new GamePiece();

        knight.setColor("white");
        knight.setName("Sir Robin");



        if (!knight.isFrozen()) {
            knight.freeze();
        System.out.println(knight.frozen);
        }

        if (knight.isFrozen()) {
            knight.unfreeze();
            System.out.println(knight.frozen);
        }


        if (!knight.isFrozen()) {
            System.out.println("positionX before moving: " + knight.getPositionX());
            System.out.println("positionY before moving: " + knight.getPositionY());

            knight.move(3, 4);
            System.out.println("positionX after moving: " + knight.getPositionX());
            System.out.println("positionY after moving: " + knight.getPositionY());
        }

        if (knight.isFrozen()) {
            System.out.println(knight.getName()+" is frozen and can't move");
        }





    }
}
