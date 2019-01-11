package model;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;


public class ChristmasTreeImpl implements ChristmasTree {

    public void draw(Pane paneTree){

        Path tree = new Path();
        tree.getElements().addAll(new MoveTo(110, 370),
                new LineTo(368, 370),
                new LineTo(239, 93),
                new ClosePath());
        tree.setFill(Color.GREEN);

        Rectangle trunk = new Rectangle();
        trunk.setX(215);
        trunk.setY(370);
        trunk.setWidth(50);
        trunk.setHeight(50);
        trunk.setFill(Color.BROWN);

        paneTree.getChildren().addAll(trunk, tree);


       /* gc.setFill(Color.BROWN);
        gc.fillPolygon(new double[]{219, 269, 269, 219},
                new double[]{450,450,150, 150},4
        );

        gc.setFill(Color.DARKGREEN);
        gc.fillPolygon(new double[]{168,244, 320},
                new double[]{192,81,192},3
        );

        gc.setFill(Color.DARKGREEN);
        gc.fillPolygon(new double[]{124,243, 361},
                new double[]{293,128,293},3
        );

        gc.setFill(Color.DARKGREEN);
        gc.fillPolygon(new double[]{90,242, 393},
                new double[]{365,200,365},3
        );*/


    }
}
