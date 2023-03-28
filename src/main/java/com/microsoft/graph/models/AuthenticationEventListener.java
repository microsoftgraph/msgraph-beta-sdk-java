package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationEventListener extends Entity implements Parsable {
    /** The authenticationEventsFlowId property */
    private String authenticationEventsFlowId;
    /** The conditions property */
    private AuthenticationConditions conditions;
    /** The priority property */
    private Integer priority;
    /**
     * Instantiates a new AuthenticationEventListener and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuthenticationEventListener() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AuthenticationEventListener
     */
    @javax.annotation.Nonnull
    public static AuthenticationEventListener createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.onTokenIssuanceStartListener": return new OnTokenIssuanceStartListener();
            }
        }
        return new AuthenticationEventListener();
    }
    /**
     * Gets the authenticationEventsFlowId property value. The authenticationEventsFlowId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAuthenticationEventsFlowId() {
        return this.authenticationEventsFlowId;
    }
    /**
     * Gets the conditions property value. The conditions property
     * @return a authenticationConditions
     */
    @javax.annotation.Nullable
    public AuthenticationConditions getConditions() {
        return this.conditions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationEventsFlowId", (n) -> { this.setAuthenticationEventsFlowId(n.getStringValue()); });
        deserializerMap.put("conditions", (n) -> { this.setConditions(n.getObjectValue(AuthenticationConditions::createFromDiscriminatorValue)); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the priority property value. The priority property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return this.priority;
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
        writer.writeStringValue("authenticationEventsFlowId", this.getAuthenticationEventsFlowId());
        writer.writeObjectValue("conditions", this.getConditions());
        writer.writeIntegerValue("priority", this.getPriority());
    }
    /**
     * Sets the authenticationEventsFlowId property value. The authenticationEventsFlowId property
     * @param value Value to set for the authenticationEventsFlowId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthenticationEventsFlowId(@javax.annotation.Nullable final String value) {
        this.authenticationEventsFlowId = value;
    }
    /**
     * Sets the conditions property value. The conditions property
     * @param value Value to set for the conditions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConditions(@javax.annotation.Nullable final AuthenticationConditions value) {
        this.conditions = value;
    }
    /**
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPriority(@javax.annotation.Nullable final Integer value) {
        this.priority = value;
    }
}
