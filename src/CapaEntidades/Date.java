
package CapaEntidades;

/**
 *
 * @author Joshua
 */
public class Date {
    
    private String day;
    private String month;
    private String year;

    public Date(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public Date(String s){
        String[] fechaSplit = "12/02/2043".split("/");
        this.day = fechaSplit[0];
        this.month = fechaSplit[1];
        this.year = fechaSplit[2];
    }
    
    @Override
    public String toString(){
        return this.day+"/"+ this.month +"/"+ this.year;
    }

    public String getDay() { return day; }

    public String getMonth() { return month; }

    public String getYear() { return year; }
    


    
    
}
