package LessonOne_Course;

public class TeamMember {

    private final String name;
    private final int capability;

    private Status status = Status.NotPassedDistance;

    private final boolean winner = false;

    public TeamMember(String name, int capability) {
        this.name = name;
        this.capability = capability;
    }

    public String getName() {
        return name;
    }

    public int getCapability() {
        return capability;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isWinner() {
        return winner;
    }



    //about ObstacleCourseChallenge
    private boolean checkCapability(int courseDifficulty) {
        return capability > courseDifficulty || capability == courseDifficulty;
    }

    public void swim(int courseDifficulty) {
        if(checkCapability(courseDifficulty)) {
            System.out.println(name + " passed course \"Swimming\"");
            changeStatus(Status.PassedDistance);
        } else {
            System.out.println(name + " failed course \"Swimming\"");
        }
    }

    public void jump(int courseDifficulty) {
        if(checkCapability(courseDifficulty)) {
            changeStatus(Status.PassedDistance);
            System.out.println(name + " passed course \"Jumping\"");
        } else {
            System.out.println(name + " failed course \"Jumping\"");

        }
    }

    public void run(int courseDifficulty) {
        if(checkCapability(courseDifficulty)) {
            changeStatus(Status.PassedDistance);
            System.out.println(name + " passed course \"Cross\"");
        } else {
            System.out.println(name + " failed course \"Cross\"");

        }
    }



        private void changeStatus (Status newStatus){
            status = newStatus;

        }


}
