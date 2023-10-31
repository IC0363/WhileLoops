public class whileLoop{
    public static void main(String[]args){
        whileLoops(28);

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
}