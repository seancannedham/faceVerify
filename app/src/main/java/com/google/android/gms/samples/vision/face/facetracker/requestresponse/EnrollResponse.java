package com.google.android.gms.samples.vision.face.facetracker.requestresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;


/**
 * Created by HareshChaudhary on 2017-04-11
 */

public class EnrollResponse implements Serializable {

    @SerializedName("images")
    @Expose
    private List<Image> images = null;

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    //-----------------------------------com.example.Attributes.java-----------------------------------
    public class Attributes implements Serializable {

        @SerializedName("lips")
        @Expose
        private String lips;
        @SerializedName("asian")
        @Expose
        private String asian;
        @SerializedName("gender")
        @Expose
        private Gender gender;
        @SerializedName("age")
        @Expose
        private Integer age;
        @SerializedName("hispanic")
        @Expose
        private String hispanic;
        @SerializedName("other")
        @Expose
        private String other;
        @SerializedName("black")
        @Expose
        private String black;
        @SerializedName("white")
        @Expose
        private String white;
        @SerializedName("glasses")
        @Expose
        private String glasses;

        public String getLips() {
            return lips;
        }

        public void setLips(String lips) {
            this.lips = lips;
        }

        public String getAsian() {
            return asian;
        }

        public void setAsian(String asian) {
            this.asian = asian;
        }

        public Gender getGender() {
            return gender;
        }

        public void setGender(Gender gender) {
            this.gender = gender;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getHispanic() {
            return hispanic;
        }

        public void setHispanic(String hispanic) {
            this.hispanic = hispanic;
        }

        public String getOther() {
            return other;
        }

        public void setOther(String other) {
            this.other = other;
        }

        public String getBlack() {
            return black;
        }

        public void setBlack(String black) {
            this.black = black;
        }

        public String getWhite() {
            return white;
        }

        public void setWhite(String white) {
            this.white = white;
        }

        public String getGlasses() {
            return glasses;
        }

        public void setGlasses(String glasses) {
            this.glasses = glasses;
        }

    }

//-----------------------------------com.example.Gender.java-----------------------------------


    public class Gender  implements Serializable {

        @SerializedName("type")
        @Expose
        private String type;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

    }
//-----------------------------------com.example.Image.java-----------------------------------

    public class Image implements Serializable {

        @SerializedName("attributes")
        @Expose
        private Attributes attributes;
        @SerializedName("transaction")
        @Expose
        private Transaction transaction;

        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }

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
        @SerializedName("topLeftX")
        @Expose
        private Integer topLeftX;
        @SerializedName("topLeftY")
        @Expose
        private Integer topLeftY;
        @SerializedName("gallery_name")
        @Expose
        private String gallery_name;
        @SerializedName("timestamp")
        @Expose
        private String timestamp;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("quality")
        @Expose
        private Double quality;
        @SerializedName("confidence")
        @Expose
        private Double confidence;
        @SerializedName("subject_id")
        @Expose
        private String subject_id;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("face_id")
        @Expose
        private Integer face_id;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
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

        public String getGallery_name() {
            return gallery_name;
        }

        public void setGallery_name(String gallery_name) {
            this.gallery_name = gallery_name;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public Double getQuality() {
            return quality;
        }

        public void setQuality(Double quality) {
            this.quality = quality;
        }

        public Double getConfidence() {
            return confidence;
        }

        public void setConfidence(Double confidence) {
            this.confidence = confidence;
        }

        public String getSubject_id() {
            return subject_id;
        }

        public void setSubject_id(String subject_id) {
            this.subject_id = subject_id;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getFace_id() {
            return face_id;
        }

        public void setFace_id(Integer face_id) {
            this.face_id = face_id;
        }

    }
}
