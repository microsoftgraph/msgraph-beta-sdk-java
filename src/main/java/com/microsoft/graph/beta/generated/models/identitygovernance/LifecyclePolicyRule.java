package com.microsoft.graph.beta.models.identitygovernance;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LifecyclePolicyRule extends Entity implements Parsable {
    /**
     * Instantiates a new {@link LifecyclePolicyRule} and sets the default values.
     */
    public LifecyclePolicyRule() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LifecyclePolicyRule}
     */
    @jakarta.annotation.Nonnull
    public static LifecyclePolicyRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.identityGovernance.accessPackageAssignmentRequiredRule": return new AccessPackageAssignmentRequiredRule();
                case "#microsoft.graph.identityGovernance.inactivityRule": return new InactivityRule();
                case "#microsoft.graph.identityGovernance.invitationRedemptionRule": return new InvitationRedemptionRule();
                case "#microsoft.graph.identityGovernance.periodicAttestationRule": return new PeriodicAttestationRule();
                case "#microsoft.graph.identityGovernance.sponsorPresenceRule": return new SponsorPresenceRule();
            }
        }
        return new LifecyclePolicyRule();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("gracePeriodInDays", (n) -> { this.setGracePeriodInDays(n.getIntegerValue()); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the gracePeriodInDays property value. The optional grace period, in days, that starts when the rule violation is first detected. The allowed range is 0 through 30. If omitted or set to null, the gracePeriodInDays value of the containing lifecycle policy applies. A value of 0 means no additional grace period. If multiple rules remain violated, the earliest rule grace-period expiry starts the policy action sequence; the policy-level grace period isn&apos;t added again.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getGracePeriodInDays() {
        return this.backingStore.get("gracePeriodInDays");
    }
    /**
     * Gets the isEnabled property value. Indicates whether the rule is enabled and evaluated as part of its policy.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("gracePeriodInDays", this.getGracePeriodInDays());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
    }
    /**
     * Sets the gracePeriodInDays property value. The optional grace period, in days, that starts when the rule violation is first detected. The allowed range is 0 through 30. If omitted or set to null, the gracePeriodInDays value of the containing lifecycle policy applies. A value of 0 means no additional grace period. If multiple rules remain violated, the earliest rule grace-period expiry starts the policy action sequence; the policy-level grace period isn&apos;t added again.
     * @param value Value to set for the gracePeriodInDays property.
     */
    public void setGracePeriodInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("gracePeriodInDays", value);
    }
    /**
     * Sets the isEnabled property value. Indicates whether the rule is enabled and evaluated as part of its policy.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
}
