package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookComment extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WorkbookComment} and sets the default values.
     */
    public WorkbookComment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WorkbookComment}
     */
    @jakarta.annotation.Nonnull
    public static WorkbookComment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookComment();
    }
    /**
     * Gets the content property value. The content of the comment that is the String displayed to end-users.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContent() {
        return this.backingStore.get("content");
    }
    /**
     * Gets the contentType property value. The content type of the comment. Supported values are: plain, mention.
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
        deserializerMap.put("replies", (n) -> { this.setReplies(n.getCollectionOfObjectValues(WorkbookCommentReply::createFromDiscriminatorValue)); });
        deserializerMap.put("task", (n) -> { this.setTask(n.getObjectValue(WorkbookDocumentTask::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the replies property value. The list of replies to the comment. Read-only. Nullable.
     * @return a {@link java.util.List<WorkbookCommentReply>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkbookCommentReply> getReplies() {
        return this.backingStore.get("replies");
    }
    /**
     * Gets the task property value. The task associated with the comment. Read-only. Nullable.
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
        writer.writeCollectionOfObjectValues("replies", this.getReplies());
        writer.writeObjectValue("task", this.getTask());
    }
    /**
     * Sets the content property value. The content of the comment that is the String displayed to end-users.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("content", value);
    }
    /**
     * Sets the contentType property value. The content type of the comment. Supported values are: plain, mention.
     * @param value Value to set for the contentType property.
     */
    public void setContentType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contentType", value);
    }
    /**
     * Sets the replies property value. The list of replies to the comment. Read-only. Nullable.
     * @param value Value to set for the replies property.
     */
    public void setReplies(@jakarta.annotation.Nullable final java.util.List<WorkbookCommentReply> value) {
        this.backingStore.set("replies", value);
    }
    /**
     * Sets the task property value. The task associated with the comment. Read-only. Nullable.
     * @param value Value to set for the task property.
     */
    public void setTask(@jakarta.annotation.Nullable final WorkbookDocumentTask value) {
        this.backingStore.set("task", value);
    }
}
