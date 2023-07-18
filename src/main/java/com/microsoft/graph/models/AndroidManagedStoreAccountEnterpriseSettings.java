package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Enterprise settings for an Android managed store account.
 */
public class AndroidManagedStoreAccountEnterpriseSettings extends Entity implements Parsable {
    /**
     * Company codes for AndroidManagedStoreAccountEnterpriseSettings
     */
    private Boolean androidDeviceOwnerFullyManagedEnrollmentEnabled;
    /**
     * Bind status of the tenant with the Google EMM API
     */
    private AndroidManagedStoreAccountBindStatus bindStatus;
    /**
     * Company codes for AndroidManagedStoreAccountEnterpriseSettings
     */
    private java.util.List<AndroidEnrollmentCompanyCode> companyCodes;
    /**
     * Indicates if this account is flighting for Android Device Owner Management with CloudDPC.
     */
    private Boolean deviceOwnerManagementEnabled;
    /**
     * Android for Work device management targeting type for the account
     */
    private AndroidManagedStoreAccountEnrollmentTarget enrollmentTarget;
    /**
     * Last completion time for app sync
     */
    private OffsetDateTime lastAppSyncDateTime;
    /**
     * Sync status of the tenant with the Google EMM API
     */
    private AndroidManagedStoreAccountAppSyncStatus lastAppSyncStatus;
    /**
     * Last modification time for Android enterprise settings
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Initial scope tags for MGP apps
     */
    private java.util.List<String> managedGooglePlayInitialScopeTagIds;
    /**
     * Organization name used when onboarding Android Enterprise
     */
    private String ownerOrganizationName;
    /**
     * Owner UPN that created the enterprise
     */
    private String ownerUserPrincipalName;
    /**
     * Specifies which AAD groups can enroll devices in Android for Work device management if enrollmentTarget is set to 'Targeted'
     */
    private java.util.List<String> targetGroupIds;
    /**
     * Instantiates a new androidManagedStoreAccountEnterpriseSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidManagedStoreAccountEnterpriseSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidManagedStoreAccountEnterpriseSettings
     */
    @javax.annotation.Nonnull
    public static AndroidManagedStoreAccountEnterpriseSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidManagedStoreAccountEnterpriseSettings();
    }
    /**
     * Gets the androidDeviceOwnerFullyManagedEnrollmentEnabled property value. Company codes for AndroidManagedStoreAccountEnterpriseSettings
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAndroidDeviceOwnerFullyManagedEnrollmentEnabled() {
        return this.androidDeviceOwnerFullyManagedEnrollmentEnabled;
    }
    /**
     * Gets the bindStatus property value. Bind status of the tenant with the Google EMM API
     * @return a androidManagedStoreAccountBindStatus
     */
    @javax.annotation.Nullable
    public AndroidManagedStoreAccountBindStatus getBindStatus() {
        return this.bindStatus;
    }
    /**
     * Gets the companyCodes property value. Company codes for AndroidManagedStoreAccountEnterpriseSettings
     * @return a androidEnrollmentCompanyCode
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidEnrollmentCompanyCode> getCompanyCodes() {
        return this.companyCodes;
    }
    /**
     * Gets the deviceOwnerManagementEnabled property value. Indicates if this account is flighting for Android Device Owner Management with CloudDPC.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceOwnerManagementEnabled() {
        return this.deviceOwnerManagementEnabled;
    }
    /**
     * Gets the enrollmentTarget property value. Android for Work device management targeting type for the account
     * @return a androidManagedStoreAccountEnrollmentTarget
     */
    @javax.annotation.Nullable
    public AndroidManagedStoreAccountEnrollmentTarget getEnrollmentTarget() {
        return this.enrollmentTarget;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("androidDeviceOwnerFullyManagedEnrollmentEnabled", (n) -> { this.setAndroidDeviceOwnerFullyManagedEnrollmentEnabled(n.getBooleanValue()); });
        deserializerMap.put("bindStatus", (n) -> { this.setBindStatus(n.getEnumValue(AndroidManagedStoreAccountBindStatus.class)); });
        deserializerMap.put("companyCodes", (n) -> { this.setCompanyCodes(n.getCollectionOfObjectValues(AndroidEnrollmentCompanyCode::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceOwnerManagementEnabled", (n) -> { this.setDeviceOwnerManagementEnabled(n.getBooleanValue()); });
        deserializerMap.put("enrollmentTarget", (n) -> { this.setEnrollmentTarget(n.getEnumValue(AndroidManagedStoreAccountEnrollmentTarget.class)); });
        deserializerMap.put("lastAppSyncDateTime", (n) -> { this.setLastAppSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastAppSyncStatus", (n) -> { this.setLastAppSyncStatus(n.getEnumValue(AndroidManagedStoreAccountAppSyncStatus.class)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managedGooglePlayInitialScopeTagIds", (n) -> { this.setManagedGooglePlayInitialScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("ownerOrganizationName", (n) -> { this.setOwnerOrganizationName(n.getStringValue()); });
        deserializerMap.put("ownerUserPrincipalName", (n) -> { this.setOwnerUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("targetGroupIds", (n) -> { this.setTargetGroupIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastAppSyncDateTime property value. Last completion time for app sync
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastAppSyncDateTime() {
        return this.lastAppSyncDateTime;
    }
    /**
     * Gets the lastAppSyncStatus property value. Sync status of the tenant with the Google EMM API
     * @return a androidManagedStoreAccountAppSyncStatus
     */
    @javax.annotation.Nullable
    public AndroidManagedStoreAccountAppSyncStatus getLastAppSyncStatus() {
        return this.lastAppSyncStatus;
    }
    /**
     * Gets the lastModifiedDateTime property value. Last modification time for Android enterprise settings
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the managedGooglePlayInitialScopeTagIds property value. Initial scope tags for MGP apps
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getManagedGooglePlayInitialScopeTagIds() {
        return this.managedGooglePlayInitialScopeTagIds;
    }
    /**
     * Gets the ownerOrganizationName property value. Organization name used when onboarding Android Enterprise
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOwnerOrganizationName() {
        return this.ownerOrganizationName;
    }
    /**
     * Gets the ownerUserPrincipalName property value. Owner UPN that created the enterprise
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOwnerUserPrincipalName() {
        return this.ownerUserPrincipalName;
    }
    /**
     * Gets the targetGroupIds property value. Specifies which AAD groups can enroll devices in Android for Work device management if enrollmentTarget is set to 'Targeted'
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTargetGroupIds() {
        return this.targetGroupIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("androidDeviceOwnerFullyManagedEnrollmentEnabled", this.getAndroidDeviceOwnerFullyManagedEnrollmentEnabled());
        writer.writeEnumValue("bindStatus", this.getBindStatus());
        writer.writeCollectionOfObjectValues("companyCodes", this.getCompanyCodes());
        writer.writeBooleanValue("deviceOwnerManagementEnabled", this.getDeviceOwnerManagementEnabled());
        writer.writeEnumValue("enrollmentTarget", this.getEnrollmentTarget());
        writer.writeOffsetDateTimeValue("lastAppSyncDateTime", this.getLastAppSyncDateTime());
        writer.writeEnumValue("lastAppSyncStatus", this.getLastAppSyncStatus());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfPrimitiveValues("managedGooglePlayInitialScopeTagIds", this.getManagedGooglePlayInitialScopeTagIds());
        writer.writeStringValue("ownerOrganizationName", this.getOwnerOrganizationName());
        writer.writeStringValue("ownerUserPrincipalName", this.getOwnerUserPrincipalName());
        writer.writeCollectionOfPrimitiveValues("targetGroupIds", this.getTargetGroupIds());
    }
    /**
     * Sets the androidDeviceOwnerFullyManagedEnrollmentEnabled property value. Company codes for AndroidManagedStoreAccountEnterpriseSettings
     * @param value Value to set for the androidDeviceOwnerFullyManagedEnrollmentEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAndroidDeviceOwnerFullyManagedEnrollmentEnabled(@javax.annotation.Nullable final Boolean value) {
        this.androidDeviceOwnerFullyManagedEnrollmentEnabled = value;
    }
    /**
     * Sets the bindStatus property value. Bind status of the tenant with the Google EMM API
     * @param value Value to set for the bindStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBindStatus(@javax.annotation.Nullable final AndroidManagedStoreAccountBindStatus value) {
        this.bindStatus = value;
    }
    /**
     * Sets the companyCodes property value. Company codes for AndroidManagedStoreAccountEnterpriseSettings
     * @param value Value to set for the companyCodes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompanyCodes(@javax.annotation.Nullable final java.util.List<AndroidEnrollmentCompanyCode> value) {
        this.companyCodes = value;
    }
    /**
     * Sets the deviceOwnerManagementEnabled property value. Indicates if this account is flighting for Android Device Owner Management with CloudDPC.
     * @param value Value to set for the deviceOwnerManagementEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceOwnerManagementEnabled(@javax.annotation.Nullable final Boolean value) {
        this.deviceOwnerManagementEnabled = value;
    }
    /**
     * Sets the enrollmentTarget property value. Android for Work device management targeting type for the account
     * @param value Value to set for the enrollmentTarget property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrollmentTarget(@javax.annotation.Nullable final AndroidManagedStoreAccountEnrollmentTarget value) {
        this.enrollmentTarget = value;
    }
    /**
     * Sets the lastAppSyncDateTime property value. Last completion time for app sync
     * @param value Value to set for the lastAppSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastAppSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastAppSyncDateTime = value;
    }
    /**
     * Sets the lastAppSyncStatus property value. Sync status of the tenant with the Google EMM API
     * @param value Value to set for the lastAppSyncStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastAppSyncStatus(@javax.annotation.Nullable final AndroidManagedStoreAccountAppSyncStatus value) {
        this.lastAppSyncStatus = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Last modification time for Android enterprise settings
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the managedGooglePlayInitialScopeTagIds property value. Initial scope tags for MGP apps
     * @param value Value to set for the managedGooglePlayInitialScopeTagIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedGooglePlayInitialScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.managedGooglePlayInitialScopeTagIds = value;
    }
    /**
     * Sets the ownerOrganizationName property value. Organization name used when onboarding Android Enterprise
     * @param value Value to set for the ownerOrganizationName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwnerOrganizationName(@javax.annotation.Nullable final String value) {
        this.ownerOrganizationName = value;
    }
    /**
     * Sets the ownerUserPrincipalName property value. Owner UPN that created the enterprise
     * @param value Value to set for the ownerUserPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwnerUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.ownerUserPrincipalName = value;
    }
    /**
     * Sets the targetGroupIds property value. Specifies which AAD groups can enroll devices in Android for Work device management if enrollmentTarget is set to 'Targeted'
     * @param value Value to set for the targetGroupIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetGroupIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.targetGroupIds = value;
    }
}
