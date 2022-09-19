public enum Type {
    IRREGURALTRIANGLE(1),
    ISOSCELESTRIANGLE(2),
    EQUILATERALTRIANGLE(3);

    int levelOfSide;

    Type (int levelOfSide){
        this.levelOfSide = levelOfSide;
    }
}
