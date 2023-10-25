package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcDevice extends Entity implements Parsable {
    /**
     * The status of the cloud PC. Possible values are: notProvisioned, provisioning, provisioned, upgrading, inGracePeriod, deprovisioning, failed. Required. Read-only.
     */
    private String cloudPcStatus;
    /**
     * The specification of the cloud PC device. Required. Read-only.
     */
    private String deviceSpecification;
    /**
     * The display name  of the cloud PC device. Required. Read-only.
     */
    private String displayName;
    /**
     * Date and time the entity was last updated in the multi-tenant management platform. Required. Read-only.
     */
    private OffsetDateTime lastRefreshedDateTime;
    /**
     * The managed device identifier of the cloud PC device. Optional. Read-only.
     */
    private String managedDeviceId;
    /**
     * The managed device display name of the cloud PC device. Optional. Read-only.
     */
    private String managedDeviceName;
    /**
     * The provisioning policy identifier for the cloud PC device. Required. Read-only.
     */
    private String provisioningPolicyId;
    /**
     * The service plan name of the cloud PC device. Required. Read-only.
     */
    private String servicePlanName;
    /**
     * The service plan type of the cloud PC device. Required. Read-only.
     */
    private String servicePlanType;
    /**
     * The display name for the managed tenant. Required. Read-only.
     */
    private String tenantDisplayName;
    /**
     * The Microsoft Entra tenant identifier for the managed tenant. Required. Read-only.
     */
    private String tenantId;
    /**
     * The user principal name (UPN) of the user assigned to the cloud PC device. Required. Read-only.
     */
    private String userPrincipalName;
    /**
     * Instantiates a new CloudPcDevice and sets the default values.
     */
    public CloudPcDevice() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcDevice
     */
    @jakarta.annotation.Nonnull
    public static CloudPcDevice createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcDevice();
    }
    /**
     * Gets the cloudPcStatus property value. The status of the cloud PC. Possible values are: notProvisioned, provisioning, provisioned, upgrading, inGracePeriod, deprovisioning, failed. Required. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCloudPcStatus() {
        return this.cloudPcStatus;
    }
    /**
     * Gets the deviceSpecification property value. The specification of the cloud PC device. Required. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceSpecification() {
        return this.deviceSpecification;
    }
    /**
     * Gets the displayName property value. The display name  of the cloud PC device. Required. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("cloudPcStatus", (n) -> { this.setCloudPcStatus(n.getStringValue()); });
        deserializerMap.put("deviceSpecification", (n) -> { this.setDeviceSpecification(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastRefreshedDateTime", (n) -> { this.setLastRefreshedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managedDeviceId", (n) -> { this.setManagedDeviceId(n.getStringValue()); });
        deserializerMap.put("managedDeviceName", (n) -> { this.setManagedDeviceName(n.getStringValue()); });
        deserializerMap.put("provisioningPolicyId", (n) -> { this.setProvisioningPolicyId(n.getStringValue()); });
        deserializerMap.put("servicePlanName", (n) -> { this.setServicePlanName(n.getStringValue()); });
        deserializerMap.put("servicePlanType", (n) -> { this.setServicePlanType(n.getStringValue()); });
        deserializerMap.put("tenantDisplayName", (n) -> { this.setTenantDisplayName(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Required. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastRefreshedDateTime() {
        return this.lastRefreshedDateTime;
    }
    /**
     * Gets the managedDeviceId property value. The managed device identifier of the cloud PC device. Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceId() {
        return this.managedDeviceId;
    }
    /**
     * Gets the managedDeviceName property value. The managed device display name of the cloud PC device. Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceName() {
        return this.managedDeviceName;
    }
    /**
     * Gets the provisioningPolicyId property value. The provisioning policy identifier for the cloud PC device. Required. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProvisioningPolicyId() {
        return this.provisioningPolicyId;
    }
    /**
     * Gets the servicePlanName property value. The service plan name of the cloud PC device. Required. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServicePlanName() {
        return this.servicePlanName;
    }
    /**
     * Gets the servicePlanType property value. The service plan type of the cloud PC device. Required. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServicePlanType() {
        return this.servicePlanType;
    }
    /**
     * Gets the tenantDisplayName property value. The display name for the managed tenant. Required. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantDisplayName() {
        return this.tenantDisplayName;
    }
    /**
     * Gets the tenantId property value. The Microsoft Entra tenant identifier for the managed tenant. Required. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Gets the userPrincipalName property value. The user principal name (UPN) of the user assigned to the cloud PC device. Required. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("cloudPcStatus", this.getCloudPcStatus());
        writer.writeStringValue("deviceSpecification", this.getDeviceSpecification());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastRefreshedDateTime", this.getLastRefreshedDateTime());
        writer.writeStringValue("managedDeviceId", this.getManagedDeviceId());
        writer.writeStringValue("managedDeviceName", this.getManagedDeviceName());
        writer.writeStringValue("provisioningPolicyId", this.getProvisioningPolicyId());
        writer.writeStringValue("servicePlanName", this.getServicePlanName());
        writer.writeStringValue("servicePlanType", this.getServicePlanType());
        writer.writeStringValue("tenantDisplayName", this.getTenantDisplayName());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the cloudPcStatus property value. The status of the cloud PC. Possible values are: notProvisioned, provisioning, provisioned, upgrading, inGracePeriod, deprovisioning, failed. Required. Read-only.
     * @param value Value to set for the cloudPcStatus property.
     */
    public void setCloudPcStatus(@jakarta.annotation.Nullable final String value) {
        this.cloudPcStatus = value;
    }
    /**
     * Sets the deviceSpecification property value. The specification of the cloud PC device. Required. Read-only.
     * @param value Value to set for the deviceSpecification property.
     */
    public void setDeviceSpecification(@jakarta.annotation.Nullable final String value) {
        this.deviceSpecification = value;
    }
    /**
     * Sets the displayName property value. The display name  of the cloud PC device. Required. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Required. Read-only.
     * @param value Value to set for the lastRefreshedDateTime property.
     */
    public void setLastRefreshedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastRefreshedDateTime = value;
    }
    /**
     * Sets the managedDeviceId property value. The managed device identifier of the cloud PC device. Optional. Read-only.
     * @param value Value to set for the managedDeviceId property.
     */
    public void setManagedDeviceId(@jakarta.annotation.Nullable final String value) {
        this.managedDeviceId = value;
    }
    /**
     * Sets the managedDeviceName property value. The managed device display name of the cloud PC device. Optional. Read-only.
     * @param value Value to set for the managedDeviceName property.
     */
    public void setManagedDeviceName(@jakarta.annotation.Nullable final String value) {
        this.managedDeviceName = value;
    }
    /**
     * Sets the provisioningPolicyId property value. The provisioning policy identifier for the cloud PC device. Required. Read-only.
     * @param value Value to set for the provisioningPolicyId property.
     */
    public void setProvisioningPolicyId(@jakarta.annotation.Nullable final String value) {
        this.provisioningPolicyId = value;
    }
    /**
     * Sets the servicePlanName property value. The service plan name of the cloud PC device. Required. Read-only.
     * @param value Value to set for the servicePlanName property.
     */
    public void setServicePlanName(@jakarta.annotation.Nullable final String value) {
        this.servicePlanName = value;
    }
    /**
     * Sets the servicePlanType property value. The service plan type of the cloud PC device. Required. Read-only.
     * @param value Value to set for the servicePlanType property.
     */
    public void setServicePlanType(@jakarta.annotation.Nullable final String value) {
        this.servicePlanType = value;
    }
    /**
     * Sets the tenantDisplayName property value. The display name for the managed tenant. Required. Read-only.
     * @param value Value to set for the tenantDisplayName property.
     */
    public void setTenantDisplayName(@jakarta.annotation.Nullable final String value) {
        this.tenantDisplayName = value;
    }
    /**
     * Sets the tenantId property value. The Microsoft Entra tenant identifier for the managed tenant. Required. Read-only.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.tenantId = value;
    }
    /**
     * Sets the userPrincipalName property value. The user principal name (UPN) of the user assigned to the cloud PC device. Required. Read-only.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
