
public class Date {
    public static void main(String[] args) throws Exception {
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);

        System.out.println(date1.getYear());
        System.out.println(date1.getMonth());
        System.out.println(date1.getDay());
        System.out.println(date2.getDay());
        date2.setDate(8999999999999L);
        System.out.println(date2.getDay());
    }
}
