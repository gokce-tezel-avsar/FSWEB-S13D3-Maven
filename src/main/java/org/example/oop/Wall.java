package org.example.oop;

    public class Wall {
        double width;
        double height;

    public Wall(double width, double height){ // constructur
        this.width = width;
        this.height = height;

    }

    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
            this.height = (height < 0) ? 0 : height;
    }


        public void setWidth(double width) {
            this.width = (width < 0) ? 0 :width;
        }

    public double getArea(){
        if(width<0 && height< 0) {
            return 0;
        }else{
        return width * height;
        }
    }


}
