package com.microsoft.graph.beta.models.managedtenants;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsProtectionState extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WindowsProtectionState} and sets the default values.
     */
    public WindowsProtectionState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsProtectionState}
     */
    @jakarta.annotation.Nonnull
    public static WindowsProtectionState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsProtectionState();
    }
    /**
     * Gets the antiMalwareVersion property value. The anti-malware version for the managed device. Optional. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAntiMalwareVersion() {
        return this.backingStore.get("antiMalwareVersion");
    }
    /**
     * Gets the attentionRequired property value. A flag indicating whether attention is required for the managed device. Optional. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAttentionRequired() {
        return this.backingStore.get("attentionRequired");
    }
    /**
     * Gets the deviceDeleted property value. A flag indicating whether the managed device has been deleted. Optional. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceDeleted() {
        return this.backingStore.get("deviceDeleted");
    }
    /**
     * Gets the devicePropertyRefreshDateTime property value. The date and time the device property has been refreshed. Optional. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDevicePropertyRefreshDateTime() {
        return this.backingStore.get("devicePropertyRefreshDateTime");
    }
    /**
     * Gets the engineVersion property value. The anti-virus engine version for the managed device. Optional. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEngineVersion() {
        return this.backingStore.get("engineVersion");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
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
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getFullScanOverdue() {
        return this.backingStore.get("fullScanOverdue");
    }
    /**
     * Gets the fullScanRequired property value. A flag indicating whether full scan is overdue for the managed device. Optional. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getFullScanRequired() {
        return this.backingStore.get("fullScanRequired");
    }
    /**
     * Gets the lastFullScanDateTime property value. The date and time a full scan was completed. Optional. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastFullScanDateTime() {
        return this.backingStore.get("lastFullScanDateTime");
    }
    /**
     * Gets the lastFullScanSignatureVersion property value. The version anti-malware version used to perform the last full scan. Optional. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastFullScanSignatureVersion() {
        return this.backingStore.get("lastFullScanSignatureVersion");
    }
    /**
     * Gets the lastQuickScanDateTime property value. The date and time a quick scan was completed. Optional. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastQuickScanDateTime() {
        return this.backingStore.get("lastQuickScanDateTime");
    }
    /**
     * Gets the lastQuickScanSignatureVersion property value. The version anti-malware version used to perform the last full scan. Optional. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastQuickScanSignatureVersion() {
        return this.backingStore.get("lastQuickScanSignatureVersion");
    }
    /**
     * Gets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastRefreshedDateTime() {
        return this.backingStore.get("lastRefreshedDateTime");
    }
    /**
     * Gets the lastReportedDateTime property value. The date and time the protection state was last reported for the managed device. Optional. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastReportedDateTime() {
        return this.backingStore.get("lastReportedDateTime");
    }
    /**
     * Gets the malwareProtectionEnabled property value. A flag indicating whether malware protection is enabled for the managed device. Optional. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMalwareProtectionEnabled() {
        return this.backingStore.get("malwareProtectionEnabled");
    }
    /**
     * Gets the managedDeviceHealthState property value. The health state for the managed device. Optional. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceHealthState() {
        return this.backingStore.get("managedDeviceHealthState");
    }
    /**
     * Gets the managedDeviceId property value. The unique identifier for the managed device. Optional. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceId() {
        return this.backingStore.get("managedDeviceId");
    }
    /**
     * Gets the managedDeviceName property value. The display name for the managed device. Optional. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceName() {
        return this.backingStore.get("managedDeviceName");
    }
    /**
     * Gets the networkInspectionSystemEnabled property value. A flag indicating whether the network inspection system is enabled. Optional. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getNetworkInspectionSystemEnabled() {
        return this.backingStore.get("networkInspectionSystemEnabled");
    }
    /**
     * Gets the quickScanOverdue property value. A flag indicating weather a quick scan is overdue. Optional. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getQuickScanOverdue() {
        return this.backingStore.get("quickScanOverdue");
    }
    /**
     * Gets the realTimeProtectionEnabled property value. A flag indicating whether real time protection is enabled. Optional. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRealTimeProtectionEnabled() {
        return this.backingStore.get("realTimeProtectionEnabled");
    }
    /**
     * Gets the rebootRequired property value. A flag indicating whether a reboot is required. Optional. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRebootRequired() {
        return this.backingStore.get("rebootRequired");
    }
    /**
     * Gets the signatureUpdateOverdue property value. A flag indicating whether an signature update is overdue. Optional. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSignatureUpdateOverdue() {
        return this.backingStore.get("signatureUpdateOverdue");
    }
    /**
     * Gets the signatureVersion property value. The signature version for the managed device. Optional. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSignatureVersion() {
        return this.backingStore.get("signatureVersion");
    }
    /**
     * Gets the tenantDisplayName property value. The display name for the managed tenant. Optional. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantDisplayName() {
        return this.backingStore.get("tenantDisplayName");
    }
    /**
     * Gets the tenantId property value. The Microsoft Entra tenant identifier for the managed tenant. Optional. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.backingStore.get("tenantId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAntiMalwareVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("antiMalwareVersion", value);
    }
    /**
     * Sets the attentionRequired property value. A flag indicating whether attention is required for the managed device. Optional. Read-only.
     * @param value Value to set for the attentionRequired property.
     */
    public void setAttentionRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("attentionRequired", value);
    }
    /**
     * Sets the deviceDeleted property value. A flag indicating whether the managed device has been deleted. Optional. Read-only.
     * @param value Value to set for the deviceDeleted property.
     */
    public void setDeviceDeleted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("deviceDeleted", value);
    }
    /**
     * Sets the devicePropertyRefreshDateTime property value. The date and time the device property has been refreshed. Optional. Read-only.
     * @param value Value to set for the devicePropertyRefreshDateTime property.
     */
    public void setDevicePropertyRefreshDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("devicePropertyRefreshDateTime", value);
    }
    /**
     * Sets the engineVersion property value. The anti-virus engine version for the managed device. Optional. Read-only.
     * @param value Value to set for the engineVersion property.
     */
    public void setEngineVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("engineVersion", value);
    }
    /**
     * Sets the fullScanOverdue property value. A flag indicating whether quick scan is overdue for the managed device. Optional. Read-only.
     * @param value Value to set for the fullScanOverdue property.
     */
    public void setFullScanOverdue(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("fullScanOverdue", value);
    }
    /**
     * Sets the fullScanRequired property value. A flag indicating whether full scan is overdue for the managed device. Optional. Read-only.
     * @param value Value to set for the fullScanRequired property.
     */
    public void setFullScanRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("fullScanRequired", value);
    }
    /**
     * Sets the lastFullScanDateTime property value. The date and time a full scan was completed. Optional. Read-only.
     * @param value Value to set for the lastFullScanDateTime property.
     */
    public void setLastFullScanDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastFullScanDateTime", value);
    }
    /**
     * Sets the lastFullScanSignatureVersion property value. The version anti-malware version used to perform the last full scan. Optional. Read-only.
     * @param value Value to set for the lastFullScanSignatureVersion property.
     */
    public void setLastFullScanSignatureVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lastFullScanSignatureVersion", value);
    }
    /**
     * Sets the lastQuickScanDateTime property value. The date and time a quick scan was completed. Optional. Read-only.
     * @param value Value to set for the lastQuickScanDateTime property.
     */
    public void setLastQuickScanDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastQuickScanDateTime", value);
    }
    /**
     * Sets the lastQuickScanSignatureVersion property value. The version anti-malware version used to perform the last full scan. Optional. Read-only.
     * @param value Value to set for the lastQuickScanSignatureVersion property.
     */
    public void setLastQuickScanSignatureVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lastQuickScanSignatureVersion", value);
    }
    /**
     * Sets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only.
     * @param value Value to set for the lastRefreshedDateTime property.
     */
    public void setLastRefreshedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastRefreshedDateTime", value);
    }
    /**
     * Sets the lastReportedDateTime property value. The date and time the protection state was last reported for the managed device. Optional. Read-only.
     * @param value Value to set for the lastReportedDateTime property.
     */
    public void setLastReportedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastReportedDateTime", value);
    }
    /**
     * Sets the malwareProtectionEnabled property value. A flag indicating whether malware protection is enabled for the managed device. Optional. Read-only.
     * @param value Value to set for the malwareProtectionEnabled property.
     */
    public void setMalwareProtectionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("malwareProtectionEnabled", value);
    }
    /**
     * Sets the managedDeviceHealthState property value. The health state for the managed device. Optional. Read-only.
     * @param value Value to set for the managedDeviceHealthState property.
     */
    public void setManagedDeviceHealthState(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedDeviceHealthState", value);
    }
    /**
     * Sets the managedDeviceId property value. The unique identifier for the managed device. Optional. Read-only.
     * @param value Value to set for the managedDeviceId property.
     */
    public void setManagedDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedDeviceId", value);
    }
    /**
     * Sets the managedDeviceName property value. The display name for the managed device. Optional. Read-only.
     * @param value Value to set for the managedDeviceName property.
     */
    public void setManagedDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedDeviceName", value);
    }
    /**
     * Sets the networkInspectionSystemEnabled property value. A flag indicating whether the network inspection system is enabled. Optional. Read-only.
     * @param value Value to set for the networkInspectionSystemEnabled property.
     */
    public void setNetworkInspectionSystemEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("networkInspectionSystemEnabled", value);
    }
    /**
     * Sets the quickScanOverdue property value. A flag indicating weather a quick scan is overdue. Optional. Read-only.
     * @param value Value to set for the quickScanOverdue property.
     */
    public void setQuickScanOverdue(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("quickScanOverdue", value);
    }
    /**
     * Sets the realTimeProtectionEnabled property value. A flag indicating whether real time protection is enabled. Optional. Read-only.
     * @param value Value to set for the realTimeProtectionEnabled property.
     */
    public void setRealTimeProtectionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("realTimeProtectionEnabled", value);
    }
    /**
     * Sets the rebootRequired property value. A flag indicating whether a reboot is required. Optional. Read-only.
     * @param value Value to set for the rebootRequired property.
     */
    public void setRebootRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("rebootRequired", value);
    }
    /**
     * Sets the signatureUpdateOverdue property value. A flag indicating whether an signature update is overdue. Optional. Read-only.
     * @param value Value to set for the signatureUpdateOverdue property.
     */
    public void setSignatureUpdateOverdue(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("signatureUpdateOverdue", value);
    }
    /**
     * Sets the signatureVersion property value. The signature version for the managed device. Optional. Read-only.
     * @param value Value to set for the signatureVersion property.
     */
    public void setSignatureVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("signatureVersion", value);
    }
    /**
     * Sets the tenantDisplayName property value. The display name for the managed tenant. Optional. Read-only.
     * @param value Value to set for the tenantDisplayName property.
     */
    public void setTenantDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantDisplayName", value);
    }
    /**
     * Sets the tenantId property value. The Microsoft Entra tenant identifier for the managed tenant. Optional. Read-only.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
}
