package org.wzeiri.zr.zrtaxiplatform.bean;

/**
 * @author k-lm on 2018/1/2.
 */

public class AgreementBean {

    /**
     * title : string
     * code : string
     * content : string
     * id : 0
     */

    private String title;
    private String code;
    private String content;
    private int id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}