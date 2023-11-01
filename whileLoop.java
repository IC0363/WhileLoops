public class whileLoop{
    public static void main(String[]args){
        System.out.print("The factors for 24 is: ");
        whileLoops(24);
        countPrimes(47);

    } 

    public static void whileLoops(int i){
        int num = 1;

        while(num<=i){
            if(i%num ==0){
                System.out.print(num+ ", ");
            }
            num++;
        }
        
    }
    public static void countPrimes(int n){
        int i = 1;
        boolean t = false;
        while(i<=n){
            if(n%i ==0){
                t =true;
                break;
                

            } 

        }
        if(!t){
            System.out.println(n + " is not a prime number");
        }
        else{
            System.out.println(n + " is a prime number");
        }
    }
}