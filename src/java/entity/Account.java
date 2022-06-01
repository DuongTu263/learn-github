/*
 * Copyright(C) 2022, FPT University
 * CMS
 * CLINIC MANAGEMENT SYSTEM
 */
package entity;

import java.sql.Date;

/**
 * The class contains attributes and getter,setter for information of [Account]
 * object <br>
 * The getter will throw an attribute of [Account] object<br>
 * The setter will set an attribute of [Account] object<br>
 *
 * @author Nam Hai
 */
public class Account {

    private int userId;
    private String role;
    private int serviceId;
    private String username;
    private String email;
    private String password;
    private String fullName;
    private Date birthDate;
    private boolean gender;
    private String phone;
    private String address;
    private String avatarImage;

    /**
     * Return the value of userId attribute of the
     * <code>Account</code> object.
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Set userId value of the <code>Account</code> object.
     *
     * @param userId is a <code>java.lang.int</code> this value is the id
     * of the user.
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Return the value of role attribute of the
     * <code>Account</code> object.
     */
    public String getRole() {
        return role;
    }

    /**
     * Set role value of the <code>Account</code> object.
     *
     * @param role is a <code>java.lang.String</code> this value is the role
     * of the account.
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Return the value of serviceId attribute of the
     * <code>Account</code> object.
     */
    public int getServiceId() {
        return serviceId;
    }

    /**
     * Set serviceId value of the <code>Account</code> object.
     *
     * @param serviceId is a <code>java.lang.int</code> this value is the id
     * of the service.
     */
    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * Return the value of username attribute of the
     * <code>Account</code> object.
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * Set username value of the <code>Account</code> object.
     *
     * @param username is a <code>java.lang.String</code> this value 
     * is the username of account.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Return the value of email attribute of the
     * <code>Account</code> object.
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Set email value of the <code>Account</code> object.
     *
     * @param email is a <code>java.lang.String</code> this value is the email
     * of the account.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Return the value of password attribute of the
     * <code>Account</code> object.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set password value of the <code>Account</code> object.
     *
     * @param password is a <code>java.lang.String</code> this value is the 
     * password of the account.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Return the value of fullName attribute of the
     * <code>Account</code> object.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Set fullName value of the <code>Account</code> object.
     *
     * @param fullName is a <code>java.lang.String</code> this value is the 
     * fullname of the user.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Return the value of birthDate attribute of the
     * <code>Account</code> object.
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * Set birthDate value of the <code>Account</code> object.
     *
     * @param birthDate is a <code>java.lang.Date</code> this value is the 
     * birthday of the user.
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Return the value of gender attribute of the
     * <code>Account</code> object.
     */
    public boolean isGender() {
        return gender;
    }

    /**
     * Set gender value of the <code>Account</code> object.
     *
     * @param gender is a <code>java.lang.Boolean</code> this value is the 
     * gender of the user.
     */
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    /**
     * Return the value of phone attribute of the
     * <code>Account</code> object.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Set phone value of the <code>Account</code> object.
     *
     * @param phone is a <code>java.lang.String</code> this value is the 
     * phone of the user.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Return the value of address attribute of the
     * <code>Account</code> object.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set address value of the <code>Account</code> object.
     *
     * @param address is a <code>java.lang.String</code> this value is the 
     * address of the user.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Return the value of avatarImage attribute of the
     * <code>Account</code> object.
     */
    public String getAvatarImage() {
        return avatarImage;
    }

    /**
     * Set avatarImage value of the <code>Account</code> object.
     *
     * @param avatarImage is a <code>java.lang.String</code> this value is the 
     * avatar of the account.
     */
    public void setAvatarImage(String avatarImage) {
        this.avatarImage = avatarImage;
    }

}
