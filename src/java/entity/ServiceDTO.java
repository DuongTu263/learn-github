/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import entity.Doctor;
import java.util.ArrayList;
import java.util.List;


public class ServiceDTO {

    private int serviceId;
    private String serviceName;
    private String serviceBrief;
    private String serviceDescription;
    private String serviceImage;
   
    
    private List<Doctor> doctors = new ArrayList<>();

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceBrief() {
        return serviceBrief;
    }

    public void setServiceBrief(String serviceBrief) {
        this.serviceBrief = serviceBrief;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getServiceImage() {
        return serviceImage;
    }

    public void setServiceImage(String serviceImage) {
        this.serviceImage = serviceImage;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }


    
    

}
