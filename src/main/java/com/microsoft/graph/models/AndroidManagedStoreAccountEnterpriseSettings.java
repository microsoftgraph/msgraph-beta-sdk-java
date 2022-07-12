package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidManagedStoreAccountEnterpriseSettings extends Entity implements Parsable {
    /** Company codes for AndroidManagedStoreAccountEnterpriseSettings */
    private Boolean _androidDeviceOwnerFullyManagedEnrollmentEnabled;
    /** Bind status of the tenant with the Google EMM API */
    private AndroidManagedStoreAccountBindStatus _bindStatus;
    /** Company codes for AndroidManagedStoreAccountEnterpriseSettings */
    private java.util.List<AndroidEnrollmentCompanyCode> _companyCodes;
    /** Indicates if this account is flighting for Android Device Owner Management with CloudDPC. */
    private Boolean _deviceOwnerManagementEnabled;
    /** Android for Work device management targeting type for the account */
    private AndroidManagedStoreAccountEnrollmentTarget _enrollmentTarget;
    /** Last completion time for app sync */
    private OffsetDateTime _lastAppSyncDateTime;
    /** Sync status of the tenant with the Google EMM API */
    private AndroidManagedStoreAccountAppSyncStatus _lastAppSyncStatus;
    /** Last modification time for Android enterprise settings */
    private OffsetDateTime _lastModifiedDateTime;
    /** Initial scope tags for MGP apps */
    private java.util.List<String> _managedGooglePlayInitialScopeTagIds;
    /** Organization name used when onboarding Android Enterprise */
    private String _ownerOrganizationName;
    /** Owner UPN that created the enterprise */
    private String _ownerUserPrincipalName;
    /** Specifies which AAD groups can enroll devices in Android for Work device management if enrollmentTarget is set to 'Targeted' */
    private java.util.List<String> _targetGroupIds;
    /**
     * Instantiates a new AndroidManagedStoreAccountEnterpriseSettings and sets the default values.
     * @return a void
     */
    public AndroidManagedStoreAccountEnterpriseSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidManagedStoreAccountEnterpriseSettings
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
        return this._androidDeviceOwnerFullyManagedEnrollmentEnabled;
    }
    /**
     * Gets the bindStatus property value. Bind status of the tenant with the Google EMM API
     * @return a androidManagedStoreAccountBindStatus
     */
    @javax.annotation.Nullable
    public AndroidManagedStoreAccountBindStatus getBindStatus() {
        return this._bindStatus;
    }
    /**
     * Gets the companyCodes property value. Company codes for AndroidManagedStoreAccountEnterpriseSettings
     * @return a androidEnrollmentCompanyCode
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidEnrollmentCompanyCode> getCompanyCodes() {
        return this._companyCodes;
    }
    /**
     * Gets the deviceOwnerManagementEnabled property value. Indicates if this account is flighting for Android Device Owner Management with CloudDPC.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceOwnerManagementEnabled() {
        return this._deviceOwnerManagementEnabled;
    }
    /**
     * Gets the enrollmentTarget property value. Android for Work device management targeting type for the account
     * @return a androidManagedStoreAccountEnrollmentTarget
     */
    @javax.annotation.Nullable
    public AndroidManagedStoreAccountEnrollmentTarget getEnrollmentTarget() {
        return this._enrollmentTarget;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidManagedStoreAccountEnterpriseSettings currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("androidDeviceOwnerFullyManagedEnrollmentEnabled", (n) -> { currentObject.setAndroidDeviceOwnerFullyManagedEnrollmentEnabled(n.getBooleanValue()); });
            this.put("bindStatus", (n) -> { currentObject.setBindStatus(n.getEnumValue(AndroidManagedStoreAccountBindStatus.class)); });
            this.put("companyCodes", (n) -> { currentObject.setCompanyCodes(n.getCollectionOfObjectValues(AndroidEnrollmentCompanyCode::createFromDiscriminatorValue)); });
            this.put("deviceOwnerManagementEnabled", (n) -> { currentObject.setDeviceOwnerManagementEnabled(n.getBooleanValue()); });
            this.put("enrollmentTarget", (n) -> { currentObject.setEnrollmentTarget(n.getEnumValue(AndroidManagedStoreAccountEnrollmentTarget.class)); });
            this.put("lastAppSyncDateTime", (n) -> { currentObject.setLastAppSyncDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastAppSyncStatus", (n) -> { currentObject.setLastAppSyncStatus(n.getEnumValue(AndroidManagedStoreAccountAppSyncStatus.class)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("managedGooglePlayInitialScopeTagIds", (n) -> { currentObject.setManagedGooglePlayInitialScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("ownerOrganizationName", (n) -> { currentObject.setOwnerOrganizationName(n.getStringValue()); });
            this.put("ownerUserPrincipalName", (n) -> { currentObject.setOwnerUserPrincipalName(n.getStringValue()); });
            this.put("targetGroupIds", (n) -> { currentObject.setTargetGroupIds(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the lastAppSyncDateTime property value. Last completion time for app sync
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastAppSyncDateTime() {
        return this._lastAppSyncDateTime;
    }
    /**
     * Gets the lastAppSyncStatus property value. Sync status of the tenant with the Google EMM API
     * @return a androidManagedStoreAccountAppSyncStatus
     */
    @javax.annotation.Nullable
    public AndroidManagedStoreAccountAppSyncStatus getLastAppSyncStatus() {
        return this._lastAppSyncStatus;
    }
    /**
     * Gets the lastModifiedDateTime property value. Last modification time for Android enterprise settings
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the managedGooglePlayInitialScopeTagIds property value. Initial scope tags for MGP apps
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getManagedGooglePlayInitialScopeTagIds() {
        return this._managedGooglePlayInitialScopeTagIds;
    }
    /**
     * Gets the ownerOrganizationName property value. Organization name used when onboarding Android Enterprise
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOwnerOrganizationName() {
        return this._ownerOrganizationName;
    }
    /**
     * Gets the ownerUserPrincipalName property value. Owner UPN that created the enterprise
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOwnerUserPrincipalName() {
        return this._ownerUserPrincipalName;
    }
    /**
     * Gets the targetGroupIds property value. Specifies which AAD groups can enroll devices in Android for Work device management if enrollmentTarget is set to 'Targeted'
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTargetGroupIds() {
        return this._targetGroupIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAndroidDeviceOwnerFullyManagedEnrollmentEnabled(@javax.annotation.Nullable final Boolean value) {
        this._androidDeviceOwnerFullyManagedEnrollmentEnabled = value;
    }
    /**
     * Sets the bindStatus property value. Bind status of the tenant with the Google EMM API
     * @param value Value to set for the bindStatus property.
     * @return a void
     */
    public void setBindStatus(@javax.annotation.Nullable final AndroidManagedStoreAccountBindStatus value) {
        this._bindStatus = value;
    }
    /**
     * Sets the companyCodes property value. Company codes for AndroidManagedStoreAccountEnterpriseSettings
     * @param value Value to set for the companyCodes property.
     * @return a void
     */
    public void setCompanyCodes(@javax.annotation.Nullable final java.util.List<AndroidEnrollmentCompanyCode> value) {
        this._companyCodes = value;
    }
    /**
     * Sets the deviceOwnerManagementEnabled property value. Indicates if this account is flighting for Android Device Owner Management with CloudDPC.
     * @param value Value to set for the deviceOwnerManagementEnabled property.
     * @return a void
     */
    public void setDeviceOwnerManagementEnabled(@javax.annotation.Nullable final Boolean value) {
        this._deviceOwnerManagementEnabled = value;
    }
    /**
     * Sets the enrollmentTarget property value. Android for Work device management targeting type for the account
     * @param value Value to set for the enrollmentTarget property.
     * @return a void
     */
    public void setEnrollmentTarget(@javax.annotation.Nullable final AndroidManagedStoreAccountEnrollmentTarget value) {
        this._enrollmentTarget = value;
    }
    /**
     * Sets the lastAppSyncDateTime property value. Last completion time for app sync
     * @param value Value to set for the lastAppSyncDateTime property.
     * @return a void
     */
    public void setLastAppSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastAppSyncDateTime = value;
    }
    /**
     * Sets the lastAppSyncStatus property value. Sync status of the tenant with the Google EMM API
     * @param value Value to set for the lastAppSyncStatus property.
     * @return a void
     */
    public void setLastAppSyncStatus(@javax.annotation.Nullable final AndroidManagedStoreAccountAppSyncStatus value) {
        this._lastAppSyncStatus = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Last modification time for Android enterprise settings
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the managedGooglePlayInitialScopeTagIds property value. Initial scope tags for MGP apps
     * @param value Value to set for the managedGooglePlayInitialScopeTagIds property.
     * @return a void
     */
    public void setManagedGooglePlayInitialScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._managedGooglePlayInitialScopeTagIds = value;
    }
    /**
     * Sets the ownerOrganizationName property value. Organization name used when onboarding Android Enterprise
     * @param value Value to set for the ownerOrganizationName property.
     * @return a void
     */
    public void setOwnerOrganizationName(@javax.annotation.Nullable final String value) {
        this._ownerOrganizationName = value;
    }
    /**
     * Sets the ownerUserPrincipalName property value. Owner UPN that created the enterprise
     * @param value Value to set for the ownerUserPrincipalName property.
     * @return a void
     */
    public void setOwnerUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._ownerUserPrincipalName = value;
    }
    /**
     * Sets the targetGroupIds property value. Specifies which AAD groups can enroll devices in Android for Work device management if enrollmentTarget is set to 'Targeted'
     * @param value Value to set for the targetGroupIds property.
     * @return a void
     */
    public void setTargetGroupIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._targetGroupIds = value;
    }
}
