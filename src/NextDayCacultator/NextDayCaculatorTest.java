package NextDayCacultator;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static NextDayCacultator.NextDayCaculator.getNextDay;
import static org.junit.jupiter.api.Assertions.*;
class NextDayCaculatorTest {

    @Test
    void findNextDay1Jan2018() {
        LocalDate today = getNextDay(1, 1, 2018);
        assertEquals(LocalDate.of(2018, 1, 2), today);
    }

    @Test
    void findNextDay1Feb2018() {
        LocalDate today = getNextDay(31, 1, 2018);
        assertEquals(LocalDate.of(2018, 2, 1), today);
    }

    @Test
    void findNextDay30April2018() {
        LocalDate today = getNextDay(30, 4, 2018);
        assertEquals(LocalDate.of(2018, 5, 1), today);
    }

    @Test
    void findNextDay28Feb2018() {
        LocalDate today = getNextDay(28, 2, 2018);
        assertEquals(LocalDate.of(2018, 1, 1), today);
    }

    @Test
    void findNextDay29Feb2018() {
        LocalDate today = getNextDay(29, 2, 2020);
        assertEquals(LocalDate.of(2018, 3, 1), today);
    }

    @Test
    void findNextDay30Dep2018() {
        LocalDate today = getNextDay(31, 12, 2018);
        assertEquals(LocalDate.of(2018, 1, 1), today);
    }
}