package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcExternalPartnerSetting extends Entity implements Parsable {
    /**
     * Enable or disable the connection to an external partner. If true, an external partner API will accept incoming calls from external partners. Required. Supports $filter (eq).
     */
    private Boolean enableConnection;
    /**
     * Last data sync time for this external partner. The Timestamp type represents the date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 looks like this: '2014-01-01T00:00:00Z'.
     */
    private OffsetDateTime lastSyncDateTime;
    /**
     * The external partner ID.
     */
    private String partnerId;
    /**
     * The status property
     */
    private CloudPcExternalPartnerStatus status;
    /**
     * Status details message.
     */
    private String statusDetails;
    /**
     * Instantiates a new cloudPcExternalPartnerSetting and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public CloudPcExternalPartnerSetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcExternalPartnerSetting
     */
    @jakarta.annotation.Nonnull
    public static CloudPcExternalPartnerSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcExternalPartnerSetting();
    }
    /**
     * Gets the enableConnection property value. Enable or disable the connection to an external partner. If true, an external partner API will accept incoming calls from external partners. Required. Supports $filter (eq).
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableConnection() {
        return this.enableConnection;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("enableConnection", (n) -> { this.setEnableConnection(n.getBooleanValue()); });
        deserializerMap.put("lastSyncDateTime", (n) -> { this.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("partnerId", (n) -> { this.setPartnerId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(CloudPcExternalPartnerStatus.class)); });
        deserializerMap.put("statusDetails", (n) -> { this.setStatusDetails(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastSyncDateTime property value. Last data sync time for this external partner. The Timestamp type represents the date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 looks like this: '2014-01-01T00:00:00Z'.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this.lastSyncDateTime;
    }
    /**
     * Gets the partnerId property value. The external partner ID.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPartnerId() {
        return this.partnerId;
    }
    /**
     * Gets the status property value. The status property
     * @return a cloudPcExternalPartnerStatus
     */
    @jakarta.annotation.Nullable
    public CloudPcExternalPartnerStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the statusDetails property value. Status details message.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getStatusDetails() {
        return this.statusDetails;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("enableConnection", this.getEnableConnection());
        writer.writeOffsetDateTimeValue("lastSyncDateTime", this.getLastSyncDateTime());
        writer.writeStringValue("partnerId", this.getPartnerId());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("statusDetails", this.getStatusDetails());
    }
    /**
     * Sets the enableConnection property value. Enable or disable the connection to an external partner. If true, an external partner API will accept incoming calls from external partners. Required. Supports $filter (eq).
     * @param value Value to set for the enableConnection property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEnableConnection(@jakarta.annotation.Nullable final Boolean value) {
        this.enableConnection = value;
    }
    /**
     * Sets the lastSyncDateTime property value. Last data sync time for this external partner. The Timestamp type represents the date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 looks like this: '2014-01-01T00:00:00Z'.
     * @param value Value to set for the lastSyncDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastSyncDateTime = value;
    }
    /**
     * Sets the partnerId property value. The external partner ID.
     * @param value Value to set for the partnerId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPartnerId(@jakarta.annotation.Nullable final String value) {
        this.partnerId = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStatus(@jakarta.annotation.Nullable final CloudPcExternalPartnerStatus value) {
        this.status = value;
    }
    /**
     * Sets the statusDetails property value. Status details message.
     * @param value Value to set for the statusDetails property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStatusDetails(@jakarta.annotation.Nullable final String value) {
        this.statusDetails = value;
    }
}
