import java.util.Scanner();
class Azhar{

public static void main(String args[]){
Scanner scn=new Scanner(System.in);
float a=scn.nextFloat();
float b=scn.nextFloat();


System.out.println("Addition is" +add(a,b));
System.out.println("Subtraction is" +subtract(a,b));
System.out.println("Multiplication is" +multiply(a,b));
System.out.println("Division is" +divide(a,b));

}

public static int add(float a,float b){
return a+b;
}
public static int multiply(float a,float b){
return a*b;
}
public static int subtract(float a,float b){
return a-b;
}
public static int divide(float a,float b){
return a/b;
}
}