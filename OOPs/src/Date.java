public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public void setDate(int day,int month, int year) {
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void display() {
        String d=day+"";
        String m=month+"";
        String y=year+"";

        if (day<10) d="0"+d;
        if (month<10) m="0"+m;

        System.out.println(d+"/"+m+"/"+y);
    }
}
class D {
    public static void main(String[] args) {
        Date d = new Date(1, 1, 1997);
        d.display();
        d.setDate(12, 12, 2004);
        d.display();
        d.setMonth(3);
        d.display();
    }
}