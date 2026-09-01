package com.microsoft.graph.beta.models.identitygovernance;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DisableThenDeleteEnforcementAction extends LifecyclePolicyEnforcementAction implements Parsable {
    /**
     * Instantiates a new {@link DisableThenDeleteEnforcementAction} and sets the default values.
     */
    public DisableThenDeleteEnforcementAction() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.disableThenDeleteEnforcementAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DisableThenDeleteEnforcementAction}
     */
    @jakarta.annotation.Nonnull
    public static DisableThenDeleteEnforcementAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DisableThenDeleteEnforcementAction();
    }
    /**
     * Gets the deletionGracePeriodInDays property value. The deletionGracePeriodInDays property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDeletionGracePeriodInDays() {
        return this.backingStore.get("deletionGracePeriodInDays");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deletionGracePeriodInDays", (n) -> { this.setDeletionGracePeriodInDays(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("deletionGracePeriodInDays", this.getDeletionGracePeriodInDays());
    }
    /**
     * Sets the deletionGracePeriodInDays property value. The deletionGracePeriodInDays property
     * @param value Value to set for the deletionGracePeriodInDays property.
     */
    public void setDeletionGracePeriodInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("deletionGracePeriodInDays", value);
    }
}
