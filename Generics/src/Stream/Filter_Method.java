package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Method {

    public static void main(String[] args) {
        Student st1 = new Student("Ivanov", 'M', 28, 2, 8.5);
        Student st2 = new Student("Petrov", 'M', 22, 3, 6.8);
        Student st3 = new Student("Sidorov", 'M', 35, 1, 8.2);
        Student st4 = new Student("Smirnova", 'F', 21, 4, 7.9);
        Student st5 = new Student("Sokolova", 'F', 23, 4, 3.7);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        // todo Нужно отсортировать студентов
        // получаем стрим из листа students
        // filter вернет стрим с теми студентами,
        // которые пройдут этот фильтр

        students = students.stream().filter(element ->
                        element.getAge() > 22 && element.getAvgGrade() < 7.2)
                .collect(Collectors.toList()); // преобразовываем в List
        System.out.println( students );
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Filter_Method{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}
