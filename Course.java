package ObstacleCourse;

import LessonOne_Course.ObstacleCourse;
import LessonOne_Course.Status;
import LessonOne_Course.Team;
import LessonOne_Course.TeamMember;

public class Course {

    private ObstacleCourse[] courses;

    public Course(ObstacleCourse... courses) {
        this.courses = courses;
    }

    public ObstacleCourse[] getCourses() {
        return courses;
    }


    public void doIt(Team team) {
        System.out.println(team.getName() + " team is passing obstacle course");
    }

    public void showResults(Team team) {
        System.out.println("Results of courses are following:");
        for (TeamMember member : team.getMembers()) {
            for (ObstacleCourse course : courses) {
                course.goChallenge(member);
            }
        }
    }



}
