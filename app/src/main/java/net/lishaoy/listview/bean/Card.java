package net.lishaoy.listview.bean;

public class Card {
    private int id;
    private int imgId;
    private String title;
    private String content;
    private boolean isLongImg;

    public Card() {
    }

    public Card(int id, int imgId, String title, String content, boolean isLongImg) {
        this.id = id;
        this.imgId = imgId;
        this.title = title;
        this.content = content;
        this.isLongImg = isLongImg;
    }

    public boolean isLongImg() {
        return isLongImg;
    }

    public void setLongImg(boolean longImg) {
        isLongImg = longImg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
