package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthorizationSystemResource extends Entity implements Parsable {
    /**
     * The authorizationSystem property
     */
    private AuthorizationSystem authorizationSystem;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The externalId property
     */
    private String externalId;
    /**
     * The resourceType property
     */
    private String resourceType;
    /**
     * Instantiates a new AuthorizationSystemResource and sets the default values.
     */
    public AuthorizationSystemResource() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AuthorizationSystemResource
     */
    @jakarta.annotation.Nonnull
    public static AuthorizationSystemResource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.awsAuthorizationSystemResource": return new AwsAuthorizationSystemResource();
                case "#microsoft.graph.azureAuthorizationSystemResource": return new AzureAuthorizationSystemResource();
                case "#microsoft.graph.gcpAuthorizationSystemResource": return new GcpAuthorizationSystemResource();
            }
        }
        return new AuthorizationSystemResource();
    }
    /**
     * Gets the authorizationSystem property value. The authorizationSystem property
     * @return a AuthorizationSystem
     */
    @jakarta.annotation.Nullable
    public AuthorizationSystem getAuthorizationSystem() {
        return this.authorizationSystem;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the externalId property value. The externalId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.externalId;
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
        deserializerMap.put("resourceType", (n) -> { this.setResourceType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the resourceType property value. The resourceType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceType() {
        return this.resourceType;
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
        writer.writeStringValue("resourceType", this.getResourceType());
    }
    /**
     * Sets the authorizationSystem property value. The authorizationSystem property
     * @param value Value to set for the authorizationSystem property.
     */
    public void setAuthorizationSystem(@jakarta.annotation.Nullable final AuthorizationSystem value) {
        this.authorizationSystem = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the externalId property value. The externalId property
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.externalId = value;
    }
    /**
     * Sets the resourceType property value. The resourceType property
     * @param value Value to set for the resourceType property.
     */
    public void setResourceType(@jakarta.annotation.Nullable final String value) {
        this.resourceType = value;
    }
}
