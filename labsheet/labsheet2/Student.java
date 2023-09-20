public class Student{
    
    
    private String name;
    private int age;
    private char grade;

    Student(String name,int age,char grade){
        this.name = name;
        this.age=age;
        this.grade = grade;
    }
    Student(){
        this.name = "Dummy name";
        this.age=18;
        this.grade='A';
    }

    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public char getGrade(){
        return grade;
    }
    public void setGrade(char newGrade){
        grade = newGrade;
    }
    public void displayInfo(){
        System.out.println("Name : " +this.name+", Age : "+this.age+", Grade : "+this.grade);
        }


public static void main(String[] args) {
    Student std1 = new Student("Tharushi",22,'A');

    std1.displayInfo();

}

}
