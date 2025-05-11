public class Day1 {
    public static void main(String[] args) {

        // Printing "Hello, World!" message
        System.out.println("Hello, World!");
    
        // Declaring and printing integer variable age
        int age = 20;
        System.out.println("Age-" + age);
        
        // Declaring and printing boolean variable ischeck
        boolean ischeck = false;
        System.out.println(ischeck);
    
        // Declaring and printing byte variable a
        byte a = 10;
        System.out.println(a);
    
        // Declaring and printing short variable b
        short b = 22666;
        System.out.println(b);
        
        // Declaring and printing integer variable ans
        int ans = 100;
        System.out.println(ans);
    
        // Declaring and printing character variable c
        char c = 'A';
        System.out.println(c);
    
        // Declaring and printing string variable e
        String e = "vicky";
        System.out.println(e);
    
        // Arithmetic Operators
        int a1 = 10, b2 = 20;

        // Addition, Subtraction, Multiplication, Division, Modulus
        System.out.println("a + b = " + (a1 + b2));   // Addition
        System.out.println("a - b = " + (a1 - b2));   // Subtraction
        System.out.println("a * b = " + (a1 * b2));   // Multiplication
        System.out.println("a / b = " + (a1 / b2));   // Division
        System.out.println("a % b = " + (a1 % b2));   // Modulus (remainder)

        // Relational Operators
        int valueA = 10, valueB = 20;
        System.out.println("valueA == valueB: " + (valueA == valueB));
        System.out.println("valueA != valueB: " + (valueA != valueB));
        System.out.println("valueA > valueB: " + (valueA > valueB));
        System.out.println("valueA < valueB: " + (valueA < valueB));
        System.out.println("valueA >= valueB: " + (valueA >= valueB));
        System.out.println("valueA <= valueB: " + (valueA <= valueB));

        // Logical Operators
        boolean hasLicense = true;
        boolean isWearingHelmet = false;
        System.out.println("Can drive safely (AND): " + (hasLicense && isWearingHelmet));
        System.out.println("Can drive anyway (OR): " + (hasLicense || isWearingHelmet));
        System.out.println("Not wearing helmet: " + (!isWearingHelmet));

        // Increment and Decrement Operators
        int marks = 5;
        System.out.println("Marks before post-increment: " + marks);   // 5
        System.out.println("Post-increment: " + (marks++));            // 5, then marks becomes 6
        System.out.println("Marks after post-increment: " + marks);    // 6
        System.out.println("Pre-increment: " + (++marks));             // 7
        System.out.println("Post-decrement: " + (marks--));            // 7, then marks becomes 6
        System.out.println("Marks after post-decrement: " + marks);    // 6
        System.out.println("Pre-decrement: " + (--marks));             // 5

        // Marks Calculation
        int t = 90, t1 = 90, t2 = 90, t3 = 90, t4 = 90;
        int total = t + t1 + t2 + t3 + t4;
        int avg = total / 5;
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);

        // Typecasting Example
        int num = 10;
        double result = num;  // Implicit casting (int → double)
        System.out.println("Int value: " + num);
        System.out.println("After implicit casting to double: " + result);

        // Explicit Typecasting
        double value = 9.7;
        int result2 = (int) value;  // Explicit casting (double → int)
        System.out.println("Double value: " + value);
        System.out.println("After explicit casting to int: " + result2);

        // Area of Circle
        int radius = 5;
        float area = (float) 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);

        // Area of Rectangle
        int length = 10, breadth = 20;
        int areaRect = length * breadth;
        System.out.println("Area of Rectangle: " + areaRect);

        // Area of Square
        int side = 5;
        float areaSquare = (float) side * side;
        System.out.println("Area of Square: " + areaSquare);

        // Area of Triangle
        int base = 10, height = 5;
        double areaTriangle = 0.5 * base * height;
        System.out.println("Area of Triangle: " + areaTriangle);

        // Fahrenheit to Celsius Conversion
        int fahrenheit = 98;
        int celsius = (int) ((fahrenheit - 32) * 5 / 9); // Typecasting to int
        System.out.println(fahrenheit + "°F = " + celsius + "°C");

        // Celsius to Fahrenheit Conversion
        int celsiusInput = 37;
        int fahrenheitOutput = (int) ((celsiusInput * 9 / 5) + 32); // Typecasting to int
        System.out.println(celsiusInput + "°C = " + fahrenheitOutput + "°F");
    }
}
