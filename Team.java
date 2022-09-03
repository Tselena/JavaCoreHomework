package LessonOne_Course;

import LessonOne_Course.ObstacleCourse;

import java.sql.SQLOutput;


public class Team {
    private final String name;
    private TeamMember[] members; // массив участников из класса TeamMember


    // Переопределение конструктора, чтобы при создании команды обязательно было название и список участников
    public Team(String name, TeamMember... members) {
        this.name = name;
        this.members = members;
    }

    public TeamMember[] getMembers() {
        return members;
    }

    public String getName() {
        return name;
    }

    public void printAllMembers() {
        System.out.println("List of " + getName() + " team members is following: ");

        for (TeamMember member : members) {
            System.out.println(member.getName() + " whose capability is " + member.getCapability());
        }
    }




}
