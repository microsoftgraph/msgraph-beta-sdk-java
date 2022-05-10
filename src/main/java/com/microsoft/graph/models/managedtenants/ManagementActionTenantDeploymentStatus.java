package microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
public class ManagementActionTenantDeploymentStatus extends Entity implements Parsable {
    /** The collection of deployment status for each instance of a management action. Optional. */
    private java.util.List<ManagementActionDeploymentStatus> _statuses;
    /** The identifier for the tenant group that is associated with the management action. Required. Read-only. */
    private String _tenantGroupId;
    /** The Azure Active Directory tenant identifier for the managed tenant. Required. Read-only. */
    private String _tenantId;
    /**
     * Instantiates a new managementActionTenantDeploymentStatus and sets the default values.
     * @return a void
     */
    public ManagementActionTenantDeploymentStatus() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managementActionTenantDeploymentStatus
     */
    @javax.annotation.Nonnull
    public static ManagementActionTenantDeploymentStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementActionTenantDeploymentStatus();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagementActionTenantDeploymentStatus currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("statuses", (n) -> { currentObject.setStatuses(n.getCollectionOfObjectValues(ManagementActionDeploymentStatus::createFromDiscriminatorValue)); });
            this.put("tenantGroupId", (n) -> { currentObject.setTenantGroupId(n.getStringValue()); });
            this.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the statuses property value. The collection of deployment status for each instance of a management action. Optional.
     * @return a managementActionDeploymentStatus
     */
    @javax.annotation.Nullable
    public java.util.List<ManagementActionDeploymentStatus> getStatuses() {
        return this._statuses;
    }
    /**
     * Gets the tenantGroupId property value. The identifier for the tenant group that is associated with the management action. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantGroupId() {
        return this._tenantGroupId;
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
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("statuses", this.getStatuses());
        writer.writeStringValue("tenantGroupId", this.getTenantGroupId());
        writer.writeStringValue("tenantId", this.getTenantId());
    }
    /**
     * Sets the statuses property value. The collection of deployment status for each instance of a management action. Optional.
     * @param value Value to set for the statuses property.
     * @return a void
     */
    public void setStatuses(@javax.annotation.Nullable final java.util.List<ManagementActionDeploymentStatus> value) {
        this._statuses = value;
    }
    /**
     * Sets the tenantGroupId property value. The identifier for the tenant group that is associated with the management action. Required. Read-only.
     * @param value Value to set for the tenantGroupId property.
     * @return a void
     */
    public void setTenantGroupId(@javax.annotation.Nullable final String value) {
        this._tenantGroupId = value;
    }
    /**
     * Sets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Required. Read-only.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
}
