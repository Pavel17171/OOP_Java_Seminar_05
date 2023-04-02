package org.example.Ex1.Model;

import java.util.List;

public abstract class LearnGroup {
    Teacher teacher;
    List<Student> studentsGroup;

    public LearnGroup(Teacher teacher, List<Student> studentsGroup) {
        this.teacher = teacher;
        this.studentsGroup = studentsGroup;
    }
}