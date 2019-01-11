package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import model.*;

public class Controller {
    @FXML
    public Pane paneLight;
    public Pane panePresent;
    public Pane paneTree;
    public Pane paneStar;

    @FXML
    public void initialize() {
        paneTree.toFront();
        ChristmasTree tree = new ChristmasTreeImpl();
        tree.draw(paneTree);
    }


    public void addLights(ActionEvent actionEvent) {
        paneLight.toFront();
        ChristmasTree tree = new Girland(new ChristmasTreeImpl());
        tree.draw(paneLight);

    }

    public void addStar(ActionEvent actionEvent) {
        paneStar.toFront();
        ChristmasTree tree = new Star(new ChristmasTreeImpl());
        tree.draw(paneStar);

    }

    public void addPresents(ActionEvent actionEvent) {
        panePresent.toFront();
        ChristmasTree tree = new Presents(new ChristmasTreeImpl());
        tree.draw(panePresent);

    }

    public void addAll(ActionEvent actionEvent) {
        paneLight.toFront();
        ChristmasTree tree = new Girland(new Star(new Presents(new ChristmasTreeImpl())));
        tree.draw(paneLight);
    }

    public void deleteAll(ActionEvent actionEvent) {
        paneLight.getChildren().clear();
        panePresent.getChildren().clear();
        paneStar.getChildren().clear();
    }
}
