package tse.lawrence.sudoku.containers;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import tse.lawrence.sudoku.components.CellComponent;
import tse.lawrence.sudoku.data.Cell;

public class CellContainer extends GridPane
{
    public CellContainer()
    {
        initLayout();
        initComponents();
    }

    private void initLayout()
    {
        for (int i = 0; i < 9; i++)
        {
            RowConstraints row = new RowConstraints();
            row.setPrefHeight(Cell.SIZE);
            row.setVgrow(Priority.ALWAYS);

            ColumnConstraints col = new ColumnConstraints();
            col.setPrefWidth(Cell.SIZE);
            col.setHgrow(Priority.ALWAYS);

            getRowConstraints().add(row);
            getColumnConstraints().add(col);
        }
    }

    private void initComponents()
    {
        for (int r = 0; r < 9; r++)
        {
            for (int c = 0; c < 9; c++)
            {
                CellComponent cellComponent = new CellComponent(r, c);
                add(cellComponent, c, r);
            }
        }
    }
}
