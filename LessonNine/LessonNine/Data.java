package LessonNine;

import java.util.Arrays;
import java.util.List;

public class Data {

    public static List<Student> getStudentsList() {
    // ������ ������
    Course course1 = new Course("Java Core ��� �������������");
    Course course2 = new Course("������ ���");
    Course course3 = new Course("����������������");
    Course course4 = new Course("HTML/CSS");
    Course course5 = new Course("������������� ������������ �� Java");
    Course course6 = new Course("������������ backend �� Java");
    Course course7 = new Course("������������ ���-����������");
    Course course8 = new Course("SQL. ���� ������");
    Course course9 = new Course("Linux ��������� �������������");
    Course course10 = new Course("������ ������� ������������");
    Course course11 = new Course("������ ����-���������");
    Course course12 = new Course("Git. ������� ����");

    // ������ ���������
    Student student1 = new Student("Vasiliy", Arrays.asList(course1, course3, course5));
    Student student2 = new Student("Maria", Arrays.asList(course1, course2, course3));
    Student student3 = new Student("Olga", Arrays.asList(course1, course7, course11));
    Student student4 = new Student("Zinaida", Arrays.asList(course2, course4, course8, course1, course3, course5));
    Student student5 = new Student("Mila", Arrays.asList(course3, course7, course9));
    Student student6 = new Student("Andrey", Arrays.asList(course1, course3, course5, course9));
    Student student7 = new Student("Georgy", Arrays.asList(course2, course6, course7, course5, course9));
    Student student8 = new Student("Arseniy", Arrays.asList(course3, course2, course4));
    Student student9 = new Student("Anatoliy", Arrays.asList(course4, course8, course5));
    Student student10 = new Student("Nikolay", Arrays.asList(course5, course1, course9));
    Student student11 = new Student("Larisa", Arrays.asList(course6, course9, course5));
    Student student12 = new Student("Vladimir", Arrays.asList(course7, course6, course5));
    Student student13 = new Student("Viktor", Arrays.asList(course8, course1, course5));
    Student student14 = new Student("Yuri", Arrays.asList(course9, course2, course5));
    Student student15 = new Student("Roman", Arrays.asList(course10, course3, course1));
    Student student16 = new Student("Vadim", Arrays.asList(course11, course9, course2));
    Student student17 = new Student("Maksim", Arrays.asList(course12, course8, course3));
    Student student18 = new Student("Vera", Arrays.asList(course11, course7, course4));
    Student student19 = new Student("Galina", Arrays.asList(course10, course6, course5));
    Student student20 = new Student("Evgeniya", Arrays.asList(course9, course5, course3));
    Student student21 = new Student("Stepan", Arrays.asList(course8, course6, course5));
    Student student22 = new Student("Olga", Arrays.asList(course7, course2, course11));
    Student student23 = new Student("Aleksandra", Arrays.asList(course6, course1, course5));
    Student student24 = new Student("Kirill", Arrays.asList(course5, course11, course12));
    Student student25 = new Student("Ksenia", Arrays.asList(course4, course12, course5));


        return Arrays.asList(student1, student2, student3, student4, student5, student6, student7,
    student8, student9, student10, student11, student12, student13, student14,
    student15, student16, student17, student18, student19, student20, student21,
    student22, student23, student24, student25);
}

    public static Course getRandomCourse() {
        return new Course("Java Core ��� �������������");
    }

    private static List<Course> getListCourses() {
        return Arrays.asList(new Course("Java Core ��� �������������"),
                new Course("������ ���"),
                new Course("����������������"),
                new Course("HTML/CSS"),
                new Course("������������� ������������ �� Java"),
                new Course("������������ backend �� Java"),
                new Course("������������ ���-����������"),
                new Course("SQL. ���� ������"),
                new Course("Linux ��������� �������������"),
                new Course("������ ������� ������������"),
                new Course("������ ����-���������"),
                new Course("Git. ������� ����"));
    }
}
