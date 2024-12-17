package Test_Drive_Development;

import static Test_Drive_Development.simpleCaculator.caculator;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
public class simpleCaculatorTest {
    public static void main(String[] args) {
        int result = caculator(3, 6, '*');
        System.out.println(result);
    }
}
