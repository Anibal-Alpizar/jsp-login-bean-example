/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.sun.net.httpserver.HttpServer;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author anibal
 */
public class BeanIngreso {

    String user = "";
    String password = "";
    String page = "";

    public String getUser() {
        return user;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public void setUser(String User) {
        this.user = User;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String Password) {
        this.password = Password;
    }

    public String getMessage() {
        if (user.equals("1")) {
            page = "./Mantenimiento.xhtml";
        } else {
            page = "./index.html";
        }
        return page;
    }

    public void clean() {
        user = "";
        password = "";
    }

    public String login() {
        if (user.equals("1")) {
            page = "Mantenimiento.xhtml";
        } else {
            page = "index.html";
        }
        return page;
    }
}
