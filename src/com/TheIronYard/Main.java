package com.TheIronYard;


public class Main {

    public static void main(String[] args) {

        GamePiece knight = new GamePiece();

        knight.setColor("white");
        knight.setName("Sir Robin");

        if (!knight.isFrozen()) {
            knight.freeze();
            if(knight.isFrozen()) {
                System.out.println(knight.frozen);
            }
        }

        if (knight.isFrozen()) {
            System.out.println(knight.getName()+" is frozen and can't move");
        }

        if (knight.isFrozen()) {
            knight.unfreeze();
            if (!knight.isFrozen()) {
                System.out.println(knight.frozen);
            }
        }
        if (!knight.isFrozen()) {
            int startY = knight.positionY;
            int startX = knight.positionX;

            knight.move(3, 4);
            if(knight.positionX != startX || knight.positionY != startY) {
                System.out.println("positionX after moving: " + knight.getPositionX());
                System.out.println("positionY after moving: " + knight.getPositionY());
            } else{
                System.out.println(knight.getName() + " didn't move!");
            }
        }
    }
}
