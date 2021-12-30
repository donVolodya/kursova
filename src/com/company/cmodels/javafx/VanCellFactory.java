package com.company.cmodels.javafx;

import com.company.cmodels.Van;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class VanCellFactory implements Callback<ListView<Van>, ListCell<Van>> {
    @Override
    public ListCell<Van> call(ListView<Van> coffeeListView) {
        return new VanCell();
    }
}
