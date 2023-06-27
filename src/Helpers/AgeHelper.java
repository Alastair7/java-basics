package Helpers;

public class AgeHelper {
    private boolean CheckAge (int age){
        return age > 18;
    }

    public String IsAdult (int age) 
    {
        boolean isAdult = CheckAge(age);
        return isAdult ? "Your age is: " + Integer.toString(age) : "You are underage"; 
    }
}
