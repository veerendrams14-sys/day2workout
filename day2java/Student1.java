class Student {
    String name;
    int rollno;
    int marks;

    void display(){
        System.out.println(name + " " + rollno + " " + marks);
    }
}
    public class Student1 {
        public static void main(String[] args){
            Student s1 = new Student();
            s1.name = ("Venky");
            s1.rollno =  111 ;
            s1.marks = 95 ;
            s1.display();
        }
    }

