package com.enjoycodingfun.pojo;

import java.util.Date;

public class Upvote {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upvote.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upvote.u_id
     *
     * @mbggenerated
     */
    private Long uId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upvote.content_id
     *
     * @mbggenerated
     */
    private Long contentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upvote.ip
     *
     * @mbggenerated
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upvote.upvote
     *
     * @mbggenerated
     */
    private String upvote;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upvote.downvote
     *
     * @mbggenerated
     */
    private String downvote;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upvote.upvote_time
     *
     * @mbggenerated
     */
    private Date upvoteTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upvote.id
     *
     * @return the value of upvote.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upvote.id
     *
     * @param id the value for upvote.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upvote.u_id
     *
     * @return the value of upvote.u_id
     *
     * @mbggenerated
     */
    public Long getuId() {
        return uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upvote.u_id
     *
     * @param uId the value for upvote.u_id
     *
     * @mbggenerated
     */
    public void setuId(Long uId) {
        this.uId = uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upvote.content_id
     *
     * @return the value of upvote.content_id
     *
     * @mbggenerated
     */
    public Long getContentId() {
        return contentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upvote.content_id
     *
     * @param contentId the value for upvote.content_id
     *
     * @mbggenerated
     */
    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upvote.ip
     *
     * @return the value of upvote.ip
     *
     * @mbggenerated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upvote.ip
     *
     * @param ip the value for upvote.ip
     *
     * @mbggenerated
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upvote.upvote
     *
     * @return the value of upvote.upvote
     *
     * @mbggenerated
     */
    public String getUpvote() {
        return upvote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upvote.upvote
     *
     * @param upvote the value for upvote.upvote
     *
     * @mbggenerated
     */
    public void setUpvote(String upvote) {
        this.upvote = upvote == null ? null : upvote.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upvote.downvote
     *
     * @return the value of upvote.downvote
     *
     * @mbggenerated
     */
    public String getDownvote() {
        return downvote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upvote.downvote
     *
     * @param downvote the value for upvote.downvote
     *
     * @mbggenerated
     */
    public void setDownvote(String downvote) {
        this.downvote = downvote == null ? null : downvote.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upvote.upvote_time
     *
     * @return the value of upvote.upvote_time
     *
     * @mbggenerated
     */
    public Date getUpvoteTime() {
        return upvoteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upvote.upvote_time
     *
     * @param upvoteTime the value for upvote.upvote_time
     *
     * @mbggenerated
     */
    public void setUpvoteTime(Date upvoteTime) {
        this.upvoteTime = upvoteTime;
    }
}