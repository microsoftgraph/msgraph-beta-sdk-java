package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A termsAndConditionsGroupAssignment entity represents the assignment of a given Terms and Conditions (T&C) policy to a given group. Users in the group will be required to accept the terms in order to have devices enrolled into Intune.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TermsAndConditionsGroupAssignment extends Entity implements Parsable {
    /**
     * Unique identifier of a group that the T&C policy is assigned to.
     */
    private String targetGroupId;
    /**
     * Navigation link to the terms and conditions that are assigned.
     */
    private TermsAndConditions termsAndConditions;
    /**
     * Instantiates a new TermsAndConditionsGroupAssignment and sets the default values.
     */
    public TermsAndConditionsGroupAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TermsAndConditionsGroupAssignment
     */
    @jakarta.annotation.Nonnull
    public static TermsAndConditionsGroupAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TermsAndConditionsGroupAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("targetGroupId", (n) -> { this.setTargetGroupId(n.getStringValue()); });
        deserializerMap.put("termsAndConditions", (n) -> { this.setTermsAndConditions(n.getObjectValue(TermsAndConditions::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the targetGroupId property value. Unique identifier of a group that the T&C policy is assigned to.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTargetGroupId() {
        return this.targetGroupId;
    }
    /**
     * Gets the termsAndConditions property value. Navigation link to the terms and conditions that are assigned.
     * @return a TermsAndConditions
     */
    @jakarta.annotation.Nullable
    public TermsAndConditions getTermsAndConditions() {
        return this.termsAndConditions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("targetGroupId", this.getTargetGroupId());
        writer.writeObjectValue("termsAndConditions", this.getTermsAndConditions());
    }
    /**
     * Sets the targetGroupId property value. Unique identifier of a group that the T&C policy is assigned to.
     * @param value Value to set for the targetGroupId property.
     */
    public void setTargetGroupId(@jakarta.annotation.Nullable final String value) {
        this.targetGroupId = value;
    }
    /**
     * Sets the termsAndConditions property value. Navigation link to the terms and conditions that are assigned.
     * @param value Value to set for the termsAndConditions property.
     */
    public void setTermsAndConditions(@jakarta.annotation.Nullable final TermsAndConditions value) {
        this.termsAndConditions = value;
    }
}
