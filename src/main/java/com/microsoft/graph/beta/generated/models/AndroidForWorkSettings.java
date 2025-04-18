package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Settings for Android For Work.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidForWorkSettings extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AndroidForWorkSettings} and sets the default values.
     */
    public AndroidForWorkSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AndroidForWorkSettings}
     */
    @jakarta.annotation.Nonnull
    public static AndroidForWorkSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidForWorkSettings();
    }
    /**
     * Gets the bindStatus property value. Bind status of the tenant with the Google EMM API
     * @return a {@link AndroidForWorkBindStatus}
     */
    @jakarta.annotation.Nullable
    public AndroidForWorkBindStatus getBindStatus() {
        return this.backingStore.get("bindStatus");
    }
    /**
     * Gets the deviceOwnerManagementEnabled property value. Indicates if this account is flighting for Android Device Owner Management with CloudDPC.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceOwnerManagementEnabled() {
        return this.backingStore.get("deviceOwnerManagementEnabled");
    }
    /**
     * Gets the enrollmentTarget property value. Android for Work device management targeting type for the account
     * @return a {@link AndroidForWorkEnrollmentTarget}
     */
    @jakarta.annotation.Nullable
    public AndroidForWorkEnrollmentTarget getEnrollmentTarget() {
        return this.backingStore.get("enrollmentTarget");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bindStatus", (n) -> { this.setBindStatus(n.getEnumValue(AndroidForWorkBindStatus::forValue)); });
        deserializerMap.put("deviceOwnerManagementEnabled", (n) -> { this.setDeviceOwnerManagementEnabled(n.getBooleanValue()); });
        deserializerMap.put("enrollmentTarget", (n) -> { this.setEnrollmentTarget(n.getEnumValue(AndroidForWorkEnrollmentTarget::forValue)); });
        deserializerMap.put("lastAppSyncDateTime", (n) -> { this.setLastAppSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastAppSyncStatus", (n) -> { this.setLastAppSyncStatus(n.getEnumValue(AndroidForWorkSyncStatus::forValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("ownerOrganizationName", (n) -> { this.setOwnerOrganizationName(n.getStringValue()); });
        deserializerMap.put("ownerUserPrincipalName", (n) -> { this.setOwnerUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("targetGroupIds", (n) -> { this.setTargetGroupIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastAppSyncDateTime property value. Last completion time for app sync
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastAppSyncDateTime() {
        return this.backingStore.get("lastAppSyncDateTime");
    }
    /**
     * Gets the lastAppSyncStatus property value. Sync status of the tenant with the Google EMM API
     * @return a {@link AndroidForWorkSyncStatus}
     */
    @jakarta.annotation.Nullable
    public AndroidForWorkSyncStatus getLastAppSyncStatus() {
        return this.backingStore.get("lastAppSyncStatus");
    }
    /**
     * Gets the lastModifiedDateTime property value. Last modification time for Android for Work settings
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the ownerOrganizationName property value. Organization name used when onboarding Android for Work
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOwnerOrganizationName() {
        return this.backingStore.get("ownerOrganizationName");
    }
    /**
     * Gets the ownerUserPrincipalName property value. Owner UPN that created the enterprise
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOwnerUserPrincipalName() {
        return this.backingStore.get("ownerUserPrincipalName");
    }
    /**
     * Gets the targetGroupIds property value. Specifies which AAD groups can enroll devices in Android for Work device management if enrollmentTarget is set to &apos;Targeted&apos;
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTargetGroupIds() {
        return this.backingStore.get("targetGroupIds");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("bindStatus", this.getBindStatus());
        writer.writeBooleanValue("deviceOwnerManagementEnabled", this.getDeviceOwnerManagementEnabled());
        writer.writeEnumValue("enrollmentTarget", this.getEnrollmentTarget());
        writer.writeOffsetDateTimeValue("lastAppSyncDateTime", this.getLastAppSyncDateTime());
        writer.writeEnumValue("lastAppSyncStatus", this.getLastAppSyncStatus());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("ownerOrganizationName", this.getOwnerOrganizationName());
        writer.writeStringValue("ownerUserPrincipalName", this.getOwnerUserPrincipalName());
        writer.writeCollectionOfPrimitiveValues("targetGroupIds", this.getTargetGroupIds());
    }
    /**
     * Sets the bindStatus property value. Bind status of the tenant with the Google EMM API
     * @param value Value to set for the bindStatus property.
     */
    public void setBindStatus(@jakarta.annotation.Nullable final AndroidForWorkBindStatus value) {
        this.backingStore.set("bindStatus", value);
    }
    /**
     * Sets the deviceOwnerManagementEnabled property value. Indicates if this account is flighting for Android Device Owner Management with CloudDPC.
     * @param value Value to set for the deviceOwnerManagementEnabled property.
     */
    public void setDeviceOwnerManagementEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("deviceOwnerManagementEnabled", value);
    }
    /**
     * Sets the enrollmentTarget property value. Android for Work device management targeting type for the account
     * @param value Value to set for the enrollmentTarget property.
     */
    public void setEnrollmentTarget(@jakarta.annotation.Nullable final AndroidForWorkEnrollmentTarget value) {
        this.backingStore.set("enrollmentTarget", value);
    }
    /**
     * Sets the lastAppSyncDateTime property value. Last completion time for app sync
     * @param value Value to set for the lastAppSyncDateTime property.
     */
    public void setLastAppSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastAppSyncDateTime", value);
    }
    /**
     * Sets the lastAppSyncStatus property value. Sync status of the tenant with the Google EMM API
     * @param value Value to set for the lastAppSyncStatus property.
     */
    public void setLastAppSyncStatus(@jakarta.annotation.Nullable final AndroidForWorkSyncStatus value) {
        this.backingStore.set("lastAppSyncStatus", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Last modification time for Android for Work settings
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the ownerOrganizationName property value. Organization name used when onboarding Android for Work
     * @param value Value to set for the ownerOrganizationName property.
     */
    public void setOwnerOrganizationName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ownerOrganizationName", value);
    }
    /**
     * Sets the ownerUserPrincipalName property value. Owner UPN that created the enterprise
     * @param value Value to set for the ownerUserPrincipalName property.
     */
    public void setOwnerUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ownerUserPrincipalName", value);
    }
    /**
     * Sets the targetGroupIds property value. Specifies which AAD groups can enroll devices in Android for Work device management if enrollmentTarget is set to &apos;Targeted&apos;
     * @param value Value to set for the targetGroupIds property.
     */
    public void setTargetGroupIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("targetGroupIds", value);
    }
}
