package com.microsoft.graph.beta.models;

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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DepOnboardingSetting extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DepOnboardingSetting} and sets the default values.
     */
    public DepOnboardingSetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DepOnboardingSetting}
     */
    @jakarta.annotation.Nonnull
    public static DepOnboardingSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DepOnboardingSetting();
    }
    /**
     * Gets the appleIdentifier property value. The Apple ID used to obtain the current token.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppleIdentifier() {
        return this.backingStore.get("appleIdentifier");
    }
    /**
     * Gets the dataSharingConsentGranted property value. Consent granted for data sharing with Apple Dep Service
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDataSharingConsentGranted() {
        return this.backingStore.get("dataSharingConsentGranted");
    }
    /**
     * Gets the defaultIosEnrollmentProfile property value. Default iOS Enrollment Profile
     * @return a {@link DepIOSEnrollmentProfile}
     */
    @jakarta.annotation.Nullable
    public DepIOSEnrollmentProfile getDefaultIosEnrollmentProfile() {
        return this.backingStore.get("defaultIosEnrollmentProfile");
    }
    /**
     * Gets the defaultMacOsEnrollmentProfile property value. Default MacOs Enrollment Profile
     * @return a {@link DepMacOSEnrollmentProfile}
     */
    @jakarta.annotation.Nullable
    public DepMacOSEnrollmentProfile getDefaultMacOsEnrollmentProfile() {
        return this.backingStore.get("defaultMacOsEnrollmentProfile");
    }
    /**
     * Gets the defaultTvOSEnrollmentProfile property value. Default TvOS Enrollment Profile
     * @return a {@link DepTvOSEnrollmentProfile}
     */
    @jakarta.annotation.Nullable
    public DepTvOSEnrollmentProfile getDefaultTvOSEnrollmentProfile() {
        return this.backingStore.get("defaultTvOSEnrollmentProfile");
    }
    /**
     * Gets the defaultVisionOSEnrollmentProfile property value. Default VisionOS Enrollment Profile
     * @return a {@link DepVisionOSEnrollmentProfile}
     */
    @jakarta.annotation.Nullable
    public DepVisionOSEnrollmentProfile getDefaultVisionOSEnrollmentProfile() {
        return this.backingStore.get("defaultVisionOSEnrollmentProfile");
    }
    /**
     * Gets the enrollmentProfiles property value. The enrollment profiles.
     * @return a {@link java.util.List<EnrollmentProfile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EnrollmentProfile> getEnrollmentProfiles() {
        return this.backingStore.get("enrollmentProfiles");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appleIdentifier", (n) -> { this.setAppleIdentifier(n.getStringValue()); });
        deserializerMap.put("dataSharingConsentGranted", (n) -> { this.setDataSharingConsentGranted(n.getBooleanValue()); });
        deserializerMap.put("defaultIosEnrollmentProfile", (n) -> { this.setDefaultIosEnrollmentProfile(n.getObjectValue(DepIOSEnrollmentProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultMacOsEnrollmentProfile", (n) -> { this.setDefaultMacOsEnrollmentProfile(n.getObjectValue(DepMacOSEnrollmentProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultTvOSEnrollmentProfile", (n) -> { this.setDefaultTvOSEnrollmentProfile(n.getObjectValue(DepTvOSEnrollmentProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultVisionOSEnrollmentProfile", (n) -> { this.setDefaultVisionOSEnrollmentProfile(n.getObjectValue(DepVisionOSEnrollmentProfile::createFromDiscriminatorValue)); });
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
        deserializerMap.put("tokenType", (n) -> { this.setTokenType(n.getEnumValue(DepTokenType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the importedAppleDeviceIdentities property value. The imported Apple device identities.
     * @return a {@link java.util.List<ImportedAppleDeviceIdentity>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ImportedAppleDeviceIdentity> getImportedAppleDeviceIdentities() {
        return this.backingStore.get("importedAppleDeviceIdentities");
    }
    /**
     * Gets the lastModifiedDateTime property value. When the service was onboarded.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the lastSuccessfulSyncDateTime property value. When the service last syned with Intune
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSuccessfulSyncDateTime() {
        return this.backingStore.get("lastSuccessfulSyncDateTime");
    }
    /**
     * Gets the lastSyncErrorCode property value. Error code reported by Apple during last dep sync.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLastSyncErrorCode() {
        return this.backingStore.get("lastSyncErrorCode");
    }
    /**
     * Gets the lastSyncTriggeredDateTime property value. When Intune last requested a sync.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSyncTriggeredDateTime() {
        return this.backingStore.get("lastSyncTriggeredDateTime");
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.backingStore.get("roleScopeTagIds");
    }
    /**
     * Gets the shareTokenWithSchoolDataSyncService property value. Whether or not the Dep token sharing is enabled with the School Data Sync service.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShareTokenWithSchoolDataSyncService() {
        return this.backingStore.get("shareTokenWithSchoolDataSyncService");
    }
    /**
     * Gets the syncedDeviceCount property value. Gets synced device count
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSyncedDeviceCount() {
        return this.backingStore.get("syncedDeviceCount");
    }
    /**
     * Gets the tokenExpirationDateTime property value. When the token will expire.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTokenExpirationDateTime() {
        return this.backingStore.get("tokenExpirationDateTime");
    }
    /**
     * Gets the tokenName property value. Friendly Name for Dep Token
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTokenName() {
        return this.backingStore.get("tokenName");
    }
    /**
     * Gets the tokenType property value. The tokenType property
     * @return a {@link DepTokenType}
     */
    @jakarta.annotation.Nullable
    public DepTokenType getTokenType() {
        return this.backingStore.get("tokenType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appleIdentifier", this.getAppleIdentifier());
        writer.writeBooleanValue("dataSharingConsentGranted", this.getDataSharingConsentGranted());
        writer.writeObjectValue("defaultIosEnrollmentProfile", this.getDefaultIosEnrollmentProfile());
        writer.writeObjectValue("defaultMacOsEnrollmentProfile", this.getDefaultMacOsEnrollmentProfile());
        writer.writeObjectValue("defaultTvOSEnrollmentProfile", this.getDefaultTvOSEnrollmentProfile());
        writer.writeObjectValue("defaultVisionOSEnrollmentProfile", this.getDefaultVisionOSEnrollmentProfile());
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
     */
    public void setAppleIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appleIdentifier", value);
    }
    /**
     * Sets the dataSharingConsentGranted property value. Consent granted for data sharing with Apple Dep Service
     * @param value Value to set for the dataSharingConsentGranted property.
     */
    public void setDataSharingConsentGranted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("dataSharingConsentGranted", value);
    }
    /**
     * Sets the defaultIosEnrollmentProfile property value. Default iOS Enrollment Profile
     * @param value Value to set for the defaultIosEnrollmentProfile property.
     */
    public void setDefaultIosEnrollmentProfile(@jakarta.annotation.Nullable final DepIOSEnrollmentProfile value) {
        this.backingStore.set("defaultIosEnrollmentProfile", value);
    }
    /**
     * Sets the defaultMacOsEnrollmentProfile property value. Default MacOs Enrollment Profile
     * @param value Value to set for the defaultMacOsEnrollmentProfile property.
     */
    public void setDefaultMacOsEnrollmentProfile(@jakarta.annotation.Nullable final DepMacOSEnrollmentProfile value) {
        this.backingStore.set("defaultMacOsEnrollmentProfile", value);
    }
    /**
     * Sets the defaultTvOSEnrollmentProfile property value. Default TvOS Enrollment Profile
     * @param value Value to set for the defaultTvOSEnrollmentProfile property.
     */
    public void setDefaultTvOSEnrollmentProfile(@jakarta.annotation.Nullable final DepTvOSEnrollmentProfile value) {
        this.backingStore.set("defaultTvOSEnrollmentProfile", value);
    }
    /**
     * Sets the defaultVisionOSEnrollmentProfile property value. Default VisionOS Enrollment Profile
     * @param value Value to set for the defaultVisionOSEnrollmentProfile property.
     */
    public void setDefaultVisionOSEnrollmentProfile(@jakarta.annotation.Nullable final DepVisionOSEnrollmentProfile value) {
        this.backingStore.set("defaultVisionOSEnrollmentProfile", value);
    }
    /**
     * Sets the enrollmentProfiles property value. The enrollment profiles.
     * @param value Value to set for the enrollmentProfiles property.
     */
    public void setEnrollmentProfiles(@jakarta.annotation.Nullable final java.util.List<EnrollmentProfile> value) {
        this.backingStore.set("enrollmentProfiles", value);
    }
    /**
     * Sets the importedAppleDeviceIdentities property value. The imported Apple device identities.
     * @param value Value to set for the importedAppleDeviceIdentities property.
     */
    public void setImportedAppleDeviceIdentities(@jakarta.annotation.Nullable final java.util.List<ImportedAppleDeviceIdentity> value) {
        this.backingStore.set("importedAppleDeviceIdentities", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. When the service was onboarded.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the lastSuccessfulSyncDateTime property value. When the service last syned with Intune
     * @param value Value to set for the lastSuccessfulSyncDateTime property.
     */
    public void setLastSuccessfulSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastSuccessfulSyncDateTime", value);
    }
    /**
     * Sets the lastSyncErrorCode property value. Error code reported by Apple during last dep sync.
     * @param value Value to set for the lastSyncErrorCode property.
     */
    public void setLastSyncErrorCode(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("lastSyncErrorCode", value);
    }
    /**
     * Sets the lastSyncTriggeredDateTime property value. When Intune last requested a sync.
     * @param value Value to set for the lastSyncTriggeredDateTime property.
     */
    public void setLastSyncTriggeredDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastSyncTriggeredDateTime", value);
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("roleScopeTagIds", value);
    }
    /**
     * Sets the shareTokenWithSchoolDataSyncService property value. Whether or not the Dep token sharing is enabled with the School Data Sync service.
     * @param value Value to set for the shareTokenWithSchoolDataSyncService property.
     */
    public void setShareTokenWithSchoolDataSyncService(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("shareTokenWithSchoolDataSyncService", value);
    }
    /**
     * Sets the syncedDeviceCount property value. Gets synced device count
     * @param value Value to set for the syncedDeviceCount property.
     */
    public void setSyncedDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("syncedDeviceCount", value);
    }
    /**
     * Sets the tokenExpirationDateTime property value. When the token will expire.
     * @param value Value to set for the tokenExpirationDateTime property.
     */
    public void setTokenExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("tokenExpirationDateTime", value);
    }
    /**
     * Sets the tokenName property value. Friendly Name for Dep Token
     * @param value Value to set for the tokenName property.
     */
    public void setTokenName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tokenName", value);
    }
    /**
     * Sets the tokenType property value. The tokenType property
     * @param value Value to set for the tokenType property.
     */
    public void setTokenType(@jakarta.annotation.Nullable final DepTokenType value) {
        this.backingStore.set("tokenType", value);
    }
}
