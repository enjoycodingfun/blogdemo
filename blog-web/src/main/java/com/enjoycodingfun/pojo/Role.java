package com.enjoycodingfun.pojo;

public class Role {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.role_name
     *
     * @mbggenerated
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.role_value
     *
     * @mbggenerated
     */
    private String roleValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.role_matcher
     *
     * @mbggenerated
     */
    private String roleMatcher;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.enabled
     *
     * @mbggenerated
     */
    private String enabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.id
     *
     * @return the value of role.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.id
     *
     * @param id the value for role.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.role_name
     *
     * @return the value of role.role_name
     *
     * @mbggenerated
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.role_name
     *
     * @param roleName the value for role.role_name
     *
     * @mbggenerated
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.role_value
     *
     * @return the value of role.role_value
     *
     * @mbggenerated
     */
    public String getRoleValue() {
        return roleValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.role_value
     *
     * @param roleValue the value for role.role_value
     *
     * @mbggenerated
     */
    public void setRoleValue(String roleValue) {
        this.roleValue = roleValue == null ? null : roleValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.role_matcher
     *
     * @return the value of role.role_matcher
     *
     * @mbggenerated
     */
    public String getRoleMatcher() {
        return roleMatcher;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.role_matcher
     *
     * @param roleMatcher the value for role.role_matcher
     *
     * @mbggenerated
     */
    public void setRoleMatcher(String roleMatcher) {
        this.roleMatcher = roleMatcher == null ? null : roleMatcher.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.enabled
     *
     * @return the value of role.enabled
     *
     * @mbggenerated
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.enabled
     *
     * @param enabled the value for role.enabled
     *
     * @mbggenerated
     */
    public void setEnabled(String enabled) {
        this.enabled = enabled == null ? null : enabled.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.remark
     *
     * @return the value of role.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.remark
     *
     * @param remark the value for role.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}