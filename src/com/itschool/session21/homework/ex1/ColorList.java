package com.itschool.session21.homework.ex1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
//2. Write a Java program to iterate through all elements in a array list.
//3. Write a Java program to insert an element into the array list at the first position.
//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
//5. Write a Java program to update specific array element by given element.
//6. Write a Java program to remove the third element from a array list.
//7. Write a Java program to search an element in a array list.
//8. Write a Java program to sort a given array list.
//9. Write a Java program to copy one array list into another.
//10. Write a Java program to shuffle elements in a array list.
//11. Write a Java program to reverse elements in a array list.
//12. Write a Java program to extract a portion of a array list.
//13. Write a Java program to compare two array lists.
//16. Write a Java program to clone an array list to another array list.
//17. Write a Java program to empty an array list.
//18. Write a Java program to test an array list is empty or not.


public class ColorList {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("red");
        colors.add("yellow");
        colors.add("blue");
        colors.add("green");
        colors.add("brown");
        colors.add("orange");
        colors.add("gray");
        colors.add("white");

        System.out.println("The color list is: " + colors);
        System.out.println("=======================");

        for (String color: colors){
            System.out.println("Color " + (colors.indexOf(color) + 1) + " is: " + color);
        }
        System.out.println("=======================");

        colors.addFirst("black");
        System.out.println("The color list is: " + colors);

        String fourthColor = colors.get(3);
        System.out.println("The fourth color is: " + fourthColor);

        colors.set(5, "turqoise");
        String updatedColor = colors.get(5);
        System.out.println("The updated color is: " + updatedColor);

        String removedColor = colors.get(1);
        colors.remove(1);
        System.out.println("The new list is: " + colors + ". The color " + removedColor + " has been removed.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter color to search: ");
        String searchColor = sc.nextLine();

        if(colors.contains(searchColor)) {
            System.out.println("The color has been found");
        } else {
            System.out.println("Color not found");
        }

        Collections.sort(colors);
        System.out.println("The sorted list is: " + colors);

        ArrayList<String> copyColors = new ArrayList<>(colors);
        System.out.println("The copied list is: " + copyColors);

        Collections.shuffle(copyColors);
        System.out.println("The shuffled copied list is: " + copyColors);

        Collections.reverse(colors);
        System.out.println("The reversed list of colors is:" + colors);

        List<String> subList1 = colors.subList(1, 4);
        List<String> subList2 = colors.subList(1, 4);
        List<String> subList3 = colors.subList(2, 4);
        System.out.println("The portion of the list is:" + subList1);
        System.out.println(subList1.equals(subList2));
        System.out.println(subList1.equals(subList3));

        ArrayList<String> clonedColorList = (ArrayList<String>) colors.clone();
        System.out.println("cloned: " + clonedColorList);
        isEmptyList(clonedColorList);

        clonedColorList.clear();
        System.out.println("empty: " + clonedColorList);
        isEmptyList(clonedColorList);

        colors.trimToSize();
        System.out.println("ArrayList after trimToSize(): " + colors);


        colors.ensureCapacity(10);
        System.out.println("Capacity increased to accommodate at least 10 elements.");
        System.out.println("ArrayList after increasing capacity: " + colors);

    }

    private static void isEmptyList(ArrayList<String> arr) {
        if (arr.isEmpty()) {
            System.out.println("The list doesn't contain any elements.");
        } else {
            System.out.println("The list isn't empty.");
        }
    }

}
