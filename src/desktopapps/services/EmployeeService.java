/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopapps.services;

import desktopapps.views.IEmployeeView;


/**
 *
 * @author Aldi
 */
public class EmployeeService {
    private IEmployeeView view;

    public EmployeeService(IEmployeeView view) {
        this.view = view;
    }
    
    public void addTransaction(){
        view.addToCustomer();
    }
    
    public void logOut(){
        view.moveToLogin();
    }
}
