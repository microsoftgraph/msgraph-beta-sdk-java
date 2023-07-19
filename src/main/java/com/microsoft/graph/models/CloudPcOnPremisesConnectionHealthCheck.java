package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcOnPremisesConnectionHealthCheck implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Additional details about the health check or the recommended action.
     */
    private String additionalDetails;
    /**
     * The unique identifier of the health check item-related activities. This identifier can be useful in troubleshooting.
     */
    private String correlationId;
    /**
     * The display name for this health check item.
     */
    private String displayName;
    /**
     * The end time of the health check item. Read-only.
     */
    private OffsetDateTime endDateTime;
    /**
     * The type of error that occurred during this health check.
     */
    private CloudPcOnPremisesConnectionHealthCheckErrorType errorType;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The recommended action to fix the corresponding error.
     */
    private String recommendedAction;
    /**
     * The start time of the health check item. Read-only.
     */
    private OffsetDateTime startDateTime;
    /**
     * The status property
     */
    private CloudPcOnPremisesConnectionStatus status;
    /**
     * Instantiates a new cloudPcOnPremisesConnectionHealthCheck and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudPcOnPremisesConnectionHealthCheck() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcOnPremisesConnectionHealthCheck
     */
    @javax.annotation.Nonnull
    public static CloudPcOnPremisesConnectionHealthCheck createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcOnPremisesConnectionHealthCheck();
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
     * Gets the additionalDetails property value. Additional details about the health check or the recommended action.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdditionalDetails() {
        return this.additionalDetails;
    }
    /**
     * Gets the correlationId property value. The unique identifier of the health check item-related activities. This identifier can be useful in troubleshooting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCorrelationId() {
        return this.correlationId;
    }
    /**
     * Gets the displayName property value. The display name for this health check item.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the endDateTime property value. The end time of the health check item. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.endDateTime;
    }
    /**
     * Gets the errorType property value. The type of error that occurred during this health check.
     * @return a cloudPcOnPremisesConnectionHealthCheckErrorType
     */
    @javax.annotation.Nullable
    public CloudPcOnPremisesConnectionHealthCheckErrorType getErrorType() {
        return this.errorType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("additionalDetails", (n) -> { this.setAdditionalDetails(n.getStringValue()); });
        deserializerMap.put("correlationId", (n) -> { this.setCorrelationId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("errorType", (n) -> { this.setErrorType(n.getEnumValue(CloudPcOnPremisesConnectionHealthCheckErrorType.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recommendedAction", (n) -> { this.setRecommendedAction(n.getStringValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(CloudPcOnPremisesConnectionStatus.class)); });
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
     * Gets the recommendedAction property value. The recommended action to fix the corresponding error.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecommendedAction() {
        return this.recommendedAction;
    }
    /**
     * Gets the startDateTime property value. The start time of the health check item. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Gets the status property value. The status property
     * @return a cloudPcOnPremisesConnectionStatus
     */
    @javax.annotation.Nullable
    public CloudPcOnPremisesConnectionStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("additionalDetails", this.getAdditionalDetails());
        writer.writeStringValue("correlationId", this.getCorrelationId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeEnumValue("errorType", this.getErrorType());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("recommendedAction", this.getRecommendedAction());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the additionalDetails property value. Additional details about the health check or the recommended action.
     * @param value Value to set for the additionalDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalDetails(@javax.annotation.Nullable final String value) {
        this.additionalDetails = value;
    }
    /**
     * Sets the correlationId property value. The unique identifier of the health check item-related activities. This identifier can be useful in troubleshooting.
     * @param value Value to set for the correlationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCorrelationId(@javax.annotation.Nullable final String value) {
        this.correlationId = value;
    }
    /**
     * Sets the displayName property value. The display name for this health check item.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the endDateTime property value. The end time of the health check item. Read-only.
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.endDateTime = value;
    }
    /**
     * Sets the errorType property value. The type of error that occurred during this health check.
     * @param value Value to set for the errorType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorType(@javax.annotation.Nullable final CloudPcOnPremisesConnectionHealthCheckErrorType value) {
        this.errorType = value;
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
     * Sets the recommendedAction property value. The recommended action to fix the corresponding error.
     * @param value Value to set for the recommendedAction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecommendedAction(@javax.annotation.Nullable final String value) {
        this.recommendedAction = value;
    }
    /**
     * Sets the startDateTime property value. The start time of the health check item. Read-only.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final CloudPcOnPremisesConnectionStatus value) {
        this.status = value;
    }
}
