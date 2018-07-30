public class Circle {
    
    
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getCircumference()
    {
        return 2 * Math.PI * radius;
    }
    public String getFormattedCircumference()
    {
        double circum = getCircumference();
        return formatNumber(circum);
    }
     public double getArea()
    {
        return radius * radius * Math.PI;
    }
    public String getFormattedArea()
    {
        double area = getArea();
        return formatNumber(area); 
    }   
    private String formatNumber(double x)
    {
        double roundOff = Math.round(x * 100.0) / 100.0;
        String s = Double.toString(roundOff);
        return s;
    }
}
