void main() {
    postgraduate std1=new postgraduate("Abdinasir Ahmed Hossan",4.9,"Computer Science");
    System.out.println(std1.card());

}
public class Person {
    protected String name;
    public Person(String name){
        this.name=name;
        System.out.println("1. Person: "+name);
    }
    String define(){
        return name;
    }
}
public class student extends Person{
    protected double gba;
    student(String name,double gba){
        super(name);
        this.gba=gba;
        System.out.println("2. student GBA: "+gba);
    }
}
public class postgraduate extends student{
    protected String thesis;
    public postgraduate(String name,double gba, String thesis){
        super(name,gba);
        this.thesis=thesis;
        System.out.println("3. Postgraduate: "+thesis);
    }
    public String card(){
        return super.define()+" |GBA "+gba+" | "+thesis;

    }
}