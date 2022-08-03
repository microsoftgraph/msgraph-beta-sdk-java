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
/** Provides operations to manage the collection of activityStatistics entities. */
public class CloudPcDevice extends Entity implements Parsable {
    /** The status of the cloud PC. Possible values are: notProvisioned, provisioning, provisioned, upgrading, inGracePeriod, deprovisioning, failed. Required. Read-only. */
    private String _cloudPcStatus;
    /** The deviceSpecification property */
    private String _deviceSpecification;
    /** The display name for the cloud PC. Required. Read-only. */
    private String _displayName;
    /** Date and time the entity was last updated in the multi-tenant management platform. Required. Read-only. */
    private OffsetDateTime _lastRefreshedDateTime;
    /** The managed device identifier for the cloud PC. Optional. Read-only. */
    private String _managedDeviceId;
    /** The managed device display name for the cloud PC. Optional. Read-only. */
    private String _managedDeviceName;
    /** The provisioning policy identifier for the cloud PC. Required. Read-only. */
    private String _provisioningPolicyId;
    /** The service plan name for the cloud PC. Required. Read-only. */
    private String _servicePlanName;
    /** The servicePlanType property */
    private String _servicePlanType;
    /** The display name for the managed tenant. Required. Read-only. */
    private String _tenantDisplayName;
    /** The Azure Active Directory tenant identifier for the managed tenant. Required. Read-only. */
    private String _tenantId;
    /** The user principal name (UPN) of the user assigned to the cloud PC. Required. Read-only. */
    private String _userPrincipalName;
    /**
     * Instantiates a new cloudPcDevice and sets the default values.
     * @return a void
     */
    public CloudPcDevice() {
        super();
        this.setOdataType("#microsoft.graph.managedTenants.cloudPcDevice");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcDevice
     */
    @javax.annotation.Nonnull
    public static CloudPcDevice createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcDevice();
    }
    /**
     * Gets the cloudPcStatus property value. The status of the cloud PC. Possible values are: notProvisioned, provisioning, provisioned, upgrading, inGracePeriod, deprovisioning, failed. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudPcStatus() {
        return this._cloudPcStatus;
    }
    /**
     * Gets the deviceSpecification property value. The deviceSpecification property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceSpecification() {
        return this._deviceSpecification;
    }
    /**
     * Gets the displayName property value. The display name for the cloud PC. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPcDevice currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("cloudPcStatus", (n) -> { currentObject.setCloudPcStatus(n.getStringValue()); });
            this.put("deviceSpecification", (n) -> { currentObject.setDeviceSpecification(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastRefreshedDateTime", (n) -> { currentObject.setLastRefreshedDateTime(n.getOffsetDateTimeValue()); });
            this.put("managedDeviceId", (n) -> { currentObject.setManagedDeviceId(n.getStringValue()); });
            this.put("managedDeviceName", (n) -> { currentObject.setManagedDeviceName(n.getStringValue()); });
            this.put("provisioningPolicyId", (n) -> { currentObject.setProvisioningPolicyId(n.getStringValue()); });
            this.put("servicePlanName", (n) -> { currentObject.setServicePlanName(n.getStringValue()); });
            this.put("servicePlanType", (n) -> { currentObject.setServicePlanType(n.getStringValue()); });
            this.put("tenantDisplayName", (n) -> { currentObject.setTenantDisplayName(n.getStringValue()); });
            this.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Required. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastRefreshedDateTime() {
        return this._lastRefreshedDateTime;
    }
    /**
     * Gets the managedDeviceId property value. The managed device identifier for the cloud PC. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceId() {
        return this._managedDeviceId;
    }
    /**
     * Gets the managedDeviceName property value. The managed device display name for the cloud PC. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceName() {
        return this._managedDeviceName;
    }
    /**
     * Gets the provisioningPolicyId property value. The provisioning policy identifier for the cloud PC. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProvisioningPolicyId() {
        return this._provisioningPolicyId;
    }
    /**
     * Gets the servicePlanName property value. The service plan name for the cloud PC. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePlanName() {
        return this._servicePlanName;
    }
    /**
     * Gets the servicePlanType property value. The servicePlanType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePlanType() {
        return this._servicePlanType;
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
     * Gets the userPrincipalName property value. The user principal name (UPN) of the user assigned to the cloud PC. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setCloudPcStatus(@javax.annotation.Nullable final String value) {
        this._cloudPcStatus = value;
    }
    /**
     * Sets the deviceSpecification property value. The deviceSpecification property
     * @param value Value to set for the deviceSpecification property.
     * @return a void
     */
    public void setDeviceSpecification(@javax.annotation.Nullable final String value) {
        this._deviceSpecification = value;
    }
    /**
     * Sets the displayName property value. The display name for the cloud PC. Required. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Required. Read-only.
     * @param value Value to set for the lastRefreshedDateTime property.
     * @return a void
     */
    public void setLastRefreshedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastRefreshedDateTime = value;
    }
    /**
     * Sets the managedDeviceId property value. The managed device identifier for the cloud PC. Optional. Read-only.
     * @param value Value to set for the managedDeviceId property.
     * @return a void
     */
    public void setManagedDeviceId(@javax.annotation.Nullable final String value) {
        this._managedDeviceId = value;
    }
    /**
     * Sets the managedDeviceName property value. The managed device display name for the cloud PC. Optional. Read-only.
     * @param value Value to set for the managedDeviceName property.
     * @return a void
     */
    public void setManagedDeviceName(@javax.annotation.Nullable final String value) {
        this._managedDeviceName = value;
    }
    /**
     * Sets the provisioningPolicyId property value. The provisioning policy identifier for the cloud PC. Required. Read-only.
     * @param value Value to set for the provisioningPolicyId property.
     * @return a void
     */
    public void setProvisioningPolicyId(@javax.annotation.Nullable final String value) {
        this._provisioningPolicyId = value;
    }
    /**
     * Sets the servicePlanName property value. The service plan name for the cloud PC. Required. Read-only.
     * @param value Value to set for the servicePlanName property.
     * @return a void
     */
    public void setServicePlanName(@javax.annotation.Nullable final String value) {
        this._servicePlanName = value;
    }
    /**
     * Sets the servicePlanType property value. The servicePlanType property
     * @param value Value to set for the servicePlanType property.
     * @return a void
     */
    public void setServicePlanType(@javax.annotation.Nullable final String value) {
        this._servicePlanType = value;
    }
    /**
     * Sets the tenantDisplayName property value. The display name for the managed tenant. Required. Read-only.
     * @param value Value to set for the tenantDisplayName property.
     * @return a void
     */
    public void setTenantDisplayName(@javax.annotation.Nullable final String value) {
        this._tenantDisplayName = value;
    }
    /**
     * Sets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Required. Read-only.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
    /**
     * Sets the userPrincipalName property value. The user principal name (UPN) of the user assigned to the cloud PC. Required. Read-only.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
