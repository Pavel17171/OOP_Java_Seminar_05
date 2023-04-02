package org.example.Ex1.View;

import org.example.Ex1.Model.LearnGroupService;
import org.example.Ex1.Model.Student;
import org.example.Ex1.Model.Teacher;

import java.util.List;

public class View {

    /**
     * Вывод списка преподавателей в консоль
     *
     * @param teachers список преподавателей
     */
    public static void printListTeachers(List<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            System.out.println(teacher.toString());
        }
    }

    /**
     * Вывод списка студентов в консоль
     *
     * @param students список студентов
     */
    public static void printListStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    /**
     * Вывод списка групп в консоль
     *
     * @param listOfGroup список групп
     */
    public static void printAllGroup(List<LearnGroupService> listOfGroup) {
        int i = 1;
        for (LearnGroupService group : listOfGroup) {
            System.out.println("Группа №" + i++);
            System.out.println("-----------");
            System.out.print(group);
            System.out.println("***********");
        }
    }
}
