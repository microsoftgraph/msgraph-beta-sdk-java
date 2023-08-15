package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analyte remote connection entity.
 */
public class UserExperienceAnalyticsRemoteConnection extends Entity implements Parsable {
    /**
     * The sign in failure percentage of Cloud PC Device. Valid values 0 to 100
     */
    private Double cloudPcFailurePercentage;
    /**
     * The round tip time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     */
    private Double cloudPcRoundTripTime;
    /**
     * The sign in time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     */
    private Double cloudPcSignInTime;
    /**
     * The core boot time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     */
    private Double coreBootTime;
    /**
     * The core sign in time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     */
    private Double coreSignInTime;
    /**
     * The count of remote connection. Valid values 0 to 2147483647
     */
    private Integer deviceCount;
    /**
     * The id of the device.
     */
    private String deviceId;
    /**
     * The name of the device.
     */
    private String deviceName;
    /**
     * The user experience analytics manufacturer.
     */
    private String manufacturer;
    /**
     * The user experience analytics device model.
     */
    private String model;
    /**
     * The remote sign in time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     */
    private Double remoteSignInTime;
    /**
     * The user experience analytics userPrincipalName.
     */
    private String userPrincipalName;
    /**
     * The user experience analytics virtual network.
     */
    private String virtualNetwork;
    /**
     * Instantiates a new userExperienceAnalyticsRemoteConnection and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsRemoteConnection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsRemoteConnection
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsRemoteConnection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsRemoteConnection();
    }
    /**
     * Gets the cloudPcFailurePercentage property value. The sign in failure percentage of Cloud PC Device. Valid values 0 to 100
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getCloudPcFailurePercentage() {
        return this.cloudPcFailurePercentage;
    }
    /**
     * Gets the cloudPcRoundTripTime property value. The round tip time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getCloudPcRoundTripTime() {
        return this.cloudPcRoundTripTime;
    }
    /**
     * Gets the cloudPcSignInTime property value. The sign in time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getCloudPcSignInTime() {
        return this.cloudPcSignInTime;
    }
    /**
     * Gets the coreBootTime property value. The core boot time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getCoreBootTime() {
        return this.coreBootTime;
    }
    /**
     * Gets the coreSignInTime property value. The core sign in time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getCoreSignInTime() {
        return this.coreSignInTime;
    }
    /**
     * Gets the deviceCount property value. The count of remote connection. Valid values 0 to 2147483647
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeviceCount() {
        return this.deviceCount;
    }
    /**
     * Gets the deviceId property value. The id of the device.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * Gets the deviceName property value. The name of the device.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("cloudPcFailurePercentage", (n) -> { this.setCloudPcFailurePercentage(n.getDoubleValue()); });
        deserializerMap.put("cloudPcRoundTripTime", (n) -> { this.setCloudPcRoundTripTime(n.getDoubleValue()); });
        deserializerMap.put("cloudPcSignInTime", (n) -> { this.setCloudPcSignInTime(n.getDoubleValue()); });
        deserializerMap.put("coreBootTime", (n) -> { this.setCoreBootTime(n.getDoubleValue()); });
        deserializerMap.put("coreSignInTime", (n) -> { this.setCoreSignInTime(n.getDoubleValue()); });
        deserializerMap.put("deviceCount", (n) -> { this.setDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("remoteSignInTime", (n) -> { this.setRemoteSignInTime(n.getDoubleValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("virtualNetwork", (n) -> { this.setVirtualNetwork(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the manufacturer property value. The user experience analytics manufacturer.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.manufacturer;
    }
    /**
     * Gets the model property value. The user experience analytics device model.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.model;
    }
    /**
     * Gets the remoteSignInTime property value. The remote sign in time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getRemoteSignInTime() {
        return this.remoteSignInTime;
    }
    /**
     * Gets the userPrincipalName property value. The user experience analytics userPrincipalName.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Gets the virtualNetwork property value. The user experience analytics virtual network.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getVirtualNetwork() {
        return this.virtualNetwork;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeDoubleValue("cloudPcFailurePercentage", this.getCloudPcFailurePercentage());
        writer.writeDoubleValue("cloudPcRoundTripTime", this.getCloudPcRoundTripTime());
        writer.writeDoubleValue("cloudPcSignInTime", this.getCloudPcSignInTime());
        writer.writeDoubleValue("coreBootTime", this.getCoreBootTime());
        writer.writeDoubleValue("coreSignInTime", this.getCoreSignInTime());
        writer.writeIntegerValue("deviceCount", this.getDeviceCount());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeDoubleValue("remoteSignInTime", this.getRemoteSignInTime());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeStringValue("virtualNetwork", this.getVirtualNetwork());
    }
    /**
     * Sets the cloudPcFailurePercentage property value. The sign in failure percentage of Cloud PC Device. Valid values 0 to 100
     * @param value Value to set for the cloudPcFailurePercentage property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCloudPcFailurePercentage(@jakarta.annotation.Nullable final Double value) {
        this.cloudPcFailurePercentage = value;
    }
    /**
     * Sets the cloudPcRoundTripTime property value. The round tip time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     * @param value Value to set for the cloudPcRoundTripTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCloudPcRoundTripTime(@jakarta.annotation.Nullable final Double value) {
        this.cloudPcRoundTripTime = value;
    }
    /**
     * Sets the cloudPcSignInTime property value. The sign in time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     * @param value Value to set for the cloudPcSignInTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCloudPcSignInTime(@jakarta.annotation.Nullable final Double value) {
        this.cloudPcSignInTime = value;
    }
    /**
     * Sets the coreBootTime property value. The core boot time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     * @param value Value to set for the coreBootTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCoreBootTime(@jakarta.annotation.Nullable final Double value) {
        this.coreBootTime = value;
    }
    /**
     * Sets the coreSignInTime property value. The core sign in time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     * @param value Value to set for the coreSignInTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCoreSignInTime(@jakarta.annotation.Nullable final Double value) {
        this.coreSignInTime = value;
    }
    /**
     * Sets the deviceCount property value. The count of remote connection. Valid values 0 to 2147483647
     * @param value Value to set for the deviceCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.deviceCount = value;
    }
    /**
     * Sets the deviceId property value. The id of the device.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the deviceName property value. The name of the device.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.deviceName = value;
    }
    /**
     * Sets the manufacturer property value. The user experience analytics manufacturer.
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.manufacturer = value;
    }
    /**
     * Sets the model property value. The user experience analytics device model.
     * @param value Value to set for the model property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.model = value;
    }
    /**
     * Sets the remoteSignInTime property value. The remote sign in time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     * @param value Value to set for the remoteSignInTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRemoteSignInTime(@jakarta.annotation.Nullable final Double value) {
        this.remoteSignInTime = value;
    }
    /**
     * Sets the userPrincipalName property value. The user experience analytics userPrincipalName.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
    /**
     * Sets the virtualNetwork property value. The user experience analytics virtual network.
     * @param value Value to set for the virtualNetwork property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setVirtualNetwork(@jakarta.annotation.Nullable final String value) {
        this.virtualNetwork = value;
    }
}
