package Main;

import javax.swing.*;
import java.util.ArrayList;

public class BusinessContact extends Contact {
    private String businessName;

    public BusinessContact(){}
    public BusinessContact(String firstName, String lastName, String phoneNumber, String businessName){
        super(firstName, lastName, phoneNumber);
        this.businessName = businessName;
    }
    public String getBusinessName() {
        return businessName;
    }
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }
    @Override
    public String toString() {
        return "$" + " Nombre = " + firstName + " | Apellido = " + lastName + " | Numero = " + phoneNumber + " | Negocio = " +businessName;
    }
}
