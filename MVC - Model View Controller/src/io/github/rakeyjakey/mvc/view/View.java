package io.github.rakeyjakey.mvc.view;

import io.github.rakeyjakey.mvc.model.Model;

import javax.swing.*;

/**
 * Created by Jake on 11/12/2014.
 */
public class View extends JFrame {

    private Model model;

    public View(Model model) {
        super("MVC Demonstration");
        this.model = model;
    }
}
