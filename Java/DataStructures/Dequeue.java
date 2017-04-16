    import java.util.*;
    public class test {
        public static void main(String[] args) 
        {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();
            HashSet<Integer> temp = new HashSet<Integer>();

            int n = in.nextInt();
            int m = in.nextInt();
            int val = 0;

            for (int i = 0; i < n; i++) 
            {
                int input = in.nextInt();

                deque.add(input);
                temp.add(input);

                if (deque.size() == m) 
                {
                    if (temp.size() > val) 
                        val = temp.size();
                    int first = deque.remove();
                    if (!deque.contains(first)) 
                        temp.remove(first);
                }
            }

            System.out.println(val);
        }
    }
