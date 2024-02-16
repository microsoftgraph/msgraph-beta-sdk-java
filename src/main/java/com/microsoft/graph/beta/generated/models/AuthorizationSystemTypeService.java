package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthorizationSystemTypeService extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AuthorizationSystemTypeService} and sets the default values.
     */
    public AuthorizationSystemTypeService() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AuthorizationSystemTypeService}
     */
    @jakarta.annotation.Nonnull
    public static AuthorizationSystemTypeService createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthorizationSystemTypeService();
    }
    /**
     * Gets the actions property value. List of actions for the service in an authorization system that is onboarded to Permissions Management.
     * @return a {@link java.util.List<AuthorizationSystemTypeAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthorizationSystemTypeAction> getActions() {
        return this.backingStore.get("actions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actions", (n) -> { this.setActions(n.getCollectionOfObjectValues(AuthorizationSystemTypeAction::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("actions", this.getActions());
    }
    /**
     * Sets the actions property value. List of actions for the service in an authorization system that is onboarded to Permissions Management.
     * @param value Value to set for the actions property.
     */
    public void setActions(@jakarta.annotation.Nullable final java.util.List<AuthorizationSystemTypeAction> value) {
        this.backingStore.set("actions", value);
    }
}
