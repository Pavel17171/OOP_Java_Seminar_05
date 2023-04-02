package org.example.Ex1.Controller;

import org.example.Ex1.Model.*;
import org.example.Ex1.View.View;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {

        // Предварительное заполнение списка преподавателей
        tempSetTeachers();
        // Предварительное заполнение списка студентов
        tempSetStudents();

        //Старт
        start();

    }

    // Начальное меню
    public static void start() {
        boolean flag = true;
        while (flag) {
            System.out.println("""
                                        
                    Введите команду:
                    1 - вывести список преподавателей
                    2 - вывести список студентов
                    3 - добавить преподавателя
                    4 - добавить студента
                    5 - создать группы
                    0 - выход
                    """);
            switch (answer()) {
                case 0:
                    flag = false;
                    System.out.println("EXIT");
                    break;
                case 1:
                    System.out.println("Список преподавателей");
                    View.printListTeachers(AllUsers.getAllTeachers());
                    break;
                case 2:
                    System.out.println("Список студентов");
                    View.printListStudents(AllUsers.getAllStudents());
                    break;
                case 3:
                    System.out.println("Добавить преподавателя");
                    setUser(1);
                    break;
                case 4:
                    System.out.println("Добавить студента");
                    setUser(2);
                    break;
                case 5:
                    System.out.println("Создать группы");
                    View.printAllGroup(LearnGroupService.allGroup());
                    break;
                default:
                    System.out.println("Команда не известна");
            }
        }
    }

    /**
     * Получение ответа от пользователя
     *
     * @return возвращает ответ пользователя
     */
    public static Integer answer() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }


    //

    /**
     * Добавить преподавателя/студента
     *
     * @param num "int" вариант:
     *            <p> 1 - добавить преподавателя</p>
     *            <p> 2 - добавить студента</p>
     */
    public static void setUser(int num) {
        Scanner sc = new Scanner(System.in);
        UserService us = new UserService();
        System.out.println("Фамилия: ");
        String f = sc.next();
        System.out.println("Имя: ");
        String i = sc.next();
        System.out.println("Отчество: ");
        String o = sc.next();
        String fio = f + " " + i + " " + o;
        if (num == 1) {
            System.out.println("стаж, лет: ");
            int exp = sc.nextInt();
            AllUsers.setTeacher((Teacher) us.create(new Teacher(fio, exp, 0, 0)));
        } else if (num == 2) {
            System.out.println("курс: ");
            int exp = sc.nextInt();
            AllUsers.setStudent((Student) us.create(new Student(fio, exp, 0, 0)));
        }
    }

    //***************************************************************************************

    // Первоначальное заполнение списка преподавателей и студентов
    // (для примера, чтобы создавать связи с текстовыми файлами)
    public static void tempSetTeachers() {
        UserService teachers = new UserService();
        AllUsers.setTeacher((Teacher) teachers.create(new Teacher("Немирова Анна Петровна", 5, 0, 0)));
        AllUsers.setTeacher((Teacher) teachers.create(new Teacher("Мартынова Анастасия Евгеньевна", 7, 0, 0)));
        AllUsers.setTeacher((Teacher) teachers.create(new Teacher("Пругло Лев Борисович", 25, 0, 0)));
    }

    public static void tempSetStudents() {
        UserService students = new UserService();
        AllUsers.setStudent((Student) students.create(new Student("Алмазова Инна Эдуардовна", 1, 0, 0)));
        AllUsers.setStudent((Student) students.create(new Student("Иванов Иван Ивановичй", 1, 0, 0)));
        AllUsers.setStudent((Student) students.create(new Student("Петров Петр Сидорович", 1, 0, 0)));
        AllUsers.setStudent((Student) students.create(new Student("Сидоров Василий Иоганович", 1, 0, 0)));
        AllUsers.setStudent((Student) students.create(new Student("Сазонов Олег Андреевич", 1, 0, 0)));
        AllUsers.setStudent((Student) students.create(new Student("Шишкин Максим Иванович", 1, 0, 0)));
        AllUsers.setStudent((Student) students.create(new Student("Марков Александр Петрович", 1, 0, 0)));
        AllUsers.setStudent((Student) students.create(new Student("Лисицина Инна Павловна", 1, 0, 0)));
        AllUsers.setStudent((Student) students.create(new Student("Самопалова Василиса Ильинична", 1, 0, 0)));
        AllUsers.setStudent((Student) students.create(new Student("Ильина Лилия Сергеевна", 1, 0, 0)));
        AllUsers.setStudent((Student) students.create(new Student("Мартынов Илья Васильевич", 1, 0, 0)));
        AllUsers.setStudent((Student) students.create(new Student("Дуболазова Ирина Олеговна", 1, 0, 0)));
        AllUsers.setStudent((Student) students.create(new Student("Терехова Мария Александровна", 1, 0, 0)));
        AllUsers.setStudent((Student) students.create(new Student("Овсянникова Оксана Александровна", 1, 0, 0)));
    }

}
