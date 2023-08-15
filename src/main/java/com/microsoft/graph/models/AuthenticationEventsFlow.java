package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationEventsFlow extends Entity implements Parsable {
    /**
     * The conditions representing the context of the authentication request which will be used to decide whether the events policy will be invoked.
     */
    private AuthenticationConditions conditions;
    /**
     * The description of the events policy.
     */
    private String description;
    /**
     * Required. The display name for the events policy.
     */
    private String displayName;
    /**
     * The priority to use for each individual event of the events policy. If multiple competing listeners for an event have the same priority, one is chosen and an error is silently logged. Defaults to 500.
     */
    private Integer priority;
    /**
     * Instantiates a new authenticationEventsFlow and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AuthenticationEventsFlow() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationEventsFlow
     */
    @jakarta.annotation.Nonnull
    public static AuthenticationEventsFlow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.externalUsersSelfServiceSignUpEventsFlow": return new ExternalUsersSelfServiceSignUpEventsFlow();
            }
        }
        return new AuthenticationEventsFlow();
    }
    /**
     * Gets the conditions property value. The conditions representing the context of the authentication request which will be used to decide whether the events policy will be invoked.
     * @return a authenticationConditions
     */
    @jakarta.annotation.Nullable
    public AuthenticationConditions getConditions() {
        return this.conditions;
    }
    /**
     * Gets the description property value. The description of the events policy.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Required. The display name for the events policy.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("conditions", (n) -> { this.setConditions(n.getObjectValue(AuthenticationConditions::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the priority property value. The priority to use for each individual event of the events policy. If multiple competing listeners for an event have the same priority, one is chosen and an error is silently logged. Defaults to 500.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("conditions", this.getConditions());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("priority", this.getPriority());
    }
    /**
     * Sets the conditions property value. The conditions representing the context of the authentication request which will be used to decide whether the events policy will be invoked.
     * @param value Value to set for the conditions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setConditions(@jakarta.annotation.Nullable final AuthenticationConditions value) {
        this.conditions = value;
    }
    /**
     * Sets the description property value. The description of the events policy.
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Required. The display name for the events policy.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the priority property value. The priority to use for each individual event of the events policy. If multiple competing listeners for an event have the same priority, one is chosen and an error is silently logged. Defaults to 500.
     * @param value Value to set for the priority property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPriority(@jakarta.annotation.Nullable final Integer value) {
        this.priority = value;
    }
}
