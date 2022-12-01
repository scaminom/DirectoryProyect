package Main;

import java.util.ArrayList;

public class BusinessContact extends Contact {
    private String businessName;
    public BusinessContact(String firstName, String lastName, String phoneNumber, String businessName){
        super(firstName, lastName, phoneNumber);
        this.businessName = businessName;
    }
    @Override
    public String toString() {
        return "$ Nombre = " + firstName + " | Apellido = " + lastName + " | Numero = " + phoneNumber + " | Negocio = " +businessName;
    }
}
