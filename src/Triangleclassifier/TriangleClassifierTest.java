package Triangleclassifier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void getTriangle() {
        assertEquals("Tam giác cân", TriangleClassifier.getTriangle(2, 2, 2));
    }


    @Test
    void getTriangle1() {
        assertEquals("Tam giác đều", TriangleClassifier.getTriangle(2, 2, 1));
    }

    @Test
    void getTriangle2() {
        assertEquals("Tam giác đều", TriangleClassifier.getTriangle(3, 2, 2));
    }

    @Test
    void getTriangle3() {
        assertEquals("Tam giác thường", TriangleClassifier.getTriangle(3, 2, 1));
    }

    @Test
    void getTriangle4() {
        assertEquals("Không phai la tam", TriangleClassifier.getTriangle(5, 9, 10));
    }
}