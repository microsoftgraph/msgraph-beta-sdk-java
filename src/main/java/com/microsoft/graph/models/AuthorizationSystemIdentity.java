package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthorizationSystemIdentity extends Entity implements Parsable {
    /**
     * Instantiates a new AuthorizationSystemIdentity and sets the default values.
     */
    public AuthorizationSystemIdentity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AuthorizationSystemIdentity
     */
    @jakarta.annotation.Nonnull
    public static AuthorizationSystemIdentity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.awsAccessKey": return new AwsAccessKey();
                case "#microsoft.graph.awsEc2Instance": return new AwsEc2Instance();
                case "#microsoft.graph.awsGroup": return new AwsGroup();
                case "#microsoft.graph.awsIdentity": return new AwsIdentity();
                case "#microsoft.graph.awsLambda": return new AwsLambda();
                case "#microsoft.graph.awsRole": return new AwsRole();
                case "#microsoft.graph.awsUser": return new AwsUser();
                case "#microsoft.graph.azureGroup": return new AzureGroup();
                case "#microsoft.graph.azureIdentity": return new AzureIdentity();
                case "#microsoft.graph.azureManagedIdentity": return new AzureManagedIdentity();
                case "#microsoft.graph.azureServerlessFunction": return new AzureServerlessFunction();
                case "#microsoft.graph.azureServicePrincipal": return new AzureServicePrincipal();
                case "#microsoft.graph.azureUser": return new AzureUser();
                case "#microsoft.graph.gcpCloudFunction": return new GcpCloudFunction();
                case "#microsoft.graph.gcpGroup": return new GcpGroup();
                case "#microsoft.graph.gcpIdentity": return new GcpIdentity();
                case "#microsoft.graph.gcpServiceAccount": return new GcpServiceAccount();
                case "#microsoft.graph.gcpUser": return new GcpUser();
            }
        }
        return new AuthorizationSystemIdentity();
    }
    /**
     * Gets the authorizationSystem property value. The authorizationSystem property
     * @return a AuthorizationSystem
     */
    @jakarta.annotation.Nullable
    public AuthorizationSystem getAuthorizationSystem() {
        return this.BackingStore.get("authorizationSystem");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * Gets the externalId property value. The externalId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.BackingStore.get("externalId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authorizationSystem", (n) -> { this.setAuthorizationSystem(n.getObjectValue(AuthorizationSystem::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getObjectValue(AuthorizationSystemIdentitySource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the source property value. The source property
     * @return a AuthorizationSystemIdentitySource
     */
    @jakarta.annotation.Nullable
    public AuthorizationSystemIdentitySource getSource() {
        return this.BackingStore.get("source");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("authorizationSystem", this.getAuthorizationSystem());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeObjectValue("source", this.getSource());
    }
    /**
     * Sets the authorizationSystem property value. The authorizationSystem property
     * @param value Value to set for the authorizationSystem property.
     */
    public void setAuthorizationSystem(@jakarta.annotation.Nullable final AuthorizationSystem value) {
        this.BackingStore.set("authorizationSystem", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the externalId property value. The externalId property
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("externalId", value);
    }
    /**
     * Sets the source property value. The source property
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final AuthorizationSystemIdentitySource value) {
        this.BackingStore.set("source", value);
    }
}
