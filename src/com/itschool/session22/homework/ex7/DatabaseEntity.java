package com.itschool.session22.homework.ex7;

import java.util.Objects;

public class DatabaseEntity {
    private final String id;
    private final String name;
    private final long timestamp;

    public DatabaseEntity(String id, String name, long timestamp) {
        this.id = id;
        this.name = name;
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DatabaseEntity that = (DatabaseEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "DatabaseEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
