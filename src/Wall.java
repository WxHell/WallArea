public class Wall {
    private double width;
    private double height;

    public Wall() {

    }

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double widht) {
        if (widht<=0){
            this.width=0;
            System.out.println(this.width);
        }else {
            this.width = widht;
            System.out.println(this.width);
        }

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
       if (this.height<=0){
           this.height = 0;
       }else {
           this.height=height;
           System.out.println(this.height);
       }
    }

    public double getArea(){
        return width * height;
    }

}
