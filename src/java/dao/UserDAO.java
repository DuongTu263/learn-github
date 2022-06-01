/*
 * Copyright(C) 2022, FPT University
 * CMS
 * CLINIC MANAGEMENT SYSTEM
 */
package dao;

import entity.Account;
import entity.Doctor;
import entity.Pagination;
import entity.User;
import java.util.List;

/**
 * This is an interface contains methods of <code>User</code> object<br>
 *
 * Bugs: none
 *
 * @author Nam Hai
 */
public interface UserDAO {

    User login(String username, String password);

    /**
     * - Get all account with infomation
     *
     * @param pageIndex
     * @param pageSize
     * @return a list of <code>Account</code> objects. <br>
     * -It is a <code>java.util.List</code> object
     * @throws SQLException when <code>java.sql.SQLException</code> occurs.
     */
    Pagination<Account> getAllAccount(int pageIndex, int pageSize, String search);

    void deleteAccount(int id);

    void updateAccount(User user);

    void createAccount(User user);

    void addDoctorForService(int doctor, int service);

    List<Doctor> getAllDoctor();

    List<Doctor> getDoctorByServiceId(int id);

    void updateAccountByAdmin(User user);

    User getUserById(int id);

    boolean checkUsernameAndEmail(String username, String email);

    void updatePassword(String username, String password);

    User getUserByEmail(String email);
}
