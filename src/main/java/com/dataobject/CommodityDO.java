package com.dataobject;

import java.util.Date;

public class CommodityDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.shop_id
     *
     * @mbggenerated
     */
    private Long shopId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.commodity_image
     *
     * @mbggenerated
     */
    private String commodityImage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.commodity_name
     *
     * @mbggenerated
     */
    private String commodityName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.price
     *
     * @mbggenerated
     */
    private Long price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.count
     *
     * @mbggenerated
     */
    private Integer count;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.category_id
     *
     * @mbggenerated
     */
    private Integer categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.createtime
     *
     * @mbggenerated
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.updatetime
     *
     * @mbggenerated
     */
    private Date updatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.id
     *
     * @return the value of commodity.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.id
     *
     * @param id the value for commodity.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.shop_id
     *
     * @return the value of commodity.shop_id
     *
     * @mbggenerated
     */
    public Long getShopId() {
        return shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.shop_id
     *
     * @param shopId the value for commodity.shop_id
     *
     * @mbggenerated
     */
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.commodity_image
     *
     * @return the value of commodity.commodity_image
     *
     * @mbggenerated
     */
    public String getCommodityImage() {
        return commodityImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.commodity_image
     *
     * @param commodityImage the value for commodity.commodity_image
     *
     * @mbggenerated
     */
    public void setCommodityImage(String commodityImage) {
        this.commodityImage = commodityImage == null ? null : commodityImage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.commodity_name
     *
     * @return the value of commodity.commodity_name
     *
     * @mbggenerated
     */
    public String getCommodityName() {
        return commodityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.commodity_name
     *
     * @param commodityName the value for commodity.commodity_name
     *
     * @mbggenerated
     */
    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.description
     *
     * @return the value of commodity.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.description
     *
     * @param description the value for commodity.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.price
     *
     * @return the value of commodity.price
     *
     * @mbggenerated
     */
    public Long getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.price
     *
     * @param price the value for commodity.price
     *
     * @mbggenerated
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.count
     *
     * @return the value of commodity.count
     *
     * @mbggenerated
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.count
     *
     * @param count the value for commodity.count
     *
     * @mbggenerated
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.category_id
     *
     * @return the value of commodity.category_id
     *
     * @mbggenerated
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.category_id
     *
     * @param categoryId the value for commodity.category_id
     *
     * @mbggenerated
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.createtime
     *
     * @return the value of commodity.createtime
     *
     * @mbggenerated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.createtime
     *
     * @param createtime the value for commodity.createtime
     *
     * @mbggenerated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.updatetime
     *
     * @return the value of commodity.updatetime
     *
     * @mbggenerated
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.updatetime
     *
     * @param updatetime the value for commodity.updatetime
     *
     * @mbggenerated
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}