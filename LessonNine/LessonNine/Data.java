package LessonNine;

import java.util.Arrays;
import java.util.List;

public class Data {

    public static List<Student> getStudentsList() {
    // Список курсов
    Course course1 = new Course("Java Core для тестировщиков");
    Course course2 = new Course("Основы ООП");
    Course course3 = new Course("Программирование");
    Course course4 = new Course("HTML/CSS");
    Course course5 = new Course("Автоматизация тестирования на Java");
    Course course6 = new Course("Тестирование backend на Java");
    Course course7 = new Course("Тестирование веб-приложений");
    Course course8 = new Course("SQL. Базы данных");
    Course course9 = new Course("Linux системный администратор");
    Course course10 = new Course("Основы ручного тестирования");
    Course course11 = new Course("Основы тест-аналитики");
    Course course12 = new Course("Git. Базовый курс");

    // Список студентов
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
        return new Course("Java Core для тестировщиков");
    }

    private static List<Course> getListCourses() {
        return Arrays.asList(new Course("Java Core для тестировщиков"),
                new Course("Основы ООП"),
                new Course("Программирование"),
                new Course("HTML/CSS"),
                new Course("Автоматизация тестирования на Java"),
                new Course("Тестирование backend на Java"),
                new Course("Тестирование веб-приложений"),
                new Course("SQL. Базы данных"),
                new Course("Linux системный администратор"),
                new Course("Основы ручного тестирования"),
                new Course("Основы тест-аналитики"),
                new Course("Git. Базовый курс"));
    }
}
