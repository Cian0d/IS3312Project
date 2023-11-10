package models;

/* This is the model concerned with setting the attributes for the poster products */
public class Poster {
    private long posterID;
    private String posterName;
    private String posterDescription;
    private String posterType;
    private String posterSize;
    private String posterMaterial;
    private String posterAge;
    private String posterPrice;
    private String posterImage;

    
    public Poster(){
        
    }
    /**
     * @return the posterID
     */
    public long getPosterID() {
        return posterID;
    }

    /**
     * @param posterID the posterID to set
     */
    public void setPosterID(long posterID) {
        this.posterID = posterID;
    }

    /**
     * @return the posterName
     */
    public String getPosterName() {
        return posterName;
    }

    /**
     * @param posterName the posterName to set
     */
    public void setPosterName(String posterName) {
        this.posterName = posterName;
    }

    /**
     * @return the posterDescription
     */
    public String getPosterDescription() {
        return posterDescription;
    }

    /**
     * @param posterDescription the posterDescription to set
     */
    public void setPosterDescription(String posterDescription) {
        this.posterDescription = posterDescription;
    }

    /**
     * @return the posterType
     */
    public String getPosterType() {
        return posterType;
    }

    /**
     * @param posterType the posterType to set
     */
    public void setPosterType(String posterType) {
        this.posterType = posterType;
    }

    /**
     * @return the posterSize
     */
    public String getPosterSize() {
        return posterSize;
    }

    /**
     * @param posterSize the posterSize to set
     */
    public void setPosterSize(String posterSize) {
        this.posterSize = posterSize;
    }

    /**
     * @return the posterMaterial
     */
    public String getPosterMaterial() {
        return posterMaterial;
    }

    /**
     * @param posterMaterial the posterMaterial to set
     */
    public void setPosterMaterial(String posterMaterial) {
        this.posterMaterial = posterMaterial;
    }

    /**
     * @return the posterAge
     */
    public String getPosterAge() {
        return posterAge;
    }

    /**
     * @param posterAge the posterAge to set
     */
    public void setPosterAge(String posterAge) {
        this.posterAge = posterAge;
    }

    /**
     * @return the posterPrice
     */
    public String getPosterPrice() {
        return posterPrice;
    }

    /**
     * @param posterPrice the posterPrice to set
     */
    public void setPosterPrice(String posterPrice) {
        this.posterPrice = posterPrice;
    }

    /**
     * @return the posterImage
     */
    public String getPosterImage() {
        return posterImage;
    }

    /**
     * @param posterImage the posterImage to set
     */
    public void setPosterImage(String posterImage) {
        this.posterImage = posterImage;
    }

    public Poster(int posterID, String posterName, String posterDescription, String posterType, String posterSize, String posterMaterial, String posterAge, String posterPrice, String posterImage) {
        this.posterID = posterID;
        this.posterName = posterName;
        this.posterDescription = posterDescription;
        this.posterType = posterType;
        this.posterSize = posterSize;
        this.posterMaterial = posterMaterial;
        this.posterAge = posterAge;
        this.posterPrice = posterPrice;
        this.posterImage = posterImage;
    }

 
    
}
