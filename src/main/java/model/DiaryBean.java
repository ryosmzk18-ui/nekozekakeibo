package model;

import java.io.Serializable;
import java.sql.Date;

public class DiaryBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private int userId;
    private Date date;
    private byte[] photo;
    private String content;
    // private boolean mode; // false:個人, true:共有
    private boolean isShare; // ★追加：共有フラグ (true:共有 / false:非共有)

    public DiaryBean() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isMode() {
        return mode;
    }

    public boolean getMode() {
        return mode;
    }

    public void setMode(boolean mode) {
        this.mode = mode;
    }
    // ★追加：共有フラグを取得する
    public boolean isShare() {
        return isShare;
    }

    // ★追加：共有フラグを設定する
    public void setShare(boolean isShare) {
    this.isShare = isShare;
    }
}
