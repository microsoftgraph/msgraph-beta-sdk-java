package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageMultipleChoiceQuestion extends AccessPackageQuestion implements Parsable {
    /** Indicates whether requestor can select multiple choices as their answer. */
    private Boolean _allowsMultipleSelection;
    /** List of answer choices. */
    private java.util.List<AccessPackageAnswerChoice> _choices;
    /**
     * Instantiates a new AccessPackageMultipleChoiceQuestion and sets the default values.
     * @return a void
     */
    public AccessPackageMultipleChoiceQuestion() {
        super();
        this.setOdataType("#microsoft.graph.accessPackageMultipleChoiceQuestion");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessPackageMultipleChoiceQuestion
     */
    @javax.annotation.Nonnull
    public static AccessPackageMultipleChoiceQuestion createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageMultipleChoiceQuestion();
    }
    /**
     * Gets the allowsMultipleSelection property value. Indicates whether requestor can select multiple choices as their answer.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowsMultipleSelection() {
        return this._allowsMultipleSelection;
    }
    /**
     * Gets the choices property value. List of answer choices.
     * @return a accessPackageAnswerChoice
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageAnswerChoice> getChoices() {
        return this._choices;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessPackageMultipleChoiceQuestion currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("allowsMultipleSelection", (n) -> { currentObject.setAllowsMultipleSelection(n.getBooleanValue()); });
            this.put("choices", (n) -> { currentObject.setChoices(n.getCollectionOfObjectValues(AccessPackageAnswerChoice::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowsMultipleSelection", this.getAllowsMultipleSelection());
        writer.writeCollectionOfObjectValues("choices", this.getChoices());
    }
    /**
     * Sets the allowsMultipleSelection property value. Indicates whether requestor can select multiple choices as their answer.
     * @param value Value to set for the allowsMultipleSelection property.
     * @return a void
     */
    public void setAllowsMultipleSelection(@javax.annotation.Nullable final Boolean value) {
        this._allowsMultipleSelection = value;
    }
    /**
     * Sets the choices property value. List of answer choices.
     * @param value Value to set for the choices property.
     * @return a void
     */
    public void setChoices(@javax.annotation.Nullable final java.util.List<AccessPackageAnswerChoice> value) {
        this._choices = value;
    }
}
