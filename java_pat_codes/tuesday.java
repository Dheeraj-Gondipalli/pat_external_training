import java.util.Scanner;

public class tuesday{
        public static void main(String[] args) {
            try (Scanner input = new Scanner(System.in)) {
                int a  = input.nextInt();
                int b = input.nextInt();
                try{
                        System.out.println(a/b);
                    }catch(Exception e){
                        System.out.println("error");
                    }finally{
                        System.out.println("this is the finally block");
                    }
            }
            }
    
    }
    