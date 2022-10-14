public class Student {
    // ATRYBUTY
    public String name;
    public String lastName;
    public boolean isWeekendStudent;
    public int age;
    public float gradeAverage;
    
    public void podbijLegitymacje() {
        System.out.println("Legitymacja została podbita.");
    }
    
    public void zaliczSemestr() {
        System.out.println("Semestr został zaliczony.");
    }
    
    public void sayHello() {
        System.out.println("Hello");
    }
    
    public void displayAge() {
        System.out.println(age);
    }
    
    public void displayName() {
        System.out.println(name);
    }
    
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.sayHello();
        student1.name = "Jan";
        student1.lastName = "Kowalski";
        student1.age = 19;
        student1.displayAge();
        student1.displayName();
    }
}