package tse.lawrence.sudoku.app;

import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import tse.lawrence.sudoku.containers.CellContainer;
import tse.lawrence.sudoku.containers.DifficultyMenu;
import tse.lawrence.sudoku.containers.GameToolContainer;
import tse.lawrence.sudoku.utils.StyleUtils;

import static tse.lawrence.sudoku.configs.AppConfig.SPACING;

public class Sudoku extends HBox
{
    public Sudoku()
    {
        initLayout();
        initComponents();
    }

    private void initLayout()
    {
        setPadding(new Insets(SPACING));
        setSpacing(SPACING);
    }

    private void initComponents()
    {
        DifficultyMenu difficultyMenu = new DifficultyMenu();
        StyleUtils.setBackground(difficultyMenu, Color.AQUA);

        CellContainer cellContainer = new CellContainer();

        VBox vBox = new VBox(difficultyMenu, cellContainer);

        GameToolContainer gameToolContainer = new GameToolContainer();

        getChildren().addAll(vBox, gameToolContainer);
    }
}
