package DAY2;

public class Problem6 {
    public static void main(String[] args) {
        int english = 85;
        int maths = 90;
        int science = 80;
        int totalMarks = 300;

        int obtained = english + maths + science;
        double percentage = (obtained * 100.0) / totalMarks;

        System.out.println("Percentage = " + percentage + "%");
    }

}
