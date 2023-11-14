import java.io.*//io package
;public class BufferRead {//class cannot be BufferedReader
    public static void main(String[] args) throws IOException{
        int a,b,c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter first number");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter second number");
        b=Integer.parseInt(br.readLine());
        c=a+b;
        System.out.println("Addition is:"+c);
        
    }
    
}
;