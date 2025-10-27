package com.itschool.session22.homework.ex13;

public class Main {
    public static void main(String[] args) {

        Repo<String> repo1 = new Repo<>();
        repo1.store.put("id1", "First element");
        repo1.store.put("id2", "Second element");
        repo1.store.put("id3", "Third element");

        Repo<String> repo2 = new Repo<>();
        repo2.store.put("id1", "First element");
        repo2.store.put("id2", "Second element");
        repo2.store.put("id3", "Third element");

        Repo<String> repo3 = new Repo<>();
        repo3.store.put("id1", "First element");
        repo3.store.put("id2", "Second element");

        System.out.println(repo1.store.get("id2"));
        System.out.println(repo2.store.get("id1"));
        System.out.println("repo1 == repo2? " + repo1.equals(repo2));
        System.out.println("hash1 == hash2? " + (repo1.store.hashCode() == repo2.store.hashCode()));
        System.out.println("repo1 == repo3? " + repo1.equals(repo3));
        System.out.println("hash1 == hash3? " + (repo1.store.hashCode() == repo3.store.hashCode()));
        System.out.println(repo1);
        System.out.println(repo2);
        System.out.println(repo3);

    }
}
