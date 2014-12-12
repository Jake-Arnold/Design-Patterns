package io.github.rakeyjakey.mvc;

import io.github.rakeyjakey.mvc.controller.Controller;
import io.github.rakeyjakey.mvc.model.Model;
import io.github.rakeyjakey.mvc.view.View;

import javax.swing.*;

/**
 * Created by Jake on 11/12/2014.
 */
public class Boot {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Boot::runApp);
    }


    public static void runApp() {
        Model model = new Model();
        View view = new View(model);

        Controller controller = new Controller(model, view);
    }
}
