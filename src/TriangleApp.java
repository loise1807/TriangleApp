public class TriangleApp {

    static void checkType(Triangle triangle){
        double sisiA = triangle.getSisiA();
        double sisiB = triangle.getSisiB();
        double sisiC = triangle.getSisiC();

        int count = 0;
        if(sisiA == sisiB && sisiA == sisiC){
            count = 3;
        }else if(sisiA == sisiB || sisiA == sisiC || sisiB == sisiC){
            count = 2;
        }else {
            count = 1;
        }

        if(Type.ISOSCELESTRIANGLE.levelOfSide == count){
            System.out.println("Segitiga Sama Kaki");
        }else if(Type.EQUILATERALTRIANGLE.levelOfSide == count){
            System.out.println("Segitiga Sama Sisi");
        }else if(Type.IRREGURALTRIANGLE.levelOfSide == count){
            System.out.println("Segitiga Irregular");
        }else{
            System.out.println("Bukan Segitiga");
        }
    }

    public static void main(String[] args) {
        Triangle myTriangle = new Triangle();
        myTriangle.setSisiA(10.0);
        myTriangle.setSisiB(10.0);
        myTriangle.setSisiC(10.0);

        checkType(myTriangle);

        Triangle myTriangle2 = new Triangle(10.0,11.0,11.0);
        checkType(myTriangle2);
        Triangle myTriangle3 = new Triangle(10.0,11.0,12.0);
        checkType(myTriangle3);
        Triangle myTriangle4 = new Triangle(13.0,11.0,13.0);
        checkType(myTriangle4);

    }
}
