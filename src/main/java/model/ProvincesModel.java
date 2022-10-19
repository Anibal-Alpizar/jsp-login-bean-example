/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.LinkedList;
import javax.faces.model.SelectItem;

/**
 *
 * @author anibal
 */
public class ProvincesModel {

    LinkedList list = new LinkedList();

    public LinkedList<SelectItem> readProvinces() {

        list.add(new SelectItem("San José"));
        list.add(new SelectItem("Alajuela"));
        list.add(new SelectItem("Cartago"));
        list.add(new SelectItem("Heredia"));
        list.add(new SelectItem("Guanacaste"));
        list.add(new SelectItem("Puntarenas"));
        list.add(new SelectItem("Limón"));

        return list;
    }

}
