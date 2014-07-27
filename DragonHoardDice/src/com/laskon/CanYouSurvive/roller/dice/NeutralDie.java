package com.laskon.CanYouSurvive.roller.dice;

/**
 * Created by Nija on 7/26/2014.
 */
public class NeutralDie extends Die {

    public NeutralDie(){
        super(new Type[]{Type.POSITIVE, Type.POSITIVE, Type.NEUTRAL, Type.NEUTRAL, Type.NEGATIVE, Type.NEGATIVE});
    }
}
