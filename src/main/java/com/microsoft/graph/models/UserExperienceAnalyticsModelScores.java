package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics model scores entity consolidates the various Endpoint Analytics scores.
 */
public class UserExperienceAnalyticsModelScores extends Entity implements Parsable {
    /** The user experience analytics model app reliability score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double appReliabilityScore;
    /** The user experience analytics model battery health score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double batteryHealthScore;
    /** The user experience analytics model score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double endpointAnalyticsScore;
    /** The healthStatus property */
    private UserExperienceAnalyticsHealthState healthStatus;
    /** A unique identifier of the user experience analytics model scores: device manufacturer. */
    private String manufacturer;
    /** A unique identifier of the user experience analytics model scores: device model. */
    private String model;
    /** The user experience analytics model device count. Valid values -9.22337203685478E+18 to 9.22337203685478E+18 */
    private Long modelDeviceCount;
    /** The user experience analytics model startup performance score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double startupPerformanceScore;
    /** The user experience analytics model work from anywhere score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double workFromAnywhereScore;
    /**
     * Instantiates a new userExperienceAnalyticsModelScores and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsModelScores() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsModelScores
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsModelScores createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsModelScores();
    }
    /**
     * Gets the appReliabilityScore property value. The user experience analytics model app reliability score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getAppReliabilityScore() {
        return this.appReliabilityScore;
    }
    /**
     * Gets the batteryHealthScore property value. The user experience analytics model battery health score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getBatteryHealthScore() {
        return this.batteryHealthScore;
    }
    /**
     * Gets the endpointAnalyticsScore property value. The user experience analytics model score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getEndpointAnalyticsScore() {
        return this.endpointAnalyticsScore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appReliabilityScore", (n) -> { this.setAppReliabilityScore(n.getDoubleValue()); });
        deserializerMap.put("batteryHealthScore", (n) -> { this.setBatteryHealthScore(n.getDoubleValue()); });
        deserializerMap.put("endpointAnalyticsScore", (n) -> { this.setEndpointAnalyticsScore(n.getDoubleValue()); });
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getEnumValue(UserExperienceAnalyticsHealthState.class)); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("modelDeviceCount", (n) -> { this.setModelDeviceCount(n.getLongValue()); });
        deserializerMap.put("startupPerformanceScore", (n) -> { this.setStartupPerformanceScore(n.getDoubleValue()); });
        deserializerMap.put("workFromAnywhereScore", (n) -> { this.setWorkFromAnywhereScore(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the healthStatus property value. The healthStatus property
     * @return a UserExperienceAnalyticsHealthState
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsHealthState getHealthStatus() {
        return this.healthStatus;
    }
    /**
     * Gets the manufacturer property value. A unique identifier of the user experience analytics model scores: device manufacturer.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this.manufacturer;
    }
    /**
     * Gets the model property value. A unique identifier of the user experience analytics model scores: device model.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this.model;
    }
    /**
     * Gets the modelDeviceCount property value. The user experience analytics model device count. Valid values -9.22337203685478E+18 to 9.22337203685478E+18
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getModelDeviceCount() {
        return this.modelDeviceCount;
    }
    /**
     * Gets the startupPerformanceScore property value. The user experience analytics model startup performance score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getStartupPerformanceScore() {
        return this.startupPerformanceScore;
    }
    /**
     * Gets the workFromAnywhereScore property value. The user experience analytics model work from anywhere score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getWorkFromAnywhereScore() {
        return this.workFromAnywhereScore;
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
        writer.writeDoubleValue("appReliabilityScore", this.getAppReliabilityScore());
        writer.writeDoubleValue("batteryHealthScore", this.getBatteryHealthScore());
        writer.writeDoubleValue("endpointAnalyticsScore", this.getEndpointAnalyticsScore());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeLongValue("modelDeviceCount", this.getModelDeviceCount());
        writer.writeDoubleValue("startupPerformanceScore", this.getStartupPerformanceScore());
        writer.writeDoubleValue("workFromAnywhereScore", this.getWorkFromAnywhereScore());
    }
    /**
     * Sets the appReliabilityScore property value. The user experience analytics model app reliability score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the appReliabilityScore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppReliabilityScore(@javax.annotation.Nullable final Double value) {
        this.appReliabilityScore = value;
    }
    /**
     * Sets the batteryHealthScore property value. The user experience analytics model battery health score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the batteryHealthScore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBatteryHealthScore(@javax.annotation.Nullable final Double value) {
        this.batteryHealthScore = value;
    }
    /**
     * Sets the endpointAnalyticsScore property value. The user experience analytics model score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the endpointAnalyticsScore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndpointAnalyticsScore(@javax.annotation.Nullable final Double value) {
        this.endpointAnalyticsScore = value;
    }
    /**
     * Sets the healthStatus property value. The healthStatus property
     * @param value Value to set for the healthStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHealthStatus(@javax.annotation.Nullable final UserExperienceAnalyticsHealthState value) {
        this.healthStatus = value;
    }
    /**
     * Sets the manufacturer property value. A unique identifier of the user experience analytics model scores: device manufacturer.
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this.manufacturer = value;
    }
    /**
     * Sets the model property value. A unique identifier of the user experience analytics model scores: device model.
     * @param value Value to set for the model property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModel(@javax.annotation.Nullable final String value) {
        this.model = value;
    }
    /**
     * Sets the modelDeviceCount property value. The user experience analytics model device count. Valid values -9.22337203685478E+18 to 9.22337203685478E+18
     * @param value Value to set for the modelDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModelDeviceCount(@javax.annotation.Nullable final Long value) {
        this.modelDeviceCount = value;
    }
    /**
     * Sets the startupPerformanceScore property value. The user experience analytics model startup performance score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the startupPerformanceScore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartupPerformanceScore(@javax.annotation.Nullable final Double value) {
        this.startupPerformanceScore = value;
    }
    /**
     * Sets the workFromAnywhereScore property value. The user experience analytics model work from anywhere score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the workFromAnywhereScore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkFromAnywhereScore(@javax.annotation.Nullable final Double value) {
        this.workFromAnywhereScore = value;
    }
}
