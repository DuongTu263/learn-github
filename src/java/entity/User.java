/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;


public class User {

    private int userId;
    private int roleId;
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
     * Create an instance of <code>User</code> object
     */
    public User() {
    }

    /**
     * Create an instance of <code>User</code> object with value of attributes
     * of <code>User</code>
     *
     * @param username the value of username attribute. It's a
     * <code>java.lang.int</code> object
     * @param fullName the value of fullName attribute. It's a
     * <code>java.lang.User</code> object
     *
     */
    public User(String username, String fullName) {
        this.username = username;
        this.fullName = fullName;
    }

    /**
     * Create an instance of <code>User</code> object with value of attributes
     * of <code>User</code>
     *
     * @param userId the value of userId attribute. It's a
     * <code>java.lang.int</code> object
     * @param username the value of username attribute. It's a
     * <code>java.lang.int</code> object
     * @param fullName the value of fullName attribute. It's a
     * <code>java.lang.User</code> object
     *
     */
    public User(int userId, String username, String fullName) {
        this.userId = userId;
        this.username = username;
        this.fullName = fullName;
    }

    /**
     * Create an instance of <code>User</code> object with value of attributes
     * of <code>User</code>
     *
     * @param userId the value of userId attribute. It's a
     * <code>java.lang.int</code> object
     * @param email the value of email attribute. It's a
     * <code>java.lang.String</code> object
     * @param fullName the value of fullName attribute. It's a
     * <code>java.lang.String</code> object
     * @param birthDate the value of birthDate attribute. It's a
     * <code>java.sql.Date</code> object
     * @param gender the value of gender attribute. It's a
     * <code>java.sql.boolean</code> object
     * @param phone the value of phone attribute. It's a
     * <code>java.sql.String</code> object
     * @param address the value of address attribute. It's a
     * <code>java.sql.String</code> object
     *
     */
    public User(int userId, String email, String fullName, Date birthDate, boolean gender, String phone, String address) {
        this.userId = userId;
        this.email = email;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    /**
     * Create an instance of <code>User</code> object with value of attributes
     * of <code>User</code>
     *
     * @param userId the value of userId attribute. It's a
     * <code>java.lang.int</code> object
     * @param role the value of role attribute. It's a
     * <code>java.lang.String</code> object
     * @param serviceId the value of serviceId attribute. It's a
     * <code>java.lang.int</code> object
     * @param username the value of username attribute. It's a
     * <code>java.lang.String</code> object
     * @param email the value of email attribute. It's a
     * <code>java.lang.String</code> object
     * @param password the value of password attribute. It's a
     * <code>java.lang.String</code> object
     * @param fullName the value of fullName attribute. It's a
     * <code>java.lang.String</code> object
     * @param birthDate the value of birthDate attribute. It's a
     * <code>java.sql.Date</code> object
     * @param gender the value of gender attribute. It's a
     * <code>java.lang.String</code> object
     * @param phone the value of phone attribute. It's a
     * <code>java.lang.Date</code> object
     * @param address the value of address String. It's a
     * <code>java.lang.String</code> object
     * @param avatarImage the value of avatarImage attribute. It's a
     * <code>java.lang.String</code> object
     */
    public User(int userId, int roleId, int serviceId, String username, String email, String password, String fullName, Date birthDate, boolean gender, String phone, String address, String avatarImage) {
        this.userId = userId;
        this.roleId = roleId;
        this.serviceId = serviceId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.avatarImage = avatarImage;
    }

    public User(int roleId, int serviceId, String username, String email, String password, String fullName, Date birthDate, boolean gender, String phone, String address, String avatarImage, int id) {

        this.roleId = roleId;
        this.serviceId = serviceId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.avatarImage = avatarImage;
        this.userId = id;
    }
    /**
     * Create an instance of <code>User</code> object with value of attributes
     * of <code>User</code>
     *
     * @param fullName the value of fullName attribute. It's a
     * <code>java.lang.User</code> object
     *
     */
    public User(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Return the value of userId attribute of the <code>User</code> object.
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Set userId value of the <code>User</code> object.
     *
     * @param userId is a <code>java.lang.int</code> this value is the id of the
     * User.
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Return the value of role attribute of the <code>User</code> object.
     */
    public int getRoleId() {
        return roleId;
    }

    /**
     * Set role value of the <code>User</code> object.
     *
     * @param role is a <code>java.lang.String</code> this value is the service
     * of the User.
     */
    public void setRoleId(int role) {
        this.roleId = role;
    }

    /**
     * Return the value of serviceId attribute of the <code>User</code> object.
     */
    public int getServiceId() {
        return serviceId;
    }

    /**
     * Set serviceId value of the <code>User</code> object.
     *
     * @param serviceId is a <code>java.lang.int</code> this value is the
     * service of the User.
     */
    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * Return the value of username attribute of the <code>User</code> object.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set username value of the <code>User</code> object.
     *
     * @param username is a <code>java.lang.String</code> this value is the
     * service of the User.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Return the value of email attribute of the <code>User</code> object.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set email value of the <code>User</code> object.
     *
     * @param email is a <code>java.lang.String</code> this value is the service
     * of the User.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Return the value of password attribute of the <code>User</code> object.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set password value of the <code>User</code> object.
     *
     * @param password is a <code>java.lang.String</code> this value is the
     * service of the User.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Return the value of fullName attribute of the <code>User</code> object.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Set fullName value of the <code>User</code> object.
     *
     * @param fullName is a <code>java.lang.String</code> this value is the
     * service of the User.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Return the value of birthDate attribute of the <code>User</code> object.
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * Set birthDate value of the <code>User</code> object.
     *
     * @param birthDate is a <code>java.lang.Date</code> this value is the
     * service of the User.
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Return the value of gender attribute of the <code>User</code> object.
     */
    public boolean isGender() {
        return gender;
    }

    /**
     * Set gender value of the <code>User</code> object.
     *
     * @param gender is a <code>java.lang.boolean</code> this value is the
     * service of the User.
     */
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    /**
     * Return the value of phone attribute of the <code>User</code> object.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Set phone value of the <code>User</code> object.
     *
     * @param phone is a <code>java.lang.String</code> this value is the service
     * of the User.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Return the value of address attribute of the <code>User</code> object.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set address value of the <code>User</code> object.
     *
     * @param address is a <code>java.lang.String</code> this value is the
     * service of the User.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Return the value of avatarImage attribute of the <code>User</code>
     * object.
     */
    public String getAvatarImage() {
        return avatarImage;
    }

    /**
     * Set avatarImage value of the <code>User</code> object.
     *
     * @param avatarImage is a <code>java.lang.String</code> this value is the
     * service of the User.
     */
    public void setAvatarImage(String avatarImage) {
        this.avatarImage = avatarImage;
    }
}
