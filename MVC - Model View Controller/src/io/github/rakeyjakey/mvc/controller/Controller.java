package io.github.rakeyjakey.mvc.controller;

import io.github.rakeyjakey.mvc.model.Model;
import io.github.rakeyjakey.mvc.view.View;

/**
 * Created by Jake on 11/12/2014.
 */
public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
}
