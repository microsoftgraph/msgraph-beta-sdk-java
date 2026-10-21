package com.microsoft.graph.beta.models.identitygovernance;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Requires a pending guest invitation to be redeemed within a threshold period. Guest lifecycle policies only; adding this rule to a non-guest lifecycle policy returns HTTP 400.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InvitationRedemptionRule extends LifecyclePolicyRule implements Parsable {
    /**
     * Instantiates a new {@link InvitationRedemptionRule} and sets the default values.
     */
    public InvitationRedemptionRule() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.invitationRedemptionRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InvitationRedemptionRule}
     */
    @jakarta.annotation.Nonnull
    public static InvitationRedemptionRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InvitationRedemptionRule();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("invitationRedemptionThresholdInDays", (n) -> { this.setInvitationRedemptionThresholdInDays(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the invitationRedemptionThresholdInDays property value. The number of days in which the guest user must redeem their invitation.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getInvitationRedemptionThresholdInDays() {
        return this.backingStore.get("invitationRedemptionThresholdInDays");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("invitationRedemptionThresholdInDays", this.getInvitationRedemptionThresholdInDays());
    }
    /**
     * Sets the invitationRedemptionThresholdInDays property value. The number of days in which the guest user must redeem their invitation.
     * @param value Value to set for the invitationRedemptionThresholdInDays property.
     */
    public void setInvitationRedemptionThresholdInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("invitationRedemptionThresholdInDays", value);
    }
}
