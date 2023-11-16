package com.microsoft.graph.models;

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
     * Instantiates a new AndroidForWorkSettings and sets the default values.
     */
    public AndroidForWorkSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidForWorkSettings
     */
    @jakarta.annotation.Nonnull
    public static AndroidForWorkSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidForWorkSettings();
    }
    /**
     * Gets the bindStatus property value. Bind status of the tenant with the Google EMM API
     * @return a AndroidForWorkBindStatus
     */
    @jakarta.annotation.Nullable
    public AndroidForWorkBindStatus getBindStatus() {
        return this.BackingStore.get("bindStatus");
    }
    /**
     * Gets the deviceOwnerManagementEnabled property value. Indicates if this account is flighting for Android Device Owner Management with CloudDPC.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceOwnerManagementEnabled() {
        return this.BackingStore.get("deviceOwnerManagementEnabled");
    }
    /**
     * Gets the enrollmentTarget property value. Android for Work device management targeting type for the account
     * @return a AndroidForWorkEnrollmentTarget
     */
    @jakarta.annotation.Nullable
    public AndroidForWorkEnrollmentTarget getEnrollmentTarget() {
        return this.BackingStore.get("enrollmentTarget");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bindStatus", (n) -> { this.setBindStatus(n.getEnumValue(AndroidForWorkBindStatus.class)); });
        deserializerMap.put("deviceOwnerManagementEnabled", (n) -> { this.setDeviceOwnerManagementEnabled(n.getBooleanValue()); });
        deserializerMap.put("enrollmentTarget", (n) -> { this.setEnrollmentTarget(n.getEnumValue(AndroidForWorkEnrollmentTarget.class)); });
        deserializerMap.put("lastAppSyncDateTime", (n) -> { this.setLastAppSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastAppSyncStatus", (n) -> { this.setLastAppSyncStatus(n.getEnumValue(AndroidForWorkSyncStatus.class)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("ownerOrganizationName", (n) -> { this.setOwnerOrganizationName(n.getStringValue()); });
        deserializerMap.put("ownerUserPrincipalName", (n) -> { this.setOwnerUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("targetGroupIds", (n) -> { this.setTargetGroupIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastAppSyncDateTime property value. Last completion time for app sync
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastAppSyncDateTime() {
        return this.BackingStore.get("lastAppSyncDateTime");
    }
    /**
     * Gets the lastAppSyncStatus property value. Sync status of the tenant with the Google EMM API
     * @return a AndroidForWorkSyncStatus
     */
    @jakarta.annotation.Nullable
    public AndroidForWorkSyncStatus getLastAppSyncStatus() {
        return this.BackingStore.get("lastAppSyncStatus");
    }
    /**
     * Gets the lastModifiedDateTime property value. Last modification time for Android for Work settings
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.BackingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the ownerOrganizationName property value. Organization name used when onboarding Android for Work
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOwnerOrganizationName() {
        return this.BackingStore.get("ownerOrganizationName");
    }
    /**
     * Gets the ownerUserPrincipalName property value. Owner UPN that created the enterprise
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOwnerUserPrincipalName() {
        return this.BackingStore.get("ownerUserPrincipalName");
    }
    /**
     * Gets the targetGroupIds property value. Specifies which AAD groups can enroll devices in Android for Work device management if enrollmentTarget is set to 'Targeted'
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTargetGroupIds() {
        return this.BackingStore.get("targetGroupIds");
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
        this.BackingStore.set("bindStatus", value);
    }
    /**
     * Sets the deviceOwnerManagementEnabled property value. Indicates if this account is flighting for Android Device Owner Management with CloudDPC.
     * @param value Value to set for the deviceOwnerManagementEnabled property.
     */
    public void setDeviceOwnerManagementEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("deviceOwnerManagementEnabled", value);
    }
    /**
     * Sets the enrollmentTarget property value. Android for Work device management targeting type for the account
     * @param value Value to set for the enrollmentTarget property.
     */
    public void setEnrollmentTarget(@jakarta.annotation.Nullable final AndroidForWorkEnrollmentTarget value) {
        this.BackingStore.set("enrollmentTarget", value);
    }
    /**
     * Sets the lastAppSyncDateTime property value. Last completion time for app sync
     * @param value Value to set for the lastAppSyncDateTime property.
     */
    public void setLastAppSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastAppSyncDateTime", value);
    }
    /**
     * Sets the lastAppSyncStatus property value. Sync status of the tenant with the Google EMM API
     * @param value Value to set for the lastAppSyncStatus property.
     */
    public void setLastAppSyncStatus(@jakarta.annotation.Nullable final AndroidForWorkSyncStatus value) {
        this.BackingStore.set("lastAppSyncStatus", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Last modification time for Android for Work settings
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the ownerOrganizationName property value. Organization name used when onboarding Android for Work
     * @param value Value to set for the ownerOrganizationName property.
     */
    public void setOwnerOrganizationName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("ownerOrganizationName", value);
    }
    /**
     * Sets the ownerUserPrincipalName property value. Owner UPN that created the enterprise
     * @param value Value to set for the ownerUserPrincipalName property.
     */
    public void setOwnerUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("ownerUserPrincipalName", value);
    }
    /**
     * Sets the targetGroupIds property value. Specifies which AAD groups can enroll devices in Android for Work device management if enrollmentTarget is set to 'Targeted'
     * @param value Value to set for the targetGroupIds property.
     */
    public void setTargetGroupIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("targetGroupIds", value);
    }
}
