public class day2 {
public day2() {
   }    public static void main(String[] args) {

        // Check voting eligibility
        int age = 17;
        if (age == 18) {
            System.out.println("vote eligible");
        } else {
            System.out.println("no vote eligible");
        }

        // Check pass or fail based on marks
        int marks = 35;
        if (marks >= 35) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }

        // Check if number is even or odd
        int a = 10;
        if (a % 2 == 0) {
            System.out.println("even n.o");
        } else {
            System.out.println("odd n.o");
        }
 
 int z=10;
 int y=20;
 if(z>y){
    System.out.println("a is greater");
 }
 else{
    System.out.println("b is greater");
 }
 
//  leapyear or not a leap year
int year = 2025;
if(year%4==0){
    System.out.println("is a leapyear");
}
else{
    System.out.println("not a leap year");
}
 

char letter = 'e'; // You can change this value

        if (letter == 'a' || letter == 'e' || letter == 'i' || 
            letter == 'o' || letter == 'u' || 
            letter == 'A' || letter == 'E' || letter == 'I' || 
            letter == 'O' || letter == 'U') {
            System.out.println(letter + " is a vowel");
        } else {
            System.out.println(letter + " is a consonant");
        }
 
//  largest of  3 numbers
// if elseif else ------------------------ 

int d=10;
int e=60;
int f=30;
if(d>e & d>f)
{
     System.out.println("d is greater ");
}
else if ( e>d & e>f)
{
     System.out.println( " e is greater");
}

 else if ( f>d & f>d)
{
     System.out.println(" f is greater");
}
    else
{
     System.out.println(" all are equal");
}



int p = -10;
if(p>0)
{
     System.out.println(" +ve");
}
else if (p<0)
 {
     System.out.println(" -ve");
 }
 else{
     System.out.println(" 0");
 }
 
 
//  nested if else

 
 
 
 
 
 
 
 
    }
}
