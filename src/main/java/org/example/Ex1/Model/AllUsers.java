package org.example.Ex1.Model;

import java.util.ArrayList;
import java.util.List;

public class AllUsers {

    //Список преподавателей
    static List<Teacher> allTeachers = new ArrayList<>();
    static int teacherID = 101; //Начальный ID преподавателей

    /**
     * Добавление нового преподавателя в список
     *
     * @param teacher преподаватель
     *                <p>AllUsers.teacherID++ - изменение ID</p>
     */
    public static void setTeacher(Teacher teacher) {
        AllUsers.teacherID++;
        allTeachers.add(teacher);
    }

    /**
     * Дает список преподавателей
     *
     * @return возвращает список преподавателей
     */
    public static List<Teacher> getAllTeachers() {
        return allTeachers;
    }


    // Список студентов
    static int studentID = 201; // Начальный ID студентов
    static List<Student> allStudents = new ArrayList<>();

    /**
     * Добавление нового студента в список
     *
     * @param student студент
     *                <p>AllUsers.studentID++ - изменение ID</p>
     */
    public static void setStudent(Student student) {
        AllUsers.studentID++;
        allStudents.add(student);
    }

    /**
     * Дает список студентов
     *
     * @return возвращает список студентов
     */
    public static List<Student> getAllStudents() {
        return allStudents;
    }

}
