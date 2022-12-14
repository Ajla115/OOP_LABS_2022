package com.Week8;
/*b) Create the class MilitaryService which implements your NationalService interface.
 The class constructor has one parameter, defining the days of service (int daysLeft).
 */
public class MilitaryService implements NationalService{
    private int daysLeft;
    public MilitaryService(int daysLeft){
        this.daysLeft =  daysLeft;
    }

    @Override
    public int getDaysLeft() {
        return this.daysLeft;
    }

    @Override
    public void work() {
        if(this.daysLeft > 0){
            this.daysLeft--;
        }
    }
}
