import java.util.Scanner;

class New {
    Scanner scanner = new Scanner(System.in);

    int[] roll;
    
    String[] name;
    
    String[] sub;
    int[] marks;
    /*int[] total;
    int[] per;
     */

    int arrsize;

    void array_size()

    {
        // Method to input array size
        System.out.println("\n Please Enter how many student: ");
        arrsize = scanner.nextInt();

        // Initialize the roll array with the size
        roll = new int[arrsize];

        name = new String[arrsize];
        
        sub = new String[arrsize];
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
           
            System.out.println("Roll: " +roll[i] +"| Student name : " + name[i]+"| Enter Subject name: ");
            sub[i] = scanner.nextLine();


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