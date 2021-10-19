package room1;

/**
 * 11. Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately
 */
public class Exercise11 {
    public static void division(){
        System.out.println("<----Number divided by 3---->");
        for(int i=1;i<100;i++)
            if(i%3==0){
                System.out.println(i);
            }

        System.out.println("<---Number divided by 5----->");
            for(int i=1;i<100;i++)
                if(i%5==0){
                    System.out.println(i + " , ");
                }

        System.out.println("<---Number divided by 3 & 5----->");
                for (int i=1; i<100; i++)
                    if(i%3==0 && i%5==0)
                        System.out.println(i);

    }

    public static void main(String[] args) {
        division();
    }
}
