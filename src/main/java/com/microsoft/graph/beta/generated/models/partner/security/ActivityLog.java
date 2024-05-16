package com.microsoft.graph.beta.models.partner.security;

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
public class ActivityLog implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ActivityLog} and sets the default values.
     */
    public ActivityLog() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ActivityLog}
     */
    @jakarta.annotation.Nonnull
    public static ActivityLog createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ActivityLog();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("statusFrom", (n) -> { this.setStatusFrom(n.getEnumValue(SecurityAlertStatus::forValue)); });
        deserializerMap.put("statusTo", (n) -> { this.setStatusTo(n.getEnumValue(SecurityAlertStatus::forValue)); });
        deserializerMap.put("updatedBy", (n) -> { this.setUpdatedBy(n.getStringValue()); });
        deserializerMap.put("updatedDateTime", (n) -> { this.setUpdatedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
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
     * Gets the statusFrom property value. The statusFrom property
     * @return a {@link SecurityAlertStatus}
     */
    @jakarta.annotation.Nullable
    public SecurityAlertStatus getStatusFrom() {
        return this.backingStore.get("statusFrom");
    }
    /**
     * Gets the statusTo property value. The statusTo property
     * @return a {@link SecurityAlertStatus}
     */
    @jakarta.annotation.Nullable
    public SecurityAlertStatus getStatusTo() {
        return this.backingStore.get("statusTo");
    }
    /**
     * Gets the updatedBy property value. The UPN of the partner user who did the status update activity. This attribute is set by the system.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUpdatedBy() {
        return this.backingStore.get("updatedBy");
    }
    /**
     * Gets the updatedDateTime property value. The date and time for the status update activity. This attribute is set by the system. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUpdatedDateTime() {
        return this.backingStore.get("updatedDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("statusFrom", this.getStatusFrom());
        writer.writeEnumValue("statusTo", this.getStatusTo());
        writer.writeStringValue("updatedBy", this.getUpdatedBy());
        writer.writeOffsetDateTimeValue("updatedDateTime", this.getUpdatedDateTime());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the statusFrom property value. The statusFrom property
     * @param value Value to set for the statusFrom property.
     */
    public void setStatusFrom(@jakarta.annotation.Nullable final SecurityAlertStatus value) {
        this.backingStore.set("statusFrom", value);
    }
    /**
     * Sets the statusTo property value. The statusTo property
     * @param value Value to set for the statusTo property.
     */
    public void setStatusTo(@jakarta.annotation.Nullable final SecurityAlertStatus value) {
        this.backingStore.set("statusTo", value);
    }
    /**
     * Sets the updatedBy property value. The UPN of the partner user who did the status update activity. This attribute is set by the system.
     * @param value Value to set for the updatedBy property.
     */
    public void setUpdatedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("updatedBy", value);
    }
    /**
     * Sets the updatedDateTime property value. The date and time for the status update activity. This attribute is set by the system. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the updatedDateTime property.
     */
    public void setUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("updatedDateTime", value);
    }
}
