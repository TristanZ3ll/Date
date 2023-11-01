

/**************************************************************
*                     MyDate                         *
***************************************************************
* -millisec: long                                              *
* -month: int                                                  *
* -day: int                                                    *
* -c: Calendar                                                 *
* +MyDate()                                                    *
* +MyDate(newMillisec: long)                                   *
* +MyDate(newYear: int,newMonth: int, newDay: int              *
* +setDate(elapsedTime: long)                                  *
* +getMonth(): int                                             *
* +getDay(): int                                               *
* +getYear(): int                                              *                                          
**************************************************************/











import java.util.Calendar;


public class MyDate {
    private long millisec;
    private int month;
    private int day;
    private int year;
    private Calendar c = Calendar.getInstance();

    MyDate(){
        day = 1;
        month = 11;
        year = 2023;
        c.set(year,month,day);
        
    }
    MyDate(long newMillisec){
        millisec = newMillisec;
        c.setTimeInMillis(millisec);
    }
    
    MyDate(int newYear, int newMonth, int newDay){
        day =  newDay;
        year=newYear;
        month= newMonth;
        c.set(year,month,day);
    }
    public int getMonth(){
        return(c.get(Calendar.MONTH));
    }

    public int getDay(){
        return(c.get(Calendar.DAY_OF_MONTH));
    }

    public int getYear(){
        return(c.get(Calendar.YEAR));
    }

    public void setDate(long elapsedTime){
        c.set(1970,0,1);
        c.setTimeInMillis(elapsedTime);
    }
}
