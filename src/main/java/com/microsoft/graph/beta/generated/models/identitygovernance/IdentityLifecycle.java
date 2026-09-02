package com.microsoft.graph.beta.models.identitygovernance;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IdentityLifecycle extends Entity implements Parsable {
    /**
     * Instantiates a new {@link IdentityLifecycle} and sets the default values.
     */
    public IdentityLifecycle() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IdentityLifecycle}
     */
    @jakarta.annotation.Nonnull
    public static IdentityLifecycle createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.identityGovernance.agentIdentityLifecycle": return new AgentIdentityLifecycle();
            }
        }
        return new IdentityLifecycle();
    }
    /**
     * Gets the complianceIssues property value. The complianceIssues property
     * @return a {@link java.util.List<ComplianceIssue>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ComplianceIssue> getComplianceIssues() {
        return this.backingStore.get("complianceIssues");
    }
    /**
     * Gets the effectiveGoverningPolicy property value. The effectiveGoverningPolicy property
     * @return a {@link LifecyclePolicy}
     */
    @jakarta.annotation.Nullable
    public LifecyclePolicy getEffectiveGoverningPolicy() {
        return this.backingStore.get("effectiveGoverningPolicy");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("complianceIssues", (n) -> { this.setComplianceIssues(n.getCollectionOfObjectValues(ComplianceIssue::createFromDiscriminatorValue)); });
        deserializerMap.put("effectiveGoverningPolicy", (n) -> { this.setEffectiveGoverningPolicy(n.getObjectValue(LifecyclePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("lastAttestationDateTime", (n) -> { this.setLastAttestationDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastAttestationDateTime property value. The lastAttestationDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastAttestationDateTime() {
        return this.backingStore.get("lastAttestationDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("complianceIssues", this.getComplianceIssues());
        writer.writeObjectValue("effectiveGoverningPolicy", this.getEffectiveGoverningPolicy());
        writer.writeOffsetDateTimeValue("lastAttestationDateTime", this.getLastAttestationDateTime());
    }
    /**
     * Sets the complianceIssues property value. The complianceIssues property
     * @param value Value to set for the complianceIssues property.
     */
    public void setComplianceIssues(@jakarta.annotation.Nullable final java.util.List<ComplianceIssue> value) {
        this.backingStore.set("complianceIssues", value);
    }
    /**
     * Sets the effectiveGoverningPolicy property value. The effectiveGoverningPolicy property
     * @param value Value to set for the effectiveGoverningPolicy property.
     */
    public void setEffectiveGoverningPolicy(@jakarta.annotation.Nullable final LifecyclePolicy value) {
        this.backingStore.set("effectiveGoverningPolicy", value);
    }
    /**
     * Sets the lastAttestationDateTime property value. The lastAttestationDateTime property
     * @param value Value to set for the lastAttestationDateTime property.
     */
    public void setLastAttestationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastAttestationDateTime", value);
    }
}
