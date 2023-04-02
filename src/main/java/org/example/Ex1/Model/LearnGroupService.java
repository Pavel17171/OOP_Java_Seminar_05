package org.example.Ex1.Model;

import java.util.ArrayList;
import java.util.List;

public class LearnGroupService extends LearnGroup {


    public LearnGroupService(Teacher teacher, List<Student> studentsGroup) {
        super(teacher, studentsGroup);
    }

    /**
     * Возвращает преподавателя
     *
     * @return возвращает преподавателя "Teacher"
     */
    public Teacher getTeacher() {
        return this.teacher;
    }

    /**
     * Возвращает студента
     *
     * @return возвращает преподавателя "Student"
     */
    public List<Student> getStudents() {
        return this.studentsGroup;
    }

    /**
     * Переводит список студентов к строку
     *
     * @param students список студентов
     * @return вовращает строку "String" студентов
     */
    public static String getStringListStudents(List<Student> students) {
        StringBuilder s = new StringBuilder();
        for (User u : students) {
            s.append(u.toString()).append("\n");
        }
        return s.toString();
    }

    /**
     * Переводит преподавателя и студентов в строку
     *
     * @return возвращает "String" строку преподаватель и студенты
     */
    @Override
    public String toString() {
        Teacher teacher = getTeacher();
        List<Student> students = getStudents();
        return "Преподаватель: \n" + teacher.toString() +
                "\nСтуденты: \n" + getStringListStudents(students);
    }

    /**
     * Создает новую группу из преподавателя и списка студентов
     *
     * @param teacher       преподаватель
     * @param studentsGroup список студентов
     * @return возвращает новую группу
     */
    public static LearnGroupService createGroup(Teacher teacher, List<Student> studentsGroup) {
        return new LearnGroupService(teacher, studentsGroup);
    }

    /**
     * Создание списка групп из всех преподавателей и студентов
     *
     * @return возвращает список групп
     */
    public static List<LearnGroupService> allGroup() {
        List<LearnGroupService> allGroup = new ArrayList<>();
        List<Student> tempListStudent = new ArrayList<>(AllUsers.getAllStudents());
        double countTeachers = AllUsers.getAllTeachers().size();
        double countStudents = AllUsers.getAllStudents().size();
        int countStudentsInGroup = (int) Math.ceil(countStudents / countTeachers);
        for (int i = 0; i < countTeachers; i++) {
            Teacher teacher = AllUsers.getAllTeachers().get(i);
            List<Student> group = new ArrayList<>();
            teacher.setGroupID(i + 1);
            if (countStudents >= countStudentsInGroup) {
                for (int j = 0; j < countStudentsInGroup; j++) {
                    group.add(tempListStudent.get(0));
                    tempListStudent.remove(0);
                }
                countStudents -= countStudentsInGroup;
            } else {
                for (int j = 0; j < countStudents; j++) {
                    group.add(tempListStudent.get(0));
                    tempListStudent.remove(0);
                }
            }
            for (Student s : group) {
                s.setGroupID(i + 1);
            }
            allGroup.add(createGroup(teacher, group));
        }
        return allGroup;
    }

}
