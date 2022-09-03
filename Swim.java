package ObstacleCourse;

import LessonOne_Course.ObstacleCourse;
import LessonOne_Course.TeamMember;

public class Swim extends ObstacleCourse {

    public Swim(int difficulty) {
        super(difficulty);
    }

    public void goChallenge(TeamMember member) {
        member.swim(super.getDifficulty());
    }
}
