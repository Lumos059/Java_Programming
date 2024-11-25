//this keyword
public class Student2 {
    private String name;
    public Student2(String name){
        this.name = name;
    }
    public Student2(){
        this("Irfan");
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
