package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExternalIdentitiesPolicy extends PolicyBase implements Parsable {
    /**
     * Reserved for future use.
     */
    private Boolean allowDeletedIdentitiesDataRemoval;
    /**
     * Defines whether external users can leave the guest tenant. If set to false, self-service controls are disabled, and the admin of the guest tenant must manually remove the external user from the guest tenant. When the external user leaves the tenant, their data in the guest tenant is first soft-deleted then permanently deleted in 30 days.
     */
    private Boolean allowExternalIdentitiesToLeave;
    /**
     * Instantiates a new ExternalIdentitiesPolicy and sets the default values.
     */
    public ExternalIdentitiesPolicy() {
        super();
        this.setOdataType("#microsoft.graph.externalIdentitiesPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ExternalIdentitiesPolicy
     */
    @jakarta.annotation.Nonnull
    public static ExternalIdentitiesPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExternalIdentitiesPolicy();
    }
    /**
     * Gets the allowDeletedIdentitiesDataRemoval property value. Reserved for future use.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowDeletedIdentitiesDataRemoval() {
        return this.allowDeletedIdentitiesDataRemoval;
    }
    /**
     * Gets the allowExternalIdentitiesToLeave property value. Defines whether external users can leave the guest tenant. If set to false, self-service controls are disabled, and the admin of the guest tenant must manually remove the external user from the guest tenant. When the external user leaves the tenant, their data in the guest tenant is first soft-deleted then permanently deleted in 30 days.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowExternalIdentitiesToLeave() {
        return this.allowExternalIdentitiesToLeave;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowDeletedIdentitiesDataRemoval", (n) -> { this.setAllowDeletedIdentitiesDataRemoval(n.getBooleanValue()); });
        deserializerMap.put("allowExternalIdentitiesToLeave", (n) -> { this.setAllowExternalIdentitiesToLeave(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowDeletedIdentitiesDataRemoval", this.getAllowDeletedIdentitiesDataRemoval());
        writer.writeBooleanValue("allowExternalIdentitiesToLeave", this.getAllowExternalIdentitiesToLeave());
    }
    /**
     * Sets the allowDeletedIdentitiesDataRemoval property value. Reserved for future use.
     * @param value Value to set for the allowDeletedIdentitiesDataRemoval property.
     */
    public void setAllowDeletedIdentitiesDataRemoval(@jakarta.annotation.Nullable final Boolean value) {
        this.allowDeletedIdentitiesDataRemoval = value;
    }
    /**
     * Sets the allowExternalIdentitiesToLeave property value. Defines whether external users can leave the guest tenant. If set to false, self-service controls are disabled, and the admin of the guest tenant must manually remove the external user from the guest tenant. When the external user leaves the tenant, their data in the guest tenant is first soft-deleted then permanently deleted in 30 days.
     * @param value Value to set for the allowExternalIdentitiesToLeave property.
     */
    public void setAllowExternalIdentitiesToLeave(@jakarta.annotation.Nullable final Boolean value) {
        this.allowExternalIdentitiesToLeave = value;
    }
}
