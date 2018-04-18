package com.company;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
	    ArrayStack arrayStack = new ArrayStack<>(10);
        arrayStack.push("abc");
        arrayStack.push("def");
        arrayStack.push(11);

        ArrayStack arrayStack1 = new ArrayStack(10);
        System.out.println("Top of original -> " + arrayStack.top());
        System.out.println("Top of transferred stack -> "+transfer(arrayStack, arrayStack1).top());
        System.out.println("All elements removed? -> "+removeStackElements(arrayStack, 2).isEmpty());

        LinkedCircularQueue<String> josephus = new LinkedCircularQueue<>();
        josephus.enqueue("Alice");
        josephus.enqueue("Bob");
        josephus.enqueue("Cindy");
        josephus.enqueue("Doug");

        Josephus(josephus, 5);
        int[] a = {1, 3, 4, 99, 5, 6, 7};
        almostIncreasingSequence(a);

        // matrix
        int[][] bb = {{0, 1, 1, 2},
                      {0, 5, 0, 0},
                      {2, 0, 3, 3}};

        // array of strings example
        String[] strings = {"aba", "aa", "ad", "vcd", "aba"};
        String[] strings1 = {"aa","bb","aaaa","cc","bbbb"};
        System.out.println(Arrays.toString(allLongestStrings(strings1)));
        System.out.println(matrixElementsSum(bb));


        System.out.print(6 << 2);
    }

    static String[] allLongestStrings(String[] inputArray) {
        int b = 0;
        int sz = inputArray.length;
        StringBuilder n = new StringBuilder();
        for (String anInputArray : inputArray) {
            if (sz > b) b = anInputArray.length();
        }
        for (int k = 0; k < sz; k++) {
            if (inputArray[k].length() == b) n.append(inputArray[k]).append(" ");
        }
        return n.toString().split(" ");
    }

    static int matrixElementsSum(int[][] matrix) {
        int t = 0;
        boolean[] ghost = new boolean[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[0].length;k++) {
                if (matrix[i][k] == 0) ghost[k] = true;
                if (!ghost[k]) {
                    t+= matrix[i][k];
                }
            }
        }
        return t;
    }

    static boolean almostIncreasingSequence(int[] sequence) {
        boolean flag=true;
        int seq1=0;
        int seq2=0;
        for(int i=0;i<sequence.length-1;i++){
            if(sequence[i]>=sequence[i+1]) seq1++;
        }
        for(int k=0;k<sequence.length-2;k++){
            if(sequence[k]>=sequence[k+2]) seq2++;
        }
        if(seq1+seq2>2) flag=false;
        return flag;
    }


    // ({ab})
    public static boolean isMatched(String expression) {
        final String opening = "({[";
        final String closing = ")}]";
        Stack<Character> buffer = new LinkedStack<>();
        for (char c : expression.toCharArray()) {
            if (opening.indexOf(c) != -1)
                buffer.push(c);
            else if (closing.indexOf(c) != -1) {
                if (buffer.isEmpty()) return false;
                if (closing.indexOf(c) != opening.indexOf(buffer.pop())) return false;
            }
        }
        return buffer.isEmpty();
    }

    public static boolean isHTMLMatched(String html) {
        Stack<String> buffer = new LinkedStack<>();
        int j = html.indexOf('<'); // find first '<' (if any)
        while (j != -1) {
            int k = html.indexOf('>',j+1);
            if (k == -1)
                return false;
            String tag = html.substring(j+1, k);
            if (!tag.startsWith("/"))
                buffer.push(tag);
            else {
                if (buffer.isEmpty())
                    return false;
                if (!tag.substring(1).equals(buffer.pop()))
                    return false;
            }
            j = html.indexOf('<', k+1);
        }
        return buffer.isEmpty();

    }

    public static <E> E Josephus(CircularQueue<E> queue, int k) {
        if (queue.isEmpty()) return null;
        while (queue.size() > 1) {
            for (int i = 0; i < k - 1; i++)
                queue.rotate();
            E e = queue.dequeue();
            System.out.println("    " + e + " is out");
        }
        return queue.dequeue();
    }
                    // <E> Stack<E>
    public static <E> Stack<E> transfer(Stack<E> s, Stack<E> t) {
        int sz = s.size();
        for (int i = 0; i < sz; i++) {
            t.push(s.pop());
        }
        return t;
    }

    public static <E> Stack<E> removeStackElements(Stack<E> s, int n) {

        if (n == 0) {
            s.pop();
            return s;
        }
        return removeStackElements(s, n -1);
    }
}
