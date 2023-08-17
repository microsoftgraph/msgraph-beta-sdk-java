package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationEventsPolicy extends Entity implements Parsable {
    /**
     * A list of applicable actions to be taken on sign-up.
     */
    private java.util.List<AuthenticationListener> onSignupStart;
    /**
     * Instantiates a new authenticationEventsPolicy and sets the default values.
     */
    public AuthenticationEventsPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationEventsPolicy
     */
    @jakarta.annotation.Nonnull
    public static AuthenticationEventsPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationEventsPolicy();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("onSignupStart", (n) -> { this.setOnSignupStart(n.getCollectionOfObjectValues(AuthenticationListener::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the onSignupStart property value. A list of applicable actions to be taken on sign-up.
     * @return a authenticationListener
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationListener> getOnSignupStart() {
        return this.onSignupStart;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("onSignupStart", this.getOnSignupStart());
    }
    /**
     * Sets the onSignupStart property value. A list of applicable actions to be taken on sign-up.
     * @param value Value to set for the onSignupStart property.
     */
    public void setOnSignupStart(@jakarta.annotation.Nullable final java.util.List<AuthenticationListener> value) {
        this.onSignupStart = value;
    }
}
