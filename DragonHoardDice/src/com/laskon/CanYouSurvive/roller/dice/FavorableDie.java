package com.laskon.CanYouSurvive.roller.dice;

/**
 * Created by Nija on 7/26/2014.
 */
public class FavorableDie extends Die {

    public FavorableDie(){
        super(new Type[]{Type.POSITIVE, Type.POSITIVE, Type.POSITIVE, Type.NEUTRAL, Type.NEUTRAL, Type.NEGATIVE});
    }
}
