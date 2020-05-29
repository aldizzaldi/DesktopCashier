/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopapps.services;

import desktopapps.models.Item;
import desktopapps.views.IItemView;
import java.util.ArrayList;

/**
 *
 * @author Aldi
 */
public class ItemService {
    private IItemView view;
    

    public ItemService(IItemView view) {
        this.view = view;
    }

    public void addItem(Item itemBaru) {
         view.moveToTransaction(itemBaru);
    }
}
