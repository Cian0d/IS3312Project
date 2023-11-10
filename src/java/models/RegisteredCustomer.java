package models;

/* This is the model extending the user class, setting the attributes for registered customer */
public class RegisteredCustomer extends User {
    private String address;

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public RegisteredCustomer(String address, int UserID, String fName, String lName, String email, String pWord, String uType) {
        super(UserID, fName, lName, email, pWord, uType);
        this.address = address;
    }
    
}
