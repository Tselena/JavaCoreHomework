package ObstacleCourse;

import LessonOne_Course.ObstacleCourse;
import LessonOne_Course.TeamMember;

public class Jump extends ObstacleCourse {

    public Jump(int difficulty) {
        super(difficulty);
    }

    public void goChallenge(TeamMember member) {
        member.jump(super.getDifficulty());
    }
}
