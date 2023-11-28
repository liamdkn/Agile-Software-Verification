package cm;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DurkanLiamTestTask2 {
    @Test
    public void PeriodTestCase1() {
        Period period = new Period(17, 20);
        assertNotNull(period);
    }
    @Test
    public void PeriodTestCase2(){
        Period period = new Period(1,7);
        assertNotNull(period);
    }
    @Test
    public void PeriodTestCase3(){
        assertThrows(IllegalArgumentException.class, () -> {
            Period period = new Period(9,9);
        });
    }
    @Test
    public void PeriodTestCase4(){
        assertThrows(IllegalArgumentException.class, () -> {
            Period period = new Period(27,9);
        });
    }
    @Test
    public void PeriodTestCase5(){
        assertThrows(IllegalArgumentException.class, () -> {
            Period period = new Period(-4,7);
        });
    }
    @Test
    public void PeriodTestCase6(){
        assertThrows(IllegalArgumentException.class, () -> {
            Period period = new Period(7,26);
        });
    }
    @Test
    public void PeriodTestCase7(){
        assertThrows(IllegalArgumentException.class, () -> {
            Period period = new Period(9,-6);
        });
    }
    @Test
    public void PeriodTestCase8() {
        Period period = new Period(0,23);
        assertNotNull(period);
    }
    @Test
    public void PeriodTestCase9() {
        Period period = new Period(9,13);
        assertNotNull(period);
    }
    @Test
    public void PeriodTestCase10() {
        assertThrows(IllegalArgumentException.class, () -> {
            Period period = new Period(15, 9);
        });
    }
    @Test
    public void PeriodTestCase11() {
        assertThrows(IllegalArgumentException.class, () -> {
            Period period = new Period(22, 1);
        });
    }
    @Test
    public void PeriodTestCase12() {
        assertThrows(IllegalArgumentException.class, () -> {
            Period period = new Period(4, 25);
        });
    }
    @Test
    public void PeriodTestCase13() {//new
        assertThrows(IllegalArgumentException.class, () -> {
            Period period = new Period(25, 27);
        });
    }

    @Test
    public void durationTestCase1(){
        Period period = new Period(14,17);
        assertEquals(3, period.duration());
    }
    @Test
    public void durationTestCase2(){
        Period period = new Period(0,23);
        assertEquals(23, period.duration());
    }
    @Test
    public void durationTestCase3(){
        Period period = new Period(14,16);
        assertEquals(2, period.duration());
    }
    @Test
    public void durationTestCase4(){
        Period period = new Period(7,7);
        assertEquals(1, period.duration());
    }
    //removed test 5-9

    @Test
    public void overlapsTestCase1(){
        Period period1 = new Period(13,19);
        Period period2 = new Period(15,21);
        assertTrue(period1.overlaps(period2));
    }
    @Test
    public void overlapsTestCase2(){
        Period period1 = new Period(1,7);
        Period period2 = new Period(12,18);
        assertFalse(period1.overlaps(period2));
    }
    @Test
    public void overlapsTestCase3(){
        Period period1 = new Period(5,9);
        Period period2 = new Period(9,10);
        assertFalse(period1.overlaps(period2));
    }
    @Test
    public void overlapsTestCase4(){
        Period period1 = new Period(11,14);
        Period period2 = new Period(11,14);
        assertTrue(period1.overlaps(period2));
    }
    @Test
    public void overlapsTestCase5(){
        Period period1 = new Period(1,18);
        Period period2 = new Period(7,11);
        assertTrue(period1.overlaps(period2));
    }

    @Test
    public void RateTestCase1(){
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = BigDecimal.valueOf(4.00);
        BigDecimal reducedRate = BigDecimal.valueOf(2.50);
        ArrayList<Period> normalPeriods = new ArrayList<>();
        ArrayList<Period> reducedPeriods = new ArrayList<>();

        normalPeriods.add(new Period(9, 17));
        reducedPeriods.add(new Period(6, 8));
        reducedPeriods.add(new Period(20, 22));

        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
        assertNotNull(rate);
    }
    @Test
    public void RateTestCase2(){
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = BigDecimal.valueOf(6.00);
        BigDecimal reducedRate = BigDecimal.valueOf(4.50);
        ArrayList<Period> normalPeriods = new ArrayList<>();
        ArrayList<Period> reducedPeriods = new ArrayList<>();

        normalPeriods.add(new Period(9, 17));
        reducedPeriods.add(new Period(6, 8));
        reducedPeriods.add(new Period(20, 22));

        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
        assertNotNull(rate);
    }
    @Test
    public void RateTestCase3(){
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = BigDecimal.valueOf(7.50);
        BigDecimal reducedRate = BigDecimal.valueOf(4.00);
        ArrayList<Period> normalPeriods = new ArrayList<>();
        ArrayList<Period> reducedPeriods = new ArrayList<>();

        normalPeriods.add(new Period(9, 17));
        reducedPeriods.add(new Period(6, 8));
        reducedPeriods.add(new Period(20, 22));

        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);

        assertNotNull(rate);
    }
    @Test
    public void RateTestCase4(){
        assertThrows(IllegalArgumentException.class, () -> {
            CarParkKind kind = CarParkKind.STAFF;
            BigDecimal normalRate = BigDecimal.valueOf(-4.50);
            BigDecimal reducedRate = BigDecimal.valueOf(4.00);
            ArrayList<Period> normalPeriods = new ArrayList<>();
            ArrayList<Period> reducedPeriods = new ArrayList<>();

            normalPeriods.add(new Period(9, 17));
            reducedPeriods.add(new Period(6, 8));
            reducedPeriods.add(new Period(20, 22));

            Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
        });
    }
    @Test
    public void RateTestCase5(){
        assertThrows(IllegalArgumentException.class, () -> {
            CarParkKind kind = CarParkKind.STAFF;
            BigDecimal normalRate = BigDecimal.valueOf(7.50);
            BigDecimal reducedRate = BigDecimal.valueOf(-4.55);
            ArrayList<Period> normalPeriods = new ArrayList<>();
            ArrayList<Period> reducedPeriods = new ArrayList<>();

            normalPeriods.add(new Period(9, 17));
            reducedPeriods.add(new Period(6, 8));
            reducedPeriods.add(new Period(20, 22));

            Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
        });
    }
    @Test
    public void RateTestCase6(){
        assertThrows(IllegalArgumentException.class, () -> {
            CarParkKind kind = CarParkKind.STAFF;
            BigDecimal normalRate = BigDecimal.valueOf(7.45);
            BigDecimal reducedRate = BigDecimal.valueOf(6.25);
            ArrayList<Period> normalPeriods = new ArrayList<>();
            ArrayList<Period> reducedPeriods = new ArrayList<>();

            normalPeriods.add(new Period(9, 17));
            normalPeriods.add(new Period(20, 23));
            reducedPeriods.add(new Period(15, 19));

            Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
        });
    }

    @Test
    public void RateTestCase7(){
        assertThrows(IllegalArgumentException.class, () -> {
            CarParkKind kind = CarParkKind.STAFF;
            BigDecimal normalRate = null;
            BigDecimal reducedRate = BigDecimal.valueOf(6.25);
            ArrayList<Period> normalPeriods = new ArrayList<>();
            ArrayList<Period> reducedPeriods = new ArrayList<>();

            normalPeriods.add(new Period(9, 17));
            normalPeriods.add(new Period(20, 23));
            reducedPeriods.add(new Period(15, 19));

            Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
        });
    }
    @Test
    public void RateTestCase8(){
        assertThrows(IllegalArgumentException.class, () -> {
            CarParkKind kind = CarParkKind.STAFF;
            BigDecimal normalRate = BigDecimal.valueOf(7.45);
            BigDecimal reducedRate = null;
            ArrayList<Period> normalPeriods = new ArrayList<>();
            ArrayList<Period> reducedPeriods = new ArrayList<>();

            normalPeriods.add(new Period(9, 17));
            normalPeriods.add(new Period(20, 23));
            reducedPeriods.add(new Period(15, 19));

            Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
        });
    }
    @Test
    public void RateTestCase9(){
        assertThrows(IllegalArgumentException.class, () -> {
            CarParkKind kind = CarParkKind.STAFF;
            BigDecimal normalRate = BigDecimal.valueOf(7.45);
            BigDecimal reducedRate = BigDecimal.valueOf(6.25);
            ArrayList<Period> normalPeriods = null;
            ArrayList<Period> reducedPeriods = new ArrayList<>();

            reducedPeriods.add(new Period(15, 19));

            Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
        });
    }
    @Test
    public void RateTestCase10(){
        assertThrows(IllegalArgumentException.class, () -> {
            CarParkKind kind = CarParkKind.STAFF;
            BigDecimal normalRate = BigDecimal.valueOf(7.45);
            BigDecimal reducedRate = BigDecimal.valueOf(6.25);
            ArrayList<Period> normalPeriods = new ArrayList<>();
            ArrayList<Period> reducedPeriods = null;

            normalPeriods.add(new Period(15, 19));

            Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
        });
    }
    @Test
    public void RateTestCase11(){
        assertThrows(IllegalArgumentException.class, () -> {
            CarParkKind kind = CarParkKind.STAFF;
            BigDecimal normalRate = BigDecimal.valueOf(6.25);
            BigDecimal reducedRate = BigDecimal.valueOf(7.25);
            ArrayList<Period> normalPeriods = new ArrayList<>();
            ArrayList<Period> reducedPeriods = new ArrayList<>();

            normalPeriods.add(new Period(9, 17));
            normalPeriods.add(new Period(20, 23));
            reducedPeriods.add(new Period(15, 19));

            Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
        });
    }
    @Test
    public void RateTestCase12(){
        assertThrows(IllegalArgumentException.class, () -> {
            CarParkKind kind = CarParkKind.STAFF;
            BigDecimal normalRate = BigDecimal.valueOf(7.25);
            BigDecimal reducedRate = BigDecimal.valueOf(6.25);
            ArrayList<Period> normalPeriods = new ArrayList<>();
            ArrayList<Period> reducedPeriods = new ArrayList<>();

            normalPeriods.add(new Period(9, 7));
            reducedPeriods.add(new Period(11, 13));

            Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
        });
    }
    @Test
    public void RateTestCase13(){
        assertThrows(IllegalArgumentException.class, () -> {
            CarParkKind kind = CarParkKind.STAFF;
            BigDecimal normalRate = BigDecimal.valueOf(7.25);
            BigDecimal reducedRate = BigDecimal.valueOf(6.25);
            ArrayList<Period> normalPeriods = new ArrayList<>();
            ArrayList<Period> reducedPeriods = new ArrayList<>();

            normalPeriods.add(new Period(13, 11));
            reducedPeriods.add(new Period(11, 7));

            Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
        });
    }
    @Test
    public void RateTestCase14() {
        assertThrows(IllegalArgumentException.class, () -> {
            CarParkKind kind = CarParkKind.STAFF;
            BigDecimal normalRate = BigDecimal.valueOf(7.25);
            BigDecimal reducedRate = BigDecimal.valueOf(6.25);
            ArrayList<Period> normalPeriods = new ArrayList<>();
            ArrayList<Period> reducedPeriods = new ArrayList<>();

            reducedPeriods.add(new Period(8, 12));
            reducedPeriods.add(new Period(10, 14));
            normalPeriods.add(new Period(14, 18));

            Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
        });
    }
    @Test
    public void RateTestCase15(){
        assertThrows(IllegalArgumentException.class, () -> {
            CarParkKind kind = CarParkKind.STAFF;
            BigDecimal normalRate = BigDecimal.valueOf(7.45);
            BigDecimal reducedRate = BigDecimal.valueOf(6.25);
            ArrayList<Period> normalPeriods = new ArrayList<>();
            ArrayList<Period> reducedPeriods = new ArrayList<>();

            normalPeriods.add(new Period(9, 17));
            normalPeriods.add(new Period(20, 23));
            reducedPeriods.add(new Period(15, 19));
            reducedPeriods.add(new Period(7,9));

            Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
        });
    }
    @Test
    public void RateTestCase16(){
        assertThrows(IllegalArgumentException.class, () -> {
            CarParkKind kind = CarParkKind.STAFF;
            BigDecimal normalRate = BigDecimal.valueOf(7.45);
            BigDecimal reducedRate = BigDecimal.valueOf(6.25);
            ArrayList<Period> normalPeriods = new ArrayList<>();
            ArrayList<Period> reducedPeriods = new ArrayList<>();

            normalPeriods.add(new Period(9, 17));
            normalPeriods.add(new Period(16, 23));
            reducedPeriods.add(new Period(15, 19));
            reducedPeriods.add(new Period(7,9));

            Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
        });
    }
    @Test
    public void calculateTestCase1(){
        ArrayList<Period> normalPeriods = new ArrayList<>();
        ArrayList<Period> reducedPeriods = new ArrayList<>();

        normalPeriods.add(new Period(8, 18));
        reducedPeriods.add(new Period(19, 23));


        Rate rate = new Rate(CarParkKind.VISITOR,
                        BigDecimal.valueOf(5.00),
                        BigDecimal.valueOf(2.50), normalPeriods, reducedPeriods);

        Period periodStay = new Period(10, 14);

        assertEquals(new BigDecimal("20.0"), rate.calculate(periodStay));
    }
    @Test
    public void calculateTestCase2(){
        ArrayList<Period> normalPeriods = new ArrayList<>();
        ArrayList<Period> reducedPeriods = new ArrayList<>();

        normalPeriods.add(new Period(8, 18));
        reducedPeriods.add(new Period(19, 23));


        Rate rate = new Rate(CarParkKind.STAFF,
                BigDecimal.valueOf(5.00),
                BigDecimal.valueOf(2.50), normalPeriods, reducedPeriods);

        Period periodStay = new Period(20, 22);

        assertEquals(new BigDecimal("5.0"), rate.calculate(periodStay));
    }
    @Test
    public void calculateTestCase3(){
        ArrayList<Period> normalPeriods = new ArrayList<>();
        ArrayList<Period> reducedPeriods = new ArrayList<>();

        normalPeriods.add(new Period(8, 18));
        reducedPeriods.add(new Period(20, 23));


        Rate rate = new Rate(CarParkKind.STAFF,
                BigDecimal.valueOf(5.00),
                BigDecimal.valueOf(2.50), normalPeriods, reducedPeriods);

        Period periodStay = new Period(15, 20);

        assertEquals(new BigDecimal("22.5"), rate.calculate(periodStay));
    }
    @Test
    public void calculateTestCase4(){
        ArrayList<Period> normalPeriods = new ArrayList<>();
        ArrayList<Period> reducedPeriods = new ArrayList<>();

        normalPeriods.add(new Period(8, 18));
        reducedPeriods.add(new Period(19, 23));


        Rate rate = new Rate(CarParkKind.STAFF,
                BigDecimal.valueOf(5.00),
                BigDecimal.valueOf(2.50), normalPeriods, reducedPeriods);

        Period periodStay = new Period(1, 3);

        assertEquals(new BigDecimal("0.0"), rate.calculate(periodStay));
    }
    @Test
    public void calculateTestCase5(){
        ArrayList<Period> normalPeriods = new ArrayList<>();
        ArrayList<Period> reducedPeriods = new ArrayList<>();

        normalPeriods.add(new Period(3, 18));
        reducedPeriods.add(new Period(19, 23));


        Rate rate = new Rate(CarParkKind.STAFF,
                BigDecimal.valueOf(5.00),
                BigDecimal.valueOf(2.50), normalPeriods, reducedPeriods);

        Period periodStay = new Period(1, 4);

        assertEquals(new BigDecimal("10.0"), rate.calculate(periodStay));
    }
    @Test
    public void calculateTestCase6(){
        ArrayList<Period> normalPeriods = new ArrayList<>();
        ArrayList<Period> reducedPeriods = new ArrayList<>();

        normalPeriods.add(new Period(3, 17));
        reducedPeriods.add(new Period(19, 23));


        Rate rate = new Rate(CarParkKind.STAFF,
                BigDecimal.valueOf(5.00),
                BigDecimal.valueOf(2.50), normalPeriods, reducedPeriods);

        Period periodStay = new Period(18, 20);

        assertEquals(new BigDecimal("10.0"), rate.calculate(periodStay));
    }
    @Test
    public void calculateTestCase7(){
        ArrayList<Period> normalPeriods = new ArrayList<>();
        ArrayList<Period> reducedPeriods = new ArrayList<>();

        normalPeriods.add(new Period(3, 18));
        reducedPeriods.add(new Period(19, 23));


        Rate rate = new Rate(CarParkKind.STAFF,
                BigDecimal.valueOf(5.00),
                BigDecimal.valueOf(2.50), normalPeriods, reducedPeriods);

        Period periodStay = new Period(1, 22);

        assertEquals(new BigDecimal("95.0"), rate.calculate(periodStay));
    }
}