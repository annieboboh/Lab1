/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * This program implements an animation that moves a car shape.
 */
public class AnimationTester {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        final MoveableShape shape
                = new CarShape(0, 0, CAR_WIDTH);

        final MoveableShape shape2
                = new CarShape(0, 50, CAR_WIDTH);

        final MoveableShape shape3
                = new CarShape(0, 100, CAR_WIDTH);

        final ArrayList<MoveableShape> cars = new ArrayList<MoveableShape>();
        cars.add(shape);
        cars.add(shape2);
        cars.add(shape3);

        ShapeIcon icon = new ShapeIcon(cars,
                ICON_WIDTH, ICON_HEIGHT);

        final JLabel label = new JLabel(icon);
        frame.setLayout(new FlowLayout());
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        final int DELAY = 100;
        // Milliseconds between timer ticks
        Timer t = new Timer(DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                for (MoveableShape shape : cars) {
                    shape.translate(5, 0);

                    label.repaint();
                }
            }
        }
        );
        t.start();
    }

    private static final int ICON_WIDTH = 400;
    private static final int ICON_HEIGHT = 150;
    private static final int CAR_WIDTH = 100;
}
