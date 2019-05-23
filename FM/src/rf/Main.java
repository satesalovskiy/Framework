package rf;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class Main{
    public static void main (String args [])
    {
        Scanner in = new Scanner(System.in);
       // System.out.println("Enter file name: ");
       // String fileName = in.next();
        String fileName = "3.txt";
        System.out.println("Entered file name: " + fileName);
        FM a = new FM();
        a.Read(fileName);
        String resultName="2.txt";


       // System.out.print("Enter full name: ");

       // String name1 = in.nextLine();


       // a.FindCar(name1);
      /*  a.AddCar();
        System.out.println();
        System.out.println();
        System.out.println("Enter full name: ");

        String name2 = in.nextLine();
        a.FindCar(name2);
        a.WriterFM(resultName);*/
        System.out.println("What to do?: 1.Add 2.Find 3.Delete 4.Edit");
        int c =in.nextInt();
        switch (c) {
            case 1:
                a.AddCar();
                a.WriterFM(resultName);
                break;
            case 2:
                System.out.print("Enter full name:");
                String name1 = in.next();
                a.FindCar(name1);
                break;
            case 3:
                System.out.print("Enter full name:");
                String name2 = in.next();
                a.DeleteCar(name2);
                a.WriterFM(resultName);
                break;
            case 4:
                System.out.print("Enter full name:");
                String name3 = in.next();
                a.EditCar(name3);
                a.WriterFM(resultName);
                break;

        }
        in.close();
    }
}
