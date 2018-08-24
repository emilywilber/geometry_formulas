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
     * @param length  length of base of parallelogram
     * @param width   width of the parallelogram
     * @return        area of the parallelogram
     */
    public static double parallelogramArea(double length, double width) 
    {
        return length * width;
    }
    
    /**
     * Calculates the area of a triange.
     *
     * @param base    length of base of triangle
     * @param height  height of the triangle
     * @return        area of the triangle
     */
    public static double triangleArea(double base, double height) 
    {
        return base * height / 2.0;
    }
    
    /**
     * Calulates volume of a sphere.
     * @param radius   radius of sphere
     * @return         volume of the sphere
     */ 
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    /**
     * Calulates area of a trapezoid.
     * @param sideA   one base of trapezoid 
     * @param sideB   another base of trapezoid
     * @param height  height of trapezoid
     * @return        area of a trapezoid
     */ 
    public static double trapezoidArea(double sideA, double sideB, double height) 
    {
        return (sideA + sideB) / 2 * height;
    }
    
    /**
     * Calulates volume of a rectuangular prism.
     * @param lenth   length of rectangular prism
     * @param width   width of rectangular prism
     * @param height  height of rectangular prism
     * @return        volume of the rectangular prism
     */ 
    public static double rectPrismVolume(double length, double width, double height) 
    {
        return length * width * height;
    }
    
    /**
     * Calulates volume of a cone.
     * @param radius   radius of the cone
     * @param height   height of the cone
     * @return         volume of the cone
     */ 
    public static double coneVolume(double radius, double height) 
    {
        return Math.PI * radius * radius * (height / 3);
    }
    
    /**
     * Calulates surface area of a rectangular prism.
     * @param length   length of the rectangular prism
     * @param width    width of the rectangular prism
     * @param height   height of the rectangular prism
     * @return         surface area of a rectangular prism
     */ 
    public static double surfAreaRectPrism(double length, double height, double width) 
    {
        return 2 * ((width * length) + (height * length) + (height * width));
    }
    
    /**
     * Calulates surface area of a sphere.
     * @param radius   radius of the sphere
     * @return         area of a sphere
     */ 
    public static double surfAreaSphere(double radius) 
    {
        return 4 * Math.PI * (Math.pow(radius, 2));
    }
    
    /**
     * Calulates hypotenuse of a right triangle when given the lengths of two legs. 
     * 
     */ 
    public static double hypotRightTriangle(double ff) 
    {
        return ff;
    }
    
    /**
     * Calculates distance between two points.
     * 
     */
    public static double distance(double ff)
    {
        return ff;
    }
    
    /**
     * Calculates slope between two points.
     * 
     */
    public static double slope(double ff)
    {
        return ff;
    }
    
    /**
     * Calculates triangle area based on three side lengths.
     * 
     */
    public static double sideTriangleArea(double ff)
    {
        return ff;
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
