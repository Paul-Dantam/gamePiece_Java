package com.TheIronYard;


public class Main {

    public static void main(String[] args) {

        GamePiece knight = new GamePiece();

        knight.setColor("white");
        knight.setName("Sir Robin");

        if (!knight.isFrozen()) {
            knight.freeze();
            if(knight.isFrozen()) {
                System.out.println("Verification: "+knight.getName()+" is frozen is "+knight.frozen);
            }
        }
        if (knight.isFrozen()) {
            knight.unfreeze();
            if (!knight.isFrozen()) {
                System.out.println("Verification: "+knight.getName()+" is frozen is "+knight.frozen);
            }
        }

        if (!knight.isFrozen()||knight.isFrozen()) {
            knight.freeze();
            int startY = knight.getPositionY();
            System.out.println("Testing: "+knight.getName()+ " is at positionY before moving: " + knight.getPositionX());
            int startX = knight.getPositionX();
            System.out.println("Testing: "+knight.getName()+ " is at positionX before moving: "+ knight.getPositionY());

            knight.move(startX +2, startY +2);
            System.out.println("Testing: "+knight.getName()+ " is at positionY after moving: " + knight.getPositionX());
            System.out.println("Testing: "+knight.getName()+ " is at positionX after moving: "+ knight.getPositionY());
            System.out.println("Verification: "+knight.getName()+" is frozen and can't move");
        }


        if (!knight.isFrozen()||knight.isFrozen()) {
            knight.unfreeze();
            int startY = knight.getPositionY();
            System.out.println("Testing: "+knight.getName()+ " is at positionX before moving: "+ knight.getPositionY());
            int startX = knight.getPositionX();
            System.out.println("Testing: "+knight.getName()+ " is at positionY before moving: " + knight.getPositionX());

            knight.move(startY+3, startX+4);
            if(knight.positionX != startX || knight.positionY != startY) {
                System.out.println("Testing: "+knight.getName()+ " is at positionX after moving: " + knight.getPositionX());
                System.out.println("Testing: "+knight.getName()+ " is at positionY after moving: " + knight.getPositionY());
                System.out.println("Verification: "+knight.getName()+" is not frozen and can move");

            }
            }
        }
    }

