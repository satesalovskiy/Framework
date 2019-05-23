package rf;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FM{
    String[] subStr;
    String[] subStr2;
    ArrayList<Car> cars = new ArrayList<>();

    int [] del = new int[100];
    int [] del2 = new int[100];

    void Read (String name)
    {

        try{
            FileInputStream f = new FileInputStream(name);
            BufferedReader br = new BufferedReader(new InputStreamReader(f));
            String string1;
            while ((string1 = br.readLine()) != null){
                String del = "//";
                subStr = string1.split(del);

                int year = Integer.parseInt(subStr[1]);
                double volum = Double.parseDouble(subStr[3]);
                int hp= Integer.parseInt(subStr[4]);
                String p = subStr[0];
                //System.out.print( Index(subStr[0]));
                //Car pp = new Car(subStr[0],year,subStr[2],volum,hp);

                cars.add(new Car(subStr[0],year,subStr[2],volum,hp));


            }
           // System.out.println(cars.get(1).GetName());
           // System.out.println(cars.get(1).Write());
            br.close();
            f.close();

        }
        catch (IOException e)
        {
            System.out.println("Ошибка");
        }
    }
    /*void ReadS(String name)
    {
        try{
            FileInputStream f = new FileInputStream(name);
            ObjectInputStream oin = new ObjectInputStream(f);
            oin.readObject();

            f.close();

        }
        catch (IOException e)
        {
            System.out.println("Ошибка");
        }
        catch(ClassNotFoundException ex)
        {

        }
    }*/
    void WriterFM(String name)
    {
        try(FileWriter writer = new FileWriter(name))
        {
            int j =cars.size();
            for (int i =0; i<j;i++)
            {
               // System.out.println(cars.get(i).Write());
                writer.write(cars.get(i).toString()+'\n');
                //writer.write('\n');
            }

            writer.flush();
        }
        catch(IOException ex){

            System.out.println("Can not write");
        }
    }
    /*void WriteS(String name)
    {
        try
        {
            FileOutputStream f = new FileOutputStream(name);
            ObjectOutputStream oos = new ObjectOutputStream(f);
            //TestSerial ts = new TestSerial();
            oos.writeObject();
        }
        catch(IOException e)
        {

        }
    }*/
    void AddCar()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter car name: ");
        String name = in.nextLine() ;

        System.out.print("Enter year: ");
        int year1 = in.nextInt() ;

        System.out.print("Enter type: ");
        String type = in.next() ;

        System.out.print("Enter volum: ");
        double volums = in.nextDouble() ;

        System.out.print("Enter hp: ");
        int hps = in.nextInt() ;

        //int year1 = Integer.parseInt(year);
        //double volums = Double.parseDouble(volumss);
        //int hps= Integer.parseInt(hp);

       // System.out.println("New element");
        cars.add(new Car(name, year1, type, volums, hps));
        in.close();
        //FindCar(name);
        // System.out.println(cars.indexOf());
    }
    void FindCar(String name1)
    {
        //System.out.println(name1);
        int a=0;
        for (int i =0; i<cars.size();i++)
        {
            //System.out.println(cars.get(i).GetName());
            if ((cars.get(i)!=null)&&(cars.get(i).GetName().equals(name1)))
            {
                System.out.println("Found!");
                System.out.println(cars.get(i).toString());
                a++;
            }
        }
        if(a==0)
        {
            System.out.println("Not found");
        }



    }
    int Index(String name)
    {
        int index =0;

        for (int i =0; i<name.length();i++)
        {
            index++;
        }

        return index;
    }
    void DeleteCar(String name)
    {
        int j=0;
        for (int i =0; i<cars.size();i++)
        {

            //System.out.println(cars.get(i).GetName());
            if ((cars.get(i)!=null)&&(cars.get(i).GetName().equals(name)))
            {
                System.out.print("Found: ");
                System.out.println(i+": "+cars.get(i).toString());
                del[j]=i;
                j++;
                //cars.remove(i);
            }
        }
        System.out.println("What to del?");

        for (int i =0;i<del.length;i++)
        {
                if(del[i]!=0)
                {
                    System.out.print(" " + del[i]);
                }



        }
        Scanner in = new Scanner(System.in);
        System.out.println();
        int o = in.nextInt();
        cars.remove(o);
    }
    void EditCar(String name)
    {
        int j=0;
        for (int i =0; i<cars.size();i++)
        {

            //System.out.println(cars.get(i).GetName());
            if ((cars.get(i)!=null)&&(cars.get(i).GetName().equals(name)))
            {
                System.out.print("Found: ");
                System.out.println(i+": "+cars.get(i).toString());
                del2[j]=i;
                j++;
                //cars.remove(i);
            }
        }
        System.out.println("What to edit?");

        for (int i =0;i<del2.length;i++)
        {
            if(del2[i]!=0)
            {
                System.out.println(i+": "+cars.get(i).toString());

            }



        }
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.println();
            int o = in.nextInt();
 //           System.out.println("Enter data: ");
//            System.out.println();
//            String string1 = in.nextLine();
            String string1 ="Aston//2000//df//1//1";
            String del = "//";
            subStr2 = string1.split(del);

            int year = Integer.parseInt(subStr2[1]);

            double volum = Double.parseDouble(subStr2[3]);
            int hp= Integer.parseInt(subStr2[4]);
            cars.set(o, new Car(subStr2[0],year,subStr2[2],volum,hp));




    }
}
