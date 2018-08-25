package edu.hunau.love.pojo;

public class Image {
    private String id;

    private String imageUsername;

    private String imageImage;

    private String imageIntroduce;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getImageUsername() {
        return imageUsername;
    }

    public void setImageUsername(String imageUsername) {
        this.imageUsername = imageUsername == null ? null : imageUsername.trim();
    }

    public String getImageImage() {
        return imageImage;
    }

    public void setImageImage(String imageImage) {
        this.imageImage = imageImage == null ? null : imageImage.trim();
    }

    public String getImageIntroduce() {
        return imageIntroduce;
    }

    public void setImageIntroduce(String imageIntroduce) {
        this.imageIntroduce = imageIntroduce == null ? null : imageIntroduce.trim();
    }
}