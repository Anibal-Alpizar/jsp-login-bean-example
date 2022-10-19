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
public class MaritalStatusModel {

    LinkedList list = new LinkedList();

    public LinkedList<SelectItem> readMaritalStatus() {
        list.add(new SelectItem("Soltero"));
        list.add(new SelectItem("Casado"));
        list.add(new SelectItem("Divorciado"));
        list.add(new SelectItem("Viudo"));
        return list;
    }

}
