package com.spring.cold.pojo;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class DpRole implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dp_role.id
     *
     * @mbggenerated Wed Jun 10 16:48:53 GMT+08:00 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dp_role.name
     *
     * @mbggenerated Wed Jun 10 16:48:53 GMT+08:00 2020
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dp_role
     *
     * @mbggenerated Wed Jun 10 16:48:53 GMT+08:00 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dp_role.id
     *
     * @return the value of dp_role.id
     *
     * @mbggenerated Wed Jun 10 16:48:53 GMT+08:00 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dp_role.id
     *
     * @param id the value for dp_role.id
     *
     * @mbggenerated Wed Jun 10 16:48:53 GMT+08:00 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dp_role.name
     *
     * @return the value of dp_role.name
     *
     * @mbggenerated Wed Jun 10 16:48:53 GMT+08:00 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dp_role.name
     *
     * @param name the value for dp_role.name
     *
     * @mbggenerated Wed Jun 10 16:48:53 GMT+08:00 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dp_role
     *
     * @mbggenerated Wed Jun 10 16:48:53 GMT+08:00 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}