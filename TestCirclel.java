public class TestCirclel {
    public static void main (String[] args) {

        // Create a circle with radius 5.0
        Circlel myCircle = new Circlel(5.0);
        System.out.println("Area of circle of radius " + myCircle.radius + " is " + myCircle.getArea());

        // Create circle with radius 1
        Circlel yourCircle = new Circlel();
        System.out.println("The area of the circle of radius " + yourCircle.radius + " is " + yourCircle.getArea());

        //Modify circle radius
        yourCircle.radius = 100;
        System.out.println("The area of circle of radius" + yourCircle.radius + " is " + yourCircle.getArea());
         }
    }

    //Define the circle with two constructors
class Circlel{
    double radius;

    // Construct a circle with radius 1
        Circlel(){
            radius = 1.0;
        }
        // Construct a circle with a specified radius
        Circlel (double newRadius){
            radius=newRadius;
        }
        // Return the area of the circle
        double getArea(){
            return radius*radius*Math.PI;
        }
    }
