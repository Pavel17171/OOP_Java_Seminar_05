package org.example.Ex1.Model;

public class Student extends User {

    public Student(String fio, int exp, int id, int groupID) {
        this.fio = fio;
        this.exp = exp;
        this.id = id;
        this.groupID = groupID;
    }

    /**
     * Присвоение номера группы
     *
     * @param i номер группы
     */
    public void setGroupID(int i) {
        this.groupID = i;
    }

    @Override
    public String toString() {
        return "id = " + id + ". Student. " + fio
                + ", группа = " + groupID
                + ", курс - " + exp;
    }
}
