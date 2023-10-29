package mp2_brcherry;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class NHLStatsBarChartJavaFX extends Application {

    @Override
    public void start(Stage stage) {
        try {
            System.out.println("Current Working Directory: " + System.getProperty("user.dir"));

            // Load the file from the resources folder using class loader
            InputStream inputStream = getClass().getResourceAsStream("/resources/mp3_hockey_stats.csv");

            if (inputStream != null) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

                ObservableList<XYChart.Data<Number, String>> data = FXCollections.observableArrayList();

                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    String team = parts[0].trim();
                    int goals = Integer.parseInt(parts[1].trim());
                    data.add(new XYChart.Data<>(goals, team));
                }

                BarChart<Number, String> barChart = new BarChart<>(new NumberAxis(), new CategoryAxis());
                barChart.setTitle("NHL Team Goals (2018-19 Season)");

                XYChart.Series<Number, String> series = new XYChart.Series<>(data);
                barChart.getData().add(series);

                Scene scene = new Scene(barChart, 800, 600);
                stage.setScene(scene);
                stage.setTitle("NHL Stats Bar Chart");
                stage.show();

            } else {
                System.err.println("InputStream is null. File not found.");
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

