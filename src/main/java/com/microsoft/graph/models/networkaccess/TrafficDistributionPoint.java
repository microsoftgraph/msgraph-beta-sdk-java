package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TrafficDistributionPoint implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The internetAccessTrafficCount property
     */
    private Long internetAccessTrafficCount;
    /**
     * The microsoft365AccessTrafficCount property
     */
    private Long microsoft365AccessTrafficCount;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The privateAccessTrafficCount property
     */
    private Long privateAccessTrafficCount;
    /**
     * The timeStampDateTime property
     */
    private OffsetDateTime timeStampDateTime;
    /**
     * The totalTrafficCount property
     */
    private Long totalTrafficCount;
    /**
     * Instantiates a new TrafficDistributionPoint and sets the default values.
     */
    public TrafficDistributionPoint() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TrafficDistributionPoint
     */
    @jakarta.annotation.Nonnull
    public static TrafficDistributionPoint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TrafficDistributionPoint();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("internetAccessTrafficCount", (n) -> { this.setInternetAccessTrafficCount(n.getLongValue()); });
        deserializerMap.put("microsoft365AccessTrafficCount", (n) -> { this.setMicrosoft365AccessTrafficCount(n.getLongValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("privateAccessTrafficCount", (n) -> { this.setPrivateAccessTrafficCount(n.getLongValue()); });
        deserializerMap.put("timeStampDateTime", (n) -> { this.setTimeStampDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("totalTrafficCount", (n) -> { this.setTotalTrafficCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the internetAccessTrafficCount property value. The internetAccessTrafficCount property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getInternetAccessTrafficCount() {
        return this.internetAccessTrafficCount;
    }
    /**
     * Gets the microsoft365AccessTrafficCount property value. The microsoft365AccessTrafficCount property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getMicrosoft365AccessTrafficCount() {
        return this.microsoft365AccessTrafficCount;
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
     * Gets the privateAccessTrafficCount property value. The privateAccessTrafficCount property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getPrivateAccessTrafficCount() {
        return this.privateAccessTrafficCount;
    }
    /**
     * Gets the timeStampDateTime property value. The timeStampDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTimeStampDateTime() {
        return this.timeStampDateTime;
    }
    /**
     * Gets the totalTrafficCount property value. The totalTrafficCount property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getTotalTrafficCount() {
        return this.totalTrafficCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("internetAccessTrafficCount", this.getInternetAccessTrafficCount());
        writer.writeLongValue("microsoft365AccessTrafficCount", this.getMicrosoft365AccessTrafficCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("privateAccessTrafficCount", this.getPrivateAccessTrafficCount());
        writer.writeOffsetDateTimeValue("timeStampDateTime", this.getTimeStampDateTime());
        writer.writeLongValue("totalTrafficCount", this.getTotalTrafficCount());
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
     * Sets the internetAccessTrafficCount property value. The internetAccessTrafficCount property
     * @param value Value to set for the internetAccessTrafficCount property.
     */
    public void setInternetAccessTrafficCount(@jakarta.annotation.Nullable final Long value) {
        this.internetAccessTrafficCount = value;
    }
    /**
     * Sets the microsoft365AccessTrafficCount property value. The microsoft365AccessTrafficCount property
     * @param value Value to set for the microsoft365AccessTrafficCount property.
     */
    public void setMicrosoft365AccessTrafficCount(@jakarta.annotation.Nullable final Long value) {
        this.microsoft365AccessTrafficCount = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the privateAccessTrafficCount property value. The privateAccessTrafficCount property
     * @param value Value to set for the privateAccessTrafficCount property.
     */
    public void setPrivateAccessTrafficCount(@jakarta.annotation.Nullable final Long value) {
        this.privateAccessTrafficCount = value;
    }
    /**
     * Sets the timeStampDateTime property value. The timeStampDateTime property
     * @param value Value to set for the timeStampDateTime property.
     */
    public void setTimeStampDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.timeStampDateTime = value;
    }
    /**
     * Sets the totalTrafficCount property value. The totalTrafficCount property
     * @param value Value to set for the totalTrafficCount property.
     */
    public void setTotalTrafficCount(@jakarta.annotation.Nullable final Long value) {
        this.totalTrafficCount = value;
    }
}
