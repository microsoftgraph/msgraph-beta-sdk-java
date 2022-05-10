package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsRemoteConnection extends Entity implements Parsable {
    /** The sign in failure percentage of Cloud PC Device. Valid values 0 to 100 */
    private Double _cloudPcFailurePercentage;
    /** The round tip time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308 */
    private Double _cloudPcRoundTripTime;
    /** The sign in time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308 */
    private Double _cloudPcSignInTime;
    /** The core boot time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308 */
    private Double _coreBootTime;
    /** The core sign in time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308 */
    private Double _coreSignInTime;
    /** The count of remote connection. Valid values 0 to 2147483647 */
    private Integer _deviceCount;
    /** The id of the device. */
    private String _deviceId;
    /** The name of the device. */
    private String _deviceName;
    /** The user experience analytics manufacturer. */
    private String _manufacturer;
    /** The user experience analytics device model. */
    private String _model;
    /** The remote sign in time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308 */
    private Double _remoteSignInTime;
    /** The user experience analytics userPrincipalName. */
    private String _userPrincipalName;
    /** The user experience analytics virtual network. */
    private String _virtualNetwork;
    /**
     * Instantiates a new userExperienceAnalyticsRemoteConnection and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsRemoteConnection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsRemoteConnection
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsRemoteConnection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsRemoteConnection();
    }
    /**
     * Gets the cloudPcFailurePercentage property value. The sign in failure percentage of Cloud PC Device. Valid values 0 to 100
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getCloudPcFailurePercentage() {
        return this._cloudPcFailurePercentage;
    }
    /**
     * Gets the cloudPcRoundTripTime property value. The round tip time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getCloudPcRoundTripTime() {
        return this._cloudPcRoundTripTime;
    }
    /**
     * Gets the cloudPcSignInTime property value. The sign in time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getCloudPcSignInTime() {
        return this._cloudPcSignInTime;
    }
    /**
     * Gets the coreBootTime property value. The core boot time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getCoreBootTime() {
        return this._coreBootTime;
    }
    /**
     * Gets the coreSignInTime property value. The core sign in time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getCoreSignInTime() {
        return this._coreSignInTime;
    }
    /**
     * Gets the deviceCount property value. The count of remote connection. Valid values 0 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeviceCount() {
        return this._deviceCount;
    }
    /**
     * Gets the deviceId property value. The id of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * Gets the deviceName property value. The name of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsRemoteConnection currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("cloudPcFailurePercentage", (n) -> { currentObject.setCloudPcFailurePercentage(n.getDoubleValue()); });
            this.put("cloudPcRoundTripTime", (n) -> { currentObject.setCloudPcRoundTripTime(n.getDoubleValue()); });
            this.put("cloudPcSignInTime", (n) -> { currentObject.setCloudPcSignInTime(n.getDoubleValue()); });
            this.put("coreBootTime", (n) -> { currentObject.setCoreBootTime(n.getDoubleValue()); });
            this.put("coreSignInTime", (n) -> { currentObject.setCoreSignInTime(n.getDoubleValue()); });
            this.put("deviceCount", (n) -> { currentObject.setDeviceCount(n.getIntegerValue()); });
            this.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
            this.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
            this.put("manufacturer", (n) -> { currentObject.setManufacturer(n.getStringValue()); });
            this.put("model", (n) -> { currentObject.setModel(n.getStringValue()); });
            this.put("remoteSignInTime", (n) -> { currentObject.setRemoteSignInTime(n.getDoubleValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
            this.put("virtualNetwork", (n) -> { currentObject.setVirtualNetwork(n.getStringValue()); });
        }};
    }
    /**
     * Gets the manufacturer property value. The user experience analytics manufacturer.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this._manufacturer;
    }
    /**
     * Gets the model property value. The user experience analytics device model.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this._model;
    }
    /**
     * Gets the remoteSignInTime property value. The remote sign in time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getRemoteSignInTime() {
        return this._remoteSignInTime;
    }
    /**
     * Gets the userPrincipalName property value. The user experience analytics userPrincipalName.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Gets the virtualNetwork property value. The user experience analytics virtual network.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVirtualNetwork() {
        return this._virtualNetwork;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
    public void setCloudPcFailurePercentage(@javax.annotation.Nullable final Double value) {
        this._cloudPcFailurePercentage = value;
    }
    /**
     * Sets the cloudPcRoundTripTime property value. The round tip time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     * @param value Value to set for the cloudPcRoundTripTime property.
     * @return a void
     */
    public void setCloudPcRoundTripTime(@javax.annotation.Nullable final Double value) {
        this._cloudPcRoundTripTime = value;
    }
    /**
     * Sets the cloudPcSignInTime property value. The sign in time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     * @param value Value to set for the cloudPcSignInTime property.
     * @return a void
     */
    public void setCloudPcSignInTime(@javax.annotation.Nullable final Double value) {
        this._cloudPcSignInTime = value;
    }
    /**
     * Sets the coreBootTime property value. The core boot time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     * @param value Value to set for the coreBootTime property.
     * @return a void
     */
    public void setCoreBootTime(@javax.annotation.Nullable final Double value) {
        this._coreBootTime = value;
    }
    /**
     * Sets the coreSignInTime property value. The core sign in time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     * @param value Value to set for the coreSignInTime property.
     * @return a void
     */
    public void setCoreSignInTime(@javax.annotation.Nullable final Double value) {
        this._coreSignInTime = value;
    }
    /**
     * Sets the deviceCount property value. The count of remote connection. Valid values 0 to 2147483647
     * @param value Value to set for the deviceCount property.
     * @return a void
     */
    public void setDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._deviceCount = value;
    }
    /**
     * Sets the deviceId property value. The id of the device.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the deviceName property value. The name of the device.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the manufacturer property value. The user experience analytics manufacturer.
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this._manufacturer = value;
    }
    /**
     * Sets the model property value. The user experience analytics device model.
     * @param value Value to set for the model property.
     * @return a void
     */
    public void setModel(@javax.annotation.Nullable final String value) {
        this._model = value;
    }
    /**
     * Sets the remoteSignInTime property value. The remote sign in time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     * @param value Value to set for the remoteSignInTime property.
     * @return a void
     */
    public void setRemoteSignInTime(@javax.annotation.Nullable final Double value) {
        this._remoteSignInTime = value;
    }
    /**
     * Sets the userPrincipalName property value. The user experience analytics userPrincipalName.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
    /**
     * Sets the virtualNetwork property value. The user experience analytics virtual network.
     * @param value Value to set for the virtualNetwork property.
     * @return a void
     */
    public void setVirtualNetwork(@javax.annotation.Nullable final String value) {
        this._virtualNetwork = value;
    }
}
