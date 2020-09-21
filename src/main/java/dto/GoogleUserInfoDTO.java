package dto;

public class GoogleUserInfoDTO {

   private  String googleId;

   private String name;

   private String email;

   private String imageUrl;

    public GoogleUserInfoDTO() {
    }

    public GoogleUserInfoDTO(String googleId, String name, String email, String imageUrl) {
        this.googleId = googleId;
        this.name = name;
        this.email = email;
        this.imageUrl = imageUrl;
    }

    public String getGoogleId() {
        return googleId;
    }

    public void setGoogleId(String googleId) {
        this.googleId = googleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
