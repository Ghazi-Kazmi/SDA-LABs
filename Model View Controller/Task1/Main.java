/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1;

import view.View;
import controller.Controller;
import model.Model;

/**
 *
 * @author fa22-bse-082
 */
public class Main {
 public static void main(String[] args) {
    // Create the model, view, and controller
    Model model = new Model();
    View view = new View();
    Controller controller = new Controller(model, view);
    // Set the data and update the view
    controller.setData("Hello, MVC!");
    controller.updateView();
    }
   }

