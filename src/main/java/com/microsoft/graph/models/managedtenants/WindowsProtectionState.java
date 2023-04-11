package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsProtectionState extends Entity implements Parsable {
    /** The anti-malware version for the managed device. Optional. Read-only. */
    private String antiMalwareVersion;
    /** A flag indicating whether attention is required for the managed device. Optional. Read-only. */
    private Boolean attentionRequired;
    /** A flag indicating whether the managed device has been deleted. Optional. Read-only. */
    private Boolean deviceDeleted;
    /** The date and time the device property has been refreshed. Optional. Read-only. */
    private OffsetDateTime devicePropertyRefreshDateTime;
    /** The anti-virus engine version for the managed device. Optional. Read-only. */
    private String engineVersion;
    /** A flag indicating whether quick scan is overdue for the managed device. Optional. Read-only. */
    private Boolean fullScanOverdue;
    /** A flag indicating whether full scan is overdue for the managed device. Optional. Read-only. */
    private Boolean fullScanRequired;
    /** The date and time a full scan was completed. Optional. Read-only. */
    private OffsetDateTime lastFullScanDateTime;
    /** The version anti-malware version used to perform the last full scan. Optional. Read-only. */
    private String lastFullScanSignatureVersion;
    /** The date and time a quick scan was completed. Optional. Read-only. */
    private OffsetDateTime lastQuickScanDateTime;
    /** The version anti-malware version used to perform the last full scan. Optional. Read-only. */
    private String lastQuickScanSignatureVersion;
    /** Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only. */
    private OffsetDateTime lastRefreshedDateTime;
    /** The date and time the protection state was last reported for the managed device. Optional. Read-only. */
    private OffsetDateTime lastReportedDateTime;
    /** A flag indicating whether malware protection is enabled for the managed device. Optional. Read-only. */
    private Boolean malwareProtectionEnabled;
    /** The health state for the managed device. Optional. Read-only. */
    private String managedDeviceHealthState;
    /** The unique identifier for the managed device. Optional. Read-only. */
    private String managedDeviceId;
    /** The display name for the managed device. Optional. Read-only. */
    private String managedDeviceName;
    /** A flag indicating whether the network inspection system is enabled. Optional. Read-only. */
    private Boolean networkInspectionSystemEnabled;
    /** A flag indicating weather a quick scan is overdue. Optional. Read-only. */
    private Boolean quickScanOverdue;
    /** A flag indicating whether real time protection is enabled. Optional. Read-only. */
    private Boolean realTimeProtectionEnabled;
    /** A flag indicating whether a reboot is required. Optional. Read-only. */
    private Boolean rebootRequired;
    /** A flag indicating whether an signature update is overdue. Optional. Read-only. */
    private Boolean signatureUpdateOverdue;
    /** The signature version for the managed device. Optional. Read-only. */
    private String signatureVersion;
    /** The display name for the managed tenant. Optional. Read-only. */
    private String tenantDisplayName;
    /** The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only. */
    private String tenantId;
    /**
     * Instantiates a new windowsProtectionState and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.antiMalwareVersion;
    }
    /**
     * Gets the attentionRequired property value. A flag indicating whether attention is required for the managed device. Optional. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAttentionRequired() {
        return this.attentionRequired;
    }
    /**
     * Gets the deviceDeleted property value. A flag indicating whether the managed device has been deleted. Optional. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceDeleted() {
        return this.deviceDeleted;
    }
    /**
     * Gets the devicePropertyRefreshDateTime property value. The date and time the device property has been refreshed. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDevicePropertyRefreshDateTime() {
        return this.devicePropertyRefreshDateTime;
    }
    /**
     * Gets the engineVersion property value. The anti-virus engine version for the managed device. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEngineVersion() {
        return this.engineVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("antiMalwareVersion", (n) -> { this.setAntiMalwareVersion(n.getStringValue()); });
        deserializerMap.put("attentionRequired", (n) -> { this.setAttentionRequired(n.getBooleanValue()); });
        deserializerMap.put("deviceDeleted", (n) -> { this.setDeviceDeleted(n.getBooleanValue()); });
        deserializerMap.put("devicePropertyRefreshDateTime", (n) -> { this.setDevicePropertyRefreshDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("engineVersion", (n) -> { this.setEngineVersion(n.getStringValue()); });
        deserializerMap.put("fullScanOverdue", (n) -> { this.setFullScanOverdue(n.getBooleanValue()); });
        deserializerMap.put("fullScanRequired", (n) -> { this.setFullScanRequired(n.getBooleanValue()); });
        deserializerMap.put("lastFullScanDateTime", (n) -> { this.setLastFullScanDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastFullScanSignatureVersion", (n) -> { this.setLastFullScanSignatureVersion(n.getStringValue()); });
        deserializerMap.put("lastQuickScanDateTime", (n) -> { this.setLastQuickScanDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastQuickScanSignatureVersion", (n) -> { this.setLastQuickScanSignatureVersion(n.getStringValue()); });
        deserializerMap.put("lastRefreshedDateTime", (n) -> { this.setLastRefreshedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastReportedDateTime", (n) -> { this.setLastReportedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("malwareProtectionEnabled", (n) -> { this.setMalwareProtectionEnabled(n.getBooleanValue()); });
        deserializerMap.put("managedDeviceHealthState", (n) -> { this.setManagedDeviceHealthState(n.getStringValue()); });
        deserializerMap.put("managedDeviceId", (n) -> { this.setManagedDeviceId(n.getStringValue()); });
        deserializerMap.put("managedDeviceName", (n) -> { this.setManagedDeviceName(n.getStringValue()); });
        deserializerMap.put("networkInspectionSystemEnabled", (n) -> { this.setNetworkInspectionSystemEnabled(n.getBooleanValue()); });
        deserializerMap.put("quickScanOverdue", (n) -> { this.setQuickScanOverdue(n.getBooleanValue()); });
        deserializerMap.put("realTimeProtectionEnabled", (n) -> { this.setRealTimeProtectionEnabled(n.getBooleanValue()); });
        deserializerMap.put("rebootRequired", (n) -> { this.setRebootRequired(n.getBooleanValue()); });
        deserializerMap.put("signatureUpdateOverdue", (n) -> { this.setSignatureUpdateOverdue(n.getBooleanValue()); });
        deserializerMap.put("signatureVersion", (n) -> { this.setSignatureVersion(n.getStringValue()); });
        deserializerMap.put("tenantDisplayName", (n) -> { this.setTenantDisplayName(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fullScanOverdue property value. A flag indicating whether quick scan is overdue for the managed device. Optional. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFullScanOverdue() {
        return this.fullScanOverdue;
    }
    /**
     * Gets the fullScanRequired property value. A flag indicating whether full scan is overdue for the managed device. Optional. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFullScanRequired() {
        return this.fullScanRequired;
    }
    /**
     * Gets the lastFullScanDateTime property value. The date and time a full scan was completed. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastFullScanDateTime() {
        return this.lastFullScanDateTime;
    }
    /**
     * Gets the lastFullScanSignatureVersion property value. The version anti-malware version used to perform the last full scan. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastFullScanSignatureVersion() {
        return this.lastFullScanSignatureVersion;
    }
    /**
     * Gets the lastQuickScanDateTime property value. The date and time a quick scan was completed. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastQuickScanDateTime() {
        return this.lastQuickScanDateTime;
    }
    /**
     * Gets the lastQuickScanSignatureVersion property value. The version anti-malware version used to perform the last full scan. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastQuickScanSignatureVersion() {
        return this.lastQuickScanSignatureVersion;
    }
    /**
     * Gets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastRefreshedDateTime() {
        return this.lastRefreshedDateTime;
    }
    /**
     * Gets the lastReportedDateTime property value. The date and time the protection state was last reported for the managed device. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastReportedDateTime() {
        return this.lastReportedDateTime;
    }
    /**
     * Gets the malwareProtectionEnabled property value. A flag indicating whether malware protection is enabled for the managed device. Optional. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMalwareProtectionEnabled() {
        return this.malwareProtectionEnabled;
    }
    /**
     * Gets the managedDeviceHealthState property value. The health state for the managed device. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceHealthState() {
        return this.managedDeviceHealthState;
    }
    /**
     * Gets the managedDeviceId property value. The unique identifier for the managed device. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceId() {
        return this.managedDeviceId;
    }
    /**
     * Gets the managedDeviceName property value. The display name for the managed device. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceName() {
        return this.managedDeviceName;
    }
    /**
     * Gets the networkInspectionSystemEnabled property value. A flag indicating whether the network inspection system is enabled. Optional. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNetworkInspectionSystemEnabled() {
        return this.networkInspectionSystemEnabled;
    }
    /**
     * Gets the quickScanOverdue property value. A flag indicating weather a quick scan is overdue. Optional. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getQuickScanOverdue() {
        return this.quickScanOverdue;
    }
    /**
     * Gets the realTimeProtectionEnabled property value. A flag indicating whether real time protection is enabled. Optional. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRealTimeProtectionEnabled() {
        return this.realTimeProtectionEnabled;
    }
    /**
     * Gets the rebootRequired property value. A flag indicating whether a reboot is required. Optional. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRebootRequired() {
        return this.rebootRequired;
    }
    /**
     * Gets the signatureUpdateOverdue property value. A flag indicating whether an signature update is overdue. Optional. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSignatureUpdateOverdue() {
        return this.signatureUpdateOverdue;
    }
    /**
     * Gets the signatureVersion property value. The signature version for the managed device. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSignatureVersion() {
        return this.signatureVersion;
    }
    /**
     * Gets the tenantDisplayName property value. The display name for the managed tenant. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantDisplayName() {
        return this.tenantDisplayName;
    }
    /**
     * Gets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
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
    @javax.annotation.Nonnull
    public void setAntiMalwareVersion(@javax.annotation.Nullable final String value) {
        this.antiMalwareVersion = value;
    }
    /**
     * Sets the attentionRequired property value. A flag indicating whether attention is required for the managed device. Optional. Read-only.
     * @param value Value to set for the attentionRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttentionRequired(@javax.annotation.Nullable final Boolean value) {
        this.attentionRequired = value;
    }
    /**
     * Sets the deviceDeleted property value. A flag indicating whether the managed device has been deleted. Optional. Read-only.
     * @param value Value to set for the deviceDeleted property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceDeleted(@javax.annotation.Nullable final Boolean value) {
        this.deviceDeleted = value;
    }
    /**
     * Sets the devicePropertyRefreshDateTime property value. The date and time the device property has been refreshed. Optional. Read-only.
     * @param value Value to set for the devicePropertyRefreshDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDevicePropertyRefreshDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.devicePropertyRefreshDateTime = value;
    }
    /**
     * Sets the engineVersion property value. The anti-virus engine version for the managed device. Optional. Read-only.
     * @param value Value to set for the engineVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEngineVersion(@javax.annotation.Nullable final String value) {
        this.engineVersion = value;
    }
    /**
     * Sets the fullScanOverdue property value. A flag indicating whether quick scan is overdue for the managed device. Optional. Read-only.
     * @param value Value to set for the fullScanOverdue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFullScanOverdue(@javax.annotation.Nullable final Boolean value) {
        this.fullScanOverdue = value;
    }
    /**
     * Sets the fullScanRequired property value. A flag indicating whether full scan is overdue for the managed device. Optional. Read-only.
     * @param value Value to set for the fullScanRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFullScanRequired(@javax.annotation.Nullable final Boolean value) {
        this.fullScanRequired = value;
    }
    /**
     * Sets the lastFullScanDateTime property value. The date and time a full scan was completed. Optional. Read-only.
     * @param value Value to set for the lastFullScanDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastFullScanDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastFullScanDateTime = value;
    }
    /**
     * Sets the lastFullScanSignatureVersion property value. The version anti-malware version used to perform the last full scan. Optional. Read-only.
     * @param value Value to set for the lastFullScanSignatureVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastFullScanSignatureVersion(@javax.annotation.Nullable final String value) {
        this.lastFullScanSignatureVersion = value;
    }
    /**
     * Sets the lastQuickScanDateTime property value. The date and time a quick scan was completed. Optional. Read-only.
     * @param value Value to set for the lastQuickScanDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastQuickScanDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastQuickScanDateTime = value;
    }
    /**
     * Sets the lastQuickScanSignatureVersion property value. The version anti-malware version used to perform the last full scan. Optional. Read-only.
     * @param value Value to set for the lastQuickScanSignatureVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastQuickScanSignatureVersion(@javax.annotation.Nullable final String value) {
        this.lastQuickScanSignatureVersion = value;
    }
    /**
     * Sets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only.
     * @param value Value to set for the lastRefreshedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastRefreshedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastRefreshedDateTime = value;
    }
    /**
     * Sets the lastReportedDateTime property value. The date and time the protection state was last reported for the managed device. Optional. Read-only.
     * @param value Value to set for the lastReportedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastReportedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastReportedDateTime = value;
    }
    /**
     * Sets the malwareProtectionEnabled property value. A flag indicating whether malware protection is enabled for the managed device. Optional. Read-only.
     * @param value Value to set for the malwareProtectionEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMalwareProtectionEnabled(@javax.annotation.Nullable final Boolean value) {
        this.malwareProtectionEnabled = value;
    }
    /**
     * Sets the managedDeviceHealthState property value. The health state for the managed device. Optional. Read-only.
     * @param value Value to set for the managedDeviceHealthState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceHealthState(@javax.annotation.Nullable final String value) {
        this.managedDeviceHealthState = value;
    }
    /**
     * Sets the managedDeviceId property value. The unique identifier for the managed device. Optional. Read-only.
     * @param value Value to set for the managedDeviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceId(@javax.annotation.Nullable final String value) {
        this.managedDeviceId = value;
    }
    /**
     * Sets the managedDeviceName property value. The display name for the managed device. Optional. Read-only.
     * @param value Value to set for the managedDeviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceName(@javax.annotation.Nullable final String value) {
        this.managedDeviceName = value;
    }
    /**
     * Sets the networkInspectionSystemEnabled property value. A flag indicating whether the network inspection system is enabled. Optional. Read-only.
     * @param value Value to set for the networkInspectionSystemEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkInspectionSystemEnabled(@javax.annotation.Nullable final Boolean value) {
        this.networkInspectionSystemEnabled = value;
    }
    /**
     * Sets the quickScanOverdue property value. A flag indicating weather a quick scan is overdue. Optional. Read-only.
     * @param value Value to set for the quickScanOverdue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuickScanOverdue(@javax.annotation.Nullable final Boolean value) {
        this.quickScanOverdue = value;
    }
    /**
     * Sets the realTimeProtectionEnabled property value. A flag indicating whether real time protection is enabled. Optional. Read-only.
     * @param value Value to set for the realTimeProtectionEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRealTimeProtectionEnabled(@javax.annotation.Nullable final Boolean value) {
        this.realTimeProtectionEnabled = value;
    }
    /**
     * Sets the rebootRequired property value. A flag indicating whether a reboot is required. Optional. Read-only.
     * @param value Value to set for the rebootRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRebootRequired(@javax.annotation.Nullable final Boolean value) {
        this.rebootRequired = value;
    }
    /**
     * Sets the signatureUpdateOverdue property value. A flag indicating whether an signature update is overdue. Optional. Read-only.
     * @param value Value to set for the signatureUpdateOverdue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSignatureUpdateOverdue(@javax.annotation.Nullable final Boolean value) {
        this.signatureUpdateOverdue = value;
    }
    /**
     * Sets the signatureVersion property value. The signature version for the managed device. Optional. Read-only.
     * @param value Value to set for the signatureVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSignatureVersion(@javax.annotation.Nullable final String value) {
        this.signatureVersion = value;
    }
    /**
     * Sets the tenantDisplayName property value. The display name for the managed tenant. Optional. Read-only.
     * @param value Value to set for the tenantDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantDisplayName(@javax.annotation.Nullable final String value) {
        this.tenantDisplayName = value;
    }
    /**
     * Sets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this.tenantId = value;
    }
}
