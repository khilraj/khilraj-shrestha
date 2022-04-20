package Task1;

public class Ternary {
    public static void main(String[] args) {
        int math=80;
        int science = 60;
        int english=75;
        int nepali=50;
        float Total_marks= math+science+english+nepali;
        System.out.println("The total marks obtained by student is\t"+Total_marks);
        float percentage = (Total_marks)/4;
        System.out.println("The percentage of this student is\t"+percentage);
        // Ternary operator
        String Grade;
        Grade= (percentage>=70)? "first class": ((percentage>=59 && percentage<70)? "upper second class": ((percentage>49 && percentage<59)? "second class": ((percentage>=39 && percentage<49)? "Third class":"Failed")));
        System.out.println("your grade is\t"+Grade);
    }
}
