package com.company.cmodels.javafx;

import com.company.cmodels.Coffee;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class CoffeeCellFactory implements Callback<ListView<Coffee>, ListCell<Coffee>>  {
    @Override
    public ListCell<Coffee> call(ListView<Coffee> coffeeListView) {
        return new CoffeeCell();
    }
}
