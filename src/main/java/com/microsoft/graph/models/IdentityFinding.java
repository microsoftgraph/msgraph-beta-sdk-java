package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IdentityFinding extends Finding implements Parsable {
    /**
     * Instantiates a new IdentityFinding and sets the default values.
     */
    public IdentityFinding() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IdentityFinding
     */
    @jakarta.annotation.Nonnull
    public static IdentityFinding createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.inactiveAwsResourceFinding": return new InactiveAwsResourceFinding();
                case "#microsoft.graph.inactiveAwsRoleFinding": return new InactiveAwsRoleFinding();
                case "#microsoft.graph.inactiveAzureServicePrincipalFinding": return new InactiveAzureServicePrincipalFinding();
                case "#microsoft.graph.inactiveGcpServiceAccountFinding": return new InactiveGcpServiceAccountFinding();
                case "#microsoft.graph.inactiveServerlessFunctionFinding": return new InactiveServerlessFunctionFinding();
                case "#microsoft.graph.inactiveUserFinding": return new InactiveUserFinding();
                case "#microsoft.graph.overprovisionedAwsResourceFinding": return new OverprovisionedAwsResourceFinding();
                case "#microsoft.graph.overprovisionedAwsRoleFinding": return new OverprovisionedAwsRoleFinding();
                case "#microsoft.graph.overprovisionedAzureServicePrincipalFinding": return new OverprovisionedAzureServicePrincipalFinding();
                case "#microsoft.graph.overprovisionedGcpServiceAccountFinding": return new OverprovisionedGcpServiceAccountFinding();
                case "#microsoft.graph.overprovisionedServerlessFunctionFinding": return new OverprovisionedServerlessFunctionFinding();
                case "#microsoft.graph.overprovisionedUserFinding": return new OverprovisionedUserFinding();
                case "#microsoft.graph.superAwsResourceFinding": return new SuperAwsResourceFinding();
                case "#microsoft.graph.superAwsRoleFinding": return new SuperAwsRoleFinding();
                case "#microsoft.graph.superAzureServicePrincipalFinding": return new SuperAzureServicePrincipalFinding();
                case "#microsoft.graph.superGcpServiceAccountFinding": return new SuperGcpServiceAccountFinding();
                case "#microsoft.graph.superServerlessFunctionFinding": return new SuperServerlessFunctionFinding();
                case "#microsoft.graph.superUserFinding": return new SuperUserFinding();
                case "#microsoft.graph.unenforcedMfaAwsUserFinding": return new UnenforcedMfaAwsUserFinding();
            }
        }
        return new IdentityFinding();
    }
    /**
     * Gets the actionSummary property value. The actionSummary property
     * @return a ActionSummary
     */
    @jakarta.annotation.Nullable
    public ActionSummary getActionSummary() {
        return this.backingStore.get("actionSummary");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionSummary", (n) -> { this.setActionSummary(n.getObjectValue(ActionSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("identity", (n) -> { this.setIdentity(n.getObjectValue(AuthorizationSystemIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("identityDetails", (n) -> { this.setIdentityDetails(n.getObjectValue(IdentityDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("permissionsCreepIndex", (n) -> { this.setPermissionsCreepIndex(n.getObjectValue(PermissionsCreepIndex::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the identity property value. The identity property
     * @return a AuthorizationSystemIdentity
     */
    @jakarta.annotation.Nullable
    public AuthorizationSystemIdentity getIdentity() {
        return this.backingStore.get("identity");
    }
    /**
     * Gets the identityDetails property value. The identityDetails property
     * @return a IdentityDetails
     */
    @jakarta.annotation.Nullable
    public IdentityDetails getIdentityDetails() {
        return this.backingStore.get("identityDetails");
    }
    /**
     * Gets the permissionsCreepIndex property value. The permissionsCreepIndex property
     * @return a PermissionsCreepIndex
     */
    @jakarta.annotation.Nullable
    public PermissionsCreepIndex getPermissionsCreepIndex() {
        return this.backingStore.get("permissionsCreepIndex");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("actionSummary", this.getActionSummary());
        writer.writeObjectValue("identity", this.getIdentity());
        writer.writeObjectValue("identityDetails", this.getIdentityDetails());
        writer.writeObjectValue("permissionsCreepIndex", this.getPermissionsCreepIndex());
    }
    /**
     * Sets the actionSummary property value. The actionSummary property
     * @param value Value to set for the actionSummary property.
     */
    public void setActionSummary(@jakarta.annotation.Nullable final ActionSummary value) {
        this.backingStore.set("actionSummary", value);
    }
    /**
     * Sets the identity property value. The identity property
     * @param value Value to set for the identity property.
     */
    public void setIdentity(@jakarta.annotation.Nullable final AuthorizationSystemIdentity value) {
        this.backingStore.set("identity", value);
    }
    /**
     * Sets the identityDetails property value. The identityDetails property
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
}
