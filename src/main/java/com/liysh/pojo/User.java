package com.liysh.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
//在编译阶段会根据注解自动生成对应的方法；打他包含get/set/hashCode/equals/同String等方法
@Data
@Table(name="tb_user")
public class User {
    @Id
    //主键回填
    @KeySql(useGeneratedKeys = true)
    private Long id;
    //一样就不用加
    private String userName;
    private String password;
    private String name;
    private Integer age;
    private Integer sex;
    private Date birthday;
    private String note;
    private Date created;
    private Date updated;
}
