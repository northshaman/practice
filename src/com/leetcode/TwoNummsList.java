package com.leetcode;


import nodes.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverseRecursion order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class TwoNummsList {

//    public NodeInt addTwoNumbers(NodeInt l1, NodeInt l2) {
//
//        int[] list1Arr;
//        int[] list2Arr;
//
//
//    }

     static int getDigitFromNode(Node nodeInt) {
        Map<Integer, Integer> nodeValArray = new HashMap<>();
        for (int i = 0; nodeInt != null; i++) {
            nodeValArray.put(i, (int)nodeInt.getValue());
            nodeInt = nodeInt.getNext();
        }
        int normalDigit = 0;
        for (Map.Entry<Integer, Integer> entry : nodeValArray.entrySet()) {
            normalDigit += entry.getValue() * (int) Math.pow(10, entry.getKey());
        }
        return normalDigit;
    }

    static Node getNodeFromDigit(int digit) {
     char[] charArrDigit = String.valueOf(digit).toCharArray();
            Node nodeInt = null;
        for (int i = 0; i <charArrDigit.length ; i++) {
            nodeInt = new Node<>(nodeInt,(Integer) Character.getNumericValue(charArrDigit[i]));
        }
        return nodeInt;
    }

    public static void main(String[] args) {
        Node<Integer> nodeInt = new Node<>(new Node<>(new Node<>(null,1),2),3);
        System.out.println("Node "+nodeInt);
        System.out.println("Digit from node ->"+getDigitFromNode(nodeInt));
        System.out.println("123 in Node ->"+getNodeFromDigit(123));


    }

}
