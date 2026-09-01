package com.microsoft.graph.beta.models.identitygovernance;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InactivityRule extends LifecyclePolicyRule implements Parsable {
    /**
     * Instantiates a new {@link InactivityRule} and sets the default values.
     */
    public InactivityRule() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.inactivityRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InactivityRule}
     */
    @jakarta.annotation.Nonnull
    public static InactivityRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InactivityRule();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("lastActivityThresholdInDays", (n) -> { this.setLastActivityThresholdInDays(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastActivityThresholdInDays property value. The lastActivityThresholdInDays property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLastActivityThresholdInDays() {
        return this.backingStore.get("lastActivityThresholdInDays");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("lastActivityThresholdInDays", this.getLastActivityThresholdInDays());
    }
    /**
     * Sets the lastActivityThresholdInDays property value. The lastActivityThresholdInDays property
     * @param value Value to set for the lastActivityThresholdInDays property.
     */
    public void setLastActivityThresholdInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("lastActivityThresholdInDays", value);
    }
}
