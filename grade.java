import java.util.*;
public class grade{
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);
        int i,num;
        double marks=0,tmarks=0,avg;
        String grade;
        // Enter how many subjects you have..
        System.out.print ("Enter the number of subjects:");
        num=in.nextInt();
        for(i=1;i<=num;i++){
            // Enter the marks of each subjects in between 0 to 100.
            System.out.print("Enter the marks obtained in subject"+i+":");
            marks=in.nextDouble();
            // Checks if the entered marks is exceeding the limit or not.
            if(marks>100 || marks<0){
                System.out.print("Invalid input! Enter number in between 0 to 100\n");
                i--;
                continue;
            }
            // Find the total marks
            tmarks+=marks;
        }
        // Find the average marks
        avg=tmarks/num;
        // Display the grades based on the average marks
        if(avg>=90){
            grade="A+";
        }
        else if(avg>=80 &&  avg<90 ){
            grade="A";
        }
        else if(avg >= 70 && avg<80){
            grade="B";
        }
        else if(avg >=60 && avg < 70){
            grade="C";
        }
        else if (avg>= 50 && avg < 60){
            grade="D";
        }
        else if( avg>= 37 && avg < 50){
            grade="E";
        }
        else{
            grade="F";
        }
        // Results
        System.out.println("\nTotal marks = "+tmarks);
        System.out.println("Average percentage = "+avg+"%");
        System.out.println("Grade = "+grade);
    }
}