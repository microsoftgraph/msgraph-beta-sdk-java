package com.microsoft.graph.beta.models.security.securitycopilot;

import com.microsoft.graph.beta.models.Dictionary;
import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Prompt extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Prompt} and sets the default values.
     */
    public Prompt() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Prompt}
     */
    @jakarta.annotation.Nonnull
    public static Prompt createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Prompt();
    }
    /**
     * Gets the content property value. The content property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContent() {
        return this.backingStore.get("content");
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the evaluations property value. The evaluations property
     * @return a {@link java.util.List<Evaluation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Evaluation> getEvaluations() {
        return this.backingStore.get("evaluations");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { this.setContent(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("evaluations", (n) -> { this.setEvaluations(n.getCollectionOfObjectValues(Evaluation::createFromDiscriminatorValue)); });
        deserializerMap.put("inputs", (n) -> { this.setInputs(n.getObjectValue(Dictionary::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("skillInputDescriptors", (n) -> { this.setSkillInputDescriptors(n.getCollectionOfObjectValues(SkillInputDescriptor::createFromDiscriminatorValue)); });
        deserializerMap.put("skillName", (n) -> { this.setSkillName(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(PromptType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the inputs property value. The inputs property
     * @return a {@link Dictionary}
     */
    @jakarta.annotation.Nullable
    public Dictionary getInputs() {
        return this.backingStore.get("inputs");
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the skillInputDescriptors property value. The skillInputDescriptors property
     * @return a {@link java.util.List<SkillInputDescriptor>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SkillInputDescriptor> getSkillInputDescriptors() {
        return this.backingStore.get("skillInputDescriptors");
    }
    /**
     * Gets the skillName property value. The skillName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSkillName() {
        return this.backingStore.get("skillName");
    }
    /**
     * Gets the type property value. The type property
     * @return a {@link PromptType}
     */
    @jakarta.annotation.Nullable
    public PromptType getType() {
        return this.backingStore.get("type");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("content", this.getContent());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfObjectValues("evaluations", this.getEvaluations());
        writer.writeObjectValue("inputs", this.getInputs());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfObjectValues("skillInputDescriptors", this.getSkillInputDescriptors());
        writer.writeStringValue("skillName", this.getSkillName());
        writer.writeEnumValue("type", this.getType());
    }
    /**
     * Sets the content property value. The content property
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("content", value);
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the evaluations property value. The evaluations property
     * @param value Value to set for the evaluations property.
     */
    public void setEvaluations(@jakarta.annotation.Nullable final java.util.List<Evaluation> value) {
        this.backingStore.set("evaluations", value);
    }
    /**
     * Sets the inputs property value. The inputs property
     * @param value Value to set for the inputs property.
     */
    public void setInputs(@jakarta.annotation.Nullable final Dictionary value) {
        this.backingStore.set("inputs", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the skillInputDescriptors property value. The skillInputDescriptors property
     * @param value Value to set for the skillInputDescriptors property.
     */
    public void setSkillInputDescriptors(@jakarta.annotation.Nullable final java.util.List<SkillInputDescriptor> value) {
        this.backingStore.set("skillInputDescriptors", value);
    }
    /**
     * Sets the skillName property value. The skillName property
     * @param value Value to set for the skillName property.
     */
    public void setSkillName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("skillName", value);
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final PromptType value) {
        this.backingStore.set("type", value);
    }
}
