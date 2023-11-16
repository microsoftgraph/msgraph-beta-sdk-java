package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BuiltInIdentityProvider extends IdentityProviderBase implements Parsable {
    /**
     * Instantiates a new BuiltInIdentityProvider and sets the default values.
     */
    public BuiltInIdentityProvider() {
        super();
        this.setOdataType("#microsoft.graph.builtInIdentityProvider");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BuiltInIdentityProvider
     */
    @jakarta.annotation.Nonnull
    public static BuiltInIdentityProvider createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BuiltInIdentityProvider();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("identityProviderType", (n) -> { this.setIdentityProviderType(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(IdentityProviderState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the identityProviderType property value. The identity provider type. For a B2B scenario, possible values: AADSignup, MicrosoftAccount, EmailOTP. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIdentityProviderType() {
        return this.BackingStore.get("identityProviderType");
    }
    /**
     * Gets the state property value. The state property
     * @return a IdentityProviderState
     */
    @jakarta.annotation.Nullable
    public IdentityProviderState getState() {
        return this.BackingStore.get("state");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("identityProviderType", this.getIdentityProviderType());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the identityProviderType property value. The identity provider type. For a B2B scenario, possible values: AADSignup, MicrosoftAccount, EmailOTP. Required.
     * @param value Value to set for the identityProviderType property.
     */
    public void setIdentityProviderType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("identityProviderType", value);
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final IdentityProviderState value) {
        this.BackingStore.set("state", value);
    }
}
