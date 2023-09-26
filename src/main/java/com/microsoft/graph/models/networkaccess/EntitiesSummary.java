package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EntitiesSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Count of unique devices that were seen.
     */
    private Long deviceCount;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The trafficType property
     */
    private TrafficType trafficType;
    /**
     * Count of unique Azure Active Directoy users that were seen.
     */
    private Long userCount;
    /**
     * Count of unique target workloads or hosts that were seen.
     */
    private Long workloadCount;
    /**
     * Instantiates a new EntitiesSummary and sets the default values.
     */
    public EntitiesSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EntitiesSummary
     */
    @jakarta.annotation.Nonnull
    public static EntitiesSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EntitiesSummary();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the deviceCount property value. Count of unique devices that were seen.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getDeviceCount() {
        return this.deviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("deviceCount", (n) -> { this.setDeviceCount(n.getLongValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("trafficType", (n) -> { this.setTrafficType(n.getEnumValue(TrafficType.class)); });
        deserializerMap.put("userCount", (n) -> { this.setUserCount(n.getLongValue()); });
        deserializerMap.put("workloadCount", (n) -> { this.setWorkloadCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the trafficType property value. The trafficType property
     * @return a TrafficType
     */
    @jakarta.annotation.Nullable
    public TrafficType getTrafficType() {
        return this.trafficType;
    }
    /**
     * Gets the userCount property value. Count of unique Azure Active Directoy users that were seen.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getUserCount() {
        return this.userCount;
    }
    /**
     * Gets the workloadCount property value. Count of unique target workloads or hosts that were seen.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getWorkloadCount() {
        return this.workloadCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("deviceCount", this.getDeviceCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("trafficType", this.getTrafficType());
        writer.writeLongValue("userCount", this.getUserCount());
        writer.writeLongValue("workloadCount", this.getWorkloadCount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the deviceCount property value. Count of unique devices that were seen.
     * @param value Value to set for the deviceCount property.
     */
    public void setDeviceCount(@jakarta.annotation.Nullable final Long value) {
        this.deviceCount = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the trafficType property value. The trafficType property
     * @param value Value to set for the trafficType property.
     */
    public void setTrafficType(@jakarta.annotation.Nullable final TrafficType value) {
        this.trafficType = value;
    }
    /**
     * Sets the userCount property value. Count of unique Azure Active Directoy users that were seen.
     * @param value Value to set for the userCount property.
     */
    public void setUserCount(@jakarta.annotation.Nullable final Long value) {
        this.userCount = value;
    }
    /**
     * Sets the workloadCount property value. Count of unique target workloads or hosts that were seen.
     * @param value Value to set for the workloadCount property.
     */
    public void setWorkloadCount(@jakarta.annotation.Nullable final Long value) {
        this.workloadCount = value;
    }
}
