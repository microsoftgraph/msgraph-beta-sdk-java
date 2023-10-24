package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Metric snapshot value returned in response to a GetHealthMetricTimeSeries request.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CertificateConnectorHealthMetricValue implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Timestamp for this metric data-point.
     */
    private OffsetDateTime dateTime;
    /**
     * Count of failed requests/operations.
     */
    private Long failureCount;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Count of successful requests/operations.
     */
    private Long successCount;
    /**
     * Instantiates a new CertificateConnectorHealthMetricValue and sets the default values.
     */
    public CertificateConnectorHealthMetricValue() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CertificateConnectorHealthMetricValue
     */
    @jakarta.annotation.Nonnull
    public static CertificateConnectorHealthMetricValue createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CertificateConnectorHealthMetricValue();
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
     * Gets the dateTime property value. Timestamp for this metric data-point.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDateTime() {
        return this.dateTime;
    }
    /**
     * Gets the failureCount property value. Count of failed requests/operations.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getFailureCount() {
        return this.failureCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("dateTime", (n) -> { this.setDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("failureCount", (n) -> { this.setFailureCount(n.getLongValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("successCount", (n) -> { this.setSuccessCount(n.getLongValue()); });
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
     * Gets the successCount property value. Count of successful requests/operations.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSuccessCount() {
        return this.successCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("dateTime", this.getDateTime());
        writer.writeLongValue("failureCount", this.getFailureCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("successCount", this.getSuccessCount());
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
     * Sets the dateTime property value. Timestamp for this metric data-point.
     * @param value Value to set for the dateTime property.
     */
    public void setDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.dateTime = value;
    }
    /**
     * Sets the failureCount property value. Count of failed requests/operations.
     * @param value Value to set for the failureCount property.
     */
    public void setFailureCount(@jakarta.annotation.Nullable final Long value) {
        this.failureCount = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the successCount property value. Count of successful requests/operations.
     * @param value Value to set for the successCount property.
     */
    public void setSuccessCount(@jakarta.annotation.Nullable final Long value) {
        this.successCount = value;
    }
}
