import java.io.*;
class Concat
{
 public static void main(String Args[])
 {
   String a,b;
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter 2 strings:");
   a=br.readLine();
   b=br.readLine();
   System.out.println(a+b);
 }
}
  