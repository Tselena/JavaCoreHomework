package ObstacleCourse;

import LessonOne_Course.ObstacleCourse;
import LessonOne_Course.TeamMember;

public class Cross extends ObstacleCourse {

    public Cross(int difficulty) {
        super(difficulty);
    }

    public void goChallenge(TeamMember member) {
        member.run(super.getDifficulty());
    }
}
