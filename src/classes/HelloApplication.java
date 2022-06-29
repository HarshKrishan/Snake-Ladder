package com.example.demo;

//import com.sun.org.apache.xalan.internal.xsltc.compiler.Attribute;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.*;
import javafx.scene.transform.Rotate;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Duration;


import java.io.IOException;


public class HelloApplication extends Application  {
    Button bt,bt1;


    @Override
    public void start(Stage stage) throws IOException {

//        Scene scene2;
//        stage.setTitle("**My application**");
//        bt = new Button("Click here! to go to scene2");
//
//        bt.setTranslateX(165);
//        bt.setTranslateY(250);
        Rectangle rec = new Rectangle(200,50,100,100);
        rec.setFill(Color.AQUA);
        rec.setStroke(Color.GRAY);
        rec.setStrokeWidth(5);

        PathTransition tn = new PathTransition();
        Line l = new Line();
        l.setStartX(0);
        l.setStartY(50);
        l.setEndX(500);
        l.setEndY(50);
        tn.setPath(l);

        tn.setDuration(Duration.seconds(3));
//        tn.setCycleCount(500);
//        tn.setAutoReverse(true);
        tn.setNode(rec);
        tn.play();
//
//        RotateTransition rt = new RotateTransition();
//        rt.setAxis(Rotate.Z_AXIS);
//        rt.setByAngle(360);
//        rt.setCycleCount(500);
//        rt.setDuration(Duration.millis(2000));
//        rt.setAutoReverse(true);
//        rt.setNode(rec);
//        rt.play();
//
//        Group grp = new Group();
//
//        grp.getChildren().addAll(rec,bt);
//
//
//        Scene scene = new Scene(grp,500,400);
//
//
//        bt1 = new Button("Go back to prev page");
//        bt1.setOnAction(e -> stage.setScene(scene));
//        StackPane v = new StackPane();
//
//
//
//        bt1.setAlignment(Pos.TOP_CENTER);
//
//
//        v.getChildren().addAll(bt1);
//        scene2 = new Scene(v,500,400);
//
//        bt.setOnAction(e -> stage.setScene(scene2));
//        stage.setScene(scene);
//
//        stage.show();
//        stage.setFullScreen(true);

//        player p1 = new player();
//        p1.id = 1;
//        p1.color = "red";
//        p1.name = "Harsh";
//        p1.img = new Image("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\redplayer.png");
//
//        ImageView iv = p1.view();
//        iv.setPreserveRatio(true);
//        iv.setSmooth(true);





        Scene scene,scene1,scene2;

        Text homet = new Text();
        homet.setText("Snake \n\t&\n\tladders");

        homet.setFont(Font.font("Chewy",FontWeight.BOLD,90));
        homet.setFill(Color.BROWN);
        homet.setStroke(Color.BLACK);
        DropShadow ds = new DropShadow();
        ds.setOffsetY(3.0f);
        ds.setColor(Color.color(0.4f, 0.4f, 0.4f));
        homet.setEffect(ds);
        homet.setLayoutX(590);
        homet.setLayoutY(80);



//        p.setLayoutX(590);
//        p.setLayoutY(80);



        Button bt1 = new Button("New game");
        bt1.setLayoutX(600);
        bt1.setLayoutY(400);
        bt1.setFont(Font.font("Arial",FontWeight.BOLD,18));
        bt1.setStyle("-fx-background-radius: 15;"+
        "-fx-padding: 5 25 5 25;"+
        "-fx-font-size: 35;"+
        "-fx-pref-width: 300;");



        Button bt2 = new Button("Settings");
        bt2.setLayoutX(600);
        bt2.setLayoutY(520);

        bt2.setFont(Font.font("Arial",FontWeight.BOLD,18));
        bt2.setStyle("-fx-background-radius: 15;"+
                "-fx-padding: 5 25 5 25;"+
                "-fx-font-size: 35;"+
                "-fx-pref-width: 300;");

        Button bt3 = new Button("Exit");
        bt3.setLayoutX(600);
        bt3.setLayoutY(640);
        bt3.setFont(Font.font("Arial",FontWeight.BOLD,18));
        bt3.setStyle("-fx-background-radius: 15;"+
                "-fx-padding: 5 25 5 25;"+
                "-fx-font-size: 35;"+
                "-fx-pref-width: 300;");
        bt3.setOnAction(e->stage.close());

        Pane p = new Pane();
        p.setStyle(
                "-fx-background-image: url(" +
                        "https://cdn.wallpapersafari.com/66/44/zldaLS.jpg" +
                        "); " +"-fx-background-position: center;"+
                        "-fx-background-size: stretch;"+"-fx-background-repeat: no-repeat;"
        );



        scene1 = new Scene(p);


        p.getChildren().addAll(homet,bt1,bt2,bt3);

        StackPane sp1 = new StackPane();

        BoxBlur bb = new BoxBlur();
        bb.setHeight(10);
        bb.setWidth(10);


        sp1.setEffect(bb);
        sp1.setStyle(
                "-fx-background-image: url(" +
                        "https://st.depositphotos.com/1508955/4164/v/950/depositphotos_41642213-stock-illustration-snakes-and-ladders-board-game.jpg" +
                        "); "+
                "-fx-filter: blur;"+
                "-fx-background-position: center;"
        );

        StackPane spp = new StackPane();
        Button bt4 = new Button("Start Game!");
        bt4.setLayoutX(100);
        bt4.setLayoutY(400);

        bt4.setFont(Font.font("Arial",FontWeight.BOLD,18));
        bt4.setStyle("-fx-background-radius: 15;"+
                "-fx-padding: 5 25 5 25;"+
                "-fx-font-size: 35;"+
                "-fx-pref-width: 300;");
        ScaleTransition tt = new ScaleTransition();
        tt.setByX(0.5);
        tt.setDuration(Duration.millis(1000));
        tt.setCycleCount(500);
        tt.setAutoReverse(true);
        tt.setNode(bt4);
        tt.play();
        spp.getChildren().add(bt4);
//        sp1.getChildren().add(spp);
        StackPane sp2 = new StackPane();
        sp2.getChildren().addAll(spp,sp1,bt4);
        scene = new Scene(sp2);











        Text t = new Text();
        t.setText("Snake \n\t&\n\tladders");

        t.setFont(Font.font("Brush Script MT", FontWeight.BOLD, 75));
        t.setFill(Color.GOLDENROD);
        t.setStroke(Color.BLACK);

        DropShadow ds1 = new DropShadow();
        ds1.setOffsetY(3.0f);
        ds1.setColor(Color.color(0.4f, 0.4f, 0.4f));
        t.setEffect(ds1);

        Pane hb = new Pane();
        t.setLayoutX(28);
        t.setLayoutY(65);


        Text t2 = new Text();
        t2.setText("Players: ");

        t2.setFont(Font.font("Arial", FontWeight.BOLD, 56));

        t2.setLayoutX(28);
        t2.setLayoutY(450);


        hb.getChildren().addAll(t,t2,rec);


        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();

        stage.setX(bounds.getMinX());
        stage.setY(bounds.getMinY());
        stage.setWidth(bounds.getWidth());
        stage.setHeight(bounds.getHeight());

        StackPane root = new StackPane();
        root.setId("bg");
        root.setStyle(
                "-fx-background-image: url(" +
                        "https://st.depositphotos.com/1508955/4164/v/950/depositphotos_41642213-stock-illustration-snakes-and-ladders-board-game.jpg" +
                        "); " +
                        "-fx-background-size: contain;"+"-fx-background-position: center;"+"-fx-background-repeat: no-repeat;"
        );

        scene2 = new Scene(root);

        stage.setScene(scene1);
        bt1.setOnAction(e-> stage.setScene(scene));
        bt4.setOnAction(e->stage.setScene(scene2));
        root.getChildren().add(hb);
        stage.show();

    }

    public static void main(String[] args) {

        launch(args);
    }

}