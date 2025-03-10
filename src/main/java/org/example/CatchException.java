package org.example;

public class CatchException {
    public static void main(String[] args)
    {

        int a[] = { 1, 2, 3, 4, 5 };

        try {
            for (int i = 0; i <= a.length; i++)
                System.out.print(a[i] + " ");
        }
        catch (Exception e) {
            System.out.println("\nException Caught");
        }
    }
}

