package com.laskon.CanYouSurvive.roller.dice;

/**
 * Created by Nija on 7/26/2014.
 */
public class HostileDie extends Die {

    public HostileDie(){
        super(new Type[]{Type.POSITIVE, Type.NEUTRAL, Type.NEUTRAL, Type.NEGATIVE, Type.NEGATIVE, Type.NEGATIVE});
    }
}
