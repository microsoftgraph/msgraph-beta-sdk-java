package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The depOnboardingSetting represents an instance of the Apple DEP service being onboarded to Intune. The onboarded service instance manages an Apple Token used to synchronize data between Apple and Intune.
 */
public class DepOnboardingSetting extends Entity implements Parsable {
    /** The Apple ID used to obtain the current token. */
    private String appleIdentifier;
    /** Consent granted for data sharing with Apple Dep Service */
    private Boolean dataSharingConsentGranted;
    /** Default iOS Enrollment Profile */
    private DepIOSEnrollmentProfile defaultIosEnrollmentProfile;
    /** Default MacOs Enrollment Profile */
    private DepMacOSEnrollmentProfile defaultMacOsEnrollmentProfile;
    /** The enrollment profiles. */
    private java.util.List<EnrollmentProfile> enrollmentProfiles;
    /** The imported Apple device identities. */
    private java.util.List<ImportedAppleDeviceIdentity> importedAppleDeviceIdentities;
    /** When the service was onboarded. */
    private OffsetDateTime lastModifiedDateTime;
    /** When the service last syned with Intune */
    private OffsetDateTime lastSuccessfulSyncDateTime;
    /** Error code reported by Apple during last dep sync. */
    private Integer lastSyncErrorCode;
    /** When Intune last requested a sync. */
    private OffsetDateTime lastSyncTriggeredDateTime;
    /** List of Scope Tags for this Entity instance. */
    private java.util.List<String> roleScopeTagIds;
    /** Whether or not the Dep token sharing is enabled with the School Data Sync service. */
    private Boolean shareTokenWithSchoolDataSyncService;
    /** Gets synced device count */
    private Integer syncedDeviceCount;
    /** When the token will expire. */
    private OffsetDateTime tokenExpirationDateTime;
    /** Friendly Name for Dep Token */
    private String tokenName;
    /** The tokenType property */
    private DepTokenType tokenType;
    /**
     * Instantiates a new depOnboardingSetting and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DepOnboardingSetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a depOnboardingSetting
     */
    @javax.annotation.Nonnull
    public static DepOnboardingSetting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DepOnboardingSetting();
    }
    /**
     * Gets the appleIdentifier property value. The Apple ID used to obtain the current token.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppleIdentifier() {
        return this.appleIdentifier;
    }
    /**
     * Gets the dataSharingConsentGranted property value. Consent granted for data sharing with Apple Dep Service
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDataSharingConsentGranted() {
        return this.dataSharingConsentGranted;
    }
    /**
     * Gets the defaultIosEnrollmentProfile property value. Default iOS Enrollment Profile
     * @return a depIOSEnrollmentProfile
     */
    @javax.annotation.Nullable
    public DepIOSEnrollmentProfile getDefaultIosEnrollmentProfile() {
        return this.defaultIosEnrollmentProfile;
    }
    /**
     * Gets the defaultMacOsEnrollmentProfile property value. Default MacOs Enrollment Profile
     * @return a depMacOSEnrollmentProfile
     */
    @javax.annotation.Nullable
    public DepMacOSEnrollmentProfile getDefaultMacOsEnrollmentProfile() {
        return this.defaultMacOsEnrollmentProfile;
    }
    /**
     * Gets the enrollmentProfiles property value. The enrollment profiles.
     * @return a enrollmentProfile
     */
    @javax.annotation.Nullable
    public java.util.List<EnrollmentProfile> getEnrollmentProfiles() {
        return this.enrollmentProfiles;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appleIdentifier", (n) -> { this.setAppleIdentifier(n.getStringValue()); });
        deserializerMap.put("dataSharingConsentGranted", (n) -> { this.setDataSharingConsentGranted(n.getBooleanValue()); });
        deserializerMap.put("defaultIosEnrollmentProfile", (n) -> { this.setDefaultIosEnrollmentProfile(n.getObjectValue(DepIOSEnrollmentProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultMacOsEnrollmentProfile", (n) -> { this.setDefaultMacOsEnrollmentProfile(n.getObjectValue(DepMacOSEnrollmentProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("enrollmentProfiles", (n) -> { this.setEnrollmentProfiles(n.getCollectionOfObjectValues(EnrollmentProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("importedAppleDeviceIdentities", (n) -> { this.setImportedAppleDeviceIdentities(n.getCollectionOfObjectValues(ImportedAppleDeviceIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSuccessfulSyncDateTime", (n) -> { this.setLastSuccessfulSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSyncErrorCode", (n) -> { this.setLastSyncErrorCode(n.getIntegerValue()); });
        deserializerMap.put("lastSyncTriggeredDateTime", (n) -> { this.setLastSyncTriggeredDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("shareTokenWithSchoolDataSyncService", (n) -> { this.setShareTokenWithSchoolDataSyncService(n.getBooleanValue()); });
        deserializerMap.put("syncedDeviceCount", (n) -> { this.setSyncedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("tokenExpirationDateTime", (n) -> { this.setTokenExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("tokenName", (n) -> { this.setTokenName(n.getStringValue()); });
        deserializerMap.put("tokenType", (n) -> { this.setTokenType(n.getEnumValue(DepTokenType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the importedAppleDeviceIdentities property value. The imported Apple device identities.
     * @return a importedAppleDeviceIdentity
     */
    @javax.annotation.Nullable
    public java.util.List<ImportedAppleDeviceIdentity> getImportedAppleDeviceIdentities() {
        return this.importedAppleDeviceIdentities;
    }
    /**
     * Gets the lastModifiedDateTime property value. When the service was onboarded.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the lastSuccessfulSyncDateTime property value. When the service last syned with Intune
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSuccessfulSyncDateTime() {
        return this.lastSuccessfulSyncDateTime;
    }
    /**
     * Gets the lastSyncErrorCode property value. Error code reported by Apple during last dep sync.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLastSyncErrorCode() {
        return this.lastSyncErrorCode;
    }
    /**
     * Gets the lastSyncTriggeredDateTime property value. When Intune last requested a sync.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSyncTriggeredDateTime() {
        return this.lastSyncTriggeredDateTime;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.roleScopeTagIds;
    }
    /**
     * Gets the shareTokenWithSchoolDataSyncService property value. Whether or not the Dep token sharing is enabled with the School Data Sync service.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShareTokenWithSchoolDataSyncService() {
        return this.shareTokenWithSchoolDataSyncService;
    }
    /**
     * Gets the syncedDeviceCount property value. Gets synced device count
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSyncedDeviceCount() {
        return this.syncedDeviceCount;
    }
    /**
     * Gets the tokenExpirationDateTime property value. When the token will expire.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getTokenExpirationDateTime() {
        return this.tokenExpirationDateTime;
    }
    /**
     * Gets the tokenName property value. Friendly Name for Dep Token
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTokenName() {
        return this.tokenName;
    }
    /**
     * Gets the tokenType property value. The tokenType property
     * @return a DepTokenType
     */
    @javax.annotation.Nullable
    public DepTokenType getTokenType() {
        return this.tokenType;
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
        writer.writeStringValue("appleIdentifier", this.getAppleIdentifier());
        writer.writeBooleanValue("dataSharingConsentGranted", this.getDataSharingConsentGranted());
        writer.writeObjectValue("defaultIosEnrollmentProfile", this.getDefaultIosEnrollmentProfile());
        writer.writeObjectValue("defaultMacOsEnrollmentProfile", this.getDefaultMacOsEnrollmentProfile());
        writer.writeCollectionOfObjectValues("enrollmentProfiles", this.getEnrollmentProfiles());
        writer.writeCollectionOfObjectValues("importedAppleDeviceIdentities", this.getImportedAppleDeviceIdentities());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeOffsetDateTimeValue("lastSuccessfulSyncDateTime", this.getLastSuccessfulSyncDateTime());
        writer.writeIntegerValue("lastSyncErrorCode", this.getLastSyncErrorCode());
        writer.writeOffsetDateTimeValue("lastSyncTriggeredDateTime", this.getLastSyncTriggeredDateTime());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeBooleanValue("shareTokenWithSchoolDataSyncService", this.getShareTokenWithSchoolDataSyncService());
        writer.writeIntegerValue("syncedDeviceCount", this.getSyncedDeviceCount());
        writer.writeOffsetDateTimeValue("tokenExpirationDateTime", this.getTokenExpirationDateTime());
        writer.writeStringValue("tokenName", this.getTokenName());
        writer.writeEnumValue("tokenType", this.getTokenType());
    }
    /**
     * Sets the appleIdentifier property value. The Apple ID used to obtain the current token.
     * @param value Value to set for the appleIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppleIdentifier(@javax.annotation.Nullable final String value) {
        this.appleIdentifier = value;
    }
    /**
     * Sets the dataSharingConsentGranted property value. Consent granted for data sharing with Apple Dep Service
     * @param value Value to set for the dataSharingConsentGranted property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDataSharingConsentGranted(@javax.annotation.Nullable final Boolean value) {
        this.dataSharingConsentGranted = value;
    }
    /**
     * Sets the defaultIosEnrollmentProfile property value. Default iOS Enrollment Profile
     * @param value Value to set for the defaultIosEnrollmentProfile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultIosEnrollmentProfile(@javax.annotation.Nullable final DepIOSEnrollmentProfile value) {
        this.defaultIosEnrollmentProfile = value;
    }
    /**
     * Sets the defaultMacOsEnrollmentProfile property value. Default MacOs Enrollment Profile
     * @param value Value to set for the defaultMacOsEnrollmentProfile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultMacOsEnrollmentProfile(@javax.annotation.Nullable final DepMacOSEnrollmentProfile value) {
        this.defaultMacOsEnrollmentProfile = value;
    }
    /**
     * Sets the enrollmentProfiles property value. The enrollment profiles.
     * @param value Value to set for the enrollmentProfiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrollmentProfiles(@javax.annotation.Nullable final java.util.List<EnrollmentProfile> value) {
        this.enrollmentProfiles = value;
    }
    /**
     * Sets the importedAppleDeviceIdentities property value. The imported Apple device identities.
     * @param value Value to set for the importedAppleDeviceIdentities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImportedAppleDeviceIdentities(@javax.annotation.Nullable final java.util.List<ImportedAppleDeviceIdentity> value) {
        this.importedAppleDeviceIdentities = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. When the service was onboarded.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the lastSuccessfulSyncDateTime property value. When the service last syned with Intune
     * @param value Value to set for the lastSuccessfulSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSuccessfulSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastSuccessfulSyncDateTime = value;
    }
    /**
     * Sets the lastSyncErrorCode property value. Error code reported by Apple during last dep sync.
     * @param value Value to set for the lastSyncErrorCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSyncErrorCode(@javax.annotation.Nullable final Integer value) {
        this.lastSyncErrorCode = value;
    }
    /**
     * Sets the lastSyncTriggeredDateTime property value. When Intune last requested a sync.
     * @param value Value to set for the lastSyncTriggeredDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSyncTriggeredDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastSyncTriggeredDateTime = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.roleScopeTagIds = value;
    }
    /**
     * Sets the shareTokenWithSchoolDataSyncService property value. Whether or not the Dep token sharing is enabled with the School Data Sync service.
     * @param value Value to set for the shareTokenWithSchoolDataSyncService property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShareTokenWithSchoolDataSyncService(@javax.annotation.Nullable final Boolean value) {
        this.shareTokenWithSchoolDataSyncService = value;
    }
    /**
     * Sets the syncedDeviceCount property value. Gets synced device count
     * @param value Value to set for the syncedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSyncedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.syncedDeviceCount = value;
    }
    /**
     * Sets the tokenExpirationDateTime property value. When the token will expire.
     * @param value Value to set for the tokenExpirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTokenExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.tokenExpirationDateTime = value;
    }
    /**
     * Sets the tokenName property value. Friendly Name for Dep Token
     * @param value Value to set for the tokenName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTokenName(@javax.annotation.Nullable final String value) {
        this.tokenName = value;
    }
    /**
     * Sets the tokenType property value. The tokenType property
     * @param value Value to set for the tokenType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTokenType(@javax.annotation.Nullable final DepTokenType value) {
        this.tokenType = value;
    }
}
