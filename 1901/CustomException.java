import java.util.Scanner;
class Details{
    int age;
    void takeAge() throws InvalidAgeException{  //all the custom exceptions are checked exceptions
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        age = sc.nextInt();
        if(age>=18){
            System.out.println("You are eligible to vote");
        }
        else{
            throw new InvalidAgeException("Invalid age");
        }
    }
}
public class CustomException {
    public static void main(String[] args) {
        try{
            Details a =new Details();
            a.takeAge();
        }
        catch(InvalidAgeException iae){
            System.out.println(iae);
    
        }
    }

}
class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}
