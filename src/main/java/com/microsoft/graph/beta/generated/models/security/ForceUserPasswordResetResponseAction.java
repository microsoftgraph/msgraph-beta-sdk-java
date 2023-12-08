package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ForceUserPasswordResetResponseAction extends ResponseAction implements Parsable {
    /**
     * Instantiates a new ForceUserPasswordResetResponseAction and sets the default values.
     */
    public ForceUserPasswordResetResponseAction() {
        super();
        this.setOdataType("#microsoft.graph.security.forceUserPasswordResetResponseAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ForceUserPasswordResetResponseAction
     */
    @jakarta.annotation.Nonnull
    public static ForceUserPasswordResetResponseAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ForceUserPasswordResetResponseAction();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("identifier", (n) -> { this.setIdentifier(n.getEnumSetValue(ForceUserPasswordResetEntityIdentifier::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the identifier property value. The identifier property
     * @return a EnumSet<ForceUserPasswordResetEntityIdentifier>
     */
    @jakarta.annotation.Nullable
    public EnumSet<ForceUserPasswordResetEntityIdentifier> getIdentifier() {
        return this.backingStore.get("identifier");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumSetValue("identifier", this.getIdentifier());
    }
    /**
     * Sets the identifier property value. The identifier property
     * @param value Value to set for the identifier property.
     */
    public void setIdentifier(@jakarta.annotation.Nullable final EnumSet<ForceUserPasswordResetEntityIdentifier> value) {
        this.backingStore.set("identifier", value);
    }
}
