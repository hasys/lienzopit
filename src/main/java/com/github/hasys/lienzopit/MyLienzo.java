package com.github.hasys.lienzopit;

import com.ait.lienzo.client.core.types.Point2D;

public class MyLienzo
{
    private Point2D p;

    public MyLienzo(Point2D p)
    {
        this.p = p;
    }

    public Point2D test(Point2D p)
    {
        return this.p.add(p);
    }
}
