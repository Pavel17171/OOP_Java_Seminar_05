package org.example.Ex1.Model;

public class UserService implements DataService {
    /**
     * Создание студента
     *
     * @param student студент
     * @return возвращает нового студента
     * <p>id - ID нового студента</p>
     */
    @Override
    public User create(Student student) {
        int id = AllUsers.studentID;
        return new Student(student.fio, student.exp, id, student.groupID);
    }

    /**
     * Создание преподавателя
     *
     * @param teacher преаодаватель
     * @return возвращает нового преподавателя
     * <p>id - ID нового студента</p>
     */
    @Override
    public User create(Teacher teacher) {
        int id = AllUsers.teacherID;
        return new Teacher(teacher.fio, teacher.exp, id, teacher.groupID);

    }

}
