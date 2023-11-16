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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DepOnboardingSetting extends Entity implements Parsable {
    /**
     * Instantiates a new DepOnboardingSetting and sets the default values.
     */
    public DepOnboardingSetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DepOnboardingSetting
     */
    @jakarta.annotation.Nonnull
    public static DepOnboardingSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DepOnboardingSetting();
    }
    /**
     * Gets the appleIdentifier property value. The Apple ID used to obtain the current token.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppleIdentifier() {
        return this.BackingStore.get("appleIdentifier");
    }
    /**
     * Gets the dataSharingConsentGranted property value. Consent granted for data sharing with Apple Dep Service
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDataSharingConsentGranted() {
        return this.BackingStore.get("dataSharingConsentGranted");
    }
    /**
     * Gets the defaultIosEnrollmentProfile property value. Default iOS Enrollment Profile
     * @return a DepIOSEnrollmentProfile
     */
    @jakarta.annotation.Nullable
    public DepIOSEnrollmentProfile getDefaultIosEnrollmentProfile() {
        return this.BackingStore.get("defaultIosEnrollmentProfile");
    }
    /**
     * Gets the defaultMacOsEnrollmentProfile property value. Default MacOs Enrollment Profile
     * @return a DepMacOSEnrollmentProfile
     */
    @jakarta.annotation.Nullable
    public DepMacOSEnrollmentProfile getDefaultMacOsEnrollmentProfile() {
        return this.BackingStore.get("defaultMacOsEnrollmentProfile");
    }
    /**
     * Gets the enrollmentProfiles property value. The enrollment profiles.
     * @return a java.util.List<EnrollmentProfile>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EnrollmentProfile> getEnrollmentProfiles() {
        return this.BackingStore.get("enrollmentProfiles");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a java.util.List<ImportedAppleDeviceIdentity>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ImportedAppleDeviceIdentity> getImportedAppleDeviceIdentities() {
        return this.BackingStore.get("importedAppleDeviceIdentities");
    }
    /**
     * Gets the lastModifiedDateTime property value. When the service was onboarded.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.BackingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the lastSuccessfulSyncDateTime property value. When the service last syned with Intune
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSuccessfulSyncDateTime() {
        return this.BackingStore.get("lastSuccessfulSyncDateTime");
    }
    /**
     * Gets the lastSyncErrorCode property value. Error code reported by Apple during last dep sync.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLastSyncErrorCode() {
        return this.BackingStore.get("lastSyncErrorCode");
    }
    /**
     * Gets the lastSyncTriggeredDateTime property value. When Intune last requested a sync.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSyncTriggeredDateTime() {
        return this.BackingStore.get("lastSyncTriggeredDateTime");
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.BackingStore.get("roleScopeTagIds");
    }
    /**
     * Gets the shareTokenWithSchoolDataSyncService property value. Whether or not the Dep token sharing is enabled with the School Data Sync service.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getShareTokenWithSchoolDataSyncService() {
        return this.BackingStore.get("shareTokenWithSchoolDataSyncService");
    }
    /**
     * Gets the syncedDeviceCount property value. Gets synced device count
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSyncedDeviceCount() {
        return this.BackingStore.get("syncedDeviceCount");
    }
    /**
     * Gets the tokenExpirationDateTime property value. When the token will expire.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTokenExpirationDateTime() {
        return this.BackingStore.get("tokenExpirationDateTime");
    }
    /**
     * Gets the tokenName property value. Friendly Name for Dep Token
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTokenName() {
        return this.BackingStore.get("tokenName");
    }
    /**
     * Gets the tokenType property value. The tokenType property
     * @return a DepTokenType
     */
    @jakarta.annotation.Nullable
    public DepTokenType getTokenType() {
        return this.BackingStore.get("tokenType");
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
        this.BackingStore.set("appleIdentifier", value);
    }
    /**
     * Sets the dataSharingConsentGranted property value. Consent granted for data sharing with Apple Dep Service
     * @param value Value to set for the dataSharingConsentGranted property.
     */
    public void setDataSharingConsentGranted(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("dataSharingConsentGranted", value);
    }
    /**
     * Sets the defaultIosEnrollmentProfile property value. Default iOS Enrollment Profile
     * @param value Value to set for the defaultIosEnrollmentProfile property.
     */
    public void setDefaultIosEnrollmentProfile(@jakarta.annotation.Nullable final DepIOSEnrollmentProfile value) {
        this.BackingStore.set("defaultIosEnrollmentProfile", value);
    }
    /**
     * Sets the defaultMacOsEnrollmentProfile property value. Default MacOs Enrollment Profile
     * @param value Value to set for the defaultMacOsEnrollmentProfile property.
     */
    public void setDefaultMacOsEnrollmentProfile(@jakarta.annotation.Nullable final DepMacOSEnrollmentProfile value) {
        this.BackingStore.set("defaultMacOsEnrollmentProfile", value);
    }
    /**
     * Sets the enrollmentProfiles property value. The enrollment profiles.
     * @param value Value to set for the enrollmentProfiles property.
     */
    public void setEnrollmentProfiles(@jakarta.annotation.Nullable final java.util.List<EnrollmentProfile> value) {
        this.BackingStore.set("enrollmentProfiles", value);
    }
    /**
     * Sets the importedAppleDeviceIdentities property value. The imported Apple device identities.
     * @param value Value to set for the importedAppleDeviceIdentities property.
     */
    public void setImportedAppleDeviceIdentities(@jakarta.annotation.Nullable final java.util.List<ImportedAppleDeviceIdentity> value) {
        this.BackingStore.set("importedAppleDeviceIdentities", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. When the service was onboarded.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the lastSuccessfulSyncDateTime property value. When the service last syned with Intune
     * @param value Value to set for the lastSuccessfulSyncDateTime property.
     */
    public void setLastSuccessfulSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastSuccessfulSyncDateTime", value);
    }
    /**
     * Sets the lastSyncErrorCode property value. Error code reported by Apple during last dep sync.
     * @param value Value to set for the lastSyncErrorCode property.
     */
    public void setLastSyncErrorCode(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("lastSyncErrorCode", value);
    }
    /**
     * Sets the lastSyncTriggeredDateTime property value. When Intune last requested a sync.
     * @param value Value to set for the lastSyncTriggeredDateTime property.
     */
    public void setLastSyncTriggeredDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastSyncTriggeredDateTime", value);
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("roleScopeTagIds", value);
    }
    /**
     * Sets the shareTokenWithSchoolDataSyncService property value. Whether or not the Dep token sharing is enabled with the School Data Sync service.
     * @param value Value to set for the shareTokenWithSchoolDataSyncService property.
     */
    public void setShareTokenWithSchoolDataSyncService(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("shareTokenWithSchoolDataSyncService", value);
    }
    /**
     * Sets the syncedDeviceCount property value. Gets synced device count
     * @param value Value to set for the syncedDeviceCount property.
     */
    public void setSyncedDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("syncedDeviceCount", value);
    }
    /**
     * Sets the tokenExpirationDateTime property value. When the token will expire.
     * @param value Value to set for the tokenExpirationDateTime property.
     */
    public void setTokenExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("tokenExpirationDateTime", value);
    }
    /**
     * Sets the tokenName property value. Friendly Name for Dep Token
     * @param value Value to set for the tokenName property.
     */
    public void setTokenName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("tokenName", value);
    }
    /**
     * Sets the tokenType property value. The tokenType property
     * @param value Value to set for the tokenType property.
     */
    public void setTokenType(@jakarta.annotation.Nullable final DepTokenType value) {
        this.BackingStore.set("tokenType", value);
    }
}
