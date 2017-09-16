package com.TheIronYard;


public class Main {

    public static void main(String[] args) {

        GamePiece knight = new GamePiece();

        knight.setColor("white");
        knight.setName("Sir Robin");

        // set as unFrozen
        if (!knight.isFrozen()) {
            knight.freeze();
            if(knight.isFrozen()) {
                System.out.println("Verified freeze() works correctly to set Frozen as true");
            }else {
                System.out.println("FAILED: freeze() when not frozen does not work");
            }
        }
        if (knight.isFrozen()) {
            knight.unfreeze();
            if (!knight.isFrozen()) {
                System.out.println("Verification: unFreeze() works correctly to set Frozen as false");
            }else {
                System.out.println("FAILED: unfreeze() when frozen does not work");
            }
        }


        knight.unfreeze();
        if (!knight.isFrozen()) {
            int startY = knight.getPositionY();
            int startX = knight.getPositionX();
            knight.move(startX + 2, startY + 2);
            if (knight.getPositionX() != startX && knight.positionY != startY) {
                System.out.println("Verification: When isFrozen() is false, move() works correctly");
            } else {
                System.out.println("FAILED: when isFrozen() is false, move() does not work");
            }
        }

    knight.freeze();
        if (knight.isFrozen()) {
            int startY = knight.getPositionY();
            int startX = knight.getPositionX();
            knight.move(startX+3, startY+4);
            if(knight.getPositionX() == startX && knight.positionY == startY) {
                System.out.println("Verification: When isFrozen() is true, move() does not work");
            }else {
                System.out.println("FAILED: when isFrozen() is true, move() is still functioning");
            }
            }
        }
    }

