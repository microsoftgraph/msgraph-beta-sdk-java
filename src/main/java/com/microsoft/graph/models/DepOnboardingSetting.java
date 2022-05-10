package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DepOnboardingSetting extends Entity implements Parsable {
    /** The Apple ID used to obtain the current token. */
    private String _appleIdentifier;
    /** Consent granted for data sharing with Apple Dep Service */
    private Boolean _dataSharingConsentGranted;
    /** Default iOS Enrollment Profile */
    private DepIOSEnrollmentProfile _defaultIosEnrollmentProfile;
    /** Default MacOs Enrollment Profile */
    private DepMacOSEnrollmentProfile _defaultMacOsEnrollmentProfile;
    /** The enrollment profiles. */
    private java.util.List<EnrollmentProfile> _enrollmentProfiles;
    /** The imported Apple device identities. */
    private java.util.List<ImportedAppleDeviceIdentity> _importedAppleDeviceIdentities;
    /** When the service was onboarded. */
    private OffsetDateTime _lastModifiedDateTime;
    /** When the service last syned with Intune */
    private OffsetDateTime _lastSuccessfulSyncDateTime;
    /** Error code reported by Apple during last dep sync. */
    private Integer _lastSyncErrorCode;
    /** When Intune last requested a sync. */
    private OffsetDateTime _lastSyncTriggeredDateTime;
    /** List of Scope Tags for this Entity instance. */
    private java.util.List<String> _roleScopeTagIds;
    /** Whether or not the Dep token sharing is enabled with the School Data Sync service. */
    private Boolean _shareTokenWithSchoolDataSyncService;
    /** Gets synced device count */
    private Integer _syncedDeviceCount;
    /** When the token will expire. */
    private OffsetDateTime _tokenExpirationDateTime;
    /** Friendly Name for Dep Token */
    private String _tokenName;
    /** Gets or sets the Dep Token Type. Possible values are: none, dep, appleSchoolManager. */
    private DepTokenType _tokenType;
    /**
     * Instantiates a new depOnboardingSetting and sets the default values.
     * @return a void
     */
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
        return this._appleIdentifier;
    }
    /**
     * Gets the dataSharingConsentGranted property value. Consent granted for data sharing with Apple Dep Service
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDataSharingConsentGranted() {
        return this._dataSharingConsentGranted;
    }
    /**
     * Gets the defaultIosEnrollmentProfile property value. Default iOS Enrollment Profile
     * @return a depIOSEnrollmentProfile
     */
    @javax.annotation.Nullable
    public DepIOSEnrollmentProfile getDefaultIosEnrollmentProfile() {
        return this._defaultIosEnrollmentProfile;
    }
    /**
     * Gets the defaultMacOsEnrollmentProfile property value. Default MacOs Enrollment Profile
     * @return a depMacOSEnrollmentProfile
     */
    @javax.annotation.Nullable
    public DepMacOSEnrollmentProfile getDefaultMacOsEnrollmentProfile() {
        return this._defaultMacOsEnrollmentProfile;
    }
    /**
     * Gets the enrollmentProfiles property value. The enrollment profiles.
     * @return a enrollmentProfile
     */
    @javax.annotation.Nullable
    public java.util.List<EnrollmentProfile> getEnrollmentProfiles() {
        return this._enrollmentProfiles;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DepOnboardingSetting currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("appleIdentifier", (n) -> { currentObject.setAppleIdentifier(n.getStringValue()); });
            this.put("dataSharingConsentGranted", (n) -> { currentObject.setDataSharingConsentGranted(n.getBooleanValue()); });
            this.put("defaultIosEnrollmentProfile", (n) -> { currentObject.setDefaultIosEnrollmentProfile(n.getObjectValue(DepIOSEnrollmentProfile::createFromDiscriminatorValue)); });
            this.put("defaultMacOsEnrollmentProfile", (n) -> { currentObject.setDefaultMacOsEnrollmentProfile(n.getObjectValue(DepMacOSEnrollmentProfile::createFromDiscriminatorValue)); });
            this.put("enrollmentProfiles", (n) -> { currentObject.setEnrollmentProfiles(n.getCollectionOfObjectValues(EnrollmentProfile::createFromDiscriminatorValue)); });
            this.put("importedAppleDeviceIdentities", (n) -> { currentObject.setImportedAppleDeviceIdentities(n.getCollectionOfObjectValues(ImportedAppleDeviceIdentity::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastSuccessfulSyncDateTime", (n) -> { currentObject.setLastSuccessfulSyncDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastSyncErrorCode", (n) -> { currentObject.setLastSyncErrorCode(n.getIntegerValue()); });
            this.put("lastSyncTriggeredDateTime", (n) -> { currentObject.setLastSyncTriggeredDateTime(n.getOffsetDateTimeValue()); });
            this.put("roleScopeTagIds", (n) -> { currentObject.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("shareTokenWithSchoolDataSyncService", (n) -> { currentObject.setShareTokenWithSchoolDataSyncService(n.getBooleanValue()); });
            this.put("syncedDeviceCount", (n) -> { currentObject.setSyncedDeviceCount(n.getIntegerValue()); });
            this.put("tokenExpirationDateTime", (n) -> { currentObject.setTokenExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("tokenName", (n) -> { currentObject.setTokenName(n.getStringValue()); });
            this.put("tokenType", (n) -> { currentObject.setTokenType(n.getEnumValue(DepTokenType.class)); });
        }};
    }
    /**
     * Gets the importedAppleDeviceIdentities property value. The imported Apple device identities.
     * @return a importedAppleDeviceIdentity
     */
    @javax.annotation.Nullable
    public java.util.List<ImportedAppleDeviceIdentity> getImportedAppleDeviceIdentities() {
        return this._importedAppleDeviceIdentities;
    }
    /**
     * Gets the lastModifiedDateTime property value. When the service was onboarded.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the lastSuccessfulSyncDateTime property value. When the service last syned with Intune
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSuccessfulSyncDateTime() {
        return this._lastSuccessfulSyncDateTime;
    }
    /**
     * Gets the lastSyncErrorCode property value. Error code reported by Apple during last dep sync.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLastSyncErrorCode() {
        return this._lastSyncErrorCode;
    }
    /**
     * Gets the lastSyncTriggeredDateTime property value. When Intune last requested a sync.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSyncTriggeredDateTime() {
        return this._lastSyncTriggeredDateTime;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this._roleScopeTagIds;
    }
    /**
     * Gets the shareTokenWithSchoolDataSyncService property value. Whether or not the Dep token sharing is enabled with the School Data Sync service.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShareTokenWithSchoolDataSyncService() {
        return this._shareTokenWithSchoolDataSyncService;
    }
    /**
     * Gets the syncedDeviceCount property value. Gets synced device count
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSyncedDeviceCount() {
        return this._syncedDeviceCount;
    }
    /**
     * Gets the tokenExpirationDateTime property value. When the token will expire.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getTokenExpirationDateTime() {
        return this._tokenExpirationDateTime;
    }
    /**
     * Gets the tokenName property value. Friendly Name for Dep Token
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTokenName() {
        return this._tokenName;
    }
    /**
     * Gets the tokenType property value. Gets or sets the Dep Token Type. Possible values are: none, dep, appleSchoolManager.
     * @return a depTokenType
     */
    @javax.annotation.Nullable
    public DepTokenType getTokenType() {
        return this._tokenType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAppleIdentifier(@javax.annotation.Nullable final String value) {
        this._appleIdentifier = value;
    }
    /**
     * Sets the dataSharingConsentGranted property value. Consent granted for data sharing with Apple Dep Service
     * @param value Value to set for the dataSharingConsentGranted property.
     * @return a void
     */
    public void setDataSharingConsentGranted(@javax.annotation.Nullable final Boolean value) {
        this._dataSharingConsentGranted = value;
    }
    /**
     * Sets the defaultIosEnrollmentProfile property value. Default iOS Enrollment Profile
     * @param value Value to set for the defaultIosEnrollmentProfile property.
     * @return a void
     */
    public void setDefaultIosEnrollmentProfile(@javax.annotation.Nullable final DepIOSEnrollmentProfile value) {
        this._defaultIosEnrollmentProfile = value;
    }
    /**
     * Sets the defaultMacOsEnrollmentProfile property value. Default MacOs Enrollment Profile
     * @param value Value to set for the defaultMacOsEnrollmentProfile property.
     * @return a void
     */
    public void setDefaultMacOsEnrollmentProfile(@javax.annotation.Nullable final DepMacOSEnrollmentProfile value) {
        this._defaultMacOsEnrollmentProfile = value;
    }
    /**
     * Sets the enrollmentProfiles property value. The enrollment profiles.
     * @param value Value to set for the enrollmentProfiles property.
     * @return a void
     */
    public void setEnrollmentProfiles(@javax.annotation.Nullable final java.util.List<EnrollmentProfile> value) {
        this._enrollmentProfiles = value;
    }
    /**
     * Sets the importedAppleDeviceIdentities property value. The imported Apple device identities.
     * @param value Value to set for the importedAppleDeviceIdentities property.
     * @return a void
     */
    public void setImportedAppleDeviceIdentities(@javax.annotation.Nullable final java.util.List<ImportedAppleDeviceIdentity> value) {
        this._importedAppleDeviceIdentities = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. When the service was onboarded.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the lastSuccessfulSyncDateTime property value. When the service last syned with Intune
     * @param value Value to set for the lastSuccessfulSyncDateTime property.
     * @return a void
     */
    public void setLastSuccessfulSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastSuccessfulSyncDateTime = value;
    }
    /**
     * Sets the lastSyncErrorCode property value. Error code reported by Apple during last dep sync.
     * @param value Value to set for the lastSyncErrorCode property.
     * @return a void
     */
    public void setLastSyncErrorCode(@javax.annotation.Nullable final Integer value) {
        this._lastSyncErrorCode = value;
    }
    /**
     * Sets the lastSyncTriggeredDateTime property value. When Intune last requested a sync.
     * @param value Value to set for the lastSyncTriggeredDateTime property.
     * @return a void
     */
    public void setLastSyncTriggeredDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastSyncTriggeredDateTime = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleScopeTagIds = value;
    }
    /**
     * Sets the shareTokenWithSchoolDataSyncService property value. Whether or not the Dep token sharing is enabled with the School Data Sync service.
     * @param value Value to set for the shareTokenWithSchoolDataSyncService property.
     * @return a void
     */
    public void setShareTokenWithSchoolDataSyncService(@javax.annotation.Nullable final Boolean value) {
        this._shareTokenWithSchoolDataSyncService = value;
    }
    /**
     * Sets the syncedDeviceCount property value. Gets synced device count
     * @param value Value to set for the syncedDeviceCount property.
     * @return a void
     */
    public void setSyncedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._syncedDeviceCount = value;
    }
    /**
     * Sets the tokenExpirationDateTime property value. When the token will expire.
     * @param value Value to set for the tokenExpirationDateTime property.
     * @return a void
     */
    public void setTokenExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._tokenExpirationDateTime = value;
    }
    /**
     * Sets the tokenName property value. Friendly Name for Dep Token
     * @param value Value to set for the tokenName property.
     * @return a void
     */
    public void setTokenName(@javax.annotation.Nullable final String value) {
        this._tokenName = value;
    }
    /**
     * Sets the tokenType property value. Gets or sets the Dep Token Type. Possible values are: none, dep, appleSchoolManager.
     * @param value Value to set for the tokenType property.
     * @return a void
     */
    public void setTokenType(@javax.annotation.Nullable final DepTokenType value) {
        this._tokenType = value;
    }
}
