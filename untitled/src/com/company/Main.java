package com.company;

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
