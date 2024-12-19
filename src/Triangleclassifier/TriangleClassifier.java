package Triangleclassifier;

public class TriangleClassifier {
    public static String getTriangle(int sideA, int sideB, int sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0 || sideA + sideB <= sideC || sideB + sideC <= sideA || sideA + sideC <= sideB) {
            return "Không phải là tam giác";
        } else if(sideA == sideB && sideB == sideC) {
            return "Là tam giác đều";
        } else if(sideA == sideC && sideB == sideA && sideC == sideB) {
            return "Là tam giác cân";
        } else {
            return "Là tam giác thường";
        }
    }
}
