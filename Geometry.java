/**
 * Here are some useful Geometry formulas to demonstrate how functions can return values.
 * Also look at the Java Docs.
 * 
 * @author Emily Wilber 
 * @version August 23, 2018
 */
public class Geometry 
{
    /**
     * Calculates the area of a parallelogram.
     *
     * @param b  length of base of parallelogram
     * @param h  height of the parallelogram
     * @return   area of the parallelogram
     */
    public static double parallelogramArea(double length, double width) 
    {
        return length * width;
    }
    
    /**
     * Calculates the area of a triange.
     *
     * @param b  length of base of triangle
     * @param h  height of the triangle
     * @return   area of the triangle
     */
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
    /**
     * Calulates volume of a sphere.
     * takes radius
     * returns volume of the sphere
     */ 
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    /**
     * Calulates area of a trapezoid.
     * takes side a 
     * takes side b
     * takes height
     * returns area of a trapezoid
     */ 
    public static double trapezoidArea(double sideA, double sideB, double height) 
    {
        return (sideA + sideB) / 2 * height;
    }
    
    /**
     * Calulates volume of a rectuangular prism.
     * takes lenth
     * takes width
     * takes height
     * returns volume of the rectangular prism
     */ 
    public static double rectPrismVolume(double length, double width, double height) 
    {
        return length * width * height;
    }
    
    /**
     * Calulates volume of a sphere.
     * takes radius
     * returns volume of the sphere
     */ 
    public static double coneVolume(double radius, double height) 
    {
        return Math.PI * radius * radius * (height / 3);
    }
    
    public static void main(String[] args) 
    {
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);
        
        System.out.println(ta1);
        System.out.println(ta2);
        
        double ra1 = parallelogramArea(5.2, 9.3);
        System.out.println(ra1);
    }
}
