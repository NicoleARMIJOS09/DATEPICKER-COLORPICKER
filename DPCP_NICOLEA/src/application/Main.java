package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.time.LocalDate;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("DatePicker & ColorPicker Example");

        // Etiquetas
        Label dateLabel = new Label("Selecciona una fecha:");
        Label colorLabel = new Label("Selecciona un color:");
        Label outputLabel = new Label();

        // DatePicker
        DatePicker datePicker = new DatePicker();

        // ColorPicker
        ColorPicker colorPicker = new ColorPicker();

        // Botón
        Button submitButton = new Button("Confirmar");

        // Acción del botón
        submitButton.setOnAction(e -> {
            LocalDate selectedDate = datePicker.getValue();
            String selectedColor = colorPicker.getValue().toString();
            outputLabel.setText("Fecha seleccionada: " + selectedDate + ", Color seleccionado: " + selectedColor);
        });

        // Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));
        layout.getChildren().addAll(dateLabel, datePicker, colorLabel, colorPicker, submitButton, outputLabel);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

