package com.enjoycodingfun.dao;

import com.enjoycodingfun.pojo.UserContent;

public interface UserContentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_content
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_content
     *
     * @mbggenerated
     */
    int insert(UserContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_content
     *
     * @mbggenerated
     */
    int insertSelective(UserContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_content
     *
     * @mbggenerated
     */
    UserContent selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_content
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_content
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(UserContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_content
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserContent record);
}