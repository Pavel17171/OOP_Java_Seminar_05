package org.example.Ex1.Model;

public class Teacher extends User {

    public Teacher(String fio, int exp, int id, int groupID) {
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
        return "id = " + id + ". Teacher. " + fio
                + ", стаж = " + exp + " лет"
                + ", группа = " + groupID;
    }
}
