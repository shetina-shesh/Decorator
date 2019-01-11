package model;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Star extends TreeDecorator {
    public Star(ChristmasTree tree) {
        super(tree);
    }

    public void draw(Pane paneStar) {
        super.draw(paneStar);
        drawStar(paneStar);
    }

    ;

    private void drawStar(Pane paneStar) {

        Path star = new Path();
        star.getElements().addAll(new MoveTo(239, 49),
        new LineTo(217, 102),
        new LineTo(239, 91),
        new LineTo(262, 102),
        new ClosePath(),
        new MoveTo(207, 68),
        new LineTo(270, 68),
        new LineTo(239, 91),
        new ClosePath());

        star.setFill(Color.YELLOW);
        star.setFillRule(FillRule.EVEN_ODD);

        paneStar.getChildren().addAll(star);


        /*gc.setFill(Color.YELLOW);
        gc.setStroke(Color.RED);
        gc.setLineWidth(5);
        gc.fillPolygon(new double[]{244, 234, 215, 231, 221, 244, 267, 257, 273, 254, 244},
                new double[]{30, 55, 50, 75, 100, 85, 100, 75, 50, 55, 30}, 11
        );
        gc.strokePolygon(new double[]{244, 234, 215, 231, 221, 244, 267, 257, 273, 254, 244},
                new double[]{30, 55, 50, 75, 100, 85, 100, 75, 50, 55, 30}, 11);*/
    }
}
