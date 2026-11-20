package com.microsoft.graph.beta.models.identitygovernance;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LifecyclePolicySubjectReport extends Entity implements Parsable {
    /**
     * Instantiates a new {@link LifecyclePolicySubjectReport} and sets the default values.
     */
    public LifecyclePolicySubjectReport() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LifecyclePolicySubjectReport}
     */
    @jakarta.annotation.Nonnull
    public static LifecyclePolicySubjectReport createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LifecyclePolicySubjectReport();
    }
    /**
     * Gets the compliance property value. The compliance property
     * @return a {@link LifecyclePolicySubjectCompliance}
     */
    @jakarta.annotation.Nullable
    public LifecyclePolicySubjectCompliance getCompliance() {
        return this.backingStore.get("compliance");
    }
    /**
     * Gets the effectivePolicy property value. A reference to the effective lifecycle policy for the subject.
     * @return a {@link LifecyclePolicyReference}
     */
    @jakarta.annotation.Nullable
    public LifecyclePolicyReference getEffectivePolicy() {
        return this.backingStore.get("effectivePolicy");
    }
    /**
     * Gets the enforcement property value. The enforcement property
     * @return a {@link LifecyclePolicySubjectEnforcement}
     */
    @jakarta.annotation.Nullable
    public LifecyclePolicySubjectEnforcement getEnforcement() {
        return this.backingStore.get("enforcement");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("compliance", (n) -> { this.setCompliance(n.getObjectValue(LifecyclePolicySubjectCompliance::createFromDiscriminatorValue)); });
        deserializerMap.put("effectivePolicy", (n) -> { this.setEffectivePolicy(n.getObjectValue(LifecyclePolicyReference::createFromDiscriminatorValue)); });
        deserializerMap.put("enforcement", (n) -> { this.setEnforcement(n.getObjectValue(LifecyclePolicySubjectEnforcement::createFromDiscriminatorValue)); });
        deserializerMap.put("relationship", (n) -> { this.setRelationship(n.getEnumValue(LifecyclePolicyRelationship::forValue)); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getObjectValue(LifecyclePolicySubjectReference::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the relationship property value. The relationship property
     * @return a {@link LifecyclePolicyRelationship}
     */
    @jakarta.annotation.Nullable
    public LifecyclePolicyRelationship getRelationship() {
        return this.backingStore.get("relationship");
    }
    /**
     * Gets the subject property value. The subject property
     * @return a {@link LifecyclePolicySubjectReference}
     */
    @jakarta.annotation.Nullable
    public LifecyclePolicySubjectReference getSubject() {
        return this.backingStore.get("subject");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("compliance", this.getCompliance());
        writer.writeObjectValue("effectivePolicy", this.getEffectivePolicy());
        writer.writeObjectValue("enforcement", this.getEnforcement());
        writer.writeEnumValue("relationship", this.getRelationship());
        writer.writeObjectValue("subject", this.getSubject());
    }
    /**
     * Sets the compliance property value. The compliance property
     * @param value Value to set for the compliance property.
     */
    public void setCompliance(@jakarta.annotation.Nullable final LifecyclePolicySubjectCompliance value) {
        this.backingStore.set("compliance", value);
    }
    /**
     * Sets the effectivePolicy property value. A reference to the effective lifecycle policy for the subject.
     * @param value Value to set for the effectivePolicy property.
     */
    public void setEffectivePolicy(@jakarta.annotation.Nullable final LifecyclePolicyReference value) {
        this.backingStore.set("effectivePolicy", value);
    }
    /**
     * Sets the enforcement property value. The enforcement property
     * @param value Value to set for the enforcement property.
     */
    public void setEnforcement(@jakarta.annotation.Nullable final LifecyclePolicySubjectEnforcement value) {
        this.backingStore.set("enforcement", value);
    }
    /**
     * Sets the relationship property value. The relationship property
     * @param value Value to set for the relationship property.
     */
    public void setRelationship(@jakarta.annotation.Nullable final LifecyclePolicyRelationship value) {
        this.backingStore.set("relationship", value);
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final LifecyclePolicySubjectReference value) {
        this.backingStore.set("subject", value);
    }
}
