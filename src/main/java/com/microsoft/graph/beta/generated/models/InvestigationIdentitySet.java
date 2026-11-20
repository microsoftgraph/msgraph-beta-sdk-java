package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Open investigation provenance extending shared user, application, and device identities with the recorded agent principal. This computed parent provenance grants no execution credentials or cross-tenant authorization.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InvestigationIdentitySet extends IdentitySet implements Parsable {
    /**
     * Instantiates a new {@link InvestigationIdentitySet} and sets the default values.
     */
    public InvestigationIdentitySet() {
        super();
        this.setOdataType("#microsoft.graph.investigationIdentitySet");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InvestigationIdentitySet}
     */
    @jakarta.annotation.Nonnull
    public static InvestigationIdentitySet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InvestigationIdentitySet();
    }
    /**
     * Gets the agent property value. The initiating agent principal, when recorded by the service.
     * @return a {@link Identity}
     */
    @jakarta.annotation.Nullable
    public Identity getAgent() {
        return this.backingStore.get("agent");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("agent", (n) -> { this.setAgent(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
    /**
     * Sets the agent property value. The initiating agent principal, when recorded by the service.
     * @param value Value to set for the agent property.
     */
    public void setAgent(@jakarta.annotation.Nullable final Identity value) {
        this.backingStore.set("agent", value);
    }
}
