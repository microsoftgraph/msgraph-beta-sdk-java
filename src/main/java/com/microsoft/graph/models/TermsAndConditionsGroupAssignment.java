package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** A termsAndConditionsGroupAssignment entity represents the assignment of a given Terms and Conditions (T&C) policy to a given group. Users in the group will be required to accept the terms in order to have devices enrolled into Intune. */
public class TermsAndConditionsGroupAssignment extends Entity implements Parsable {
    /** Unique identifier of a group that the T&C policy is assigned to. */
    private String _targetGroupId;
    /** Navigation link to the terms and conditions that are assigned. */
    private TermsAndConditions _termsAndConditions;
    /**
     * Instantiates a new termsAndConditionsGroupAssignment and sets the default values.
     * @return a void
     */
    public TermsAndConditionsGroupAssignment() {
        super();
        this.setOdataType("#microsoft.graph.termsAndConditionsGroupAssignment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a termsAndConditionsGroupAssignment
     */
    @javax.annotation.Nonnull
    public static TermsAndConditionsGroupAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TermsAndConditionsGroupAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TermsAndConditionsGroupAssignment currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("targetGroupId", (n) -> { currentObject.setTargetGroupId(n.getStringValue()); });
            this.put("termsAndConditions", (n) -> { currentObject.setTermsAndConditions(n.getObjectValue(TermsAndConditions::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the targetGroupId property value. Unique identifier of a group that the T&C policy is assigned to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetGroupId() {
        return this._targetGroupId;
    }
    /**
     * Gets the termsAndConditions property value. Navigation link to the terms and conditions that are assigned.
     * @return a termsAndConditions
     */
    @javax.annotation.Nullable
    public TermsAndConditions getTermsAndConditions() {
        return this._termsAndConditions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("targetGroupId", this.getTargetGroupId());
        writer.writeObjectValue("termsAndConditions", this.getTermsAndConditions());
    }
    /**
     * Sets the targetGroupId property value. Unique identifier of a group that the T&C policy is assigned to.
     * @param value Value to set for the targetGroupId property.
     * @return a void
     */
    public void setTargetGroupId(@javax.annotation.Nullable final String value) {
        this._targetGroupId = value;
    }
    /**
     * Sets the termsAndConditions property value. Navigation link to the terms and conditions that are assigned.
     * @param value Value to set for the termsAndConditions property.
     * @return a void
     */
    public void setTermsAndConditions(@javax.annotation.Nullable final TermsAndConditions value) {
        this._termsAndConditions = value;
    }
}
