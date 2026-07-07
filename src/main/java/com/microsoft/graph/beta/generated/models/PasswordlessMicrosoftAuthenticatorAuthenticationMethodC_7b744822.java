package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Original name: PasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PasswordlessMicrosoftAuthenticatorAuthenticationMethodC_7b744822 extends BaseCollectionPaginationCountResponse implements Parsable {
    /**
     * Instantiates a new {@link PasswordlessMicrosoftAuthenticatorAuthenticationMethodC_7b744822} and sets the default values.
     */
    public PasswordlessMicrosoftAuthenticatorAuthenticationMethodC_7b744822() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PasswordlessMicrosoftAuthenticatorAuthenticationMethodC_7b744822}
     */
    @jakarta.annotation.Nonnull
    public static PasswordlessMicrosoftAuthenticatorAuthenticationMethodC_7b744822 createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PasswordlessMicrosoftAuthenticatorAuthenticationMethodC_7b744822();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("value", (n) -> { this.setValue(n.getCollectionOfObjectValues(PasswordlessMicrosoftAuthenticatorAuthenticationMethod::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The value property
     * @return a {@link java.util.List<PasswordlessMicrosoftAuthenticatorAuthenticationMethod>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PasswordlessMicrosoftAuthenticatorAuthenticationMethod> getValue() {
        return this.backingStore.get("value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("value", this.getValue());
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final java.util.List<PasswordlessMicrosoftAuthenticatorAuthenticationMethod> value) {
        this.backingStore.set("value", value);
    }
}
