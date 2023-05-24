package com.mjc.stage2.impl;

import com.mjc.stage2.Observer;
import com.mjc.stage2.entity.Rectangle;
import com.mjc.stage2.entity.RectangleValues;
import com.mjc.stage2.event.RectangleEvent;
import com.mjc.stage2.warehouse.RectangleWarehouse;

public class RectangleObserver  implements Observer {
    @Override
    public void handleEvent(RectangleEvent event) {
        Rectangle modifiedRectangle = event.getSource();
        double sideA = modifiedRectangle.getSideA();
        double sideB = modifiedRectangle.getSideB();
        RectangleValues rectValues = new RectangleValues(sideA * sideB, 2 * (sideA + sideB));
        RectangleWarehouse.getInstance().put(modifiedRectangle.getId(), rectValues);
    }

}
