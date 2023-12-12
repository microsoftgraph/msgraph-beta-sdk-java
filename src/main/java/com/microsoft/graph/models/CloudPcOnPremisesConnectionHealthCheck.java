package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcOnPremisesConnectionHealthCheck implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new CloudPcOnPremisesConnectionHealthCheck and sets the default values.
     */
    public CloudPcOnPremisesConnectionHealthCheck() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcOnPremisesConnectionHealthCheck
     */
    @jakarta.annotation.Nonnull
    public static CloudPcOnPremisesConnectionHealthCheck createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcOnPremisesConnectionHealthCheck();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the additionalDetails property value. More details about the health check or the recommended action.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAdditionalDetails() {
        return this.backingStore.get("additionalDetails");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the correlationId property value. The unique identifier of the health check item-related activities. This identifier can be useful in troubleshooting.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCorrelationId() {
        return this.backingStore.get("correlationId");
    }
    /**
     * Gets the displayName property value. The display name for this health check item.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the endDateTime property value. The end time of the health check item. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.backingStore.get("endDateTime");
    }
    /**
     * Gets the errorType property value. The type of error that occurred during this health check.
     * @return a CloudPcOnPremisesConnectionHealthCheckErrorType
     */
    @jakarta.annotation.Nullable
    public CloudPcOnPremisesConnectionHealthCheckErrorType getErrorType() {
        return this.backingStore.get("errorType");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("additionalDetails", (n) -> { this.setAdditionalDetails(n.getStringValue()); });
        deserializerMap.put("correlationId", (n) -> { this.setCorrelationId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("errorType", (n) -> { this.setErrorType(n.getEnumValue(CloudPcOnPremisesConnectionHealthCheckErrorType::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recommendedAction", (n) -> { this.setRecommendedAction(n.getStringValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(CloudPcOnPremisesConnectionStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the recommendedAction property value. The recommended action to fix the corresponding error.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRecommendedAction() {
        return this.backingStore.get("recommendedAction");
    }
    /**
     * Gets the startDateTime property value. The start time of the health check item. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the status property value. The status property
     * @return a CloudPcOnPremisesConnectionStatus
     */
    @jakarta.annotation.Nullable
    public CloudPcOnPremisesConnectionStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the additionalDetails property value. More details about the health check or the recommended action.
     * @param value Value to set for the additionalDetails property.
     */
    public void setAdditionalDetails(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("additionalDetails", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the correlationId property value. The unique identifier of the health check item-related activities. This identifier can be useful in troubleshooting.
     * @param value Value to set for the correlationId property.
     */
    public void setCorrelationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("correlationId", value);
    }
    /**
     * Sets the displayName property value. The display name for this health check item.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the endDateTime property value. The end time of the health check item. Read-only.
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("endDateTime", value);
    }
    /**
     * Sets the errorType property value. The type of error that occurred during this health check.
     * @param value Value to set for the errorType property.
     */
    public void setErrorType(@jakarta.annotation.Nullable final CloudPcOnPremisesConnectionHealthCheckErrorType value) {
        this.backingStore.set("errorType", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the recommendedAction property value. The recommended action to fix the corresponding error.
     * @param value Value to set for the recommendedAction property.
     */
    public void setRecommendedAction(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("recommendedAction", value);
    }
    /**
     * Sets the startDateTime property value. The start time of the health check item. Read-only.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final CloudPcOnPremisesConnectionStatus value) {
        this.backingStore.set("status", value);
    }
}
