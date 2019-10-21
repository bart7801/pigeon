package com.uk.javalon1.bart.springbootdbtwitter;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

@Route("pigeons")
public class PigeonView extends HorizontalLayout {
    private PigeonRepo pigeonRepo;

    public PigeonView(PigeonRepo pigeonRepo) {
        this.pigeonRepo = pigeonRepo;
        Grid<Pigeon> grid = new Grid<>(Pigeon.class);
        grid.setItems(pigeonRepo.findAll());
        add(grid);
    }
}
