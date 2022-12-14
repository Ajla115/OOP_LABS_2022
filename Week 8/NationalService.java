package com.Week8;
/* In the exercise layout, you find the premade interface NationalService, which contains the following operations:
the method int getDaysLeft() which returns the number of days left on service
the method void work(), which reduces the working days by one. The working days number can not become negative
*/

public interface NationalService {
    public int getDaysLeft(); //mozemo stavit public, ali i ne moramo, ali private NE MOZE
    public void work();


}
