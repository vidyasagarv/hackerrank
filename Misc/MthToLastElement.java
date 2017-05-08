import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MthToLastElement {
    
    private static class LinkedListNode {
        public LinkedListNode next;
        public long data;
        public LinkedListNode(long d) {
            data = d;
            next = null;
        }
    }
    
    public static LinkedListNode mth_to_last(LinkedListNode head, long m){
        LinkedListNode temp = head, result = head;
        while(m > 1){
            if(temp != null){
                temp = temp.next;
                m--;
            } else{
                return null;
            }
        }
        if(temp == null){
            return null;
        }
        while(temp.next != null){
            result = result.next;
            temp = temp.next;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        LinkedListNode head = null, node = null, newNode = null;
        if(sc.hasNextInt()){
            head = new LinkedListNode(sc.nextLong());
            node = head;
        }
        while(sc.hasNextInt()){
            newNode = new LinkedListNode(sc.nextLong());
            node.next = newNode;
            node = newNode;
        }
        LinkedListNode result = mth_to_last(head, m);
        if(result != null){
            System.out.println(result.data);
        } else{
            System.out.println("NIL");
        }
    }
}