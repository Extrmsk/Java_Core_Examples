package Exceptions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Extr on 06.12.2016.
 */
public class BikeStoreTest {

    private BikeStore store;

    @Before
    public void setUp() throws Exception {
        store = new BikeStore(5);
    }

    @Test (expected = TooManyBikesException.class)
    public void buyTooManyBikes() throws TooManyBikesException {
        store.buyBikes(6);
    }

    @Test
    public void buyBikes() throws TooManyBikesException {
        store.buyBikes(3);
        assertEquals(2, store.getCountBikes());
    }

}