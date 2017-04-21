package com.google.android.gms.samples.vision.face.facetracker.requestresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by rbc on 2017-04-11.
 */

public class VerifyResponse implements Serializable {

    @SerializedName("images")
    @Expose
    private List<Image> images = null;

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    //-----------------------------------com.example.Image.java-----------------------------------

    public class Image implements Serializable {

        @SerializedName("transaction")
        @Expose
        private Transaction transaction;

        public Transaction getTransaction() {
            return transaction;
        }

        public void setTransaction(Transaction transaction) {
            this.transaction = transaction;
        }

    }
    //-----------------------------------com.example.Transaction.java-----------------------------------

    public class Transaction implements Serializable {

        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("subject_id")
        @Expose
        private String subject_id;
        @SerializedName("quality")
        @Expose
        private Double quality;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("topLeftX")
        @Expose
        private Integer topLeftX;
        @SerializedName("topLeftY")
        @Expose
        private Integer topLeftY;
        @SerializedName("confidence")
        @Expose
        private Double confidence;
        @SerializedName("gallery_name")
        @Expose
        private String gallery_name;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getSubject_id() {
            return subject_id;
        }

        public void setSubject_id(String subject_id) {
            this.subject_id = subject_id;
        }

        public Double getQuality() {
            return quality;
        }

        public void setQuality(Double quality) {
            this.quality = quality;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public Integer getTopLeftX() {
            return topLeftX;
        }

        public void setTopLeftX(Integer topLeftX) {
            this.topLeftX = topLeftX;
        }

        public Integer getTopLeftY() {
            return topLeftY;
        }

        public void setTopLeftY(Integer topLeftY) {
            this.topLeftY = topLeftY;
        }

        public Double getConfidence() {
            return confidence;
        }

        public void setConfidence(Double confidence) {
            this.confidence = confidence;
        }

        public String getGallery_name() {
            return gallery_name;
        }

        public void setGallery_name(String gallery_name) {
            this.gallery_name = gallery_name;
        }

    }

}
