package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivilegeEscalation extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PrivilegeEscalation} and sets the default values.
     */
    public PrivilegeEscalation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PrivilegeEscalation}
     */
    @jakarta.annotation.Nonnull
    public static PrivilegeEscalation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegeEscalation();
    }
    /**
     * Gets the actions property value. The list of actions that the identity could perform.
     * @return a {@link java.util.List<AuthorizationSystemTypeAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthorizationSystemTypeAction> getActions() {
        return this.backingStore.get("actions");
    }
    /**
     * Gets the description property value. A detailed description of the privilege escalation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The name of the policy that defines the escalation
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actions", (n) -> { this.setActions(n.getCollectionOfObjectValues(AuthorizationSystemTypeAction::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("resources", (n) -> { this.setResources(n.getCollectionOfObjectValues(AuthorizationSystemResource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the resources property value. The list of resources that the identity could perform actions on.
     * @return a {@link java.util.List<AuthorizationSystemResource>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthorizationSystemResource> getResources() {
        return this.backingStore.get("resources");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("actions", this.getActions());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("resources", this.getResources());
    }
    /**
     * Sets the actions property value. The list of actions that the identity could perform.
     * @param value Value to set for the actions property.
     */
    public void setActions(@jakarta.annotation.Nullable final java.util.List<AuthorizationSystemTypeAction> value) {
        this.backingStore.set("actions", value);
    }
    /**
     * Sets the description property value. A detailed description of the privilege escalation.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The name of the policy that defines the escalation
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the resources property value. The list of resources that the identity could perform actions on.
     * @param value Value to set for the resources property.
     */
    public void setResources(@jakarta.annotation.Nullable final java.util.List<AuthorizationSystemResource> value) {
        this.backingStore.set("resources", value);
    }
}
