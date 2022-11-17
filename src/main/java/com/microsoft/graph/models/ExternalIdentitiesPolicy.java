package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExternalIdentitiesPolicy extends PolicyBase implements Parsable {
    /** Reserved for future use. */
    private Boolean _allowDeletedIdentitiesDataRemoval;
    /** Defines whether external users can leave the guest tenant. If set to false, self-service controls are disabled, and the admin of the guest tenant must manually remove the external user from the guest tenant. When the external user leaves the tenant, their data in the guest tenant is first soft-deleted then permanently deleted in 30 days. */
    private Boolean _allowExternalIdentitiesToLeave;
    /**
     * Instantiates a new ExternalIdentitiesPolicy and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ExternalIdentitiesPolicy() {
        super();
        this.setOdataType("#microsoft.graph.externalIdentitiesPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ExternalIdentitiesPolicy
     */
    @javax.annotation.Nonnull
    public static ExternalIdentitiesPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExternalIdentitiesPolicy();
    }
    /**
     * Gets the allowDeletedIdentitiesDataRemoval property value. Reserved for future use.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowDeletedIdentitiesDataRemoval() {
        return this._allowDeletedIdentitiesDataRemoval;
    }
    /**
     * Gets the allowExternalIdentitiesToLeave property value. Defines whether external users can leave the guest tenant. If set to false, self-service controls are disabled, and the admin of the guest tenant must manually remove the external user from the guest tenant. When the external user leaves the tenant, their data in the guest tenant is first soft-deleted then permanently deleted in 30 days.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowExternalIdentitiesToLeave() {
        return this._allowExternalIdentitiesToLeave;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ExternalIdentitiesPolicy currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("allowDeletedIdentitiesDataRemoval", (n) -> { currentObject.setAllowDeletedIdentitiesDataRemoval(n.getBooleanValue()); });
            this.put("allowExternalIdentitiesToLeave", (n) -> { currentObject.setAllowExternalIdentitiesToLeave(n.getBooleanValue()); });
        }};
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
        writer.writeBooleanValue("allowDeletedIdentitiesDataRemoval", this.getAllowDeletedIdentitiesDataRemoval());
        writer.writeBooleanValue("allowExternalIdentitiesToLeave", this.getAllowExternalIdentitiesToLeave());
    }
    /**
     * Sets the allowDeletedIdentitiesDataRemoval property value. Reserved for future use.
     * @param value Value to set for the allowDeletedIdentitiesDataRemoval property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowDeletedIdentitiesDataRemoval(@javax.annotation.Nullable final Boolean value) {
        this._allowDeletedIdentitiesDataRemoval = value;
    }
    /**
     * Sets the allowExternalIdentitiesToLeave property value. Defines whether external users can leave the guest tenant. If set to false, self-service controls are disabled, and the admin of the guest tenant must manually remove the external user from the guest tenant. When the external user leaves the tenant, their data in the guest tenant is first soft-deleted then permanently deleted in 30 days.
     * @param value Value to set for the allowExternalIdentitiesToLeave property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowExternalIdentitiesToLeave(@javax.annotation.Nullable final Boolean value) {
        this._allowExternalIdentitiesToLeave = value;
    }
}
