package com.week12.boxes;
/*Next, implement the class BlackHoleBox in the package boxes; the class inherits Box. BlackHoleBox has the constructor
public BlackHoleBox(); anything can be added to a black-hole box, but none will be found when you look for them. In other
words, adding things must always work, but the method isInTheBox has to always return false.
 */

import java.util.ArrayList;
import java.util.List;

public class BlackHoleBox extends Box {
    private List<Thing> box;

    public BlackHoleBox(){
        this.box = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        box.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}

