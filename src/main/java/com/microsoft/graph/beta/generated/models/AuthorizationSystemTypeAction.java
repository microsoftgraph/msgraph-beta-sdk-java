package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthorizationSystemTypeAction extends Entity implements Parsable {
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
     * Gets the actionType property value. The type of action allowed in the authorization system's service. The possible values are: delete, read, unknownFutureValue. Supports $filter and (eq).
     * @return a AuthorizationSystemTypeActionActionType
     */
    @jakarta.annotation.Nullable
    public AuthorizationSystemTypeActionActionType getActionType() {
        return this.backingStore.get("actionType");
    }
    /**
     * Gets the externalId property value. The display name of an action. Read-only. Supports $filter and (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.backingStore.get("externalId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionType", (n) -> { this.setActionType(n.getEnumValue(AuthorizationSystemTypeActionActionType::forValue)); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("resourceTypes", (n) -> { this.setResourceTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(AuthorizationSystemActionSeverity::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the resourceTypes property value. The resource types in the authorization system's service where the action can be performed. Supports $filter and (eq).
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getResourceTypes() {
        return this.backingStore.get("resourceTypes");
    }
    /**
     * Gets the severity property value. The severity property
     * @return a AuthorizationSystemActionSeverity
     */
    @jakarta.annotation.Nullable
    public AuthorizationSystemActionSeverity getSeverity() {
        return this.backingStore.get("severity");
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
     * Sets the actionType property value. The type of action allowed in the authorization system's service. The possible values are: delete, read, unknownFutureValue. Supports $filter and (eq).
     * @param value Value to set for the actionType property.
     */
    public void setActionType(@jakarta.annotation.Nullable final AuthorizationSystemTypeActionActionType value) {
        this.backingStore.set("actionType", value);
    }
    /**
     * Sets the externalId property value. The display name of an action. Read-only. Supports $filter and (eq).
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalId", value);
    }
    /**
     * Sets the resourceTypes property value. The resource types in the authorization system's service where the action can be performed. Supports $filter and (eq).
     * @param value Value to set for the resourceTypes property.
     */
    public void setResourceTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("resourceTypes", value);
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final AuthorizationSystemActionSeverity value) {
        this.backingStore.set("severity", value);
    }
}
