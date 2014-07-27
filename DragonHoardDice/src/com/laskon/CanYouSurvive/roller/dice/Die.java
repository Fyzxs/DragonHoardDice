package com.laskon.CanYouSurvive.roller.dice;

import java.util.Random;

/**
 * Created by Nija on 7/26/2014.
 */
public abstract class Die {

    private static Random rand = new Random(System.nanoTime());

    enum Type{
        POSITIVE(1),
        NEUTRAL(0),
        NEGATIVE(-1);

        final int value;

        private Type(final int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }
    private Type[] sides;

    protected Die(final Type[] sides){
        this.sides = sides;
    }

    public Type getRandomSide(){
        synchronized (rand){
            return sides[rand.nextInt(sides.length)];
        }
    }
}
