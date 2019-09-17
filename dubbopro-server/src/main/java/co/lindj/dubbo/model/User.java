package co.lindj.dubbo.model;

/**
 * @author lindj
 * @date 2018/5/4 15:27
 * @description
 */
public class User {
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}