package PredicatesLamdaTest;

public class Employees {

    private int id;
    private String name;
    private int Age;
    private String designation;


    public Employees(int id, String name, int Age, String designation)
    {   this.id=id;
        this.name=name;
        this.Age=Age;
        this.designation=designation;
    }
    public int getid(){ return id; }
    public int getAge(){ return Age;}
    public String getName(){return name;}
    public String getdesignation(){return designation;}

    public String toString(){
        return this.id +" , "+this.name +" , "+
                this.Age+" , "+this.designation;
    }


}
