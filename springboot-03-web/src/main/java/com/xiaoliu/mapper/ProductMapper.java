package com.xiaoliu.mapper;


import com.xiaoliu.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ProductMapper {

    //查询全部的员工信息
    List<Product> getAll();


    //通过ID查询员工
    Product getProductById(@Param("id") int id);

    //通过ID删除员工
    int delete(@Param("id") int id);

    //增加一个员工
    int save(Product product);

    //修改员工
    int updateProById(Product product);
}
