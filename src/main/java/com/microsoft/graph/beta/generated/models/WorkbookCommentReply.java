package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookCommentReply extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WorkbookCommentReply} and sets the default values.
     */
    public WorkbookCommentReply() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WorkbookCommentReply}
     */
    @jakarta.annotation.Nonnull
    public static WorkbookCommentReply createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookCommentReply();
    }
    /**
     * Gets the content property value. The content of the reply that is the displayed to end-users.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContent() {
        return this.backingStore.get("content");
    }
    /**
     * Gets the contentType property value. The content type for the reply. Supported values are: plain, mention.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContentType() {
        return this.backingStore.get("contentType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { this.setContent(n.getStringValue()); });
        deserializerMap.put("contentType", (n) -> { this.setContentType(n.getStringValue()); });
        deserializerMap.put("mentions", (n) -> { this.setMentions(n.getCollectionOfObjectValues(WorkbookCommentMention::createFromDiscriminatorValue)); });
        deserializerMap.put("richContent", (n) -> { this.setRichContent(n.getStringValue()); });
        deserializerMap.put("task", (n) -> { this.setTask(n.getObjectValue(WorkbookDocumentTask::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the mentions property value. A collection that contains all the people mentioned within the reply. When contentType is plain, this property is an empty array. Read-only.
     * @return a {@link java.util.List<WorkbookCommentMention>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkbookCommentMention> getMentions() {
        return this.backingStore.get("mentions");
    }
    /**
     * Gets the richContent property value. The rich content of the reply (for example, reply content with mentions, where the first mentioned entity has an ID attribute of 0 and the second has an ID attribute of 1). When contentType is plain, this property is empty. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRichContent() {
        return this.backingStore.get("richContent");
    }
    /**
     * Gets the task property value. The task associated with the comment thread.
     * @return a {@link WorkbookDocumentTask}
     */
    @jakarta.annotation.Nullable
    public WorkbookDocumentTask getTask() {
        return this.backingStore.get("task");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("content", this.getContent());
        writer.writeStringValue("contentType", this.getContentType());
        writer.writeCollectionOfObjectValues("mentions", this.getMentions());
        writer.writeStringValue("richContent", this.getRichContent());
        writer.writeObjectValue("task", this.getTask());
    }
    /**
     * Sets the content property value. The content of the reply that is the displayed to end-users.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("content", value);
    }
    /**
     * Sets the contentType property value. The content type for the reply. Supported values are: plain, mention.
     * @param value Value to set for the contentType property.
     */
    public void setContentType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contentType", value);
    }
    /**
     * Sets the mentions property value. A collection that contains all the people mentioned within the reply. When contentType is plain, this property is an empty array. Read-only.
     * @param value Value to set for the mentions property.
     */
    public void setMentions(@jakarta.annotation.Nullable final java.util.List<WorkbookCommentMention> value) {
        this.backingStore.set("mentions", value);
    }
    /**
     * Sets the richContent property value. The rich content of the reply (for example, reply content with mentions, where the first mentioned entity has an ID attribute of 0 and the second has an ID attribute of 1). When contentType is plain, this property is empty. Read-only.
     * @param value Value to set for the richContent property.
     */
    public void setRichContent(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("richContent", value);
    }
    /**
     * Sets the task property value. The task associated with the comment thread.
     * @param value Value to set for the task property.
     */
    public void setTask(@jakarta.annotation.Nullable final WorkbookDocumentTask value) {
        this.backingStore.set("task", value);
    }
}
