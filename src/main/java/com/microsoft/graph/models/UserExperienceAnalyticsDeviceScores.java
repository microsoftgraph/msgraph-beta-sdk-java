package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsDeviceScores extends Entity implements Parsable {
    /** The user experience analytics device app reliability score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _appReliabilityScore;
    /** The user experience analytics device battery health score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _batteryHealthScore;
    /** The user experience analytics device name. */
    private String _deviceName;
    /** The user experience analytics device score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _endpointAnalyticsScore;
    /** The healthStatus property */
    private UserExperienceAnalyticsHealthState _healthStatus;
    /** The user experience analytics device manufacturer. */
    private String _manufacturer;
    /** The user experience analytics device model. */
    private String _model;
    /** The user experience analytics device startup performance score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _startupPerformanceScore;
    /** The user experience analytics device work From anywhere score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _workFromAnywhereScore;
    /**
     * Instantiates a new UserExperienceAnalyticsDeviceScores and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsDeviceScores() {
        super();
        this.setOdataType("#microsoft.graph.userExperienceAnalyticsDeviceScores");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsDeviceScores
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsDeviceScores createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsDeviceScores();
    }
    /**
     * Gets the appReliabilityScore property value. The user experience analytics device app reliability score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getAppReliabilityScore() {
        return this._appReliabilityScore;
    }
    /**
     * Gets the batteryHealthScore property value. The user experience analytics device battery health score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getBatteryHealthScore() {
        return this._batteryHealthScore;
    }
    /**
     * Gets the deviceName property value. The user experience analytics device name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
    }
    /**
     * Gets the endpointAnalyticsScore property value. The user experience analytics device score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getEndpointAnalyticsScore() {
        return this._endpointAnalyticsScore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsDeviceScores currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("appReliabilityScore", (n) -> { currentObject.setAppReliabilityScore(n.getDoubleValue()); });
            this.put("batteryHealthScore", (n) -> { currentObject.setBatteryHealthScore(n.getDoubleValue()); });
            this.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
            this.put("endpointAnalyticsScore", (n) -> { currentObject.setEndpointAnalyticsScore(n.getDoubleValue()); });
            this.put("healthStatus", (n) -> { currentObject.setHealthStatus(n.getEnumValue(UserExperienceAnalyticsHealthState.class)); });
            this.put("manufacturer", (n) -> { currentObject.setManufacturer(n.getStringValue()); });
            this.put("model", (n) -> { currentObject.setModel(n.getStringValue()); });
            this.put("startupPerformanceScore", (n) -> { currentObject.setStartupPerformanceScore(n.getDoubleValue()); });
            this.put("workFromAnywhereScore", (n) -> { currentObject.setWorkFromAnywhereScore(n.getDoubleValue()); });
        }};
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
     * Gets the manufacturer property value. The user experience analytics device manufacturer.
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
     * Gets the startupPerformanceScore property value. The user experience analytics device startup performance score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getStartupPerformanceScore() {
        return this._startupPerformanceScore;
    }
    /**
     * Gets the workFromAnywhereScore property value. The user experience analytics device work From anywhere score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getWorkFromAnywhereScore() {
        return this._workFromAnywhereScore;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeDoubleValue("appReliabilityScore", this.getAppReliabilityScore());
        writer.writeDoubleValue("batteryHealthScore", this.getBatteryHealthScore());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeDoubleValue("endpointAnalyticsScore", this.getEndpointAnalyticsScore());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeDoubleValue("startupPerformanceScore", this.getStartupPerformanceScore());
        writer.writeDoubleValue("workFromAnywhereScore", this.getWorkFromAnywhereScore());
    }
    /**
     * Sets the appReliabilityScore property value. The user experience analytics device app reliability score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the appReliabilityScore property.
     * @return a void
     */
    public void setAppReliabilityScore(@javax.annotation.Nullable final Double value) {
        this._appReliabilityScore = value;
    }
    /**
     * Sets the batteryHealthScore property value. The user experience analytics device battery health score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the batteryHealthScore property.
     * @return a void
     */
    public void setBatteryHealthScore(@javax.annotation.Nullable final Double value) {
        this._batteryHealthScore = value;
    }
    /**
     * Sets the deviceName property value. The user experience analytics device name.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the endpointAnalyticsScore property value. The user experience analytics device score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the endpointAnalyticsScore property.
     * @return a void
     */
    public void setEndpointAnalyticsScore(@javax.annotation.Nullable final Double value) {
        this._endpointAnalyticsScore = value;
    }
    /**
     * Sets the healthStatus property value. The healthStatus property
     * @param value Value to set for the healthStatus property.
     * @return a void
     */
    public void setHealthStatus(@javax.annotation.Nullable final UserExperienceAnalyticsHealthState value) {
        this._healthStatus = value;
    }
    /**
     * Sets the manufacturer property value. The user experience analytics device manufacturer.
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
     * Sets the startupPerformanceScore property value. The user experience analytics device startup performance score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the startupPerformanceScore property.
     * @return a void
     */
    public void setStartupPerformanceScore(@javax.annotation.Nullable final Double value) {
        this._startupPerformanceScore = value;
    }
    /**
     * Sets the workFromAnywhereScore property value. The user experience analytics device work From anywhere score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the workFromAnywhereScore property.
     * @return a void
     */
    public void setWorkFromAnywhereScore(@javax.annotation.Nullable final Double value) {
        this._workFromAnywhereScore = value;
    }
}
