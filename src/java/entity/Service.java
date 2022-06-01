
package entity;


public class Service {

    private int serviceId;
    private String serviceName;
    private String serviceBrief;
    private String serviceDescription;
    private String serviceImage;

    /**
     * Creates a service with no parameter
     */
    public Service() {
    }

    public Service(int serviceId, String serviceName) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
    }

    public Service(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * Creates a service with specified parameters.
     *
     * @param serviceId
     * @param serviceName
     * @param serviceBrief
     * @param serviceDescription
     * @param serviceImage
     */

    public Service(int serviceId, String serviceName, String serviceBrief, String serviceDescription, String serviceImage) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceBrief = serviceBrief;
        this.serviceDescription = serviceDescription;
        this.serviceImage = serviceImage;
    }

    /**
     * Get service id
     *
     * @return serviceId integer
     */
    public int getServiceId() {
        return serviceId;
    }

    /**
     * Set service id
     *
     * @param serviceId
     */
    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * Get service name
     *
     * @return serviceName string
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Set service name
     *
     * @param serviceName
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * Get service brief
     *
     * @return serviceBrief string
     */
    public String getServiceBrief() {
        return serviceBrief;
    }

    /**
     * Set service brief
     *
     * @param serviceBrief
     */
    public void setServiceBrief(String serviceBrief) {
        this.serviceBrief = serviceBrief;
    }

    /**
     * Get service description
     *
     * @return serviceDescription string
     */
    public String getServiceDescription() {
        return serviceDescription;
    }

    /**
     * Set service description
     *
     * @param serviceDescription
     */
    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    /**
     * Get service image
     *
     * @return serviceImage string
     */
    public String getServiceImage() {
        return serviceImage;
    }

    /**
     * Set service image
     *
     * @param serviceImage
     */
    public void setServiceImage(String serviceImage) {
        this.serviceImage = serviceImage;
    }

}
