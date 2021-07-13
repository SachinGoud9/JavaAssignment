import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

// Student class having fields id,name,age,gender,engDepartment,year of enrollment ,perTillDate

//        1. Print the name of all departments in the college?
//        2.Get the names of all students who have enrolled after 2018?
//        3. Get the details of all male student in the computer sci department?
//        4. How many male and female student are there ? (HINT:use Collectors.groupingBy() for grouping based on gender)
//        5.What is the average age of male and female students?
//        6.Get the details of highest student having highest percentage ?
//        7.Count the number of students in each department? (Hint :use Collectors.groupingBy())
//        8. What is the average percentage achieved in each department?
//        9. Get the details of youngest male student in the Electronic department?(Hint :Use Collectors.minBy)
//        10.How many male and female students are there in the computer science department?


public class Student {

    private int id;
    private String name;
    private int age;
    private String gender;
    private String engineeringDepartment;
    private int yearOfEnrollment;
    private double perTillDate;

    Student(int id, String name, int age, String gender, String engineeringDepartment, int yearOfEnrollment, double perTillDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engineeringDepartment = engineeringDepartment;
        this.yearOfEnrollment = yearOfEnrollment;
        this.perTillDate = perTillDate;
    }

    public static void task1(ArrayList<Student> list) {
        list.stream()
                .map(department -> department.engineeringDepartment).distinct()
                .forEach(System.out::println);
    }

    public static void task2(ArrayList<Student> list) {
        list.stream()
                .filter(year -> year.yearOfEnrollment > 2018)
                .forEach(year -> System.out.println(year.name));
    }

    public static void task3(ArrayList<Student> list) {
        list.stream()
                .filter(department -> department.engineeringDepartment.equalsIgnoreCase("Computer Science"))
                .filter(person -> person.gender.equalsIgnoreCase("male"))
                .forEach(person -> System.out.println(person.name));
    }

    public static void task4(ArrayList<Student> list) {
        list.stream()
                .collect(groupingBy(Student::getGender))
                .forEach((gender, genderValues) -> System.out.println("Count of " + gender + " is " + genderValues.size()));
    }

    public static void task5(ArrayList<Student> list) {
        list.stream()
                .collect(groupingBy(Student::getGender, averagingInt(Student::getAge)))
                .forEach((age, averageAge) -> System.out.println("average age of " + age + " is " + averageAge));
    }

    public static String task6(ArrayList<Student> list) {
        return list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Student :: getMarks))).toString();
    }

    public static void task7(ArrayList<Student> list) {
        list.stream()
                .collect(groupingBy(Student::getDept))
                .forEach((department, departmentValues) -> System.out.println("Count of " + department + " is " + departmentValues.size()));
    }

    public static void task8(ArrayList<Student> list) {
        list.stream()
                .collect(groupingBy(Student::getDept, averagingDouble(Student::getMarks)))
                .forEach(marks, averageMarks) -> System.out.println("average percentage of " + marks + " is " + averageMarks));
    }

    public static String task9(ArrayList<Student> list) {
        return list.stream()
                .filter(person -> person.gender.equals("Male"))
                .filter(person -> person.engineeringDepartment.equalsIgnoreCase("Electronic"))
                .collect(Collectors.minBy(Comparator.comparingInt(Student::getAge))).toString();
    }

    public static void task10(ArrayList<Student> list) {
        list.stream()
                .filter(person -> person.engineeringDepartment.equalsIgnoreCase("computer science"))
                .collect(Collectors.groupingBy(Student::getGender))
                .forEach((people, peopleValues) -> System.out.println("No of " + people + " in Computer Science is " + peopleValues.size()));
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        list.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        list.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        list.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        list.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        list.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        list.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        list.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        list.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        list.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        list.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        list.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        list.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        list.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        list.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        list.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        list.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
        System.out.println();
        task1(list);
        System.out.println();
        task2(list);
        System.out.println();
        task3(list);
        System.out.println();
        task4(list);
        System.out.println();
        task5(list);
        System.out.println();
        System.out.println("Details of Student with Highest percentage"+task6(list).substring(8));
        task7(list);
        System.out.println();
        task8(list);
        System.out.println();
        System.out.println("Details Of young student"+task9(list).substring(8));
        task10(list);
    }

    public String toString() {
        return this.name + " " + this.engineeringDepartment + " " + this.age + " " + this.gender;
    }

    public String getGender() {
        return this.gender;
    }

    public int getAge() {
        return this.age;
    }

    public String getDept() {
        return this.engineeringDepartment;
    }

    public double getMarks() {
        return this.perTillDate;
    }
}

