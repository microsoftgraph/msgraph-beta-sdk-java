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
public class DeviceCompliancePolicySettingStateSummary extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DeviceCompliancePolicySettingStateSummary} and sets the default values.
     */
    public DeviceCompliancePolicySettingStateSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceCompliancePolicySettingStateSummary}
     */
    @jakarta.annotation.Nonnull
    public static DeviceCompliancePolicySettingStateSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceCompliancePolicySettingStateSummary();
    }
    /**
     * Gets the conflictDeviceCount property value. The number of devices in a conflict state. Optional. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getConflictDeviceCount() {
        return this.backingStore.get("conflictDeviceCount");
    }
    /**
     * Gets the errorDeviceCount property value. The number of devices in an error state. Optional. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getErrorDeviceCount() {
        return this.backingStore.get("errorDeviceCount");
    }
    /**
     * Gets the failedDeviceCount property value. The number of devices in a failed state. Optional. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFailedDeviceCount() {
        return this.backingStore.get("failedDeviceCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("conflictDeviceCount", (n) -> { this.setConflictDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("errorDeviceCount", (n) -> { this.setErrorDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("failedDeviceCount", (n) -> { this.setFailedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("intuneAccountId", (n) -> { this.setIntuneAccountId(n.getStringValue()); });
        deserializerMap.put("intuneSettingId", (n) -> { this.setIntuneSettingId(n.getStringValue()); });
        deserializerMap.put("lastRefreshedDateTime", (n) -> { this.setLastRefreshedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("notApplicableDeviceCount", (n) -> { this.setNotApplicableDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("pendingDeviceCount", (n) -> { this.setPendingDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("policyType", (n) -> { this.setPolicyType(n.getStringValue()); });
        deserializerMap.put("settingName", (n) -> { this.setSettingName(n.getStringValue()); });
        deserializerMap.put("succeededDeviceCount", (n) -> { this.setSucceededDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("tenantDisplayName", (n) -> { this.setTenantDisplayName(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the intuneAccountId property value. The identifer for the Microsoft Intune account. Required. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIntuneAccountId() {
        return this.backingStore.get("intuneAccountId");
    }
    /**
     * Gets the intuneSettingId property value. The identifier for the Intune setting. Optional. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIntuneSettingId() {
        return this.backingStore.get("intuneSettingId");
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
     * Gets the notApplicableDeviceCount property value. The number of devices in a not applicable state. Optional. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNotApplicableDeviceCount() {
        return this.backingStore.get("notApplicableDeviceCount");
    }
    /**
     * Gets the pendingDeviceCount property value. The number of devices in a pending state. Optional. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPendingDeviceCount() {
        return this.backingStore.get("pendingDeviceCount");
    }
    /**
     * Gets the policyType property value. The type for the device compliance policy. Optional. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyType() {
        return this.backingStore.get("policyType");
    }
    /**
     * Gets the settingName property value. The name for the setting within the device compliance policy. Optional. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSettingName() {
        return this.backingStore.get("settingName");
    }
    /**
     * Gets the succeededDeviceCount property value. The number of devices in a succeeded state. Optional. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSucceededDeviceCount() {
        return this.backingStore.get("succeededDeviceCount");
    }
    /**
     * Gets the tenantDisplayName property value. The display name for the managed tenant. Required. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantDisplayName() {
        return this.backingStore.get("tenantDisplayName");
    }
    /**
     * Gets the tenantId property value. The Microsoft Entra tenant identifier for the managed tenant. Required. Read-only.
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
        writer.writeIntegerValue("conflictDeviceCount", this.getConflictDeviceCount());
        writer.writeIntegerValue("errorDeviceCount", this.getErrorDeviceCount());
        writer.writeIntegerValue("failedDeviceCount", this.getFailedDeviceCount());
        writer.writeStringValue("intuneAccountId", this.getIntuneAccountId());
        writer.writeStringValue("intuneSettingId", this.getIntuneSettingId());
        writer.writeOffsetDateTimeValue("lastRefreshedDateTime", this.getLastRefreshedDateTime());
        writer.writeIntegerValue("notApplicableDeviceCount", this.getNotApplicableDeviceCount());
        writer.writeIntegerValue("pendingDeviceCount", this.getPendingDeviceCount());
        writer.writeStringValue("policyType", this.getPolicyType());
        writer.writeStringValue("settingName", this.getSettingName());
        writer.writeIntegerValue("succeededDeviceCount", this.getSucceededDeviceCount());
        writer.writeStringValue("tenantDisplayName", this.getTenantDisplayName());
        writer.writeStringValue("tenantId", this.getTenantId());
    }
    /**
     * Sets the conflictDeviceCount property value. The number of devices in a conflict state. Optional. Read-only.
     * @param value Value to set for the conflictDeviceCount property.
     */
    public void setConflictDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("conflictDeviceCount", value);
    }
    /**
     * Sets the errorDeviceCount property value. The number of devices in an error state. Optional. Read-only.
     * @param value Value to set for the errorDeviceCount property.
     */
    public void setErrorDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("errorDeviceCount", value);
    }
    /**
     * Sets the failedDeviceCount property value. The number of devices in a failed state. Optional. Read-only.
     * @param value Value to set for the failedDeviceCount property.
     */
    public void setFailedDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("failedDeviceCount", value);
    }
    /**
     * Sets the intuneAccountId property value. The identifer for the Microsoft Intune account. Required. Read-only.
     * @param value Value to set for the intuneAccountId property.
     */
    public void setIntuneAccountId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("intuneAccountId", value);
    }
    /**
     * Sets the intuneSettingId property value. The identifier for the Intune setting. Optional. Read-only.
     * @param value Value to set for the intuneSettingId property.
     */
    public void setIntuneSettingId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("intuneSettingId", value);
    }
    /**
     * Sets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only.
     * @param value Value to set for the lastRefreshedDateTime property.
     */
    public void setLastRefreshedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastRefreshedDateTime", value);
    }
    /**
     * Sets the notApplicableDeviceCount property value. The number of devices in a not applicable state. Optional. Read-only.
     * @param value Value to set for the notApplicableDeviceCount property.
     */
    public void setNotApplicableDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("notApplicableDeviceCount", value);
    }
    /**
     * Sets the pendingDeviceCount property value. The number of devices in a pending state. Optional. Read-only.
     * @param value Value to set for the pendingDeviceCount property.
     */
    public void setPendingDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pendingDeviceCount", value);
    }
    /**
     * Sets the policyType property value. The type for the device compliance policy. Optional. Read-only.
     * @param value Value to set for the policyType property.
     */
    public void setPolicyType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyType", value);
    }
    /**
     * Sets the settingName property value. The name for the setting within the device compliance policy. Optional. Read-only.
     * @param value Value to set for the settingName property.
     */
    public void setSettingName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("settingName", value);
    }
    /**
     * Sets the succeededDeviceCount property value. The number of devices in a succeeded state. Optional. Read-only.
     * @param value Value to set for the succeededDeviceCount property.
     */
    public void setSucceededDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("succeededDeviceCount", value);
    }
    /**
     * Sets the tenantDisplayName property value. The display name for the managed tenant. Required. Read-only.
     * @param value Value to set for the tenantDisplayName property.
     */
    public void setTenantDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantDisplayName", value);
    }
    /**
     * Sets the tenantId property value. The Microsoft Entra tenant identifier for the managed tenant. Required. Read-only.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
}
