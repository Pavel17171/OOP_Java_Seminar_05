package org.example.Ex1.Model;

public abstract class User {
    String fio;
    int id;
    int exp;
    int groupID;

    public User(String fio, int exp, int id, int groupID) {
        this.fio = fio;
        this.exp = exp;
        this.id = id;
        this.groupID = groupID;
    }

    protected User() {
    }

    @Override
    public String toString() {
        return "User{" +
                ", fio='" + fio +
                ", id=" + id +
                ", exp=" + exp +
                '}';
    }
}

