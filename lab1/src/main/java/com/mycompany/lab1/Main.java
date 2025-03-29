/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import controller.AppController;
import model.DataModel;
import view.AppView;


public class Main {

    public static void main(String[] args) {
         DataModel model = new DataModel();
          AppView view = new AppView();
          AppController controller = new AppController(view, model);
          view.setVisible(true);
    }
}
