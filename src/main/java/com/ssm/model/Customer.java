package com.ssm.model;

public class Customer {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.id
     *
     * @mbg.generated Fri Mar 16 17:08:06 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.name
     *
     * @mbg.generated Fri Mar 16 17:08:06 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.phone
     *
     * @mbg.generated Fri Mar 16 17:08:06 CST 2018
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.level
     *
     * @mbg.generated Fri Mar 16 17:08:06 CST 2018
     */
    private String level;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.location
     *
     * @mbg.generated Fri Mar 16 17:08:06 CST 2018
     */
    private String location;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.status
     *
     * @mbg.generated Fri Mar 16 17:08:06 CST 2018
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.remark
     *
     * @mbg.generated Fri Mar 16 17:08:06 CST 2018
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.id
     *
     * @return the value of customer.id
     *
     * @mbg.generated Fri Mar 16 17:08:06 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.id
     *
     * @param id the value for customer.id
     *
     * @mbg.generated Fri Mar 16 17:08:06 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.name
     *
     * @return the value of customer.name
     *
     * @mbg.generated Fri Mar 16 17:08:06 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.name
     *
     * @param name the value for customer.name
     *
     * @mbg.generated Fri Mar 16 17:08:06 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.phone
     *
     * @return the value of customer.phone
     *
     * @mbg.generated Fri Mar 16 17:08:06 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.phone
     *
     * @param phone the value for customer.phone
     *
     * @mbg.generated Fri Mar 16 17:08:06 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.level
     *
     * @return the value of customer.level
     *
     * @mbg.generated Fri Mar 16 17:08:06 CST 2018
     */
    public String getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.level
     *
     * @param level the value for customer.level
     *
     * @mbg.generated Fri Mar 16 17:08:06 CST 2018
     */
    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.location
     *
     * @return the value of customer.location
     *
     * @mbg.generated Fri Mar 16 17:08:06 CST 2018
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.location
     *
     * @param location the value for customer.location
     *
     * @mbg.generated Fri Mar 16 17:08:06 CST 2018
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.status
     *
     * @return the value of customer.status
     *
     * @mbg.generated Fri Mar 16 17:08:06 CST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.status
     *
     * @param status the value for customer.status
     *
     * @mbg.generated Fri Mar 16 17:08:06 CST 2018
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.remark
     *
     * @return the value of customer.remark
     *
     * @mbg.generated Fri Mar 16 17:08:06 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.remark
     *
     * @param remark the value for customer.remark
     *
     * @mbg.generated Fri Mar 16 17:08:06 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}