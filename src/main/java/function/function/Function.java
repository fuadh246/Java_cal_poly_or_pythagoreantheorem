/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function.function;

/**
 *
 * @author FUAD HASSAN
 */

import java.util.Scanner;
public class Function {
    public static void main(String []args){
    
     String choice4;

  do{
    System.out.println("P for poly or Py for Pythagoreantheorem");
    Scanner s1 = new Scanner (System.in);
        String choice = s1.nextLine();
    if(choice.equals("P")){
    poly();
    }
    if(choice.equals("Py")){
    Pythagoreantheorem();
    }
    else {System.out.println("It's a invaild position, to start over enter 1 or 2 ");
    }
    
System.out.println("To calculate again TYPE '1' or '2'");
      Scanner s4 = new Scanner (System.in);
       choice4 = s4.nextLine();  
     
}
        while (choice4.equals("1"));

    
    
    }
    
    private static void poly(){
    double e,d,y,a,x,b,c,res1,res2;
    Scanner A = new Scanner(System.in);
    Scanner B = new Scanner(System.in);
    Scanner C = new Scanner(System.in);
    Scanner X = new Scanner(System.in);
    
    
    System.out.println("Enter 'a'= ");
    a = A.nextInt();
   
            
    System.out.println("Enter 'b'= ");
    b = B.nextInt();
   
    System.out.println("Enter 'c'= ");
     c = C.nextInt();
     
     
    
    
    
    d = ((b*b)-(4*a*c));
    e=Math.sqrt(d);
    res1=((-b+d)/(2*a));
    res2=((-b-d)/(2*a));
    System.out.println(res1);
    System.out.println(res2);
  
    
    
    
    
    }
    
    
private static void Pythagoreantheorem(){
      
    double A,B,C,D,E;
    Scanner a = new Scanner(System.in);
    Scanner b = new Scanner(System.in);
    System.out.println("Enter the value of a");
    A = a.nextDouble();
    System.out.println("Enter the value of b");
    B = b.nextDouble();
    C= ((A*A)+(B*B));
    D =(Math.sqrt(C));
    E= (D*D);
        int Right = 0;
        int Acute = 0;
        int Obtuse =0;
         if (E==C){
             Right++;}
         else if(E>C){ 
             Obtuse++;}
         else if (E<C){
             Acute++;}
        System.out.println();
    System.out.println("C = "+C);
    System.out.println(E);
    System.out.println("Square root of C = "+D);
    System.out.println();
    System.out.println("C Square= "+E);
    System.out.println();
     System.out.println(Right+" Right Angle");
         System.out.println();
         System.out.println(Acute+" Acute Angle");
         System.out.println();
         System.out.println(Obtuse+" Obtuse Angle");
         System.out.println();
}
}








