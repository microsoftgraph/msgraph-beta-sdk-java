package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomQuestionAnswer extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CustomQuestionAnswer} and sets the default values.
     */
    public CustomQuestionAnswer() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomQuestionAnswer}
     */
    @jakarta.annotation.Nonnull
    public static CustomQuestionAnswer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomQuestionAnswer();
    }
    /**
     * Gets the displayName property value. Display name of the custom registration question. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("questionId", (n) -> { this.setQuestionId(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the questionId property value. ID the custom registration question. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getQuestionId() {
        return this.backingStore.get("questionId");
    }
    /**
     * Gets the value property value. Answer to the custom registration question.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.backingStore.get("value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("questionId", this.getQuestionId());
        writer.writeStringValue("value", this.getValue());
    }
    /**
     * Sets the displayName property value. Display name of the custom registration question. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the questionId property value. ID the custom registration question. Read-only.
     * @param value Value to set for the questionId property.
     */
    public void setQuestionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("questionId", value);
    }
    /**
     * Sets the value property value. Answer to the custom registration question.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("value", value);
    }
}
