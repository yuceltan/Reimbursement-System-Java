package WithoutUI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceiptsTest {



    @Test
    void enterDaysCar() {
        Receipts testReceipt = new Receipts();
        assertEquals(15,testReceipt.enterDaysCar(50),"50*03 must be 15");

    }

    @Test
    void enterDays() {
        Receipts testReceipt = new Receipts();
        assertEquals(90,testReceipt.enterDays(6),"6*15 must be 90");

    }









}