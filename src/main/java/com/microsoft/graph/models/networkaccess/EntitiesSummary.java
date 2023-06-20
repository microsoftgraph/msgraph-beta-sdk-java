package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EntitiesSummary implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The deviceCount property */
    private Long deviceCount;
    /** The OdataType property */
    private String odataType;
    /** The trafficType property */
    private TrafficType trafficType;
    /** The userCount property */
    private Long userCount;
    /** The workloadCount property */
    private Long workloadCount;
    /**
     * Instantiates a new entitiesSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EntitiesSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a entitiesSummary
     */
    @javax.annotation.Nonnull
    public static EntitiesSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EntitiesSummary();
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
     * Gets the deviceCount property value. The deviceCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getDeviceCount() {
        return this.deviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the trafficType property value. The trafficType property
     * @return a TrafficType
     */
    @javax.annotation.Nullable
    public TrafficType getTrafficType() {
        return this.trafficType;
    }
    /**
     * Gets the userCount property value. The userCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getUserCount() {
        return this.userCount;
    }
    /**
     * Gets the workloadCount property value. The workloadCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getWorkloadCount() {
        return this.workloadCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("deviceCount", this.getDeviceCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("trafficType", this.getTrafficType());
        writer.writeLongValue("userCount", this.getUserCount());
        writer.writeLongValue("workloadCount", this.getWorkloadCount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the deviceCount property value. The deviceCount property
     * @param value Value to set for the deviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceCount(@javax.annotation.Nullable final Long value) {
        this.deviceCount = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the trafficType property value. The trafficType property
     * @param value Value to set for the trafficType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTrafficType(@javax.annotation.Nullable final TrafficType value) {
        this.trafficType = value;
    }
    /**
     * Sets the userCount property value. The userCount property
     * @param value Value to set for the userCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserCount(@javax.annotation.Nullable final Long value) {
        this.userCount = value;
    }
    /**
     * Sets the workloadCount property value. The workloadCount property
     * @param value Value to set for the workloadCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkloadCount(@javax.annotation.Nullable final Long value) {
        this.workloadCount = value;
    }
}
