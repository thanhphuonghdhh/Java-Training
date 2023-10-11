package com.example.TestSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //define bean
public class GirlFriend {

    @Autowired //inject bean into the field of another bean
    //won’t work on fields that are declared final/immutable
    //only way to declare immutable dependencies is by using constructor-based DI
    public Outfit outfit;

    // @Autowired //inject bean into the constructor, recommended injection method for mandatory dependency usage
    public GirlFriend(Outfit outfit) {
        this.outfit = outfit;
    }
    // @Autowired //inject bean into the setter, used if there are optional mutable dependencies, and optional dependencies can be specified with @Autowired
    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }

    public Outfit getOutfit() {
        return outfit;
    }
}
