package com.shao.study.arithmetic.entity;

/**
 * @ClassName User
 * @Description TOO
 * @Author 邵亨鹏
 * @Date 2020/4/28 20:39
 * @Version 1.0
 **/
public class Member {

    String id;
    String username;
    String password;

    @Override
    /**
     *
     * TODO 使用StringBuffer就行连接，默认是使用加号+就行连接
     */
    /***
     * @description: TODO 这是我自定义的在方法上注释用的注释模板
     * @author: 邵亨鹏
     * @date: 2020/4/28 21:34
     * @params: []
     * @return: java.lang.String
     */

    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("id='").append(id).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }

//    @Override
//    public String toString() {
//        return "User{" +
//                "id='" + id + '\'' +
//                ", username='" + username + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }
}
