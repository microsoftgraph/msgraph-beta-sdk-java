package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.SubjectSet;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RuleBasedSubjectSet extends SubjectSet implements Parsable {
    /** The rule for the subject set. */
    private String _rule;
    /**
     * Instantiates a new RuleBasedSubjectSet and sets the default values.
     * @return a void
     */
    public RuleBasedSubjectSet() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.ruleBasedSubjectSet");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RuleBasedSubjectSet
     */
    @javax.annotation.Nonnull
    public static RuleBasedSubjectSet createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RuleBasedSubjectSet();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RuleBasedSubjectSet currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("rule", (n) -> { currentObject.setRule(n.getStringValue()); });
        }};
    }
    /**
     * Gets the rule property value. The rule for the subject set.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRule() {
        return this._rule;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("rule", this.getRule());
    }
    /**
     * Sets the rule property value. The rule for the subject set.
     * @param value Value to set for the rule property.
     * @return a void
     */
    public void setRule(@javax.annotation.Nullable final String value) {
        this._rule = value;
    }
}
