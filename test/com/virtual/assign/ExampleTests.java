package com.virtual.assign;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ExampleTests {

    ReadFile rf;
    NoOfSetBit ns;

    @Before
    public void setup(){
        rf = mock(ReadFile.class);
        ns = new NoOfSetBit();
    }

    @Test
    public void MockTest() throws IOException {
        ns.setfile(rf);
        when(rf.inputread()).thenReturn("22");
        int x = ns.countSetBits();
        assertEquals(x,3);
    }

}