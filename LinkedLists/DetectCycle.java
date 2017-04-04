/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class DetectCycle {

	public static boolean hasCycle(Node head) {
	    if(head == null){
	        return false;
	    }
	    Node ptr1 = head;
	    Node ptr2 = head.next;
	    while(ptr1 != null && ptr2 != null && ptr2.next != null){
	        if(ptr1 == ptr2){
	            return true;
	        }
	        ptr1 = ptr1.next;
	        ptr2 = ptr2.next.next;
	    }
	    return false;
	}

}
