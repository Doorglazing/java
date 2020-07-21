public class MyDate {
    private int year,
                month,
                day;
    MyDate(){}

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    void showDate(){
        System.out.println("日期:" + year + "年" + month + "月" + day + "日");
    }
    void isBi(){
        System.out.println((this.year % 4 == 0 && this.year % 100 != 0)||this.year % 400 == 0 ? "是闰年":"不是闰年");
    }
}
