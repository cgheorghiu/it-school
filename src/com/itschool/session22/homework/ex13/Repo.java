package com.itschool.session22.homework.ex13;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Repo <T>{
    protected Map<String, T> store = new HashMap<>();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Repo<?> repo = (Repo<?>) o;
        return Objects.equals(store, repo.store);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(store);
    }

    @Override
    public String toString() {
        return "Repo{" +
                "store=" + store +
                '}';
    }
}
