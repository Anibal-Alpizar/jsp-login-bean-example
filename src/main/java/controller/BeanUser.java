/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.LinkedList;
import javax.faces.model.SelectItem;
import javax.swing.text.html.CSS;
import model.MaritalStatusModel;
import model.ProvincesModel;

/**
 *
 * @author anibal
 */
public class BeanUser {

    String id, name, message, ageResult, requestMaritalStatus, requestProvinces;
    int age = 0, salary = 0;

    LinkedList<SelectItem> listMaritalStatus = new LinkedList();
    LinkedList<SelectItem> listProvinces = new LinkedList();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAgeResult() {
        return ageResult;
    }

    public void setAgeResult(String ageResult) {
        this.ageResult = ageResult;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getRequestMaritalStatus() {
        return requestMaritalStatus;
    }

    public void setRequestMaritalStatus(String requestMaritalStatus) {
        this.requestMaritalStatus = requestMaritalStatus;
    }

    public String getRequestProvinces() {
        return requestProvinces;
    }

    public void setRequestProvinces(String requestProvinces) {
        this.requestProvinces = requestProvinces;
    }

    public LinkedList<SelectItem> getListMaritalStatus() {

        MaritalStatusModel objMaritalStatusModel = new MaritalStatusModel();
        return objMaritalStatusModel.readMaritalStatus();
    }

    public LinkedList<SelectItem> getListProvinces() {

        ProvincesModel objProvincesModel = new ProvincesModel();
        return objProvincesModel.readProvinces();
    }

    public void print() {
        ageResult = (age >= 18) ? "Mayor de edad" : "Menor de edad";

        int ccss = (int) (salary * 0.09);
        int association = (int) (salary * 0.05);

        if (!id.isEmpty() && !name.isEmpty() && age > 0 && salary > 0) {
            this.message = "Cedula: " + id + "\n" + "Nombre: " + name + "\n" + "Edad: " + ageResult + "\n" + "Estado civil: "
                    + requestMaritalStatus + "\n" + "Salario:" + salary + "\n" + "CCSS: " + ccss + "\n" + "asosiacion: "
                    + association + "\n" + "Direccion: " + requestProvinces;
        } else {
            message = "Debe llenar todos los campos";
        }
    }

    public void clear() {
        id = "";
        name = "";
        age = 0;
        salary = 0;
        message = "";
        ageResult = "";
        requestMaritalStatus = "";
        requestProvinces = "";
    }
}
