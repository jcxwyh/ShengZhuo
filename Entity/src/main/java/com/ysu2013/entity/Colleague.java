package com.ysu2013.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @author AaronJiang
 * @version 1.0
 * @date 2018/05/05
 * @mail 1327994105@qq.com
 * @description Colleague
 */
@Entity
@Table(name="ysu_colleague")
public class Colleague implements Serializable{

    private static final long serialVersionUID = 11L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    private String nickname;

    private String icon;

    private String password;

    private Boolean gender;

    private Date birthday;

    private String dorm;

    private String phone;

    @Column(name = "phone_backup")
    private String phoneBackup;

    private String qq;

    private String email;

    @Column(name = "home_address")
    private String homeAddress;

    @Column(name = "now_address")
    private String nowAddress;

    @Column(name = "is_login")
    private Boolean isLogin;

    @Column(name = "login_time")
    private Date loginTime;

    @Column(name = "login_ip")
    private String loginIP;

    @Column(name = "login_addr")
    private String loginAddr;

    @Column(name = "modify_time")
    private Date modifyTime;

    private String description;

    /*************AaronJIang***************/
    /*         geeter & setter            */
     /*************************************/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean isGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDorm() {
        return dorm;
    }

    public void setDorm(String dorm) {
        this.dorm = dorm;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoneBackup() {
        return phoneBackup;
    }

    public void setPhoneBackup(String phoneBackup) {
        this.phoneBackup = phoneBackup;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getNowAddress() {
        return nowAddress;
    }

    public void setNowAddress(String nowAddress) {
        this.nowAddress = nowAddress;
    }

    public Boolean isLogin() {
        return isLogin;
    }

    public void setLogin(Boolean login) {
        isLogin = login;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginIP() {
        return loginIP;
    }

    public void setLoginIP(String loginIP) {
        this.loginIP = loginIP;
    }

    public String getLoginAddr() {
        return loginAddr;
    }

    public void setLoginAddr(String loginAddr) {
        this.loginAddr = loginAddr;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Colleague colleague = (Colleague) o;
        return Objects.equals(name, colleague.name) &&
                Objects.equals(password, colleague.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password);
    }

    @Override
    public String toString() {
        return "我的同学{" +
                "名字：'" + name + '\'' +
                ", 外号：'" + nickname + '\'' +
                ", 性别：" + gender +
                ", 自我介绍：'" + description + '\'' +
                '}';
    }
}
