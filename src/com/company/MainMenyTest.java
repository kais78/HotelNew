package com.company;

import com.company.DoubleRoom;
import com.company.MainMeny;
import com.company.SingleRoom;
import com.company.Suit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainMenyTest {
    @Test
    void getRoom() {
        MainMeny main = new MainMeny();

        // assert = assure me that..... else print "Error msg"
        assertNull(main.getRoom(0), "Wrong room!");
        assertNotNull(main.getRoom(1), "Wrong room!");
        assertNotNull(main.getRoom(2), "Wrong room!");
        assertNotNull(main.getRoom(3), "Wrong room!");

/*
        if(main.getRoom(0) != null){
            throw new Error("Wrong room");
        }
        if (!(main.getRoom(1) instanceof SingleRoom)) {
            throw new Error("Wrong room");
        }
*/

        assertTrue(main.getRoom(1) instanceof SingleRoom, "1 was not single room!");
        assertTrue(main.getRoom(2) instanceof DoubleRoom,"2 was not DoubleRoom room!");
        assertTrue(main.getRoom(3) instanceof Suit,"3 was not suit room!");

        for (int i = -10; i < 1; i++) {
            assertNull(main.getRoom(i), "Wrong room!");
        }

        for (int i = 4; i < 100; i++) {
            assertNull(main.getRoom(i), "Wrong room!");
        }


    }
}
