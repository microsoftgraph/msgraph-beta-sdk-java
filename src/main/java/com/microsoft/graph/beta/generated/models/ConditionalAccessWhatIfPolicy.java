package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConditionalAccessWhatIfPolicy extends ConditionalAccessPolicy implements Parsable {
    /**
     * Instantiates a new {@link ConditionalAccessWhatIfPolicy} and sets the default values.
     */
    public ConditionalAccessWhatIfPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConditionalAccessWhatIfPolicy}
     */
    @jakarta.annotation.Nonnull
    public static ConditionalAccessWhatIfPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessWhatIfPolicy();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("policyApplies", (n) -> { this.setPolicyApplies(n.getBooleanValue()); });
        deserializerMap.put("reasons", (n) -> { this.setReasons(n.getCollectionOfEnumValues(ConditionalAccessWhatIfReasons::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the policyApplies property value. The policyApplies property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPolicyApplies() {
        return this.backingStore.get("policyApplies");
    }
    /**
     * Gets the reasons property value. The reasons property
     * @return a {@link java.util.List<ConditionalAccessWhatIfReasons>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConditionalAccessWhatIfReasons> getReasons() {
        return this.backingStore.get("reasons");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("policyApplies", this.getPolicyApplies());
        writer.writeCollectionOfEnumValues("reasons", this.getReasons());
    }
    /**
     * Sets the policyApplies property value. The policyApplies property
     * @param value Value to set for the policyApplies property.
     */
    public void setPolicyApplies(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("policyApplies", value);
    }
    /**
     * Sets the reasons property value. The reasons property
     * @param value Value to set for the reasons property.
     */
    public void setReasons(@jakarta.annotation.Nullable final java.util.List<ConditionalAccessWhatIfReasons> value) {
        this.backingStore.set("reasons", value);
    }
}
