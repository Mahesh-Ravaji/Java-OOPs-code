/**
Name:
Class:			Batch:
Experiment No: 06
Program on: Nested Try
*/
class NestedTry
{
  
    public static void main(String args[])
    {
        try {
            	int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println(arr[5]);
            try {
			int x = arr[2] / 0;  // performe division by zero
            }
            catch (ArithmeticException e2) {
                System.out.println("division by zero is not possible");
            }
        }
        catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println("Element at such index does not exists");
        }
    }
}