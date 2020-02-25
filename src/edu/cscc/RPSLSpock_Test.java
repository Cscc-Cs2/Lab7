package edu.cscc;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RPSLSpock_Test {

    @Test
    void isValidPick() {
        Assert.assertTrue(RPSLSpock.isValidPick("Rock"));
        Assert.assertTrue(RPSLSpock.isValidPick("Paper"));
        Assert.assertTrue(RPSLSpock.isValidPick("Scissors"));
        Assert.assertTrue(RPSLSpock.isValidPick("Lizard"));
        Assert.assertTrue(RPSLSpock.isValidPick("Spock"));
        Assert.assertFalse(RPSLSpock.isValidPick("banana"));

    }

    @Test
    void generatePick() {
        for(int i=0;i<10000;i++)
        {
            String s = RPSLSpock.generatePick();
            assertTrue(s != null);
            assertTrue(RPSLSpock.isValidPick(s));
        }
    }

    @Test
    void isComputerWin() {

        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK,RPSLSpock.SCISSORS));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK,RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER,RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER,RPSLSpock.SPOCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS,RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS,RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD,RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD,RPSLSpock.SPOCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SPOCK,RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK,RPSLSpock.SCISSORS));
        Assert.assertFalse(RPSLSpock.isComputerWin(RPSLSpock.ROCK,RPSLSpock.PAPER));



    }
}