package microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
public class WindowsProtectionState extends Entity implements Parsable {
    /** The anti-malware version for the managed device. Optional. Read-only. */
    private String _antiMalwareVersion;
    /** A flag indicating whether attention is required for the managed device. Optional. Read-only. */
    private Boolean _attentionRequired;
    /** A flag indicating whether the managed device has been deleted. Optional. Read-only. */
    private Boolean _deviceDeleted;
    /** The date and time the device property has been refreshed. Optional. Read-only. */
    private OffsetDateTime _devicePropertyRefreshDateTime;
    /** The anti-virus engine version for the managed device. Optional. Read-only. */
    private String _engineVersion;
    /** A flag indicating whether quick scan is overdue for the managed device. Optional. Read-only. */
    private Boolean _fullScanOverdue;
    /** A flag indicating whether full scan is overdue for the managed device. Optional. Read-only. */
    private Boolean _fullScanRequired;
    /** The date and time a full scan was completed. Optional. Read-only. */
    private OffsetDateTime _lastFullScanDateTime;
    /** The version anti-malware version used to perform the last full scan. Optional. Read-only. */
    private String _lastFullScanSignatureVersion;
    /** The date and time a quick scan was completed. Optional. Read-only. */
    private OffsetDateTime _lastQuickScanDateTime;
    /** The version anti-malware version used to perform the last full scan. Optional. Read-only. */
    private String _lastQuickScanSignatureVersion;
    /** Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only. */
    private OffsetDateTime _lastRefreshedDateTime;
    /** The date and time the protection state was last reported for the managed device. Optional. Read-only. */
    private OffsetDateTime _lastReportedDateTime;
    /** A flag indicating whether malware protection is enabled for the managed device. Optional. Read-only. */
    private Boolean _malwareProtectionEnabled;
    /** The health state for the managed device. Optional. Read-only. */
    private String _managedDeviceHealthState;
    /** The unique identifier for the managed device. Optional. Read-only. */
    private String _managedDeviceId;
    /** The display name for the managed device. Optional. Read-only. */
    private String _managedDeviceName;
    /** A flag indicating whether the network inspection system is enabled. Optional. Read-only. */
    private Boolean _networkInspectionSystemEnabled;
    /** A flag indicating weather a quick scan is overdue. Optional. Read-only. */
    private Boolean _quickScanOverdue;
    /** A flag indicating whether real time protection is enabled. Optional. Read-only. */
    private Boolean _realTimeProtectionEnabled;
    /** A flag indicating whether a reboot is required. Optional. Read-only. */
    private Boolean _rebootRequired;
    /** A flag indicating whether an signature update is overdue. Optional. Read-only. */
    private Boolean _signatureUpdateOverdue;
    /** The signature version for the managed device. Optional. Read-only. */
    private String _signatureVersion;
    /** The display name for the managed tenant. Optional. Read-only. */
    private String _tenantDisplayName;
    /** The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only. */
    private String _tenantId;
    /**
     * Instantiates a new windowsProtectionState and sets the default values.
     * @return a void
     */
    public WindowsProtectionState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsProtectionState
     */
    @javax.annotation.Nonnull
    public static WindowsProtectionState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsProtectionState();
    }
    /**
     * Gets the antiMalwareVersion property value. The anti-malware version for the managed device. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAntiMalwareVersion() {
        return this._antiMalwareVersion;
    }
    /**
     * Gets the attentionRequired property value. A flag indicating whether attention is required for the managed device. Optional. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAttentionRequired() {
        return this._attentionRequired;
    }
    /**
     * Gets the deviceDeleted property value. A flag indicating whether the managed device has been deleted. Optional. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceDeleted() {
        return this._deviceDeleted;
    }
    /**
     * Gets the devicePropertyRefreshDateTime property value. The date and time the device property has been refreshed. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDevicePropertyRefreshDateTime() {
        return this._devicePropertyRefreshDateTime;
    }
    /**
     * Gets the engineVersion property value. The anti-virus engine version for the managed device. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEngineVersion() {
        return this._engineVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsProtectionState currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("antiMalwareVersion", (n) -> { currentObject.setAntiMalwareVersion(n.getStringValue()); });
            this.put("attentionRequired", (n) -> { currentObject.setAttentionRequired(n.getBooleanValue()); });
            this.put("deviceDeleted", (n) -> { currentObject.setDeviceDeleted(n.getBooleanValue()); });
            this.put("devicePropertyRefreshDateTime", (n) -> { currentObject.setDevicePropertyRefreshDateTime(n.getOffsetDateTimeValue()); });
            this.put("engineVersion", (n) -> { currentObject.setEngineVersion(n.getStringValue()); });
            this.put("fullScanOverdue", (n) -> { currentObject.setFullScanOverdue(n.getBooleanValue()); });
            this.put("fullScanRequired", (n) -> { currentObject.setFullScanRequired(n.getBooleanValue()); });
            this.put("lastFullScanDateTime", (n) -> { currentObject.setLastFullScanDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastFullScanSignatureVersion", (n) -> { currentObject.setLastFullScanSignatureVersion(n.getStringValue()); });
            this.put("lastQuickScanDateTime", (n) -> { currentObject.setLastQuickScanDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastQuickScanSignatureVersion", (n) -> { currentObject.setLastQuickScanSignatureVersion(n.getStringValue()); });
            this.put("lastRefreshedDateTime", (n) -> { currentObject.setLastRefreshedDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastReportedDateTime", (n) -> { currentObject.setLastReportedDateTime(n.getOffsetDateTimeValue()); });
            this.put("malwareProtectionEnabled", (n) -> { currentObject.setMalwareProtectionEnabled(n.getBooleanValue()); });
            this.put("managedDeviceHealthState", (n) -> { currentObject.setManagedDeviceHealthState(n.getStringValue()); });
            this.put("managedDeviceId", (n) -> { currentObject.setManagedDeviceId(n.getStringValue()); });
            this.put("managedDeviceName", (n) -> { currentObject.setManagedDeviceName(n.getStringValue()); });
            this.put("networkInspectionSystemEnabled", (n) -> { currentObject.setNetworkInspectionSystemEnabled(n.getBooleanValue()); });
            this.put("quickScanOverdue", (n) -> { currentObject.setQuickScanOverdue(n.getBooleanValue()); });
            this.put("realTimeProtectionEnabled", (n) -> { currentObject.setRealTimeProtectionEnabled(n.getBooleanValue()); });
            this.put("rebootRequired", (n) -> { currentObject.setRebootRequired(n.getBooleanValue()); });
            this.put("signatureUpdateOverdue", (n) -> { currentObject.setSignatureUpdateOverdue(n.getBooleanValue()); });
            this.put("signatureVersion", (n) -> { currentObject.setSignatureVersion(n.getStringValue()); });
            this.put("tenantDisplayName", (n) -> { currentObject.setTenantDisplayName(n.getStringValue()); });
            this.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the fullScanOverdue property value. A flag indicating whether quick scan is overdue for the managed device. Optional. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFullScanOverdue() {
        return this._fullScanOverdue;
    }
    /**
     * Gets the fullScanRequired property value. A flag indicating whether full scan is overdue for the managed device. Optional. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFullScanRequired() {
        return this._fullScanRequired;
    }
    /**
     * Gets the lastFullScanDateTime property value. The date and time a full scan was completed. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastFullScanDateTime() {
        return this._lastFullScanDateTime;
    }
    /**
     * Gets the lastFullScanSignatureVersion property value. The version anti-malware version used to perform the last full scan. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastFullScanSignatureVersion() {
        return this._lastFullScanSignatureVersion;
    }
    /**
     * Gets the lastQuickScanDateTime property value. The date and time a quick scan was completed. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastQuickScanDateTime() {
        return this._lastQuickScanDateTime;
    }
    /**
     * Gets the lastQuickScanSignatureVersion property value. The version anti-malware version used to perform the last full scan. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastQuickScanSignatureVersion() {
        return this._lastQuickScanSignatureVersion;
    }
    /**
     * Gets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastRefreshedDateTime() {
        return this._lastRefreshedDateTime;
    }
    /**
     * Gets the lastReportedDateTime property value. The date and time the protection state was last reported for the managed device. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastReportedDateTime() {
        return this._lastReportedDateTime;
    }
    /**
     * Gets the malwareProtectionEnabled property value. A flag indicating whether malware protection is enabled for the managed device. Optional. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMalwareProtectionEnabled() {
        return this._malwareProtectionEnabled;
    }
    /**
     * Gets the managedDeviceHealthState property value. The health state for the managed device. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceHealthState() {
        return this._managedDeviceHealthState;
    }
    /**
     * Gets the managedDeviceId property value. The unique identifier for the managed device. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceId() {
        return this._managedDeviceId;
    }
    /**
     * Gets the managedDeviceName property value. The display name for the managed device. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceName() {
        return this._managedDeviceName;
    }
    /**
     * Gets the networkInspectionSystemEnabled property value. A flag indicating whether the network inspection system is enabled. Optional. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNetworkInspectionSystemEnabled() {
        return this._networkInspectionSystemEnabled;
    }
    /**
     * Gets the quickScanOverdue property value. A flag indicating weather a quick scan is overdue. Optional. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getQuickScanOverdue() {
        return this._quickScanOverdue;
    }
    /**
     * Gets the realTimeProtectionEnabled property value. A flag indicating whether real time protection is enabled. Optional. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRealTimeProtectionEnabled() {
        return this._realTimeProtectionEnabled;
    }
    /**
     * Gets the rebootRequired property value. A flag indicating whether a reboot is required. Optional. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRebootRequired() {
        return this._rebootRequired;
    }
    /**
     * Gets the signatureUpdateOverdue property value. A flag indicating whether an signature update is overdue. Optional. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSignatureUpdateOverdue() {
        return this._signatureUpdateOverdue;
    }
    /**
     * Gets the signatureVersion property value. The signature version for the managed device. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSignatureVersion() {
        return this._signatureVersion;
    }
    /**
     * Gets the tenantDisplayName property value. The display name for the managed tenant. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantDisplayName() {
        return this._tenantDisplayName;
    }
    /**
     * Gets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("antiMalwareVersion", this.getAntiMalwareVersion());
        writer.writeBooleanValue("attentionRequired", this.getAttentionRequired());
        writer.writeBooleanValue("deviceDeleted", this.getDeviceDeleted());
        writer.writeOffsetDateTimeValue("devicePropertyRefreshDateTime", this.getDevicePropertyRefreshDateTime());
        writer.writeStringValue("engineVersion", this.getEngineVersion());
        writer.writeBooleanValue("fullScanOverdue", this.getFullScanOverdue());
        writer.writeBooleanValue("fullScanRequired", this.getFullScanRequired());
        writer.writeOffsetDateTimeValue("lastFullScanDateTime", this.getLastFullScanDateTime());
        writer.writeStringValue("lastFullScanSignatureVersion", this.getLastFullScanSignatureVersion());
        writer.writeOffsetDateTimeValue("lastQuickScanDateTime", this.getLastQuickScanDateTime());
        writer.writeStringValue("lastQuickScanSignatureVersion", this.getLastQuickScanSignatureVersion());
        writer.writeOffsetDateTimeValue("lastRefreshedDateTime", this.getLastRefreshedDateTime());
        writer.writeOffsetDateTimeValue("lastReportedDateTime", this.getLastReportedDateTime());
        writer.writeBooleanValue("malwareProtectionEnabled", this.getMalwareProtectionEnabled());
        writer.writeStringValue("managedDeviceHealthState", this.getManagedDeviceHealthState());
        writer.writeStringValue("managedDeviceId", this.getManagedDeviceId());
        writer.writeStringValue("managedDeviceName", this.getManagedDeviceName());
        writer.writeBooleanValue("networkInspectionSystemEnabled", this.getNetworkInspectionSystemEnabled());
        writer.writeBooleanValue("quickScanOverdue", this.getQuickScanOverdue());
        writer.writeBooleanValue("realTimeProtectionEnabled", this.getRealTimeProtectionEnabled());
        writer.writeBooleanValue("rebootRequired", this.getRebootRequired());
        writer.writeBooleanValue("signatureUpdateOverdue", this.getSignatureUpdateOverdue());
        writer.writeStringValue("signatureVersion", this.getSignatureVersion());
        writer.writeStringValue("tenantDisplayName", this.getTenantDisplayName());
        writer.writeStringValue("tenantId", this.getTenantId());
    }
    /**
     * Sets the antiMalwareVersion property value. The anti-malware version for the managed device. Optional. Read-only.
     * @param value Value to set for the antiMalwareVersion property.
     * @return a void
     */
    public void setAntiMalwareVersion(@javax.annotation.Nullable final String value) {
        this._antiMalwareVersion = value;
    }
    /**
     * Sets the attentionRequired property value. A flag indicating whether attention is required for the managed device. Optional. Read-only.
     * @param value Value to set for the attentionRequired property.
     * @return a void
     */
    public void setAttentionRequired(@javax.annotation.Nullable final Boolean value) {
        this._attentionRequired = value;
    }
    /**
     * Sets the deviceDeleted property value. A flag indicating whether the managed device has been deleted. Optional. Read-only.
     * @param value Value to set for the deviceDeleted property.
     * @return a void
     */
    public void setDeviceDeleted(@javax.annotation.Nullable final Boolean value) {
        this._deviceDeleted = value;
    }
    /**
     * Sets the devicePropertyRefreshDateTime property value. The date and time the device property has been refreshed. Optional. Read-only.
     * @param value Value to set for the devicePropertyRefreshDateTime property.
     * @return a void
     */
    public void setDevicePropertyRefreshDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._devicePropertyRefreshDateTime = value;
    }
    /**
     * Sets the engineVersion property value. The anti-virus engine version for the managed device. Optional. Read-only.
     * @param value Value to set for the engineVersion property.
     * @return a void
     */
    public void setEngineVersion(@javax.annotation.Nullable final String value) {
        this._engineVersion = value;
    }
    /**
     * Sets the fullScanOverdue property value. A flag indicating whether quick scan is overdue for the managed device. Optional. Read-only.
     * @param value Value to set for the fullScanOverdue property.
     * @return a void
     */
    public void setFullScanOverdue(@javax.annotation.Nullable final Boolean value) {
        this._fullScanOverdue = value;
    }
    /**
     * Sets the fullScanRequired property value. A flag indicating whether full scan is overdue for the managed device. Optional. Read-only.
     * @param value Value to set for the fullScanRequired property.
     * @return a void
     */
    public void setFullScanRequired(@javax.annotation.Nullable final Boolean value) {
        this._fullScanRequired = value;
    }
    /**
     * Sets the lastFullScanDateTime property value. The date and time a full scan was completed. Optional. Read-only.
     * @param value Value to set for the lastFullScanDateTime property.
     * @return a void
     */
    public void setLastFullScanDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastFullScanDateTime = value;
    }
    /**
     * Sets the lastFullScanSignatureVersion property value. The version anti-malware version used to perform the last full scan. Optional. Read-only.
     * @param value Value to set for the lastFullScanSignatureVersion property.
     * @return a void
     */
    public void setLastFullScanSignatureVersion(@javax.annotation.Nullable final String value) {
        this._lastFullScanSignatureVersion = value;
    }
    /**
     * Sets the lastQuickScanDateTime property value. The date and time a quick scan was completed. Optional. Read-only.
     * @param value Value to set for the lastQuickScanDateTime property.
     * @return a void
     */
    public void setLastQuickScanDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastQuickScanDateTime = value;
    }
    /**
     * Sets the lastQuickScanSignatureVersion property value. The version anti-malware version used to perform the last full scan. Optional. Read-only.
     * @param value Value to set for the lastQuickScanSignatureVersion property.
     * @return a void
     */
    public void setLastQuickScanSignatureVersion(@javax.annotation.Nullable final String value) {
        this._lastQuickScanSignatureVersion = value;
    }
    /**
     * Sets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only.
     * @param value Value to set for the lastRefreshedDateTime property.
     * @return a void
     */
    public void setLastRefreshedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastRefreshedDateTime = value;
    }
    /**
     * Sets the lastReportedDateTime property value. The date and time the protection state was last reported for the managed device. Optional. Read-only.
     * @param value Value to set for the lastReportedDateTime property.
     * @return a void
     */
    public void setLastReportedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastReportedDateTime = value;
    }
    /**
     * Sets the malwareProtectionEnabled property value. A flag indicating whether malware protection is enabled for the managed device. Optional. Read-only.
     * @param value Value to set for the malwareProtectionEnabled property.
     * @return a void
     */
    public void setMalwareProtectionEnabled(@javax.annotation.Nullable final Boolean value) {
        this._malwareProtectionEnabled = value;
    }
    /**
     * Sets the managedDeviceHealthState property value. The health state for the managed device. Optional. Read-only.
     * @param value Value to set for the managedDeviceHealthState property.
     * @return a void
     */
    public void setManagedDeviceHealthState(@javax.annotation.Nullable final String value) {
        this._managedDeviceHealthState = value;
    }
    /**
     * Sets the managedDeviceId property value. The unique identifier for the managed device. Optional. Read-only.
     * @param value Value to set for the managedDeviceId property.
     * @return a void
     */
    public void setManagedDeviceId(@javax.annotation.Nullable final String value) {
        this._managedDeviceId = value;
    }
    /**
     * Sets the managedDeviceName property value. The display name for the managed device. Optional. Read-only.
     * @param value Value to set for the managedDeviceName property.
     * @return a void
     */
    public void setManagedDeviceName(@javax.annotation.Nullable final String value) {
        this._managedDeviceName = value;
    }
    /**
     * Sets the networkInspectionSystemEnabled property value. A flag indicating whether the network inspection system is enabled. Optional. Read-only.
     * @param value Value to set for the networkInspectionSystemEnabled property.
     * @return a void
     */
    public void setNetworkInspectionSystemEnabled(@javax.annotation.Nullable final Boolean value) {
        this._networkInspectionSystemEnabled = value;
    }
    /**
     * Sets the quickScanOverdue property value. A flag indicating weather a quick scan is overdue. Optional. Read-only.
     * @param value Value to set for the quickScanOverdue property.
     * @return a void
     */
    public void setQuickScanOverdue(@javax.annotation.Nullable final Boolean value) {
        this._quickScanOverdue = value;
    }
    /**
     * Sets the realTimeProtectionEnabled property value. A flag indicating whether real time protection is enabled. Optional. Read-only.
     * @param value Value to set for the realTimeProtectionEnabled property.
     * @return a void
     */
    public void setRealTimeProtectionEnabled(@javax.annotation.Nullable final Boolean value) {
        this._realTimeProtectionEnabled = value;
    }
    /**
     * Sets the rebootRequired property value. A flag indicating whether a reboot is required. Optional. Read-only.
     * @param value Value to set for the rebootRequired property.
     * @return a void
     */
    public void setRebootRequired(@javax.annotation.Nullable final Boolean value) {
        this._rebootRequired = value;
    }
    /**
     * Sets the signatureUpdateOverdue property value. A flag indicating whether an signature update is overdue. Optional. Read-only.
     * @param value Value to set for the signatureUpdateOverdue property.
     * @return a void
     */
    public void setSignatureUpdateOverdue(@javax.annotation.Nullable final Boolean value) {
        this._signatureUpdateOverdue = value;
    }
    /**
     * Sets the signatureVersion property value. The signature version for the managed device. Optional. Read-only.
     * @param value Value to set for the signatureVersion property.
     * @return a void
     */
    public void setSignatureVersion(@javax.annotation.Nullable final String value) {
        this._signatureVersion = value;
    }
    /**
     * Sets the tenantDisplayName property value. The display name for the managed tenant. Optional. Read-only.
     * @param value Value to set for the tenantDisplayName property.
     * @return a void
     */
    public void setTenantDisplayName(@javax.annotation.Nullable final String value) {
        this._tenantDisplayName = value;
    }
    /**
     * Sets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
}
