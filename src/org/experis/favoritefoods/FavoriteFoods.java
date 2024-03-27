package org.experis.favoritefoods;

import java.util.Arrays;

public class FavoriteFoods {
    public static void main(String[] args) {

        String[] favoriteFoods = {"Bread", "Pasta", "Meat", "Fish", "Chicken", "Lasagna", "Tiramisu", "Ice Cream",
                "Sour Candy"};

        // length of the array and array list
        System.out.println(favoriteFoods.length + " = " + Arrays.toString(favoriteFoods)) ;

        // first element of the array
        System.out.println(favoriteFoods[0]);

        // last element of the array
        System.out.println(favoriteFoods[favoriteFoods.length -1]);

        // the element in the middle of the array
        System.out.println(favoriteFoods[(favoriteFoods.length - 1 )/ 2]);

    }
}
