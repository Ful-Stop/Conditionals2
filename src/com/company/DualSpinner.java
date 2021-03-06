package com.company;

public class DualSpinner {

    public static int spin(int min, int max) {
        return (int) Math.round(Math.random() * (max - min) + min);
    }

    public void playRound() {
        int playerSpin = spin(1, 10);
        int CPUSpin = spin(2, 8);
        int playerPoints = 0;

        if (playerSpin > CPUSpin) {
            playerPoints += (playerSpin - CPUSpin);
            System.out.println("You Win! " + playerPoints + " points");
            System.out.println(playerSpin);
            System.out.println(CPUSpin);
        }

        else if (playerSpin < CPUSpin) {
            playerPoints -= (CPUSpin - playerSpin);
            System.out.println("You Lose. " + playerPoints + " points");
            System.out.println(playerSpin);
            System.out.println(CPUSpin);
        } else {
            int newPlayerSpin = spin(1, 10);
            int newCPUSpin = spin(2, 8);
            if (playerSpin + newPlayerSpin > CPUSpin + newCPUSpin) {
                playerPoints += 1;
                System.out.println("You Win 2! " + playerPoints + " points");
                System.out.println(playerSpin + newPlayerSpin);
                System.out.println(CPUSpin + newCPUSpin);
            }
            else if (playerSpin + newPlayerSpin < CPUSpin + newCPUSpin) {
                playerPoints -= 1;
                System.out.println("You Lose 2. " + playerPoints + " points");
                System.out.println(playerSpin + newPlayerSpin);
                System.out.println(CPUSpin + newCPUSpin);
            }
            else {
                System.out.println("Tie. " + playerPoints + " points");
                System.out.println(playerSpin + newPlayerSpin);
                System.out.println(CPUSpin + newCPUSpin);
            }
        }
    }

    public static void main(String[] args) {
        DualSpinner ds = new DualSpinner();
        for (int i = 0; i < 10; i++) {
            ds.playRound();

        }
    }
}
