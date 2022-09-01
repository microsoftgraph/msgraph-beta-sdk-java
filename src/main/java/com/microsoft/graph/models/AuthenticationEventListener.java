package com.microsoft.graph.models;

import com.microsoft.graph.models.OnTokenIssuanceStartListener;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationEventListener extends Entity implements Parsable {
    /** The authenticationEventsFlowId property */
    private String _authenticationEventsFlowId;
    /** The conditions property */
    private AuthenticationConditions _conditions;
    /** The priority property */
    private Integer _priority;
    /** The tags property */
    private java.util.List<KeyValuePair> _tags;
    /**
     * Instantiates a new AuthenticationEventListener and sets the default values.
     * @return a void
     */
    public AuthenticationEventListener() {
        super();
        this.setOdataType("#microsoft.graph.authenticationEventListener");
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
        return this._authenticationEventsFlowId;
    }
    /**
     * Gets the conditions property value. The conditions property
     * @return a authenticationConditions
     */
    @javax.annotation.Nullable
    public AuthenticationConditions getConditions() {
        return this._conditions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AuthenticationEventListener currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("authenticationEventsFlowId", (n) -> { currentObject.setAuthenticationEventsFlowId(n.getStringValue()); });
            this.put("conditions", (n) -> { currentObject.setConditions(n.getObjectValue(AuthenticationConditions::createFromDiscriminatorValue)); });
            this.put("priority", (n) -> { currentObject.setPriority(n.getIntegerValue()); });
            this.put("tags", (n) -> { currentObject.setTags(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the priority property value. The priority property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return this._priority;
    }
    /**
     * Gets the tags property value. The tags property
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getTags() {
        return this._tags;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("authenticationEventsFlowId", this.getAuthenticationEventsFlowId());
        writer.writeObjectValue("conditions", this.getConditions());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeCollectionOfObjectValues("tags", this.getTags());
    }
    /**
     * Sets the authenticationEventsFlowId property value. The authenticationEventsFlowId property
     * @param value Value to set for the authenticationEventsFlowId property.
     * @return a void
     */
    public void setAuthenticationEventsFlowId(@javax.annotation.Nullable final String value) {
        this._authenticationEventsFlowId = value;
    }
    /**
     * Sets the conditions property value. The conditions property
     * @param value Value to set for the conditions property.
     * @return a void
     */
    public void setConditions(@javax.annotation.Nullable final AuthenticationConditions value) {
        this._conditions = value;
    }
    /**
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     * @return a void
     */
    public void setPriority(@javax.annotation.Nullable final Integer value) {
        this._priority = value;
    }
    /**
     * Sets the tags property value. The tags property
     * @param value Value to set for the tags property.
     * @return a void
     */
    public void setTags(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._tags = value;
    }
}
