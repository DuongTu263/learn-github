/*
 * Copyright(C) 20022, FPT University
 * CMS:
 * Clinic Management System
 */
package dao.impl;

import context.DBContext;
import dao.ServiceDAO;
import entity.ServiceDTO;
import entity.Pagination;
import entity.Service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <h1>Service DAO</h1>
 * Data access object connect database and access data. - count : count list
 * services - getAllService : get list services by paging - getById : get
 * service by id
 * <p>
 *
 *
 * @author Nam Hai
 * @version 1.0
 *  @since 2022-05-18
 */
public class ServiceDAOImpl extends DBContext implements ServiceDAO {

    /**
     * Logger for system
     */
    private static Logger logger = Logger.getLogger(UserDAOImpl.class.getName());

    /**
     * Method: Get All Service
     *
     * - get all services by pageIndex and pageSize
     *
     * @param pageIndex integer
     * @param pageSize integer
     * @return pagination Pagination Service
     */
    public Pagination<ServiceDTO> getAllService(int pageIndex, int pageSize) {

        Pagination<ServiceDTO> pagination = new Pagination<>(); // pagination services

        logger.log(Level.INFO, "getAllService");
        Connection connecion = null; // connection database
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        List<ServiceDTO> services = new ArrayList<>();// list all services
        try {
            int totalItem = count(); // count total service
            pagination.setCurrentPage(pageIndex);
            pagination.setItemPerPage(pageSize);
            pagination.setTotalItem(totalItem);

            connecion = getConnection();
            // Get data
            preparedStatement = connecion.prepareStatement(""
                    + "SELECT  *\n"
                    + "FROM (SELECT ROW_NUMBER() OVER ( ORDER BY service_id )\n"
                    + "AS RowNum, * FROM  services) \n"
                    + "AS RowConstrainedResult\n"
                    + "WHERE   RowNum >= ?\n"
                    + "    AND RowNum <= ?\n"
                    + "ORDER BY RowNum");
            preparedStatement.setInt(1, (pageIndex - 1) * pageSize);
            preparedStatement.setInt(2, (pageIndex - 1) * pageSize + pageSize);
            //excute query
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ServiceDTO service = new ServiceDTO();
                service.setServiceId(rs.getInt("service_id"));
                service.setServiceName(rs.getString("service_name"));
                service.setServiceBrief(rs.getString("service_brief"));
                service.setServiceDescription(rs.getString("service_description"));
                service.setServiceImage(rs.getString("service_image"));
                services.add(service);
            }
        } catch (Exception ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeResultSet(rs);
            closePreparedStatement(preparedStatement);
            closeConnection(connecion);
        }
        pagination.setData(services);// paging for list services
        return pagination;
    }

    /**
     * Method : count - count total services in database
     *
     * @return an integer
     */
    public int count() {
        Connection connecion = null;
        PreparedStatement countPreparedStatement = null;
        ResultSet countResultSet = null;
        try {
            connecion = getConnection();
            countPreparedStatement = connecion.prepareStatement("SELECT COUNT(service_id) AS id FROM services;");
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

    /**
     * Method: Get Service By Id - Get and return data of service by an id
     *
     * @param id
     * @return service Service
     */
    public Service getById(int id) {
        logger.log(Level.INFO, "getById");
        Connection connecion = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        Service service = new Service();
        try {
            connecion = getConnection();
            // Get data
            preparedStatement = connecion.prepareStatement("select * from services where service_id = ?");
            preparedStatement.setInt(1, id);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                service.setServiceId(rs.getInt("service_id"));
                service.setServiceName(rs.getString("service_name"));
                service.setServiceBrief(rs.getString("service_brief"));
                service.setServiceDescription(rs.getString("service_description"));
                service.setServiceImage(rs.getString("service_image"));
            }
        } catch (Exception ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeResultSet(rs);
            closePreparedStatement(preparedStatement);
            closeConnection(connecion);
        }
        return service;
    }

    /**
     * - Get all services of clinic
     *
     * @return a list of <code>Service</code> objects. <br>
     * -It is a <code>java.util.ArrayList</code> object
     * @throws SQLException
     */
    @Override
    public ArrayList<Service> getServices() throws SQLException {
        ArrayList<Service> result = new ArrayList<>();
        String sql = "SELECT [service_id]\n"
                + "      ,[service_name]\n"
                + "      ,[service_brief]\n"
                + "      ,[service_description]\n"
                + "      ,[service_image]\n"
                  + "  FROM services";
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = getConnection(); //get connection
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            /**
             * set attributes for services from result set then add its to
             * result list
             */
            while (rs.next()) {
                Service service = new Service(rs.getInt("service_id"), rs.getString("service_name"), rs.getString("service_brief"), rs.getString("service_description"), rs.getString("service_image"));
                result.add(service);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReservationDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } catch (Exception ex) {
            Logger.getLogger(ReservationDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            /**
             * close result set, prepared statement and connection by
             * corresponding order
             */
        } finally {
            this.closeResultSet(rs);
            this.closePreparedStatement(ps);
            this.closeConnection(con);
        }
        return result;
    }

    @Override
    public int addService(Service service) {
        logger.log(Level.INFO, "Add service");
        Connection connecion = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            connecion = getConnection();
            // Get data
            preparedStatement = connecion.prepareStatement("insert into services (service_name, service_brief, service_description, service_image)\n"
                    + "values (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, service.getServiceName());
            preparedStatement.setString(2, "");
            preparedStatement.setString(3, service.getServiceDescription());
            preparedStatement.setString(4, service.getServiceImage());

            int row = preparedStatement.executeUpdate();
            return row;
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closePreparedStatement(preparedStatement);
            closeConnection(connecion);
        }
        return 0;
    }

    @Override
    public int getIdInserted() {

        String sql = "SELECT MAX(service_id) as id FROM services";
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = getConnection(); //get connection
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReservationDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ReservationDAOImpl.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            this.closeResultSet(rs);
            this.closePreparedStatement(ps);
            this.closeConnection(con);
        }
        return 0;
    }

    @Override
    public void updateService(Service service) {
        Connection connecion = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            connecion = getConnection();
            // Get data
            preparedStatement = connecion.prepareStatement("update services set service_name = ? , service_description = ? where service_id = ?");
            preparedStatement.setString(1, service.getServiceName());
            preparedStatement.setString(2, service.getServiceDescription());
            preparedStatement.setInt(3, service.getServiceId());
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
    public void removeAllDoctor(int id) {
        Connection connecion = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            connecion = getConnection();
            // Get data
            preparedStatement = connecion.prepareStatement("update users set service_id = null where service_id = ? and role_id = 3");
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
    public void deleteService(int id) {
        Connection connecion = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            connecion = getConnection();
            // Get data
            preparedStatement = connecion.prepareStatement("update services set isActive = 0 where service_id = ?");
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
}
