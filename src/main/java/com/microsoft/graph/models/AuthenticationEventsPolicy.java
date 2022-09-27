package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationEventsPolicy extends Entity implements Parsable {
    /** A list of applicable actions to be taken on sign-up. */
    private java.util.List<AuthenticationListener> _onSignupStart;
    /**
     * Instantiates a new AuthenticationEventsPolicy and sets the default values.
     * @return a void
     */
    public AuthenticationEventsPolicy() {
        super();
        this.setOdataType("#microsoft.graph.authenticationEventsPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AuthenticationEventsPolicy
     */
    @javax.annotation.Nonnull
    public static AuthenticationEventsPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationEventsPolicy();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AuthenticationEventsPolicy currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("onSignupStart", (n) -> { currentObject.setOnSignupStart(n.getCollectionOfObjectValues(AuthenticationListener::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the onSignupStart property value. A list of applicable actions to be taken on sign-up.
     * @return a authenticationListener
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationListener> getOnSignupStart() {
        return this._onSignupStart;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("onSignupStart", this.getOnSignupStart());
    }
    /**
     * Sets the onSignupStart property value. A list of applicable actions to be taken on sign-up.
     * @param value Value to set for the onSignupStart property.
     * @return a void
     */
    public void setOnSignupStart(@javax.annotation.Nullable final java.util.List<AuthenticationListener> value) {
        this._onSignupStart = value;
    }
}
