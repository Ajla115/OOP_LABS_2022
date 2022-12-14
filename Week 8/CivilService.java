package com.Week8;
/*a) Create the class CivilService which implements your NationalService interface. The class constructor is without
parameters. The class has the object variable daysLeft which is initialised in the constructor receiving the value 362.
 */
public class CivilService implements NationalService {
    private int daysLeft;

    public CivilService(){
        this.daysLeft = 362;
    }
    @Override
    public int getDaysLeft() {
        return this.daysLeft;
    }

    @Override
    public void work() {
        if (this.daysLeft > 0){
            this.daysLeft--;
        }
    }
}
