package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedDeviceComplianceTrend extends Entity implements Parsable {
    /**
     * The number of devices with a compliant status. Required. Read-only.
     */
    private Integer compliantDeviceCount;
    /**
     * The number of devices manged by Configuration Manager. Required. Read-only.
     */
    private Integer configManagerDeviceCount;
    /**
     * The date and time compliance snapshot was performed. Required. Read-only.
     */
    private String countDateTime;
    /**
     * The number of devices with an error status. Required. Read-only.
     */
    private Integer errorDeviceCount;
    /**
     * The number of devices that are in a grace period status. Required. Read-only.
     */
    private Integer inGracePeriodDeviceCount;
    /**
     * The number of devices that are in a non-compliant status. Required. Read-only.
     */
    private Integer noncompliantDeviceCount;
    /**
     * The display name for the managed tenant. Optional. Read-only.
     */
    private String tenantDisplayName;
    /**
     * The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only.
     */
    private String tenantId;
    /**
     * The number of devices in an unknown status. Required. Read-only.
     */
    private Integer unknownDeviceCount;
    /**
     * Instantiates a new ManagedDeviceComplianceTrend and sets the default values.
     */
    public ManagedDeviceComplianceTrend() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagedDeviceComplianceTrend
     */
    @jakarta.annotation.Nonnull
    public static ManagedDeviceComplianceTrend createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedDeviceComplianceTrend();
    }
    /**
     * Gets the compliantDeviceCount property value. The number of devices with a compliant status. Required. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCompliantDeviceCount() {
        return this.compliantDeviceCount;
    }
    /**
     * Gets the configManagerDeviceCount property value. The number of devices manged by Configuration Manager. Required. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getConfigManagerDeviceCount() {
        return this.configManagerDeviceCount;
    }
    /**
     * Gets the countDateTime property value. The date and time compliance snapshot was performed. Required. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCountDateTime() {
        return this.countDateTime;
    }
    /**
     * Gets the errorDeviceCount property value. The number of devices with an error status. Required. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getErrorDeviceCount() {
        return this.errorDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getInGracePeriodDeviceCount() {
        return this.inGracePeriodDeviceCount;
    }
    /**
     * Gets the noncompliantDeviceCount property value. The number of devices that are in a non-compliant status. Required. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNoncompliantDeviceCount() {
        return this.noncompliantDeviceCount;
    }
    /**
     * Gets the tenantDisplayName property value. The display name for the managed tenant. Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantDisplayName() {
        return this.tenantDisplayName;
    }
    /**
     * Gets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Gets the unknownDeviceCount property value. The number of devices in an unknown status. Required. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getUnknownDeviceCount() {
        return this.unknownDeviceCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setCompliantDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.compliantDeviceCount = value;
    }
    /**
     * Sets the configManagerDeviceCount property value. The number of devices manged by Configuration Manager. Required. Read-only.
     * @param value Value to set for the configManagerDeviceCount property.
     */
    public void setConfigManagerDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.configManagerDeviceCount = value;
    }
    /**
     * Sets the countDateTime property value. The date and time compliance snapshot was performed. Required. Read-only.
     * @param value Value to set for the countDateTime property.
     */
    public void setCountDateTime(@jakarta.annotation.Nullable final String value) {
        this.countDateTime = value;
    }
    /**
     * Sets the errorDeviceCount property value. The number of devices with an error status. Required. Read-only.
     * @param value Value to set for the errorDeviceCount property.
     */
    public void setErrorDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.errorDeviceCount = value;
    }
    /**
     * Sets the inGracePeriodDeviceCount property value. The number of devices that are in a grace period status. Required. Read-only.
     * @param value Value to set for the inGracePeriodDeviceCount property.
     */
    public void setInGracePeriodDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.inGracePeriodDeviceCount = value;
    }
    /**
     * Sets the noncompliantDeviceCount property value. The number of devices that are in a non-compliant status. Required. Read-only.
     * @param value Value to set for the noncompliantDeviceCount property.
     */
    public void setNoncompliantDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.noncompliantDeviceCount = value;
    }
    /**
     * Sets the tenantDisplayName property value. The display name for the managed tenant. Optional. Read-only.
     * @param value Value to set for the tenantDisplayName property.
     */
    public void setTenantDisplayName(@jakarta.annotation.Nullable final String value) {
        this.tenantDisplayName = value;
    }
    /**
     * Sets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.tenantId = value;
    }
    /**
     * Sets the unknownDeviceCount property value. The number of devices in an unknown status. Required. Read-only.
     * @param value Value to set for the unknownDeviceCount property.
     */
    public void setUnknownDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.unknownDeviceCount = value;
    }
}
