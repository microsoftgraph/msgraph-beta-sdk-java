package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageTextInputQuestion extends AccessPackageQuestion implements Parsable {
    /** Indicates whether the answer will be in single or multiple line format. */
    private Boolean _isSingleLineQuestion;
    /** The regexPattern property */
    private String _regexPattern;
    /**
     * Instantiates a new AccessPackageTextInputQuestion and sets the default values.
     * @return a void
     */
    public AccessPackageTextInputQuestion() {
        super();
        this.setOdataType("#microsoft.graph.accessPackageTextInputQuestion");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessPackageTextInputQuestion
     */
    @javax.annotation.Nonnull
    public static AccessPackageTextInputQuestion createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageTextInputQuestion();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessPackageTextInputQuestion currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("isSingleLineQuestion", (n) -> { currentObject.setIsSingleLineQuestion(n.getBooleanValue()); });
            this.put("regexPattern", (n) -> { currentObject.setRegexPattern(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isSingleLineQuestion property value. Indicates whether the answer will be in single or multiple line format.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSingleLineQuestion() {
        return this._isSingleLineQuestion;
    }
    /**
     * Gets the regexPattern property value. The regexPattern property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegexPattern() {
        return this._regexPattern;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isSingleLineQuestion", this.getIsSingleLineQuestion());
        writer.writeStringValue("regexPattern", this.getRegexPattern());
    }
    /**
     * Sets the isSingleLineQuestion property value. Indicates whether the answer will be in single or multiple line format.
     * @param value Value to set for the isSingleLineQuestion property.
     * @return a void
     */
    public void setIsSingleLineQuestion(@javax.annotation.Nullable final Boolean value) {
        this._isSingleLineQuestion = value;
    }
    /**
     * Sets the regexPattern property value. The regexPattern property
     * @param value Value to set for the regexPattern property.
     * @return a void
     */
    public void setRegexPattern(@javax.annotation.Nullable final String value) {
        this._regexPattern = value;
    }
}
