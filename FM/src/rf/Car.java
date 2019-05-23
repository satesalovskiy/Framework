package rf;

import java.io.Serializable;

public class Car {
    String name;
    int year;
    String type;
    double volums;
    int hp;
    Car()
    {
        name = "NA";
        year = 0;
        type = "NA";
        volums =0.0;
        hp =0;

    }
    Car(String name,int year,String type,double volums,int hp)
    {
        this.name=name;
        this.year=year;
        this.type=type;
        this.volums=volums;
        this.hp=hp;
    }
    String GetName()
    {
        return this.name;
    }
    public String toString()
    {
        String result;

        result =name+"//" + year+"//" + type+"//" + volums+"//" + hp;

        return result;
    }

}
