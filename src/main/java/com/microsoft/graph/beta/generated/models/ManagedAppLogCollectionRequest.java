package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The Managed App log collection response
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedAppLogCollectionRequest extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ManagedAppLogCollectionRequest} and sets the default values.
     */
    public ManagedAppLogCollectionRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ManagedAppLogCollectionRequest}
     */
    @jakarta.annotation.Nonnull
    public static ManagedAppLogCollectionRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedAppLogCollectionRequest();
    }
    /**
     * Gets the completedDateTime property value. DateTime of when the log upload request was completed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this.backingStore.get("completedDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("completedDateTime", (n) -> { this.setCompletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managedAppRegistrationId", (n) -> { this.setManagedAppRegistrationId(n.getStringValue()); });
        deserializerMap.put("requestedBy", (n) -> { this.setRequestedBy(n.getStringValue()); });
        deserializerMap.put("requestedByUserPrincipalName", (n) -> { this.setRequestedByUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("requestedDateTime", (n) -> { this.setRequestedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("uploadedLogs", (n) -> { this.setUploadedLogs(n.getCollectionOfObjectValues(ManagedAppLogUpload::createFromDiscriminatorValue)); });
        deserializerMap.put("userLogUploadConsent", (n) -> { this.setUserLogUploadConsent(n.getEnumValue(ManagedAppLogUploadConsent::forValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managedAppRegistrationId property value. The unique identifier of the app instance for which diagnostic was collected.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagedAppRegistrationId() {
        return this.backingStore.get("managedAppRegistrationId");
    }
    /**
     * Gets the requestedBy property value. The user principal name associated with the request for the managed application log collection.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRequestedBy() {
        return this.backingStore.get("requestedBy");
    }
    /**
     * Gets the requestedByUserPrincipalName property value. The user principal name associated with the request for the managed application log collection. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRequestedByUserPrincipalName() {
        return this.backingStore.get("requestedByUserPrincipalName");
    }
    /**
     * Gets the requestedDateTime property value. DateTime of when the log upload request was received. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRequestedDateTime() {
        return this.backingStore.get("requestedDateTime");
    }
    /**
     * Gets the status property value. Indicates the status for the app log collection request - pending, completed or failed. Default is pending.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the uploadedLogs property value. The collection of log upload results as reported by each component on the device. Such components can be the application itself, the Mobile Application Management (MAM) SDK, and other on-device components that are requested to upload diagnostic logs.
     * @return a {@link java.util.List<ManagedAppLogUpload>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedAppLogUpload> getUploadedLogs() {
        return this.backingStore.get("uploadedLogs");
    }
    /**
     * Gets the userLogUploadConsent property value. Represents the current consent status of the associated `managedAppLogCollectionRequest`.
     * @return a {@link ManagedAppLogUploadConsent}
     */
    @jakarta.annotation.Nullable
    public ManagedAppLogUploadConsent getUserLogUploadConsent() {
        return this.backingStore.get("userLogUploadConsent");
    }
    /**
     * Gets the version property value. Version of the entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeStringValue("managedAppRegistrationId", this.getManagedAppRegistrationId());
        writer.writeStringValue("requestedBy", this.getRequestedBy());
        writer.writeStringValue("requestedByUserPrincipalName", this.getRequestedByUserPrincipalName());
        writer.writeOffsetDateTimeValue("requestedDateTime", this.getRequestedDateTime());
        writer.writeStringValue("status", this.getStatus());
        writer.writeCollectionOfObjectValues("uploadedLogs", this.getUploadedLogs());
        writer.writeEnumValue("userLogUploadConsent", this.getUserLogUploadConsent());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the completedDateTime property value. DateTime of when the log upload request was completed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only.
     * @param value Value to set for the completedDateTime property.
     */
    public void setCompletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("completedDateTime", value);
    }
    /**
     * Sets the managedAppRegistrationId property value. The unique identifier of the app instance for which diagnostic was collected.
     * @param value Value to set for the managedAppRegistrationId property.
     */
    public void setManagedAppRegistrationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedAppRegistrationId", value);
    }
    /**
     * Sets the requestedBy property value. The user principal name associated with the request for the managed application log collection.
     * @param value Value to set for the requestedBy property.
     */
    public void setRequestedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("requestedBy", value);
    }
    /**
     * Sets the requestedByUserPrincipalName property value. The user principal name associated with the request for the managed application log collection. Read-only.
     * @param value Value to set for the requestedByUserPrincipalName property.
     */
    public void setRequestedByUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("requestedByUserPrincipalName", value);
    }
    /**
     * Sets the requestedDateTime property value. DateTime of when the log upload request was received. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only.
     * @param value Value to set for the requestedDateTime property.
     */
    public void setRequestedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("requestedDateTime", value);
    }
    /**
     * Sets the status property value. Indicates the status for the app log collection request - pending, completed or failed. Default is pending.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the uploadedLogs property value. The collection of log upload results as reported by each component on the device. Such components can be the application itself, the Mobile Application Management (MAM) SDK, and other on-device components that are requested to upload diagnostic logs.
     * @param value Value to set for the uploadedLogs property.
     */
    public void setUploadedLogs(@jakarta.annotation.Nullable final java.util.List<ManagedAppLogUpload> value) {
        this.backingStore.set("uploadedLogs", value);
    }
    /**
     * Sets the userLogUploadConsent property value. Represents the current consent status of the associated `managedAppLogCollectionRequest`.
     * @param value Value to set for the userLogUploadConsent property.
     */
    public void setUserLogUploadConsent(@jakarta.annotation.Nullable final ManagedAppLogUploadConsent value) {
        this.backingStore.set("userLogUploadConsent", value);
    }
    /**
     * Sets the version property value. Version of the entity.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
}
