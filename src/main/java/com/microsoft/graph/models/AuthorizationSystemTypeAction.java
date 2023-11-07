package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthorizationSystemTypeAction extends Entity implements Parsable {
    /**
     * The actionType property
     */
    private AuthorizationSystemActionType actionType;
    /**
     * The externalId property
     */
    private String externalId;
    /**
     * The resourceTypes property
     */
    private java.util.List<String> resourceTypes;
    /**
     * The severity property
     */
    private AuthorizationSystemActionSeverity severity;
    /**
     * Instantiates a new AuthorizationSystemTypeAction and sets the default values.
     */
    public AuthorizationSystemTypeAction() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AuthorizationSystemTypeAction
     */
    @jakarta.annotation.Nonnull
    public static AuthorizationSystemTypeAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.awsAuthorizationSystemTypeAction": return new AwsAuthorizationSystemTypeAction();
                case "#microsoft.graph.azureAuthorizationSystemTypeAction": return new AzureAuthorizationSystemTypeAction();
                case "#microsoft.graph.gcpAuthorizationSystemTypeAction": return new GcpAuthorizationSystemTypeAction();
            }
        }
        return new AuthorizationSystemTypeAction();
    }
    /**
     * Gets the actionType property value. The actionType property
     * @return a AuthorizationSystemActionType
     */
    @jakarta.annotation.Nullable
    public AuthorizationSystemActionType getActionType() {
        return this.actionType;
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
        deserializerMap.put("actionType", (n) -> { this.setActionType(n.getEnumValue(AuthorizationSystemActionType.class)); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("resourceTypes", (n) -> { this.setResourceTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(AuthorizationSystemActionSeverity.class)); });
        return deserializerMap;
    }
    /**
     * Gets the resourceTypes property value. The resourceTypes property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getResourceTypes() {
        return this.resourceTypes;
    }
    /**
     * Gets the severity property value. The severity property
     * @return a AuthorizationSystemActionSeverity
     */
    @jakarta.annotation.Nullable
    public AuthorizationSystemActionSeverity getSeverity() {
        return this.severity;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("actionType", this.getActionType());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeCollectionOfPrimitiveValues("resourceTypes", this.getResourceTypes());
        writer.writeEnumValue("severity", this.getSeverity());
    }
    /**
     * Sets the actionType property value. The actionType property
     * @param value Value to set for the actionType property.
     */
    public void setActionType(@jakarta.annotation.Nullable final AuthorizationSystemActionType value) {
        this.actionType = value;
    }
    /**
     * Sets the externalId property value. The externalId property
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.externalId = value;
    }
    /**
     * Sets the resourceTypes property value. The resourceTypes property
     * @param value Value to set for the resourceTypes property.
     */
    public void setResourceTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.resourceTypes = value;
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final AuthorizationSystemActionSeverity value) {
        this.severity = value;
    }
}
