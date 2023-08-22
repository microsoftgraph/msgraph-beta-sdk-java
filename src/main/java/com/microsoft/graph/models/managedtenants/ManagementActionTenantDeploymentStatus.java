package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagementActionTenantDeploymentStatus extends Entity implements Parsable {
    /**
     * The collection of deployment status for each instance of a management action. Optional.
     */
    private java.util.List<ManagementActionDeploymentStatus> statuses;
    /**
     * The identifier for the tenant group that is associated with the management action. Required. Read-only.
     */
    private String tenantGroupId;
    /**
     * The Azure Active Directory tenant identifier for the managed tenant. Required. Read-only.
     */
    private String tenantId;
    /**
     * Instantiates a new managementActionTenantDeploymentStatus and sets the default values.
     */
    public ManagementActionTenantDeploymentStatus() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managementActionTenantDeploymentStatus
     */
    @jakarta.annotation.Nonnull
    public static ManagementActionTenantDeploymentStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementActionTenantDeploymentStatus();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("statuses", (n) -> { this.setStatuses(n.getCollectionOfObjectValues(ManagementActionDeploymentStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("tenantGroupId", (n) -> { this.setTenantGroupId(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the statuses property value. The collection of deployment status for each instance of a management action. Optional.
     * @return a managementActionDeploymentStatus
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementActionDeploymentStatus> getStatuses() {
        return this.statuses;
    }
    /**
     * Gets the tenantGroupId property value. The identifier for the tenant group that is associated with the management action. Required. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTenantGroupId() {
        return this.tenantGroupId;
    }
    /**
     * Gets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Required. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("statuses", this.getStatuses());
        writer.writeStringValue("tenantGroupId", this.getTenantGroupId());
        writer.writeStringValue("tenantId", this.getTenantId());
    }
    /**
     * Sets the statuses property value. The collection of deployment status for each instance of a management action. Optional.
     * @param value Value to set for the statuses property.
     */
    public void setStatuses(@jakarta.annotation.Nullable final java.util.List<ManagementActionDeploymentStatus> value) {
        this.statuses = value;
    }
    /**
     * Sets the tenantGroupId property value. The identifier for the tenant group that is associated with the management action. Required. Read-only.
     * @param value Value to set for the tenantGroupId property.
     */
    public void setTenantGroupId(@jakarta.annotation.Nullable final String value) {
        this.tenantGroupId = value;
    }
    /**
     * Sets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Required. Read-only.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.tenantId = value;
    }
}
