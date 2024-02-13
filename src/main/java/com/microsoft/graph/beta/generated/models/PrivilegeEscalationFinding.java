package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivilegeEscalationFinding extends Finding implements Parsable {
    /**
     * Instantiates a new {@link PrivilegeEscalationFinding} and sets the default values.
     */
    public PrivilegeEscalationFinding() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PrivilegeEscalationFinding}
     */
    @jakarta.annotation.Nonnull
    public static PrivilegeEscalationFinding createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.privilegeEscalationAwsResourceFinding": return new PrivilegeEscalationAwsResourceFinding();
                case "#microsoft.graph.privilegeEscalationAwsRoleFinding": return new PrivilegeEscalationAwsRoleFinding();
                case "#microsoft.graph.privilegeEscalationGcpServiceAccountFinding": return new PrivilegeEscalationGcpServiceAccountFinding();
                case "#microsoft.graph.privilegeEscalationUserFinding": return new PrivilegeEscalationUserFinding();
            }
        }
        return new PrivilegeEscalationFinding();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("identity", (n) -> { this.setIdentity(n.getObjectValue(AuthorizationSystemIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("identityDetails", (n) -> { this.setIdentityDetails(n.getObjectValue(IdentityDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("permissionsCreepIndex", (n) -> { this.setPermissionsCreepIndex(n.getObjectValue(PermissionsCreepIndex::createFromDiscriminatorValue)); });
        deserializerMap.put("privilegeEscalationDetails", (n) -> { this.setPrivilegeEscalationDetails(n.getCollectionOfObjectValues(PrivilegeEscalation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the identity property value. The identity property
     * @return a {@link AuthorizationSystemIdentity}
     */
    @jakarta.annotation.Nullable
    public AuthorizationSystemIdentity getIdentity() {
        return this.backingStore.get("identity");
    }
    /**
     * Gets the identityDetails property value. An identity's information details. Inherited from finding.
     * @return a {@link IdentityDetails}
     */
    @jakarta.annotation.Nullable
    public IdentityDetails getIdentityDetails() {
        return this.backingStore.get("identityDetails");
    }
    /**
     * Gets the permissionsCreepIndex property value. The permissionsCreepIndex property
     * @return a {@link PermissionsCreepIndex}
     */
    @jakarta.annotation.Nullable
    public PermissionsCreepIndex getPermissionsCreepIndex() {
        return this.backingStore.get("permissionsCreepIndex");
    }
    /**
     * Gets the privilegeEscalationDetails property value. The list of escalations that the identity is capable of performing.
     * @return a {@link java.util.List<PrivilegeEscalation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrivilegeEscalation> getPrivilegeEscalationDetails() {
        return this.backingStore.get("privilegeEscalationDetails");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("identity", this.getIdentity());
        writer.writeObjectValue("identityDetails", this.getIdentityDetails());
        writer.writeObjectValue("permissionsCreepIndex", this.getPermissionsCreepIndex());
        writer.writeCollectionOfObjectValues("privilegeEscalationDetails", this.getPrivilegeEscalationDetails());
    }
    /**
     * Sets the identity property value. The identity property
     * @param value Value to set for the identity property.
     */
    public void setIdentity(@jakarta.annotation.Nullable final AuthorizationSystemIdentity value) {
        this.backingStore.set("identity", value);
    }
    /**
     * Sets the identityDetails property value. An identity's information details. Inherited from finding.
     * @param value Value to set for the identityDetails property.
     */
    public void setIdentityDetails(@jakarta.annotation.Nullable final IdentityDetails value) {
        this.backingStore.set("identityDetails", value);
    }
    /**
     * Sets the permissionsCreepIndex property value. The permissionsCreepIndex property
     * @param value Value to set for the permissionsCreepIndex property.
     */
    public void setPermissionsCreepIndex(@jakarta.annotation.Nullable final PermissionsCreepIndex value) {
        this.backingStore.set("permissionsCreepIndex", value);
    }
    /**
     * Sets the privilegeEscalationDetails property value. The list of escalations that the identity is capable of performing.
     * @param value Value to set for the privilegeEscalationDetails property.
     */
    public void setPrivilegeEscalationDetails(@jakarta.annotation.Nullable final java.util.List<PrivilegeEscalation> value) {
        this.backingStore.set("privilegeEscalationDetails", value);
    }
}
