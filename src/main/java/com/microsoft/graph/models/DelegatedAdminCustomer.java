package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class DelegatedAdminCustomer extends Entity implements Parsable {
    /** The Azure AD display name of the customer tenant. Read-only. Supports $orderBy. */
    private String _displayName;
    /** Contains the management details of a service in the customer tenant that's managed by delegated administration. */
    private java.util.List<DelegatedAdminServiceManagementDetail> _serviceManagementDetails;
    /** The Azure AD-assigned tenant ID of the customer. Read-only. */
    private String _tenantId;
    /**
     * Instantiates a new delegatedAdminCustomer and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DelegatedAdminCustomer() {
        super();
        this.setOdataType("#microsoft.graph.delegatedAdminCustomer");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a delegatedAdminCustomer
     */
    @javax.annotation.Nonnull
    public static DelegatedAdminCustomer createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DelegatedAdminCustomer();
    }
    /**
     * Gets the displayName property value. The Azure AD display name of the customer tenant. Read-only. Supports $orderBy.
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
        final DelegatedAdminCustomer currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("serviceManagementDetails", (n) -> { currentObject.setServiceManagementDetails(n.getCollectionOfObjectValues(DelegatedAdminServiceManagementDetail::createFromDiscriminatorValue)); });
            this.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the serviceManagementDetails property value. Contains the management details of a service in the customer tenant that's managed by delegated administration.
     * @return a delegatedAdminServiceManagementDetail
     */
    @javax.annotation.Nullable
    public java.util.List<DelegatedAdminServiceManagementDetail> getServiceManagementDetails() {
        return this._serviceManagementDetails;
    }
    /**
     * Gets the tenantId property value. The Azure AD-assigned tenant ID of the customer. Read-only.
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
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("serviceManagementDetails", this.getServiceManagementDetails());
        writer.writeStringValue("tenantId", this.getTenantId());
    }
    /**
     * Sets the displayName property value. The Azure AD display name of the customer tenant. Read-only. Supports $orderBy.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the serviceManagementDetails property value. Contains the management details of a service in the customer tenant that's managed by delegated administration.
     * @param value Value to set for the serviceManagementDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceManagementDetails(@javax.annotation.Nullable final java.util.List<DelegatedAdminServiceManagementDetail> value) {
        this._serviceManagementDetails = value;
    }
    /**
     * Sets the tenantId property value. The Azure AD-assigned tenant ID of the customer. Read-only.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
}
