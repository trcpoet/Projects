package com.example.homework1;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class HW1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Mav Tunes");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(10);
        gridPane.setHgap(0);

        // Create column constraints
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(50);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(50);
        col2.setHgrow(Priority.ALWAYS);
        gridPane.getColumnConstraints().addAll(col1, col2);


        // User details labels and text fields
        Label nameLabel = new Label("Name");
        TextField nameField = new TextField();
        nameField.setAlignment(Pos.CENTER_RIGHT);  // Align text to right
        Label streetLabel = new Label("Street");
        TextField streetField = new TextField();
        streetField.setAlignment(Pos.CENTER_RIGHT);
        Label cityLabel = new Label("City");
        TextField cityField = new TextField();
        cityField.setAlignment(Pos.CENTER_RIGHT);
        Label stateLabel = new Label("State");
        TextField stateField = new TextField();
        stateField.setAlignment(Pos.CENTER_RIGHT);
        Label zipLabel = new Label("Zip");
        TextField zipField = new TextField();
        zipField.setAlignment(Pos.CENTER_RIGHT);

        // Product selection
        Label chooseOne = new Label("Choose One");
        CheckBox appCheckBox = new CheckBox("APP");
        CheckBox musicCheckBox = new CheckBox("MUSIC");
        ComboBox<String> musicTypeComboBox = new ComboBox<>();
        musicTypeComboBox.getItems().addAll("Rock", "Pop", "Classical", "Jazz");
        GridPane.setMargin(musicCheckBox, new Insets(0, 0, 0, 200));

        Label appTypeLabel = new Label("Type of App");
        RadioButton gameRadioButton = new RadioButton("Game");
        RadioButton productivityRadioButton = new RadioButton("Productivity");
        RadioButton educationRadioButton = new RadioButton("Education");
        ToggleGroup appToggleGroup = new ToggleGroup();
        gameRadioButton.setToggleGroup(appToggleGroup);
        productivityRadioButton.setToggleGroup(appToggleGroup);
        educationRadioButton.setToggleGroup(appToggleGroup);

        Label titleLabel = new Label("Enter Title");
        TextField titleField = new TextField();
        titleField.setAlignment(Pos.CENTER_RIGHT);
        Label datePurchasedLabel = new Label("Date Purchased");
        TextField datePurchasedField = new TextField();
        datePurchasedField.setAlignment(Pos.CENTER_RIGHT);
        Label accountNumberLabel = new Label("Account Number");
        TextField accountNumberField = new TextField();
        accountNumberField.setAlignment(Pos.CENTER_RIGHT);

        Button submitButton = new Button("SUBMIT");
        Button finishButton = new Button("FINISH");

        String roundBorderStyle = "-fx-border-color: grey;" +
                "-fx-border-radius: 20;" +
                "-fx-border-width: 1;" +
                "-fx-background-radius: 15;";

        submitButton.setStyle(roundBorderStyle);
        finishButton.setStyle(roundBorderStyle);

        HBox buttonBox = new HBox(10, submitButton, finishButton);
        buttonBox.setAlignment(Pos.BOTTOM_CENTER);
        GridPane.setHalignment(buttonBox, HPos.RIGHT);

        submitButton.setMaxWidth(Double.MAX_VALUE);
        finishButton.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(submitButton, Priority.ALWAYS);
        HBox.setHgrow(finishButton, Priority.ALWAYS);


        double textFieldWidth =400;
        nameField.setPrefWidth(textFieldWidth);
        streetField.setPrefWidth(textFieldWidth);
        cityField.setPrefWidth(textFieldWidth);
        stateField.setPrefWidth(textFieldWidth);
        zipField.setPrefWidth(textFieldWidth);
        titleField.setPrefWidth(textFieldWidth);
        datePurchasedField.setPrefWidth(textFieldWidth);
        accountNumberField.setPrefWidth(textFieldWidth);

        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameField, 1, 0);
        gridPane.add(streetLabel, 0, 1);
        gridPane.add(streetField, 1, 1);
        gridPane.add(cityLabel, 0, 2);
        gridPane.add(cityField, 1, 2);
        gridPane.add(stateLabel, 0, 3);
        gridPane.add(stateField, 1, 3);
        gridPane.add(zipLabel, 0, 4);
        gridPane.add(zipField, 1, 4);
        gridPane.add(chooseOne, 0, 5);
        gridPane.add(appCheckBox, 1, 5);
        gridPane.add(musicCheckBox, 1, 5);
        gridPane.add(new Label("Type of Music"), 0, 6);
        double comboBoxWidth = 400;
        musicTypeComboBox.setPrefWidth(comboBoxWidth);
        musicTypeComboBox.setPromptText("Choose One");
        gridPane.add(musicTypeComboBox, 1, 6);
        musicTypeComboBox.setMaxWidth(Double.MAX_VALUE);
        gridPane.add(appTypeLabel, 0, 7);
        HBox radioButtonBox = new HBox(70, gameRadioButton, productivityRadioButton, educationRadioButton);
        radioButtonBox.setPadding(new Insets(0, 0, 0, 0));
        radioButtonBox.setAlignment(Pos.CENTER_LEFT);

        gridPane.add(radioButtonBox, 1, 7, 3, 1);

        gridPane.add(titleLabel, 0, 8);
        gridPane.add(titleField, 1, 8);
        gridPane.add(datePurchasedLabel, 0, 9);
        gridPane.add(datePurchasedField, 1, 9);
        gridPane.add(accountNumberLabel, 0, 10);
        gridPane.add(accountNumberField, 1, 10);
        gridPane.add(buttonBox, 0, 11, 2, 1);



        Scene scene = new Scene(gridPane, 800, 420);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
