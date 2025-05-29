package oop.mid2.t1;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * This program:
 * - Builds a list3 by extracting elements from list2 using indices calculated from list1
 * - Creates a result list by removing items at positions 0 through 6 (in sequence) from list3
 * - Prints the original list3 and the final result
 * 
 * Author: Meryem Nobatova
 */
public class Task1 {

    public static void main(String[] args) {
     
        List<Integer> list1 = Arrays.asList(8, 4, 8, 6, 9, 4, 8, 3, 2, 8, 5, 7, 5);
        List<String> list2 = Arrays.asList(
            "6G3", "TNWh", "fWXW", "temd", "3bW", "RJEO", "WTmn", "EID2T", "EAQo",
            "3hXKz", "elUPN", "2av", "PQ86t", "N1v", "6H3r", "MgA", "jMCAg", "UYT"
        );

        List<String> list3 = new ArrayList<>();

        
        for (int num : list1) {
            int index = num * 2 - 1;
            if (index >= 0 && index < list2.size()) {
                list3.add(list2.get(index));
            }
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < list3.size(); i++) {
            if (i % 2 == 1 || i == list3.size() ) { 
                result.add(list3.get(i));
            }
        }


       
        System.out.println("list3:");
        System.out.println(list3);
        System.out.println("result:");
        System.out.println(result);
    }
}
