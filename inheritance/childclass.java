
//inheritance means a sub class aquires all the properties of a super class 
//for this (extend)keyword is used
class circle {
    public double radius;
    public circle() {
        radius = 0.0;
    }
    public double area(double radius){
        return Math.PI*radius;
    }
}
class cylinder extends circle{
    private double height;
    public cylinder(){
        height=0.0;
    }
    private double volume(double height){
        return area(super.radius)*height;
    }
}