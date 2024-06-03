//package com.example.training2;
//
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.StackPane;
//import javafx.stage.Stage;
//
//public class HelloApplication extends Application implements EventHandler<ActionEvent> {
//
//    Button button;
//
//    @Override
//    public void start(Stage stage) throws Exception {
//    stage.setTitle("Title of the window");
//    button = new Button();
//
//
//    button.setText("Click me");
//    button.setOnAction(this);
//
//    StackPane layout = new StackPane();
//    layout.getChildren().add(button);
//
//    Scene scene = new Scene(layout, 320, 240);
//    stage.setTitle("Hello!");
//    stage.setScene(scene);
//    stage.show();
//    }
//
//    @Override
//    public void handle(ActionEvent actionEvent) {
//        if(actionEvent.getSource()==button) {
//            System.out.println("OOOOOoooooooooooo");
//        }
//
//    }
//
//    public static void main(String[] args) {
//        launch();
//    }
//}