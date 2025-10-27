package com.itschool.session22.homework.ex7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {


        DatabaseEntity databaseEntity1 = new DatabaseEntity(
                "leId1", "product1", convertDateToTimestamp("2024-11-21 10:45:22"));
        DatabaseEntity databaseEntity2 = new DatabaseEntity(
                "leId2", "product2", convertDateToTimestamp("2023-07-11 14:21:24"));
        DatabaseEntity databaseEntity3 = new DatabaseEntity(
                "leId1", "product3", convertDateToTimestamp("2022-11-21 09:45:22"));

        System.out.println(databaseEntity1.equals(databaseEntity2));
        System.out.println(databaseEntity1.equals(databaseEntity3));

        Set<DatabaseEntity> set = new HashSet<>(Arrays.asList(databaseEntity1, databaseEntity2, databaseEntity3));
        System.out.println(set.size());
        System.out.println(set);
    }

    private static long convertDateToTimestamp(String dateAsString) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = sdf.parse(dateAsString);
        long timestamp = date.getTime();

        return timestamp;
    }
}
