module tse.lawrence.sudoku {
    requires javafx.controls;
    requires javafx.fxml;


    opens tse.lawrence.sudoku to javafx.fxml;
    exports tse.lawrence.sudoku;
    exports tse.lawrence.sudoku.app;
    opens tse.lawrence.sudoku.app to javafx.fxml;
    exports tse.lawrence.sudoku.configs;
    opens tse.lawrence.sudoku.configs to javafx.fxml;
}