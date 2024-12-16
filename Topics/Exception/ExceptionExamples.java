package Exception;

public class ExceptionExamples {
    public static void AccessElement(int[] arr, int index) {
        try {
            System.out.println("Array element in "+index+arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error : Index out of Range");
        }
    }
    public static void Division(int num1, int num2) {
        try {
            System.out.println("Division of "+num1+" and "+num2+" is "+(num1/num2));
        } catch (ArithmeticException e) {
            System.out.println("Error : Division by zero not possible");
        }
    }
    public static void ValidAge(int age) throws CustomException{
        if (age < 18) {
            throw new CustomException("Age must be greater than 18");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        AccessElement(arr,0);
        Division(5,0);
        ValidAge(5);
    }
}
