package room1;

public class Wall15 {
    private double width;
    private double height;

    public Wall15(){

    }
    public Wall15(double width, double height){
        if(width>0 && height<0 ){
            this.width=width;
            this.height=0;
        }else if (width<0 && height>0){
            this.height=height;
            this.width=0;
        }else if(width<0 && height<0){
            this.width=0;
            this.height=0;
        }
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width){
        if (width<0){
            this.width=0;
        }else{
            this.width=width;
        }
    }

    public void setHeight(double height){
        if(height<0){
            this.height=0;
        }else{
            this.height=height;
        }
    }
    public  double getArea(){
        return this.width*this.height;
    }

    public static void main(String[] args) {
       Wall15 wall=new Wall15(5,4);
        System.out.println("Area= " +wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("Width= " + wall.getWidth());
        System.out.println("Height= " + wall.getHeight());
        System.out.println("Area=" + wall.getArea());

    }
}
