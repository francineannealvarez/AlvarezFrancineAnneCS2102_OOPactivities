public class Triangle implements Shape{
    private double a;
    private double b;
    private double c;

    public Triangle (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override 
    public double getArea(){
        double s = (a + b + c) / 2;
        
        // Calculate the area using Heron's formula
        double A = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return A;
    }

    @Override
    public double getPerimeter(){
        double P = a + b + c;
        return P;
    }

    @Override
    public void printShapeType(){
        System.out.println("Triangle");
    }
}
