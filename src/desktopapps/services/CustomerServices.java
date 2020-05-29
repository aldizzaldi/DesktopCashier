/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopapps.services;

import desktopapps.views.ICustomerServiceView;

/**
 *
 * @author Aldi
 */
public class CustomerServices {
    private ICustomerServiceView view;
    
    public CustomerServices(ICustomerServiceView view){
        this.view = view;
    }
    
    public void addItem(){
        view.moveToAddItem();
    }
    
    public void pay(){
        view.pay();
    }
    
    public void logOut(){
        view.moveToLogin();
    }
    
}
