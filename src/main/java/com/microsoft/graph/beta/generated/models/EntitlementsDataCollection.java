package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EntitlementsDataCollection extends EntitlementsDataCollectionInfo implements Parsable {
    /**
     * Instantiates a new EntitlementsDataCollection and sets the default values.
     */
    public EntitlementsDataCollection() {
        super();
        this.setOdataType("#microsoft.graph.entitlementsDataCollection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EntitlementsDataCollection
     */
    @jakarta.annotation.Nonnull
    public static EntitlementsDataCollection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EntitlementsDataCollection();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("lastCollectionDateTime", (n) -> { this.setLastCollectionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("permissionsModificationCapability", (n) -> { this.setPermissionsModificationCapability(n.getEnumValue(PermissionsModificationCapability::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(DataCollectionStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastCollectionDateTime property value. Last transformation time of entitlements.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastCollectionDateTime() {
        return this.backingStore.get("lastCollectionDateTime");
    }
    /**
     * Gets the permissionsModificationCapability property value. The permissionsModificationCapability property
     * @return a PermissionsModificationCapability
     */
    @jakarta.annotation.Nullable
    public PermissionsModificationCapability getPermissionsModificationCapability() {
        return this.backingStore.get("permissionsModificationCapability");
    }
    /**
     * Gets the status property value. The status property
     * @return a DataCollectionStatus
     */
    @jakarta.annotation.Nullable
    public DataCollectionStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("lastCollectionDateTime", this.getLastCollectionDateTime());
        writer.writeEnumValue("permissionsModificationCapability", this.getPermissionsModificationCapability());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the lastCollectionDateTime property value. Last transformation time of entitlements.
     * @param value Value to set for the lastCollectionDateTime property.
     */
    public void setLastCollectionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastCollectionDateTime", value);
    }
    /**
     * Sets the permissionsModificationCapability property value. The permissionsModificationCapability property
     * @param value Value to set for the permissionsModificationCapability property.
     */
    public void setPermissionsModificationCapability(@jakarta.annotation.Nullable final PermissionsModificationCapability value) {
        this.backingStore.set("permissionsModificationCapability", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final DataCollectionStatus value) {
        this.backingStore.set("status", value);
    }
}
