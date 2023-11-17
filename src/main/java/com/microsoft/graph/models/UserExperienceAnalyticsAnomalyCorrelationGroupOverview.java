package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics anomaly correlation group overview entity contains the information for each correlation group of an anomaly.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsAnomalyCorrelationGroupOverview extends Entity implements Parsable {
    /**
     * Instantiates a new UserExperienceAnalyticsAnomalyCorrelationGroupOverview and sets the default values.
     */
    public UserExperienceAnalyticsAnomalyCorrelationGroupOverview() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsAnomalyCorrelationGroupOverview
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsAnomalyCorrelationGroupOverview createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsAnomalyCorrelationGroupOverview();
    }
    /**
     * Gets the anomalyCorrelationGroupCount property value. Indicates the number of correlation groups in the anomaly. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAnomalyCorrelationGroupCount() {
        return this.backingStore.get("anomalyCorrelationGroupCount");
    }
    /**
     * Gets the anomalyId property value. The unique identifier of the anomaly. Anomaly details such as name and type can be found in the UserExperienceAnalyticsAnomalySeverityOverview entity.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAnomalyId() {
        return this.backingStore.get("anomalyId");
    }
    /**
     * Gets the correlationGroupAnomalousDeviceCount property value. Indicates the total number of devices affected by the anomaly in the correlation group. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCorrelationGroupAnomalousDeviceCount() {
        return this.backingStore.get("correlationGroupAnomalousDeviceCount");
    }
    /**
     * Gets the correlationGroupAtRiskDeviceCount property value. Indicates the total number of devices at risk in the correlation group. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCorrelationGroupAtRiskDeviceCount() {
        return this.backingStore.get("correlationGroupAtRiskDeviceCount");
    }
    /**
     * Gets the correlationGroupDeviceCount property value. Indicates the total number of devices in a correlation group. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCorrelationGroupDeviceCount() {
        return this.backingStore.get("correlationGroupDeviceCount");
    }
    /**
     * Gets the correlationGroupFeatures property value. Describes the features of a device that are shared between all devices in a correlation group.
     * @return a java.util.List<UserExperienceAnalyticsAnomalyCorrelationGroupFeature>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAnomalyCorrelationGroupFeature> getCorrelationGroupFeatures() {
        return this.backingStore.get("correlationGroupFeatures");
    }
    /**
     * Gets the correlationGroupId property value. The unique identifier for the correlation group which will uniquely identify one of the correlation group within an anomaly. The correlation Id can be mapped to the correlation group name by concatinating the correlation group features. Example of correlation group name which is the indicative of concatenated features names are  for names, Contoso manufacture 4.4.1 and Windows 11.22621.1485.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCorrelationGroupId() {
        return this.backingStore.get("correlationGroupId");
    }
    /**
     * Gets the correlationGroupPrevalence property value. Indicates the level of prevalence of the correlation group features in the anomaly. Possible values are: high, medium or low
     * @return a UserExperienceAnalyticsAnomalyCorrelationGroupPrevalence
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsAnomalyCorrelationGroupPrevalence getCorrelationGroupPrevalence() {
        return this.backingStore.get("correlationGroupPrevalence");
    }
    /**
     * Gets the correlationGroupPrevalencePercentage property value. The percentage of the devices in the correlation group that are anomalous. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getCorrelationGroupPrevalencePercentage() {
        return this.backingStore.get("correlationGroupPrevalencePercentage");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("anomalyCorrelationGroupCount", (n) -> { this.setAnomalyCorrelationGroupCount(n.getIntegerValue()); });
        deserializerMap.put("anomalyId", (n) -> { this.setAnomalyId(n.getStringValue()); });
        deserializerMap.put("correlationGroupAnomalousDeviceCount", (n) -> { this.setCorrelationGroupAnomalousDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("correlationGroupAtRiskDeviceCount", (n) -> { this.setCorrelationGroupAtRiskDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("correlationGroupDeviceCount", (n) -> { this.setCorrelationGroupDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("correlationGroupFeatures", (n) -> { this.setCorrelationGroupFeatures(n.getCollectionOfObjectValues(UserExperienceAnalyticsAnomalyCorrelationGroupFeature::createFromDiscriminatorValue)); });
        deserializerMap.put("correlationGroupId", (n) -> { this.setCorrelationGroupId(n.getStringValue()); });
        deserializerMap.put("correlationGroupPrevalence", (n) -> { this.setCorrelationGroupPrevalence(n.getEnumValue(UserExperienceAnalyticsAnomalyCorrelationGroupPrevalence.class)); });
        deserializerMap.put("correlationGroupPrevalencePercentage", (n) -> { this.setCorrelationGroupPrevalencePercentage(n.getDoubleValue()); });
        deserializerMap.put("totalDeviceCount", (n) -> { this.setTotalDeviceCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the totalDeviceCount property value. Indicates the total number of devices in the tenant. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalDeviceCount() {
        return this.backingStore.get("totalDeviceCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("anomalyCorrelationGroupCount", this.getAnomalyCorrelationGroupCount());
        writer.writeStringValue("anomalyId", this.getAnomalyId());
        writer.writeIntegerValue("correlationGroupAnomalousDeviceCount", this.getCorrelationGroupAnomalousDeviceCount());
        writer.writeIntegerValue("correlationGroupAtRiskDeviceCount", this.getCorrelationGroupAtRiskDeviceCount());
        writer.writeIntegerValue("correlationGroupDeviceCount", this.getCorrelationGroupDeviceCount());
        writer.writeCollectionOfObjectValues("correlationGroupFeatures", this.getCorrelationGroupFeatures());
        writer.writeStringValue("correlationGroupId", this.getCorrelationGroupId());
        writer.writeEnumValue("correlationGroupPrevalence", this.getCorrelationGroupPrevalence());
        writer.writeDoubleValue("correlationGroupPrevalencePercentage", this.getCorrelationGroupPrevalencePercentage());
        writer.writeIntegerValue("totalDeviceCount", this.getTotalDeviceCount());
    }
    /**
     * Sets the anomalyCorrelationGroupCount property value. Indicates the number of correlation groups in the anomaly. Valid values -2147483648 to 2147483647
     * @param value Value to set for the anomalyCorrelationGroupCount property.
     */
    public void setAnomalyCorrelationGroupCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("anomalyCorrelationGroupCount", value);
    }
    /**
     * Sets the anomalyId property value. The unique identifier of the anomaly. Anomaly details such as name and type can be found in the UserExperienceAnalyticsAnomalySeverityOverview entity.
     * @param value Value to set for the anomalyId property.
     */
    public void setAnomalyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("anomalyId", value);
    }
    /**
     * Sets the correlationGroupAnomalousDeviceCount property value. Indicates the total number of devices affected by the anomaly in the correlation group. Valid values -2147483648 to 2147483647
     * @param value Value to set for the correlationGroupAnomalousDeviceCount property.
     */
    public void setCorrelationGroupAnomalousDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("correlationGroupAnomalousDeviceCount", value);
    }
    /**
     * Sets the correlationGroupAtRiskDeviceCount property value. Indicates the total number of devices at risk in the correlation group. Valid values -2147483648 to 2147483647
     * @param value Value to set for the correlationGroupAtRiskDeviceCount property.
     */
    public void setCorrelationGroupAtRiskDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("correlationGroupAtRiskDeviceCount", value);
    }
    /**
     * Sets the correlationGroupDeviceCount property value. Indicates the total number of devices in a correlation group. Valid values -2147483648 to 2147483647
     * @param value Value to set for the correlationGroupDeviceCount property.
     */
    public void setCorrelationGroupDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("correlationGroupDeviceCount", value);
    }
    /**
     * Sets the correlationGroupFeatures property value. Describes the features of a device that are shared between all devices in a correlation group.
     * @param value Value to set for the correlationGroupFeatures property.
     */
    public void setCorrelationGroupFeatures(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsAnomalyCorrelationGroupFeature> value) {
        this.backingStore.set("correlationGroupFeatures", value);
    }
    /**
     * Sets the correlationGroupId property value. The unique identifier for the correlation group which will uniquely identify one of the correlation group within an anomaly. The correlation Id can be mapped to the correlation group name by concatinating the correlation group features. Example of correlation group name which is the indicative of concatenated features names are  for names, Contoso manufacture 4.4.1 and Windows 11.22621.1485.
     * @param value Value to set for the correlationGroupId property.
     */
    public void setCorrelationGroupId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("correlationGroupId", value);
    }
    /**
     * Sets the correlationGroupPrevalence property value. Indicates the level of prevalence of the correlation group features in the anomaly. Possible values are: high, medium or low
     * @param value Value to set for the correlationGroupPrevalence property.
     */
    public void setCorrelationGroupPrevalence(@jakarta.annotation.Nullable final UserExperienceAnalyticsAnomalyCorrelationGroupPrevalence value) {
        this.backingStore.set("correlationGroupPrevalence", value);
    }
    /**
     * Sets the correlationGroupPrevalencePercentage property value. The percentage of the devices in the correlation group that are anomalous. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the correlationGroupPrevalencePercentage property.
     */
    public void setCorrelationGroupPrevalencePercentage(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("correlationGroupPrevalencePercentage", value);
    }
    /**
     * Sets the totalDeviceCount property value. Indicates the total number of devices in the tenant. Valid values -2147483648 to 2147483647
     * @param value Value to set for the totalDeviceCount property.
     */
    public void setTotalDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalDeviceCount", value);
    }
}
