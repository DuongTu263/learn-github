/*
 * Copyright(C) 2022, FPT University
 * CMS
 * CLINIC MANAGEMENT SYSTEM
 */
package dao.impl;

import context.DBContext;
import dao.UserDAO;
import entity.Account;
import entity.Pagination;
import entity.User;
import entity.Doctor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nam Hai
 */
public class UserDAOImpl extends DBContext implements UserDAO {

    /**
     * Logger for system
     */
    private static Logger logger = Logger.getLogger(UserDAOImpl.class.getName());

    /*
    * Get all user from database. 
    * 
    * @return a list of <code>User</code> objects. It is
    * a <code>java.util.List</code> object 
     */
    @Override
    public User login(String username, String password) {
        logger.log(Level.INFO, "Login Controller");
        Connection connecion = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        try {
            connecion = getConnection();
            // Get data
            preparedStatement = connecion.prepareStatement("select * from users c join roles r on c.role_id = r.role_id where username = ? "
                    + "and BINARY_CHECKSUM(password) = BINARY_CHECKSUM(?)");
            preparedStatement.setNString(1, username);
            preparedStatement.setNString(2, password);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setUserId(rs.getInt("user_id"));
                user.setRoleId(rs.getInt("role_id"));
                user.setServiceId(rs.getInt("service_id"));
                user.setUsername(username);
                user.setEmail(rs.getString("email"));
                user.setPassword(password);
                user.setFullName(rs.getString("full_name"));
                user.setBirthDate(rs.getDate("birth_date"));
                user.setGender(rs.getBoolean("gender"));
                user.setPhone(rs.getString("phone"));
                user.setAddress(rs.getString("address"));
                user.setAvatarImage(rs.getString("avatar_image"));
                return user;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeResultSet(rs);
            closePreparedStatement(preparedStatement);
            closeConnection(connecion);
        }
        return null;
    }

    /*
    * Get all accounts from database. 
    * 
    * @return a list of <code>Account</code> objects. It is
    * a <code>java.util.List</code> object 
     */
    @Override
    public Pagination<Account> getAllAccount(int pageIndex, int pageSize, String search) {
        Pagination<Account> pagination = new Pagination<>();
        logger.log(Level.INFO, "Login Controller");
        Connection connecion = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        List<Account> users = new ArrayList<>();
        try {
            connecion = getConnection();
            int totalItem = count(); // 
            pagination.setCurrentPage(pageIndex);
            pagination.setItemPerPage(pageSize);
            pagination.setTotalItem(totalItem);
            // Get data
            preparedStatement = connecion.prepareStatement("SELECT  *\n"
                    + "FROM  ( SELECT  ROW_NUMBER() OVER ( ORDER BY  c.user_id ) AS RowNum,  c.user_id, c.role_id, c.username, c.email, c.password, c.full_name, c.birth_date, c.gender, c.phone, c.avatar_image, c.service_id, c.address, c.is_active, r.role_name\n"
                    + "          FROM users c join roles r on c.role_id = r.role_id and c.is_active = 1 and (c.username like N'%" + search + "%' or c.email like N'%" + search + "%' or c.full_name like N'%" + search + "%')\n"
                    + "        ) AS RowConstrainedResult\n"
                    + "WHERE   RowNum >= ?\n"
                    + "    AND RowNum <= ?\n"
                    + "ORDER BY RowNum");
            preparedStatement.setInt(1, (pageIndex - 1) * pageSize);
            preparedStatement.setInt(2, (pageIndex - 1) * pageSize + pageSize);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Account user = new Account();
                user.setUserId(rs.getInt("user_id"));
                user.setRole(rs.getString("role_name"));
                user.setServiceId(rs.getInt("service_id"));
                user.setUsername(rs.getString("username"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setFullName(rs.getString("full_name"));
                user.setBirthDate(rs.getDate("birth_date"));
                user.setGender(rs.getBoolean("gender"));
                user.setPhone(rs.getString("phone"));
                user.setAddress(rs.getString("address"));
                user.setAvatarImage(rs.getString("avatar_image"));
                users.add(user);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeResultSet(rs);
            closePreparedStatement(preparedStatement);
            closeConnection(connecion);
        }
        pagination.setData(users);
        return pagination;
    }

    public int count() {
        Connection connecion = null;
        PreparedStatement countPreparedStatement = null;
        ResultSet countResultSet = null;
        try {
            connecion = getConnection();
            countPreparedStatement = connecion.prepareStatement("SELECT COUNT(user_id) AS id FROM users where is_active = 1");
            countResultSet = countPreparedStatement.executeQuery();
            if (countResultSet.next()) {
                // get and return count total services
                return countResultSet.getInt(1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            closeResultSet(countResultSet);
            closePreparedStatement(countPreparedStatement);
            closeConnection(connecion);
        }
        return 0;
    }

    @Override
    public void deleteAccount(int id) {
        logger.log(Level.INFO, "Delete account with id");
        Connection connecion = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            connecion = getConnection();
            // Get data
            preparedStatement = connecion.prepareStatement("  update users set is_active = 0 where user_id = ?");
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closePreparedStatement(preparedStatement);
            closeConnection(connecion);
        }
    }

    @Override
    public void updateAccount(User user) {
        Connection connecion = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            connecion = getConnection();
            // Get data
            preparedStatement = connecion.prepareStatement("update users set email = ?, full_name = ?, birth_date = ?, phone = ? , address = ? where user_id = ?");

            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getFullName());
            preparedStatement.setDate(3, user.getBirthDate());
            preparedStatement.setString(4, user.getPhone());
            preparedStatement.setString(5, user.getAddress());
            preparedStatement.setInt(6, user.getUserId());

            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closePreparedStatement(preparedStatement);
            closeConnection(connecion);
        }
    }

    @Override
    public void createAccount(User user) {
        logger.log(Level.INFO, "Create account");
        Connection connecion = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            connecion = getConnection();
            // Get data
            preparedStatement = connecion.prepareStatement("insert into users (role_id, username, full_name, email, birth_date, gender, phone, address, is_active, password)\n"
                    + "values (?,?,?,?,?,?,?,?, 1,?)");
            preparedStatement.setInt(1, user.getRoleId());
            preparedStatement.setString(2, user.getUsername());
            preparedStatement.setNString(3, user.getFullName());
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setDate(5, user.getBirthDate());
            if (user.isGender()) {
                preparedStatement.setInt(6, 1);
            } else {
                preparedStatement.setInt(6, 0);
            }
            preparedStatement.setString(7, user.getPhone());
            preparedStatement.setString(8, user.getAddress());
            preparedStatement.setString(9, user.getPassword());
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closePreparedStatement(preparedStatement);
            closeConnection(connecion);
        }
    }

    @Override
    public void addDoctorForService(int doctor, int service) {
        Connection connecion = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            connecion = getConnection();
            // Get data
            preparedStatement = connecion.prepareStatement(" update users set service_id = ? where user_id = ? and role_id = 3");
            preparedStatement.setInt(1, service);
            preparedStatement.setInt(2, doctor);
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closePreparedStatement(preparedStatement);
            closeConnection(connecion);
        }
    }

    @Override
    public List<Doctor> getAllDoctor() {
        logger.log(Level.INFO, "Login Controller");
        Connection connecion = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        List<Doctor> doctor = new ArrayList<>();
        try {
            connecion = getConnection();
            // Get data
            preparedStatement = connecion.prepareStatement("select * from users where role_id = 3 and is_active = 1;");
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Doctor user = new Doctor();
                user.setId(rs.getInt("user_id"));
                user.setName(rs.getString("full_name"));
                user.setImage(rs.getString("avatar_image"));
                user.setServiceId(rs.getInt("service_id"));
                doctor.add(user);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeResultSet(rs);
            closePreparedStatement(preparedStatement);
            closeConnection(connecion);
        }
        return doctor;
    }

    @Override
    public List<Doctor> getDoctorByServiceId(int id) {
        logger.log(Level.INFO, "Login Controller");
        Connection connecion = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        List<Doctor> doctor = new ArrayList<>();
        try {
            connecion = getConnection();
            // Get data
            preparedStatement = connecion.prepareStatement(" select distinct u.user_id, u.avatar_image, u.full_name, u.service_id, s.service_description \n"
                    + "	 from users u \n"
                    + "	 join services s\n"
                    + "    on u.role_id  = 3 and u.service_id = ? and u.is_active = 1 and s.service_id = ?");
            preparedStatement.setInt(1, id);
            preparedStatement.setInt(2, id);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Doctor user = new Doctor();
                user.setId(rs.getInt("user_id"));
                user.setName(rs.getString("full_name"));
                user.setImage(rs.getString("avatar_image"));
                user.setServiceDescription(rs.getString("service_description"));

                doctor.add(user);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeResultSet(rs);
            closePreparedStatement(preparedStatement);
            closeConnection(connecion);
        }
        return doctor;

    }

    @Override
    public void updateAccountByAdmin(User user) {
        Connection connecion = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            connecion = getConnection();
            // Get data
            preparedStatement = connecion.prepareStatement("update users set email = ?, full_name = ?, birth_date = ?,"
                    + " phone = ? , address = ? , role_id = ?,  username = ? , gender = ? where user_id = ?");

            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getFullName());
            preparedStatement.setDate(3, user.getBirthDate());
            preparedStatement.setString(4, user.getPhone());
            preparedStatement.setString(5, user.getAddress());

            preparedStatement.setInt(6, user.getRoleId());
            preparedStatement.setString(7, user.getUsername());

            if (user.isGender()) {
                preparedStatement.setInt(8, 1);
            } else {
                preparedStatement.setInt(8, 0);
            }

            preparedStatement.setInt(9, user.getUserId());

            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closePreparedStatement(preparedStatement);
            closeConnection(connecion);
        }
    }

    @Override
    public User getUserById(int id) {
        logger.log(Level.INFO, "Login Controller");
        Connection connecion = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        try {
            connecion = getConnection();
            // Get data
            preparedStatement = connecion.prepareStatement("select * from users c join roles r on c.role_id = r.role_id where user_id =?");
            preparedStatement.setInt(1, id);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setUserId(rs.getInt("user_id"));
                user.setRoleId(rs.getInt("role_id"));
                user.setServiceId(rs.getInt("service_id"));
                user.setUsername(rs.getString("username"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setFullName(rs.getString("full_name"));
                user.setBirthDate(rs.getDate("birth_date"));
                user.setGender(rs.getBoolean("gender"));
                user.setPhone(rs.getString("phone"));
                user.setAddress(rs.getString("address"));
                user.setAvatarImage(rs.getString("avatar_image"));
                return user;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeResultSet(rs);
            closePreparedStatement(preparedStatement);
            closeConnection(connecion);
        }
        return null;
    }

    @Override
    public boolean checkUsernameAndEmail(String username, String email) {
        logger.log(Level.INFO, "Login Controller");
        Connection connecion = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        try {
            connecion = getConnection();
            // Get data
            preparedStatement = connecion.prepareStatement("select * from users where username = ? or email = ?");
            preparedStatement.setNString(1, username);
            preparedStatement.setNString(2, email);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeResultSet(rs);
            closePreparedStatement(preparedStatement);
            closeConnection(connecion);
        }
        return false;

    }

    @Override
    public void updatePassword(String username, String password) {
        Connection connecion = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            connecion = getConnection();
            // Get data
            preparedStatement = connecion.prepareStatement("update users set password = ? where username = ?");

            preparedStatement.setString(1, password);
            preparedStatement.setString(2, username);

            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closePreparedStatement(preparedStatement);
            closeConnection(connecion);
        }
    }

    @Override
    public User getUserByEmail(String email) {
        logger.log(Level.INFO, "Login Controller");
        Connection connecion = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        try {
            connecion = getConnection();
            // Get data
            preparedStatement = connecion.prepareStatement("select * from users  where email = ?");
            preparedStatement.setNString(1, email);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setUserId(rs.getInt("user_id"));
                user.setRoleId(rs.getInt("role_id"));
                user.setServiceId(rs.getInt("service_id"));
                user.setUsername(rs.getString("username"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setFullName(rs.getString("full_name"));
                user.setBirthDate(rs.getDate("birth_date"));
                user.setGender(rs.getBoolean("gender"));
                user.setPhone(rs.getString("phone"));
                user.setAddress(rs.getString("address"));
                user.setAvatarImage(rs.getString("avatar_image"));
                return user;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeResultSet(rs);
            closePreparedStatement(preparedStatement);
            closeConnection(connecion);
        }
        return null;
    }
}
