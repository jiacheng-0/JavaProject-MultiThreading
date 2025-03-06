package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
        Node n = new Node(1);
        Node n2 = new Node(2);
        n.next = n2;

        Node curr = n;
        while (curr != null) {
            System.out.println(curr.value);
            curr = curr.next;
        }

        int[] int_arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(int_arr));

        System.out.println(Arrays.binarySearch(int_arr, 3));
        System.out.println(binSearch(int_arr, 7));
        System.out.println(binSearch(int_arr, 8));
    }

    static int binSearch(int[] int_arr, int target) {
        int low = 0, high = int_arr.length;

        while (low < high) {
            int mid = (low + high) / 2;
            int mid_val = int_arr[mid];
            if (mid_val == target) {
                return mid;
            } else if (target < mid_val) {
                high = mid - 1;
            } else { // target < mid_val
                low = mid + 1;
            }
        }
        return -1;
    }
}

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}