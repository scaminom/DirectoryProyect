package PhoneBook;

public abstract class Contact {
    protected String typeContact;
    protected String firstName;
    protected String lastName;
    protected String phoneNumber;

    protected String csvDelimeter = ",";

    public Contact() {
    }

    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getTypeContact() {
        return typeContact;
    }

    public void setTypeContact(String typeContact) {
        this.typeContact = typeContact;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean matchByName(String query){
        return this.firstName.contains(query) || this.lastName.contains(query);
    }

    public boolean searchByPhone(String query){
        return this.phoneNumber.contains(query);
    }

    public abstract String toString();

    public abstract String toCSV();

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Contact other = (Contact) o;
        return this.firstName.equals(other.getFirstName()) && this.lastName.equals(other.getLastName()) && this.phoneNumber.equals(other.getPhoneNumber());
    }
}