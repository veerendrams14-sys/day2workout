class Rectangle {
    public int area(int a,int b){
        int area = a*b;
        return area;
    }
}
class Rectangle1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        int res = r1.area(10,14);
        System.out.println(res);
    }
}