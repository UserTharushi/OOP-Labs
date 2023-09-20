import java.util.Scanner;

class Area {
     int length;
     int breadth;

    
    public Area(){

    }

   
    public int getLength() {
        return length;
    }
    public void setLength(int length){
        this.length=length;
    }
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth){
        this.breadth=breadth;
    }

    public int getArea(){
        return length*breadth;
    }
       
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the length of the rectangle: ");
    int length = sc.nextInt();

    System.out.println("Enter the breadth of the rectangle: ");
    int breadth = sc.nextInt();

    Area area = new Area();
    area.setLength(length);
    area.setBreadth(breadth);

    int areaofRectangle = area.getArea();
    
    System.out.println("The area of the rectangle is " + areaofRectangle);
    }

        
        
    }

