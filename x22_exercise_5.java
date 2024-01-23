package com.codewithharry.shape;
class rectangle {
    int length;
    int breadth;

    rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
        public int getLength() {
            return length;}

        public int setLength(int l){
        return length = l;}
        public int getBreadth () {
        return breadth;}
        public int setBreadth ( int b){
        return breadth = b;
        }
        public int area () {
            return  (length * breadth);
        }
    }
    class square {
        int side;

        square(int side) {
            this.side = side;
        }
            public int getSide() {
                return side;
            }
            public int setSide ( int a){
                return side = a;
            }
            public int area () {
                return side * side;
            }
        }
        class circle {
            int radius;

            circle(int radius) {
                this.radius = radius;
            }
                public int getRadius() {
                    return radius;
                }
                public int setRadius ( int r){
                    return radius = r;
                }
                public double area () {
                    return  (2 * Math.PI * radius);
            }
        }
            class cylinder{
                int radius;
                int height;
                cylinder(int radius,int height) {
                    this.radius = radius;
                    this.height = height;
                }
                public int getRadius(){return radius;}
                public int setRadius(int r){return radius = r;}
                public int getHeight(){return height;}
                public int setHeight(int h){return height = h;}
                public double area(){
                    return (2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
                }
                public double volume(){
                    return Math.PI*radius*radius*height;
                }
            }

            class x22_exercise_5{
                public static void main(String[] args){
                    rectangle r = new rectangle(3,4);
                    System.out.println(r.area());
                }
}

