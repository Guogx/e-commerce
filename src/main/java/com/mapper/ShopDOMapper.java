package com.mapper;

import com.dataobject.ShopDO;
import com.dataobject.ShopDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated
     */
    int countByExample(ShopDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated
     */
    int deleteByExample(ShopDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated
     */
    int insert(ShopDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated
     */
    int insertSelective(ShopDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated
     */
    List<ShopDO> selectByExample(ShopDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated
     */
    ShopDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ShopDO record, @Param("example") ShopDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ShopDO record, @Param("example") ShopDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ShopDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ShopDO record);
}