import java.util.ArrayList;

public class UserInformation {
    public static void main(String[] args) {

        String name = "Nazareno";
        String lastname = "Bucciarelli";
        int age = 20;
        String country = "Argentina";
        String company = "Solvd Laba";
        String course = "Java Test Automation";

        System.out.println("Hi " + name + " " + lastname + ", you are " + age + " years old, also, you are from "
                + country + ". Currently you are learning at " + company + " about " + course + ". This is the " +
                "information provided through the args parameter in the main method:");

        if(args.length > 0 ){
            for(String arg:args){
                System.out.println(arg);
            }
        } else {
            System.out.println("I didn't receive any argument.");
        }


    }
}
