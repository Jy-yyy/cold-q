package com.spring.cold.pojo;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class DpUser implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dp_user.id
     *
     * @mbggenerated Tue Jun 09 16:26:03 GMT+08:00 2020
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dp_user.name
     *
     * @mbggenerated Tue Jun 09 16:26:03 GMT+08:00 2020
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dp_user.account
     *
     * @mbggenerated Tue Jun 09 16:26:03 GMT+08:00 2020
     */
    private String account;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dp_user.password
     *
     * @mbggenerated Tue Jun 09 16:26:03 GMT+08:00 2020
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dp_user
     *
     * @mbggenerated Tue Jun 09 16:26:03 GMT+08:00 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dp_user.id
     *
     * @return the value of dp_user.id
     *
     * @mbggenerated Tue Jun 09 16:26:03 GMT+08:00 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dp_user.id
     *
     * @param id the value for dp_user.id
     *
     * @mbggenerated Tue Jun 09 16:26:03 GMT+08:00 2020
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dp_user.name
     *
     * @return the value of dp_user.name
     *
     * @mbggenerated Tue Jun 09 16:26:03 GMT+08:00 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dp_user.name
     *
     * @param name the value for dp_user.name
     *
     * @mbggenerated Tue Jun 09 16:26:03 GMT+08:00 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dp_user.account
     *
     * @return the value of dp_user.account
     *
     * @mbggenerated Tue Jun 09 16:26:03 GMT+08:00 2020
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dp_user.account
     *
     * @param account the value for dp_user.account
     *
     * @mbggenerated Tue Jun 09 16:26:03 GMT+08:00 2020
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dp_user.password
     *
     * @return the value of dp_user.password
     *
     * @mbggenerated Tue Jun 09 16:26:03 GMT+08:00 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dp_user.password
     *
     * @param password the value for dp_user.password
     *
     * @mbggenerated Tue Jun 09 16:26:03 GMT+08:00 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dp_user
     *
     * @mbggenerated Tue Jun 09 16:26:03 GMT+08:00 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", account=").append(account);
        sb.append(", password=").append(password);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}