package com.example.mobileventesauxencheres.models;

import java.io.Serializable;

public class ApiFields implements Serializable {
    private String _id;
    private String title;
    private String price;
    private String description;
    private String image;
    private String dateStart;
    private String dateEnd;
    private ApiCategory category;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() { return image; }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public ApiCategory getCategory() {
        return category;
    }

    public void setCategory(ApiCategory category) {
        this.category = category;
    }
}
