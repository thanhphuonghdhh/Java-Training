class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String s){
        super(s);
    }
    public InvalidAgeException(String s, Throwable e) {
        super(s, e);
    }
}
public class CustomException {
    public void checkAge(int a) throws InvalidAgeException{
        if (a<18) {
            throw new InvalidAgeException("Not Invalid");
        }
        System.out.println("Invalid");
    }

    public static void main(String[] args) {

        CustomException a = new CustomException();
        try {
            //a.checkAge(17);
            int b = 9/0;
        }
        catch (InvalidAgeException e){
            System.out.println(e);
        }
        catch (ArithmeticException e) {
            throw new InvalidAgeException("No",e);
        }
    }
}
