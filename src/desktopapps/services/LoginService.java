/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopapps.services;

import desktopapps.models.User;
import desktopapps.views.ILoginView;
import java.util.ArrayList;

/**
 *
 * @author Aldi
 */
public class LoginService {
    User  pelanggan = new User();
    User  karyawan = new User();
    ArrayList<User> users = new ArrayList<>();
    private ILoginView view;
    
    public LoginService(ILoginView view){
        this.view = view;
    }
    
//    public LoginService(ILoginView view, User newUser){
//        this.view = view;
//        this.users.add(newUser);
//    }
    
    void inisialisasi(){
        pelanggan.setUsername("pel");
        pelanggan.setPassword("pel");
        pelanggan.setJenisUser("pelanggan");
        karyawan.setUsername("kar");
        karyawan.setPassword("kar");
        karyawan.setJenisUser("karyawan");
        users.add(pelanggan);
        users.add(karyawan);
    }
    
    public void doLogin(String username, String password){
        inisialisasi();
        int i;
        
        for(i = 0; i < users.size(); i++){
            String uname = users.get(i).getUsername();
            String pwd = users.get(i).getPassword();
            
            if(uname.equals(username) && pwd.equals(password)){
                if(users.get(i).getJenisUser().equals("karyawan")){
                    view.moveToHomeKaryawan();
                    break;
                }else{
                    view.moveToHomePelanggan();
                    break;
                }
             }
        }
        if(i+1 == users.size() + 1){
            view.showMessage("Username atau password salah");
        }
    }
    
}
