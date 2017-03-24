package com.github.hasys.lienzopit;

import static org.junit.Assert.assertEquals;

import com.ait.lienzo.client.core.types.Point2D;
import com.ait.lienzo.test.LienzoMockitoTestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(LienzoMockitoTestRunner.class)
public class MyLienzoTest
{
    private MyLienzo myLienzo;

    @Before
    public void setup()
    {
        myLienzo = new MyLienzo(new Point2D(0, 0));
    }

    @Test
    public void test()
    {
        Point2D p = myLienzo.test(new Point2D(0, 0));

        assertEquals(p.getX(), 0, 0);

        assertEquals(p.getY(), 0, 0);
    }
}
