package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedDeviceComplianceTrend extends Entity implements Parsable {
    /** The number of devices with a compliant status. Required. Read-only. */
    private Integer compliantDeviceCount;
    /** The number of devices manged by Configuration Manager. Required. Read-only. */
    private Integer configManagerDeviceCount;
    /** The date and time compliance snapshot was performed. Required. Read-only. */
    private String countDateTime;
    /** The number of devices with an error status. Required. Read-only. */
    private Integer errorDeviceCount;
    /** The number of devices that are in a grace period status. Required. Read-only. */
    private Integer inGracePeriodDeviceCount;
    /** The number of devices that are in a non-compliant status. Required. Read-only. */
    private Integer noncompliantDeviceCount;
    /** The display name for the managed tenant. Optional. Read-only. */
    private String tenantDisplayName;
    /** The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only. */
    private String tenantId;
    /** The number of devices in an unknown status. Required. Read-only. */
    private Integer unknownDeviceCount;
    /**
     * Instantiates a new managedDeviceComplianceTrend and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedDeviceComplianceTrend() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedDeviceComplianceTrend
     */
    @javax.annotation.Nonnull
    public static ManagedDeviceComplianceTrend createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedDeviceComplianceTrend();
    }
    /**
     * Gets the compliantDeviceCount property value. The number of devices with a compliant status. Required. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCompliantDeviceCount() {
        return this.compliantDeviceCount;
    }
    /**
     * Gets the configManagerDeviceCount property value. The number of devices manged by Configuration Manager. Required. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConfigManagerDeviceCount() {
        return this.configManagerDeviceCount;
    }
    /**
     * Gets the countDateTime property value. The date and time compliance snapshot was performed. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCountDateTime() {
        return this.countDateTime;
    }
    /**
     * Gets the errorDeviceCount property value. The number of devices with an error status. Required. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorDeviceCount() {
        return this.errorDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("compliantDeviceCount", (n) -> { this.setCompliantDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("configManagerDeviceCount", (n) -> { this.setConfigManagerDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("countDateTime", (n) -> { this.setCountDateTime(n.getStringValue()); });
        deserializerMap.put("errorDeviceCount", (n) -> { this.setErrorDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("inGracePeriodDeviceCount", (n) -> { this.setInGracePeriodDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("noncompliantDeviceCount", (n) -> { this.setNoncompliantDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("tenantDisplayName", (n) -> { this.setTenantDisplayName(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("unknownDeviceCount", (n) -> { this.setUnknownDeviceCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inGracePeriodDeviceCount property value. The number of devices that are in a grace period status. Required. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInGracePeriodDeviceCount() {
        return this.inGracePeriodDeviceCount;
    }
    /**
     * Gets the noncompliantDeviceCount property value. The number of devices that are in a non-compliant status. Required. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNoncompliantDeviceCount() {
        return this.noncompliantDeviceCount;
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
     * Gets the unknownDeviceCount property value. The number of devices in an unknown status. Required. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnknownDeviceCount() {
        return this.unknownDeviceCount;
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
        writer.writeIntegerValue("compliantDeviceCount", this.getCompliantDeviceCount());
        writer.writeIntegerValue("configManagerDeviceCount", this.getConfigManagerDeviceCount());
        writer.writeStringValue("countDateTime", this.getCountDateTime());
        writer.writeIntegerValue("errorDeviceCount", this.getErrorDeviceCount());
        writer.writeIntegerValue("inGracePeriodDeviceCount", this.getInGracePeriodDeviceCount());
        writer.writeIntegerValue("noncompliantDeviceCount", this.getNoncompliantDeviceCount());
        writer.writeStringValue("tenantDisplayName", this.getTenantDisplayName());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeIntegerValue("unknownDeviceCount", this.getUnknownDeviceCount());
    }
    /**
     * Sets the compliantDeviceCount property value. The number of devices with a compliant status. Required. Read-only.
     * @param value Value to set for the compliantDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompliantDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.compliantDeviceCount = value;
    }
    /**
     * Sets the configManagerDeviceCount property value. The number of devices manged by Configuration Manager. Required. Read-only.
     * @param value Value to set for the configManagerDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigManagerDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.configManagerDeviceCount = value;
    }
    /**
     * Sets the countDateTime property value. The date and time compliance snapshot was performed. Required. Read-only.
     * @param value Value to set for the countDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountDateTime(@javax.annotation.Nullable final String value) {
        this.countDateTime = value;
    }
    /**
     * Sets the errorDeviceCount property value. The number of devices with an error status. Required. Read-only.
     * @param value Value to set for the errorDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.errorDeviceCount = value;
    }
    /**
     * Sets the inGracePeriodDeviceCount property value. The number of devices that are in a grace period status. Required. Read-only.
     * @param value Value to set for the inGracePeriodDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInGracePeriodDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.inGracePeriodDeviceCount = value;
    }
    /**
     * Sets the noncompliantDeviceCount property value. The number of devices that are in a non-compliant status. Required. Read-only.
     * @param value Value to set for the noncompliantDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNoncompliantDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.noncompliantDeviceCount = value;
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
    /**
     * Sets the unknownDeviceCount property value. The number of devices in an unknown status. Required. Read-only.
     * @param value Value to set for the unknownDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnknownDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.unknownDeviceCount = value;
    }
}
