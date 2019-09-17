package co.lindj.dubbo.enums;

public enum DemoEnum {

    /**
     * demo
     */
    DEMO(1, "demo");

    private Integer code;
    private String title;

    DemoEnum(Integer code, String title) {
        this.code = code;
        this.title = title;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
