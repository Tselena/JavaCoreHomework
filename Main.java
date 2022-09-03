package LessonOne_Course;

import ObstacleCourse.Course;
import ObstacleCourse.Cross;
import ObstacleCourse.Jump;
import ObstacleCourse.Swim;

public class Main {
    public static void main(String[] args) {

        /*
        Course course = new Course(); // Создание полосы препятствий
        Team team = new Team();       // Создание команды
        course.doIt(team);            // Просим команду пройти полосу
        team.showResults();           // Показываем результаты
        */


        Team teamOne = new Team("Dream",
                new TeamMember("Igor", 50),
                new TeamMember("Nikolai", 150),
                new TeamMember("Vasilii", 200),
                new TeamMember("Andrey", 300));
        System.out.println("Team " + teamOne.getName() + " created!");

        System.out.println();
        teamOne.printAllMembers();

        System.out.println();
        Course course = new Course(new Swim(100), new Jump(300), new Cross(200));
        course.doIt(teamOne);

        System.out.println();
        course.showResults(teamOne);
    }


}
