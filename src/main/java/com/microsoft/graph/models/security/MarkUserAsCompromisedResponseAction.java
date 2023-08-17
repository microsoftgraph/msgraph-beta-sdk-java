package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MarkUserAsCompromisedResponseAction extends ResponseAction implements Parsable {
    /**
     * The identifier property
     */
    private MarkUserAsCompromisedEntityIdentifier identifier;
    /**
     * Instantiates a new markUserAsCompromisedResponseAction and sets the default values.
     */
    public MarkUserAsCompromisedResponseAction() {
        super();
        this.setOdataType("#microsoft.graph.security.markUserAsCompromisedResponseAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a markUserAsCompromisedResponseAction
     */
    @jakarta.annotation.Nonnull
    public static MarkUserAsCompromisedResponseAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MarkUserAsCompromisedResponseAction();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("identifier", (n) -> { this.setIdentifier(n.getEnumValue(MarkUserAsCompromisedEntityIdentifier.class)); });
        return deserializerMap;
    }
    /**
     * Gets the identifier property value. The identifier property
     * @return a markUserAsCompromisedEntityIdentifier
     */
    @jakarta.annotation.Nullable
    public MarkUserAsCompromisedEntityIdentifier getIdentifier() {
        return this.identifier;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("identifier", this.getIdentifier());
    }
    /**
     * Sets the identifier property value. The identifier property
     * @param value Value to set for the identifier property.
     */
    public void setIdentifier(@jakarta.annotation.Nullable final MarkUserAsCompromisedEntityIdentifier value) {
        this.identifier = value;
    }
}
