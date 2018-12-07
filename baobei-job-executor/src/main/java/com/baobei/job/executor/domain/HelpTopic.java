package com.baobei.job.executor.domain;

import java.io.Serializable;

public class HelpTopic implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column help_topic.help_topic_id
     *
     * @mbg.generated Fri Dec 07 17:23:33 CST 2018
     */
    private Integer helpTopicId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column help_topic.name
     *
     * @mbg.generated Fri Dec 07 17:23:33 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column help_topic.help_category_id
     *
     * @mbg.generated Fri Dec 07 17:23:33 CST 2018
     */
    private Short helpCategoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column help_topic.description
     *
     * @mbg.generated Fri Dec 07 17:23:33 CST 2018
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column help_topic.example
     *
     * @mbg.generated Fri Dec 07 17:23:33 CST 2018
     */
    private String example;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column help_topic.url
     *
     * @mbg.generated Fri Dec 07 17:23:33 CST 2018
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table help_topic
     *
     * @mbg.generated Fri Dec 07 17:23:33 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column help_topic.help_topic_id
     *
     * @return the value of help_topic.help_topic_id
     *
     * @mbg.generated Fri Dec 07 17:23:33 CST 2018
     */
    public Integer getHelpTopicId() {
        return helpTopicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column help_topic.help_topic_id
     *
     * @param helpTopicId the value for help_topic.help_topic_id
     *
     * @mbg.generated Fri Dec 07 17:23:33 CST 2018
     */
    public void setHelpTopicId(Integer helpTopicId) {
        this.helpTopicId = helpTopicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column help_topic.name
     *
     * @return the value of help_topic.name
     *
     * @mbg.generated Fri Dec 07 17:23:33 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column help_topic.name
     *
     * @param name the value for help_topic.name
     *
     * @mbg.generated Fri Dec 07 17:23:33 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column help_topic.help_category_id
     *
     * @return the value of help_topic.help_category_id
     *
     * @mbg.generated Fri Dec 07 17:23:33 CST 2018
     */
    public Short getHelpCategoryId() {
        return helpCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column help_topic.help_category_id
     *
     * @param helpCategoryId the value for help_topic.help_category_id
     *
     * @mbg.generated Fri Dec 07 17:23:33 CST 2018
     */
    public void setHelpCategoryId(Short helpCategoryId) {
        this.helpCategoryId = helpCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column help_topic.description
     *
     * @return the value of help_topic.description
     *
     * @mbg.generated Fri Dec 07 17:23:33 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column help_topic.description
     *
     * @param description the value for help_topic.description
     *
     * @mbg.generated Fri Dec 07 17:23:33 CST 2018
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column help_topic.example
     *
     * @return the value of help_topic.example
     *
     * @mbg.generated Fri Dec 07 17:23:33 CST 2018
     */
    public String getExample() {
        return example;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column help_topic.example
     *
     * @param example the value for help_topic.example
     *
     * @mbg.generated Fri Dec 07 17:23:33 CST 2018
     */
    public void setExample(String example) {
        this.example = example;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column help_topic.url
     *
     * @return the value of help_topic.url
     *
     * @mbg.generated Fri Dec 07 17:23:33 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column help_topic.url
     *
     * @param url the value for help_topic.url
     *
     * @mbg.generated Fri Dec 07 17:23:33 CST 2018
     */
    public void setUrl(String url) {
        this.url = url;
    }
}