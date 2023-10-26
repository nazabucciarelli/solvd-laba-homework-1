import java.util.ArrayList;

public class UserInformation {
    public static void printUserInfo(String name, String lastname, int age,
                                     String country, String company, String course){
        System.out.println("Hi " + name + " " + lastname + ", you are " + age + " years old, also, you are from "
                + country + ". Currently you are learning at " + company + " about " + course + ".");
    }
}
