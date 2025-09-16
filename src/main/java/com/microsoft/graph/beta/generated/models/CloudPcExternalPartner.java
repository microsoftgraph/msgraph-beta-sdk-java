package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcExternalPartner extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPcExternalPartner} and sets the default values.
     */
    public CloudPcExternalPartner() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcExternalPartner}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcExternalPartner createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcExternalPartner();
    }
    /**
     * Gets the connectionStatus property value. The connectionStatus property
     * @return a {@link CloudPcExternalPartnerStatus}
     */
    @jakarta.annotation.Nullable
    public CloudPcExternalPartnerStatus getConnectionStatus() {
        return this.backingStore.get("connectionStatus");
    }
    /**
     * Gets the enableConnection property value. The enableConnection property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableConnection() {
        return this.backingStore.get("enableConnection");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("connectionStatus", (n) -> { this.setConnectionStatus(n.getEnumValue(CloudPcExternalPartnerStatus::forValue)); });
        deserializerMap.put("enableConnection", (n) -> { this.setEnableConnection(n.getBooleanValue()); });
        deserializerMap.put("lastSyncDateTime", (n) -> { this.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("partnerId", (n) -> { this.setPartnerId(n.getStringValue()); });
        deserializerMap.put("statusDetails", (n) -> { this.setStatusDetails(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastSyncDateTime property value. The lastSyncDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this.backingStore.get("lastSyncDateTime");
    }
    /**
     * Gets the partnerId property value. The partnerId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPartnerId() {
        return this.backingStore.get("partnerId");
    }
    /**
     * Gets the statusDetails property value. The statusDetails property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatusDetails() {
        return this.backingStore.get("statusDetails");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("connectionStatus", this.getConnectionStatus());
        writer.writeBooleanValue("enableConnection", this.getEnableConnection());
        writer.writeOffsetDateTimeValue("lastSyncDateTime", this.getLastSyncDateTime());
        writer.writeStringValue("partnerId", this.getPartnerId());
        writer.writeStringValue("statusDetails", this.getStatusDetails());
    }
    /**
     * Sets the connectionStatus property value. The connectionStatus property
     * @param value Value to set for the connectionStatus property.
     */
    public void setConnectionStatus(@jakarta.annotation.Nullable final CloudPcExternalPartnerStatus value) {
        this.backingStore.set("connectionStatus", value);
    }
    /**
     * Sets the enableConnection property value. The enableConnection property
     * @param value Value to set for the enableConnection property.
     */
    public void setEnableConnection(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableConnection", value);
    }
    /**
     * Sets the lastSyncDateTime property value. The lastSyncDateTime property
     * @param value Value to set for the lastSyncDateTime property.
     */
    public void setLastSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastSyncDateTime", value);
    }
    /**
     * Sets the partnerId property value. The partnerId property
     * @param value Value to set for the partnerId property.
     */
    public void setPartnerId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("partnerId", value);
    }
    /**
     * Sets the statusDetails property value. The statusDetails property
     * @param value Value to set for the statusDetails property.
     */
    public void setStatusDetails(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("statusDetails", value);
    }
}
