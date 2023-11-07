package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AwsSecretInformationAccessFinding extends Finding implements Parsable {
    /**
     * The identity property
     */
    private AuthorizationSystemIdentity identity;
    /**
     * The identityDetails property
     */
    private IdentityDetails identityDetails;
    /**
     * The permissionsCreepIndex property
     */
    private PermissionsCreepIndex permissionsCreepIndex;
    /**
     * The secretInformationWebServices property
     */
    private EnumSet<AwsSecretInformationWebServices> secretInformationWebServices;
    /**
     * Instantiates a new AwsSecretInformationAccessFinding and sets the default values.
     */
    public AwsSecretInformationAccessFinding() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AwsSecretInformationAccessFinding
     */
    @jakarta.annotation.Nonnull
    public static AwsSecretInformationAccessFinding createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.secretInformationAccessAwsResourceFinding": return new SecretInformationAccessAwsResourceFinding();
                case "#microsoft.graph.secretInformationAccessAwsRoleFinding": return new SecretInformationAccessAwsRoleFinding();
                case "#microsoft.graph.secretInformationAccessAwsServerlessFunctionFinding": return new SecretInformationAccessAwsServerlessFunctionFinding();
                case "#microsoft.graph.secretInformationAccessAwsUserFinding": return new SecretInformationAccessAwsUserFinding();
            }
        }
        return new AwsSecretInformationAccessFinding();
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
        deserializerMap.put("secretInformationWebServices", (n) -> { this.setSecretInformationWebServices(n.getEnumSetValue(AwsSecretInformationWebServices.class)); });
        return deserializerMap;
    }
    /**
     * Gets the identity property value. The identity property
     * @return a AuthorizationSystemIdentity
     */
    @jakarta.annotation.Nullable
    public AuthorizationSystemIdentity getIdentity() {
        return this.identity;
    }
    /**
     * Gets the identityDetails property value. The identityDetails property
     * @return a IdentityDetails
     */
    @jakarta.annotation.Nullable
    public IdentityDetails getIdentityDetails() {
        return this.identityDetails;
    }
    /**
     * Gets the permissionsCreepIndex property value. The permissionsCreepIndex property
     * @return a PermissionsCreepIndex
     */
    @jakarta.annotation.Nullable
    public PermissionsCreepIndex getPermissionsCreepIndex() {
        return this.permissionsCreepIndex;
    }
    /**
     * Gets the secretInformationWebServices property value. The secretInformationWebServices property
     * @return a EnumSet<AwsSecretInformationWebServices>
     */
    @jakarta.annotation.Nullable
    public EnumSet<AwsSecretInformationWebServices> getSecretInformationWebServices() {
        return this.secretInformationWebServices;
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
        writer.writeEnumSetValue("secretInformationWebServices", this.getSecretInformationWebServices());
    }
    /**
     * Sets the identity property value. The identity property
     * @param value Value to set for the identity property.
     */
    public void setIdentity(@jakarta.annotation.Nullable final AuthorizationSystemIdentity value) {
        this.identity = value;
    }
    /**
     * Sets the identityDetails property value. The identityDetails property
     * @param value Value to set for the identityDetails property.
     */
    public void setIdentityDetails(@jakarta.annotation.Nullable final IdentityDetails value) {
        this.identityDetails = value;
    }
    /**
     * Sets the permissionsCreepIndex property value. The permissionsCreepIndex property
     * @param value Value to set for the permissionsCreepIndex property.
     */
    public void setPermissionsCreepIndex(@jakarta.annotation.Nullable final PermissionsCreepIndex value) {
        this.permissionsCreepIndex = value;
    }
    /**
     * Sets the secretInformationWebServices property value. The secretInformationWebServices property
     * @param value Value to set for the secretInformationWebServices property.
     */
    public void setSecretInformationWebServices(@jakarta.annotation.Nullable final EnumSet<AwsSecretInformationWebServices> value) {
        this.secretInformationWebServices = value;
    }
}
