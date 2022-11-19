package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The user experience analytics device model performance entity contains device model performance details. */
public class UserExperienceAnalyticsAppHealthDeviceModelPerformance extends Entity implements Parsable {
    /** The number of active devices for the model. Valid values -2147483648 to 2147483647 */
    private Integer _activeDeviceCount;
    /** The manufacturer name of the device. */
    private String _deviceManufacturer;
    /** The model name of the device. */
    private String _deviceModel;
    /** The healthStatus property */
    private UserExperienceAnalyticsHealthState _healthStatus;
    /** The mean time to failure for the model device in minutes. Valid values -2147483648 to 2147483647 */
    private Integer _meanTimeToFailureInMinutes;
    /** The app health score of the device model. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _modelAppHealthScore;
    /** The overall app health status of the device model. */
    private String _modelAppHealthStatus;
    /**
     * Instantiates a new userExperienceAnalyticsAppHealthDeviceModelPerformance and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsAppHealthDeviceModelPerformance() {
        super();
        this.setOdataType("#microsoft.graph.userExperienceAnalyticsAppHealthDeviceModelPerformance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsAppHealthDeviceModelPerformance
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsAppHealthDeviceModelPerformance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsAppHealthDeviceModelPerformance();
    }
    /**
     * Gets the activeDeviceCount property value. The number of active devices for the model. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getActiveDeviceCount() {
        return this._activeDeviceCount;
    }
    /**
     * Gets the deviceManufacturer property value. The manufacturer name of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceManufacturer() {
        return this._deviceManufacturer;
    }
    /**
     * Gets the deviceModel property value. The model name of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceModel() {
        return this._deviceModel;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsAppHealthDeviceModelPerformance currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeDeviceCount", (n) -> { currentObject.setActiveDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("deviceManufacturer", (n) -> { currentObject.setDeviceManufacturer(n.getStringValue()); });
        deserializerMap.put("deviceModel", (n) -> { currentObject.setDeviceModel(n.getStringValue()); });
        deserializerMap.put("healthStatus", (n) -> { currentObject.setHealthStatus(n.getEnumValue(UserExperienceAnalyticsHealthState.class)); });
        deserializerMap.put("meanTimeToFailureInMinutes", (n) -> { currentObject.setMeanTimeToFailureInMinutes(n.getIntegerValue()); });
        deserializerMap.put("modelAppHealthScore", (n) -> { currentObject.setModelAppHealthScore(n.getDoubleValue()); });
        deserializerMap.put("modelAppHealthStatus", (n) -> { currentObject.setModelAppHealthStatus(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the healthStatus property value. The healthStatus property
     * @return a userExperienceAnalyticsHealthState
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsHealthState getHealthStatus() {
        return this._healthStatus;
    }
    /**
     * Gets the meanTimeToFailureInMinutes property value. The mean time to failure for the model device in minutes. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMeanTimeToFailureInMinutes() {
        return this._meanTimeToFailureInMinutes;
    }
    /**
     * Gets the modelAppHealthScore property value. The app health score of the device model. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getModelAppHealthScore() {
        return this._modelAppHealthScore;
    }
    /**
     * Gets the modelAppHealthStatus property value. The overall app health status of the device model.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModelAppHealthStatus() {
        return this._modelAppHealthStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("activeDeviceCount", this.getActiveDeviceCount());
        writer.writeStringValue("deviceManufacturer", this.getDeviceManufacturer());
        writer.writeStringValue("deviceModel", this.getDeviceModel());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeIntegerValue("meanTimeToFailureInMinutes", this.getMeanTimeToFailureInMinutes());
        writer.writeDoubleValue("modelAppHealthScore", this.getModelAppHealthScore());
        writer.writeStringValue("modelAppHealthStatus", this.getModelAppHealthStatus());
    }
    /**
     * Sets the activeDeviceCount property value. The number of active devices for the model. Valid values -2147483648 to 2147483647
     * @param value Value to set for the activeDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActiveDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._activeDeviceCount = value;
    }
    /**
     * Sets the deviceManufacturer property value. The manufacturer name of the device.
     * @param value Value to set for the deviceManufacturer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceManufacturer(@javax.annotation.Nullable final String value) {
        this._deviceManufacturer = value;
    }
    /**
     * Sets the deviceModel property value. The model name of the device.
     * @param value Value to set for the deviceModel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceModel(@javax.annotation.Nullable final String value) {
        this._deviceModel = value;
    }
    /**
     * Sets the healthStatus property value. The healthStatus property
     * @param value Value to set for the healthStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHealthStatus(@javax.annotation.Nullable final UserExperienceAnalyticsHealthState value) {
        this._healthStatus = value;
    }
    /**
     * Sets the meanTimeToFailureInMinutes property value. The mean time to failure for the model device in minutes. Valid values -2147483648 to 2147483647
     * @param value Value to set for the meanTimeToFailureInMinutes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMeanTimeToFailureInMinutes(@javax.annotation.Nullable final Integer value) {
        this._meanTimeToFailureInMinutes = value;
    }
    /**
     * Sets the modelAppHealthScore property value. The app health score of the device model. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the modelAppHealthScore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModelAppHealthScore(@javax.annotation.Nullable final Double value) {
        this._modelAppHealthScore = value;
    }
    /**
     * Sets the modelAppHealthStatus property value. The overall app health status of the device model.
     * @param value Value to set for the modelAppHealthStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModelAppHealthStatus(@javax.annotation.Nullable final String value) {
        this._modelAppHealthStatus = value;
    }
}
