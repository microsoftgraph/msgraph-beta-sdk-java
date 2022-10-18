package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class DeviceCompliancePolicySettingStateSummary extends Entity implements Parsable {
    /** The number of devices in a conflict state. Optional. Read-only. */
    private Integer _conflictDeviceCount;
    /** The number of devices in an error state. Optional. Read-only. */
    private Integer _errorDeviceCount;
    /** The number of devices in a failed state. Optional. Read-only. */
    private Integer _failedDeviceCount;
    /** The identifer for the Microsoft Intune account. Required. Read-only. */
    private String _intuneAccountId;
    /** The identifier for the Intune setting. Optional. Read-only. */
    private String _intuneSettingId;
    /** Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only. */
    private OffsetDateTime _lastRefreshedDateTime;
    /** The number of devices in a not applicable state. Optional. Read-only. */
    private Integer _notApplicableDeviceCount;
    /** The number of devices in a pending state. Optional. Read-only. */
    private Integer _pendingDeviceCount;
    /** The type for the device compliance policy. Optional. Read-only. */
    private String _policyType;
    /** The name for the setting within the device compliance policy. Optional. Read-only. */
    private String _settingName;
    /** The number of devices in a succeeded state. Optional. Read-only. */
    private Integer _succeededDeviceCount;
    /** The display name for the managed tenant. Required. Read-only. */
    private String _tenantDisplayName;
    /** The Azure Active Directory tenant identifier for the managed tenant. Required. Read-only. */
    private String _tenantId;
    /**
     * Instantiates a new deviceCompliancePolicySettingStateSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceCompliancePolicySettingStateSummary() {
        super();
        this.setOdataType("#microsoft.graph.managedTenants.deviceCompliancePolicySettingStateSummary");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceCompliancePolicySettingStateSummary
     */
    @javax.annotation.Nonnull
    public static DeviceCompliancePolicySettingStateSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceCompliancePolicySettingStateSummary();
    }
    /**
     * Gets the conflictDeviceCount property value. The number of devices in a conflict state. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConflictDeviceCount() {
        return this._conflictDeviceCount;
    }
    /**
     * Gets the errorDeviceCount property value. The number of devices in an error state. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorDeviceCount() {
        return this._errorDeviceCount;
    }
    /**
     * Gets the failedDeviceCount property value. The number of devices in a failed state. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedDeviceCount() {
        return this._failedDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceCompliancePolicySettingStateSummary currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("conflictDeviceCount", (n) -> { currentObject.setConflictDeviceCount(n.getIntegerValue()); });
            this.put("errorDeviceCount", (n) -> { currentObject.setErrorDeviceCount(n.getIntegerValue()); });
            this.put("failedDeviceCount", (n) -> { currentObject.setFailedDeviceCount(n.getIntegerValue()); });
            this.put("intuneAccountId", (n) -> { currentObject.setIntuneAccountId(n.getStringValue()); });
            this.put("intuneSettingId", (n) -> { currentObject.setIntuneSettingId(n.getStringValue()); });
            this.put("lastRefreshedDateTime", (n) -> { currentObject.setLastRefreshedDateTime(n.getOffsetDateTimeValue()); });
            this.put("notApplicableDeviceCount", (n) -> { currentObject.setNotApplicableDeviceCount(n.getIntegerValue()); });
            this.put("pendingDeviceCount", (n) -> { currentObject.setPendingDeviceCount(n.getIntegerValue()); });
            this.put("policyType", (n) -> { currentObject.setPolicyType(n.getStringValue()); });
            this.put("settingName", (n) -> { currentObject.setSettingName(n.getStringValue()); });
            this.put("succeededDeviceCount", (n) -> { currentObject.setSucceededDeviceCount(n.getIntegerValue()); });
            this.put("tenantDisplayName", (n) -> { currentObject.setTenantDisplayName(n.getStringValue()); });
            this.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the intuneAccountId property value. The identifer for the Microsoft Intune account. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIntuneAccountId() {
        return this._intuneAccountId;
    }
    /**
     * Gets the intuneSettingId property value. The identifier for the Intune setting. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIntuneSettingId() {
        return this._intuneSettingId;
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
     * Gets the notApplicableDeviceCount property value. The number of devices in a not applicable state. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNotApplicableDeviceCount() {
        return this._notApplicableDeviceCount;
    }
    /**
     * Gets the pendingDeviceCount property value. The number of devices in a pending state. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPendingDeviceCount() {
        return this._pendingDeviceCount;
    }
    /**
     * Gets the policyType property value. The type for the device compliance policy. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyType() {
        return this._policyType;
    }
    /**
     * Gets the settingName property value. The name for the setting within the device compliance policy. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingName() {
        return this._settingName;
    }
    /**
     * Gets the succeededDeviceCount property value. The number of devices in a succeeded state. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSucceededDeviceCount() {
        return this._succeededDeviceCount;
    }
    /**
     * Gets the tenantDisplayName property value. The display name for the managed tenant. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantDisplayName() {
        return this._tenantDisplayName;
    }
    /**
     * Gets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Required. Read-only.
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
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConflictDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._conflictDeviceCount = value;
    }
    /**
     * Sets the errorDeviceCount property value. The number of devices in an error state. Optional. Read-only.
     * @param value Value to set for the errorDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._errorDeviceCount = value;
    }
    /**
     * Sets the failedDeviceCount property value. The number of devices in a failed state. Optional. Read-only.
     * @param value Value to set for the failedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._failedDeviceCount = value;
    }
    /**
     * Sets the intuneAccountId property value. The identifer for the Microsoft Intune account. Required. Read-only.
     * @param value Value to set for the intuneAccountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIntuneAccountId(@javax.annotation.Nullable final String value) {
        this._intuneAccountId = value;
    }
    /**
     * Sets the intuneSettingId property value. The identifier for the Intune setting. Optional. Read-only.
     * @param value Value to set for the intuneSettingId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIntuneSettingId(@javax.annotation.Nullable final String value) {
        this._intuneSettingId = value;
    }
    /**
     * Sets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only.
     * @param value Value to set for the lastRefreshedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastRefreshedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastRefreshedDateTime = value;
    }
    /**
     * Sets the notApplicableDeviceCount property value. The number of devices in a not applicable state. Optional. Read-only.
     * @param value Value to set for the notApplicableDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotApplicableDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._notApplicableDeviceCount = value;
    }
    /**
     * Sets the pendingDeviceCount property value. The number of devices in a pending state. Optional. Read-only.
     * @param value Value to set for the pendingDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPendingDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._pendingDeviceCount = value;
    }
    /**
     * Sets the policyType property value. The type for the device compliance policy. Optional. Read-only.
     * @param value Value to set for the policyType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyType(@javax.annotation.Nullable final String value) {
        this._policyType = value;
    }
    /**
     * Sets the settingName property value. The name for the setting within the device compliance policy. Optional. Read-only.
     * @param value Value to set for the settingName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingName(@javax.annotation.Nullable final String value) {
        this._settingName = value;
    }
    /**
     * Sets the succeededDeviceCount property value. The number of devices in a succeeded state. Optional. Read-only.
     * @param value Value to set for the succeededDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSucceededDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._succeededDeviceCount = value;
    }
    /**
     * Sets the tenantDisplayName property value. The display name for the managed tenant. Required. Read-only.
     * @param value Value to set for the tenantDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantDisplayName(@javax.annotation.Nullable final String value) {
        this._tenantDisplayName = value;
    }
    /**
     * Sets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Required. Read-only.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
}
