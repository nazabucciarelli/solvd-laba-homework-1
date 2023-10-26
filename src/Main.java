public class Main {
    public static void main(String[] args) {
        // 1st Exercise: Doing a simple System.out program.

        String name = "Nazareno";
        String lastname = "Bucciarelli";
        int age = 20;
        String country = "Argentina";
        String company = "Solvd Laba";
        String course = "Java Test Automation";

        UserInformation.printUserInfo(name,lastname,age,country,company,course);

        // Printing parameters sent to main in terminal (if any)

        System.out.println( "This is the information provided through the args parameter in the main method:");

        if(args.length > 0 ){
            for(String arg:args){
                System.out.println(arg);
            }
        } else {
            System.out.println("I didn't receive any argument.");
        }

        // 2nd Exercise: Quick Sort Algorithm.

        int[] numbers = {1, 14, 18, 3, 2, 6, 5, 4, 0, 8, 20};
        QuickSort.quickSort(numbers,0,numbers.length -1);
        for(int num:numbers){
            System.out.print(num+ " ");
        }
    }
}
