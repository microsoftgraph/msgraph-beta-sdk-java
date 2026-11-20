package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Addressable transcript entity owned only by an agent run and referenced by the session aggregate. The key explicitly maps Graph id to backend messageId without shadowing an inherited property; ids are unique across the containing session.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InvestigationMessage extends Entity implements Parsable {
    /**
     * Instantiates a new {@link InvestigationMessage} and sets the default values.
     */
    public InvestigationMessage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InvestigationMessage}
     */
    @jakarta.annotation.Nonnull
    public static InvestigationMessage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InvestigationMessage();
    }
    /**
     * Gets the agentTurnId property value. Opaque identifier of the agent-processing turn associated with this message, when available. Does not identify the overall session or run.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentTurnId() {
        return this.backingStore.get("agentTurnId");
    }
    /**
     * Gets the author property value. Embedded message-author role and identifier, not an independently addressable resource.
     * @return a {@link InvestigationMessageAuthor}
     */
    @jakarta.annotation.Nullable
    public InvestigationMessageAuthor getAuthor() {
        return this.backingStore.get("author");
    }
    /**
     * Gets the content property value. Optional in historical transcript reads when the source omits content.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContent() {
        return this.backingStore.get("content");
    }
    /**
     * Gets the createdDateTime property value. UTC persistence timestamp. Backend wire name: timestamp.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("agentTurnId", (n) -> { this.setAgentTurnId(n.getStringValue()); });
        deserializerMap.put("author", (n) -> { this.setAuthor(n.getObjectValue(InvestigationMessageAuthor::createFromDiscriminatorValue)); });
        deserializerMap.put("content", (n) -> { this.setContent(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("kind", (n) -> { this.setKind(n.getEnumValue(InvestigationMessageType::forValue)); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(InvestigationMessageRole::forValue)); });
        deserializerMap.put("sequenceId", (n) -> { this.setSequenceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the kind property value. Read-only message categories from the existing transcript contract.
     * @return a {@link InvestigationMessageType}
     */
    @jakarta.annotation.Nullable
    public InvestigationMessageType getKind() {
        return this.backingStore.get("kind");
    }
    /**
     * Gets the role property value. Transcript message role or recorded author kind. These are independent fields; a tool or system message can have an agent author.
     * @return a {@link InvestigationMessageRole}
     */
    @jakarta.annotation.Nullable
    public InvestigationMessageRole getRole() {
        return this.backingStore.get("role");
    }
    /**
     * Gets the sequenceId property value. Opaque chronological sequence identifier, when available. Does not advertise Graph delta or a message-item key.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSequenceId() {
        return this.backingStore.get("sequenceId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("author", this.getAuthor());
        writer.writeStringValue("content", this.getContent());
        writer.writeEnumValue("kind", this.getKind());
        writer.writeEnumValue("role", this.getRole());
    }
    /**
     * Sets the agentTurnId property value. Opaque identifier of the agent-processing turn associated with this message, when available. Does not identify the overall session or run.
     * @param value Value to set for the agentTurnId property.
     */
    public void setAgentTurnId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentTurnId", value);
    }
    /**
     * Sets the author property value. Embedded message-author role and identifier, not an independently addressable resource.
     * @param value Value to set for the author property.
     */
    public void setAuthor(@jakarta.annotation.Nullable final InvestigationMessageAuthor value) {
        this.backingStore.set("author", value);
    }
    /**
     * Sets the content property value. Optional in historical transcript reads when the source omits content.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("content", value);
    }
    /**
     * Sets the createdDateTime property value. UTC persistence timestamp. Backend wire name: timestamp.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the kind property value. Read-only message categories from the existing transcript contract.
     * @param value Value to set for the kind property.
     */
    public void setKind(@jakarta.annotation.Nullable final InvestigationMessageType value) {
        this.backingStore.set("kind", value);
    }
    /**
     * Sets the role property value. Transcript message role or recorded author kind. These are independent fields; a tool or system message can have an agent author.
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final InvestigationMessageRole value) {
        this.backingStore.set("role", value);
    }
    /**
     * Sets the sequenceId property value. Opaque chronological sequence identifier, when available. Does not advertise Graph delta or a message-item key.
     * @param value Value to set for the sequenceId property.
     */
    public void setSequenceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sequenceId", value);
    }
}
