/*
import java.util.Scanner;

class New {
    Scanner scanner = new Scanner(System.in);

    int[] roll;
    
    String[] name;
    
   
    

    int arrsize;

    void array_size()

    {
        // Method to input array size
        System.out.println("\n Please Enter how many student: ");
        arrsize = scanner.nextInt();

        // Initialize the roll array with the size
        roll = new int[arrsize];

        name = new String[arrsize];
        scanner.nextLine(); // Consume leftover newline "need to reasearch"
    }

    void roll_name()

    {
        // Method to input roll numbers
        System.out.println("\n Please enter the roll number: ");
        for (int i = 0; i < arrsize; i++) {

            System.out.print(" Roll No. : " );

            roll[i] = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Roll: " +roll[i] +" Student name : " );
            name[i] = scanner.nextLine(); // "need to check"
           
            


        }
    }

    void viewroll()

    {
        for (int i = 0; i < arrsize; i++) {

            System.out.println( "Student No."+ (i+1) +" Roll:" + roll[i]+" Student Name: "+ name[i]+" Subject Name: "+sub[i] );
            

        }
    }



    public static void main(String[] args) {
        
        New obj = new New();
        // int roll, arrsize;
        

        obj.array_size();
        obj.roll_name();
        obj.viewroll();

        obj.scanner.close();

    }

}
*/

/*
import java.util.Scanner;

class New {
    Scanner scanner = new Scanner(System.in);

    String[][] roll;
    int row, col, input;

    void array_size()

    {
        // Method to input array size in column
        System.out.println("\n Please Enter total number of subject: ");
        input = scanner.nextInt();
        col = input + 4;

        // Method to input array size in row
        System.out.println("\n Please Enter how many student: ");
        row = scanner.nextInt();

        // Initialize the roll array with the size
        roll = new String[row][col];
        scanner.nextLine(); // Consume leftover newline "need to reasearch"
    }

    void roll_name()

    {
        // Method to input roll numbers
        System.out.println("\n Please enter the roll number and student details: ");
        for (int i = 0; i < row; i++) 
        {     // for row

            for(int j = 0; j<col; j++) // for column
            {

                if(j==0)
                {
                    System.out.println("Please Enter the Roll No. : ");
                    roll[i][j] = scanner.next();
                }
                
                else if(j==1)
                {
                    System.out.println("Please Enter the Student Name : ");
                    roll[i][j] = scanner.next();
                }

                for(int i =3; j>i&&j<=input; i++)
                {
                    System.out.println("Please Enter the Subject Name : ");
                    roll[i][j] = scanner.next();

                }

                else if(j==input+1)
                {
                    for(int i = 3; i<=input i++)
                    {
                        roll[][j]=row[][j+i];
                    }

                    System.out.println("Total Number : ");
                    roll[i][j] = scanner.next();
                }
                else if (j==input+2) {
                    System.out.println("Please Enter the percentage : ");
                    roll[i][j] = scanner.next();

                }


            
            //scanner.nextLine();

            // System.out.println("Roll: " +roll[i] +" Student name : " );
           // name[i] = scanner.nextLine(); // "need to check"
        }
           
            


        }
    }

    void viewroll()

    {
        for (int i = 0; i < row; i++) // for row
        {
            for (int j = 0; j < col; j++) // for col
            {
                System.out.println(" " + roll[i][j]);
                // System.out.println( "|Student No."+ (i+1) +"| Roll:" + roll[i]+"| Student
                // Name: "+ name[i]+" Subject Name: "+sub[i] );

            }

        }
    }

    public static void main(String[] args) {

        New obj = new New();
        // int roll, arrsize;

        obj.array_size();
        obj.roll_name();
        obj.viewroll();

        obj.scanner.close();

    }

}
 */



import java.util.Scanner;

public class New {
    Scanner scanner = new Scanner(System.in);

    String[][] roll;
    int row, col, subjectCount;

    void array_size() {
        System.out.print("\nPlease Enter total number of subjects: ");
        subjectCount = scanner.nextInt();

        System.out.print("Please Enter how many students: ");
        row = scanner.nextInt();

        // Add 4 extra columns for Roll No, Name, Total, Percentage
        col = subjectCount + 4;

        roll = new String[row][col];
        scanner.nextLine(); // consume leftover newline
    }

    void roll_name() {
        System.out.println("\nPlease enter the roll number, student name and marks:");

        for (int i = 0; i < row; i++) 
            {
            // Roll No.
            System.out.print("Roll No. of student " + (i + 1) + ": ");
            roll[i][0] = scanner.nextLine();

            // Student Name
            System.out.print("Name of student " + (i + 1) + ": ");
            roll[i][1] = scanner.nextLine();

            int totalMarks = 0;

            // Subject marks input
            for (int j = 0; j < subjectCount; j++) {
                System.out.print("Marks in Subject " + (j + 1) + ": ");
                String markStr = scanner.nextLine();

                // Store the mark as string in the array
                roll[i][j + 2] = markStr;

                // Convert to int and add to total
                try {
                    int mark = Integer.parseInt(markStr);
                    totalMarks += mark;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Marks set to 0.");
                }
            }

            // Store total marks
            roll[i][col - 2] = String.valueOf(totalMarks);

            // Calculate and store percentage
            double percentage = ((double) totalMarks / (subjectCount * 100)) * 100;
            roll[i][col - 1] = String.format("%.2f", percentage);
        }
    }

    void viewroll() {
        System.out.println("\nStudent Details:");
        for (int i = 0; i < row; i++) {
            
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Roll No: " + roll[i][0]);
            System.out.println("Name: " + roll[i][1]);
            for (int j = 2; j < col - 2; j++) {
                System.out.println("Subject " + (j - 1) + " Marks: " + roll[i][j]);
            }
            System.out.println("Total Marks: " + roll[i][col - 2]);
            System.out.println("Percentage: " + roll[i][col - 1] + "%");
            System.out.println("-------------------------");
        }
    }

    public static void main(String[] args) {
        New obj = new New();

        obj.array_size();
        obj.roll_name();
        obj.viewroll();

        obj.scanner.close();
    }
}
