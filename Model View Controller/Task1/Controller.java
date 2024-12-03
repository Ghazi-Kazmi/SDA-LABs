/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1;

import model.Model;
import view.View;

/**
 *
 * @author fa22-bse-082
 */
public class Controller {
 private Model model;
 private View view;
 public Controller(Model model, View view) {
 this.model = model;
 this.view = view;
 }
 public void setData(String data) {
 setData(data);
 }
 public String getData() {
 return getData();
 }
 public void updateView() {
 view.printData(getData());
 }
}