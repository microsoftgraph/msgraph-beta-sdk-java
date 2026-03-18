package com.microsoft.graph.beta.models;

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
public class CloudPcExternalPartnerActionResult implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CloudPcExternalPartnerActionResult} and sets the default values.
     */
    public CloudPcExternalPartnerActionResult() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcExternalPartnerActionResult}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcExternalPartnerActionResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcExternalPartnerActionResult();
    }
    /**
     * Gets the activityId property value. The activity ID associated with the external partner action. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActivityId() {
        return this.backingStore.get("activityId");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the cloudPcId property value. The Cloud PC ID associated with the external partner action. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCloudPcId() {
        return this.backingStore.get("cloudPcId");
    }
    /**
     * Gets the errorCode property value. The errorCode property
     * @return a {@link CloudPcExternalPartnerActionErrorCode}
     */
    @jakarta.annotation.Nullable
    public CloudPcExternalPartnerActionErrorCode getErrorCode() {
        return this.backingStore.get("errorCode");
    }
    /**
     * Gets the errorMessage property value. The error message of the action. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getErrorMessage() {
        return this.backingStore.get("errorMessage");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("activityId", (n) -> { this.setActivityId(n.getStringValue()); });
        deserializerMap.put("cloudPcId", (n) -> { this.setCloudPcId(n.getStringValue()); });
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getEnumValue(CloudPcExternalPartnerActionErrorCode::forValue)); });
        deserializerMap.put("errorMessage", (n) -> { this.setErrorMessage(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(CloudPcExternalPartnerActionStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The last update time of the action. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the startDateTime property value. The start time of the action. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the state property value. The state property
     * @return a {@link CloudPcExternalPartnerActionStatus}
     */
    @jakarta.annotation.Nullable
    public CloudPcExternalPartnerActionStatus getState() {
        return this.backingStore.get("state");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("activityId", this.getActivityId());
        writer.writeStringValue("cloudPcId", this.getCloudPcId());
        writer.writeEnumValue("errorCode", this.getErrorCode());
        writer.writeStringValue("errorMessage", this.getErrorMessage());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeEnumValue("state", this.getState());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activityId property value. The activity ID associated with the external partner action. Read-only.
     * @param value Value to set for the activityId property.
     */
    public void setActivityId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("activityId", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
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
     * Sets the cloudPcId property value. The Cloud PC ID associated with the external partner action. Read-only.
     * @param value Value to set for the cloudPcId property.
     */
    public void setCloudPcId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("cloudPcId", value);
    }
    /**
     * Sets the errorCode property value. The errorCode property
     * @param value Value to set for the errorCode property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final CloudPcExternalPartnerActionErrorCode value) {
        this.backingStore.set("errorCode", value);
    }
    /**
     * Sets the errorMessage property value. The error message of the action. Read-only.
     * @param value Value to set for the errorMessage property.
     */
    public void setErrorMessage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("errorMessage", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The last update time of the action. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the startDateTime property value. The start time of the action. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Read-only.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final CloudPcExternalPartnerActionStatus value) {
        this.backingStore.set("state", value);
    }
}
