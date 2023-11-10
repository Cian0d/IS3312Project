package models;

/* This is the model extending the user class, setting the attributes for admin */
public class Admin extends User {
    private String clearanceLevel;

    /**
     * @return the clearanceLevel
     */
    public String getClearanceLevel() {
        return clearanceLevel;
    }

    /**
     * @param clearanceLevel the clearanceLevel to set
     */
    public void setClearanceLevel(String clearanceLevel) {
        this.clearanceLevel = clearanceLevel;
    }

    public Admin(String clearanceLevel, int UserID, String fName, String lName, String email, String pWord, String uType) {
        super(UserID, fName, lName, email, pWord, uType);
        this.clearanceLevel = clearanceLevel;
    }
    
}
