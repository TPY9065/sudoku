package tse.lawrence.sudoku;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import tse.lawrence.sudoku.configs.AppConfig;
import tse.lawrence.sudoku.app.Sudoku;

public class MainApplication extends Application
{
    @Override
    public void start(Stage stage)
    {
        Scene scene = new Scene(new Sudoku(), AppConfig.APP_WIDTH, AppConfig.APP_HEIGHT);
        stage.setTitle("Sudoku");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch();
    }
}