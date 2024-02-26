package tse.lawrence.sudoku.containers;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import tse.lawrence.sudoku.components.ClickableLabel;
import tse.lawrence.sudoku.components.CustomLabel;

import static tse.lawrence.sudoku.configs.AppConfig.CORNER_RADII;
import static tse.lawrence.sudoku.configs.AppConfig.SPACING;

public class DifficultyMenu extends HBox
{
    public DifficultyMenu()
    {
        initLayout();
        initComponents();
    }

    public void initLayout()
    {
        setAlignment(Pos.CENTER_LEFT);
        setSpacing(SPACING);
    }

    public void initComponents()
    {
        getChildren().addAll(
            new CustomLabel("Difficulty:"),
            new ClickableLabel("Easy", Color.LIGHTGRAY, new CornerRadii(CORNER_RADII), new Insets(SPACING)),
            new ClickableLabel("Medium", Color.LIGHTGRAY, new CornerRadii(CORNER_RADII), new Insets(SPACING)),
            new ClickableLabel("Hard", Color.LIGHTGRAY, new CornerRadii(CORNER_RADII), new Insets(SPACING))
        );
    }
}
