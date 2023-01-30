package com.week12.boxes;
/*Next, implement the class OneThingBox in the package boxes; the class inherits Box. OneThingBox has the constructor
public OneThingBox(), and only one thing can fit there. If the box already contains one thing, this should not be changed.
The weight of the added thing is not important.
 */

import java.util.ArrayList;
import java.util.List;

public class OneThingBox extends Box{
    private int numberOfItems;
    private List<Thing> box;

    public OneThingBox(){
        this.numberOfItems = 0;
        this.box = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        if(numberOfItems != 1){
            box.add(thing);
            numberOfItems = 1;
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        boolean found = false;

        for(Thing t : box){
            if(t.equals(thing)){
                found = true;
                break;
            }
        }
        return found;
    }

}

