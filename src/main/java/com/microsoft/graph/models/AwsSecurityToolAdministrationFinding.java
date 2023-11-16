package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AwsSecurityToolAdministrationFinding extends Finding implements Parsable {
    /**
     * Instantiates a new AwsSecurityToolAdministrationFinding and sets the default values.
     */
    public AwsSecurityToolAdministrationFinding() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AwsSecurityToolAdministrationFinding
     */
    @jakarta.annotation.Nonnull
    public static AwsSecurityToolAdministrationFinding createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.securityToolAwsResourceAdministratorFinding": return new SecurityToolAwsResourceAdministratorFinding();
                case "#microsoft.graph.securityToolAwsRoleAdministratorFinding": return new SecurityToolAwsRoleAdministratorFinding();
                case "#microsoft.graph.securityToolAwsServerlessFunctionAdministratorFinding": return new SecurityToolAwsServerlessFunctionAdministratorFinding();
                case "#microsoft.graph.securityToolAwsUserAdministratorFinding": return new SecurityToolAwsUserAdministratorFinding();
            }
        }
        return new AwsSecurityToolAdministrationFinding();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("identity", (n) -> { this.setIdentity(n.getObjectValue(AuthorizationSystemIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("identityDetails", (n) -> { this.setIdentityDetails(n.getObjectValue(IdentityDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("permissionsCreepIndex", (n) -> { this.setPermissionsCreepIndex(n.getObjectValue(PermissionsCreepIndex::createFromDiscriminatorValue)); });
        deserializerMap.put("securityTools", (n) -> { this.setSecurityTools(n.getEnumSetValue(AwsSecurityToolWebServices.class)); });
        return deserializerMap;
    }
    /**
     * Gets the identity property value. The identity property
     * @return a AuthorizationSystemIdentity
     */
    @jakarta.annotation.Nullable
    public AuthorizationSystemIdentity getIdentity() {
        return this.BackingStore.get("identity");
    }
    /**
     * Gets the identityDetails property value. The identityDetails property
     * @return a IdentityDetails
     */
    @jakarta.annotation.Nullable
    public IdentityDetails getIdentityDetails() {
        return this.BackingStore.get("identityDetails");
    }
    /**
     * Gets the permissionsCreepIndex property value. The permissionsCreepIndex property
     * @return a PermissionsCreepIndex
     */
    @jakarta.annotation.Nullable
    public PermissionsCreepIndex getPermissionsCreepIndex() {
        return this.BackingStore.get("permissionsCreepIndex");
    }
    /**
     * Gets the securityTools property value. The securityTools property
     * @return a EnumSet<AwsSecurityToolWebServices>
     */
    @jakarta.annotation.Nullable
    public EnumSet<AwsSecurityToolWebServices> getSecurityTools() {
        return this.BackingStore.get("securityTools");
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
        writer.writeEnumSetValue("securityTools", this.getSecurityTools());
    }
    /**
     * Sets the identity property value. The identity property
     * @param value Value to set for the identity property.
     */
    public void setIdentity(@jakarta.annotation.Nullable final AuthorizationSystemIdentity value) {
        this.BackingStore.set("identity", value);
    }
    /**
     * Sets the identityDetails property value. The identityDetails property
     * @param value Value to set for the identityDetails property.
     */
    public void setIdentityDetails(@jakarta.annotation.Nullable final IdentityDetails value) {
        this.BackingStore.set("identityDetails", value);
    }
    /**
     * Sets the permissionsCreepIndex property value. The permissionsCreepIndex property
     * @param value Value to set for the permissionsCreepIndex property.
     */
    public void setPermissionsCreepIndex(@jakarta.annotation.Nullable final PermissionsCreepIndex value) {
        this.BackingStore.set("permissionsCreepIndex", value);
    }
    /**
     * Sets the securityTools property value. The securityTools property
     * @param value Value to set for the securityTools property.
     */
    public void setSecurityTools(@jakarta.annotation.Nullable final EnumSet<AwsSecurityToolWebServices> value) {
        this.BackingStore.set("securityTools", value);
    }
}
