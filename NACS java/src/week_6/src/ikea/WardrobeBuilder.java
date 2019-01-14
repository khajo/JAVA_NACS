package week_6.src.ikea;


import week_6.src.ikea.*;

import java.util.Arrays;
import java.util.List;


/*Create the WardrobeBuilder class that has a list of all the
Steps it has to follow to build a wardrobe. It has the build
 method. It creates an empty Wardrobe and applies all the steps
  one by one to it until it’s finished and then it returns it.
   A Wardrobe needs the following to be completed: one bottom,
   2 sides, one back, one top, 8 shelves and 2 doors.
*/
public class WardrobeBuilder {


  private List<Step> steps = Arrays.asList(new AddBottom(),new AddSide(),new AddSide(),new AddBack(),new AddTop()
            ,new AddShelf(),new AddShelf(),new AddShelf(),new AddShelf(),
            new AddShelf(),new AddShelf(),new AddShelf(),new AddShelf(),new AddDoor(),new AddDoor());

    public Wardrobe built(){
        Wardrobe wardrobe = new Wardrobe();
        for (Step step : steps) {
            step.perform(wardrobe);
        }



        return wardrobe;
    }


}
