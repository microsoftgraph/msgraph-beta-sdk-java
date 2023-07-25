package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics anomaly severity overview entity contains the count information for each severity of anomaly.
 */
public class UserExperienceAnalyticsAnomalySeverityOverview implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates count of high severity anomalies which have been detected. Valid values -2147483648 to 2147483647
     */
    private Integer highSeverityAnomalyCount;
    /**
     * Indicates count of informational severity anomalies which have been detected. Valid values -2147483648 to 2147483647
     */
    private Integer informationalSeverityAnomalyCount;
    /**
     * Indicates count of low severity anomalies which have been detected. Valid values -2147483648 to 2147483647
     */
    private Integer lowSeverityAnomalyCount;
    /**
     * Indicates count of medium severity anomalies which have been detected. Valid values -2147483648 to 2147483647
     */
    private Integer mediumSeverityAnomalyCount;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new userExperienceAnalyticsAnomalySeverityOverview and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsAnomalySeverityOverview() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsAnomalySeverityOverview
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsAnomalySeverityOverview createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsAnomalySeverityOverview();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("highSeverityAnomalyCount", (n) -> { this.setHighSeverityAnomalyCount(n.getIntegerValue()); });
        deserializerMap.put("informationalSeverityAnomalyCount", (n) -> { this.setInformationalSeverityAnomalyCount(n.getIntegerValue()); });
        deserializerMap.put("lowSeverityAnomalyCount", (n) -> { this.setLowSeverityAnomalyCount(n.getIntegerValue()); });
        deserializerMap.put("mediumSeverityAnomalyCount", (n) -> { this.setMediumSeverityAnomalyCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the highSeverityAnomalyCount property value. Indicates count of high severity anomalies which have been detected. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getHighSeverityAnomalyCount() {
        return this.highSeverityAnomalyCount;
    }
    /**
     * Gets the informationalSeverityAnomalyCount property value. Indicates count of informational severity anomalies which have been detected. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInformationalSeverityAnomalyCount() {
        return this.informationalSeverityAnomalyCount;
    }
    /**
     * Gets the lowSeverityAnomalyCount property value. Indicates count of low severity anomalies which have been detected. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLowSeverityAnomalyCount() {
        return this.lowSeverityAnomalyCount;
    }
    /**
     * Gets the mediumSeverityAnomalyCount property value. Indicates count of medium severity anomalies which have been detected. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMediumSeverityAnomalyCount() {
        return this.mediumSeverityAnomalyCount;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("highSeverityAnomalyCount", this.getHighSeverityAnomalyCount());
        writer.writeIntegerValue("informationalSeverityAnomalyCount", this.getInformationalSeverityAnomalyCount());
        writer.writeIntegerValue("lowSeverityAnomalyCount", this.getLowSeverityAnomalyCount());
        writer.writeIntegerValue("mediumSeverityAnomalyCount", this.getMediumSeverityAnomalyCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the highSeverityAnomalyCount property value. Indicates count of high severity anomalies which have been detected. Valid values -2147483648 to 2147483647
     * @param value Value to set for the highSeverityAnomalyCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHighSeverityAnomalyCount(@javax.annotation.Nullable final Integer value) {
        this.highSeverityAnomalyCount = value;
    }
    /**
     * Sets the informationalSeverityAnomalyCount property value. Indicates count of informational severity anomalies which have been detected. Valid values -2147483648 to 2147483647
     * @param value Value to set for the informationalSeverityAnomalyCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInformationalSeverityAnomalyCount(@javax.annotation.Nullable final Integer value) {
        this.informationalSeverityAnomalyCount = value;
    }
    /**
     * Sets the lowSeverityAnomalyCount property value. Indicates count of low severity anomalies which have been detected. Valid values -2147483648 to 2147483647
     * @param value Value to set for the lowSeverityAnomalyCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLowSeverityAnomalyCount(@javax.annotation.Nullable final Integer value) {
        this.lowSeverityAnomalyCount = value;
    }
    /**
     * Sets the mediumSeverityAnomalyCount property value. Indicates count of medium severity anomalies which have been detected. Valid values -2147483648 to 2147483647
     * @param value Value to set for the mediumSeverityAnomalyCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediumSeverityAnomalyCount(@javax.annotation.Nullable final Integer value) {
        this.mediumSeverityAnomalyCount = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
