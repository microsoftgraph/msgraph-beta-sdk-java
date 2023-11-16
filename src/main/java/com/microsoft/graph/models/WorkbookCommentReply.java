package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookCommentReply extends Entity implements Parsable {
    /**
     * Instantiates a new WorkbookCommentReply and sets the default values.
     */
    public WorkbookCommentReply() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WorkbookCommentReply
     */
    @jakarta.annotation.Nonnull
    public static WorkbookCommentReply createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookCommentReply();
    }
    /**
     * Gets the content property value. The content of replied comment.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContent() {
        return this.BackingStore.get("content");
    }
    /**
     * Gets the contentType property value. Indicates the type for the replied comment.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContentType() {
        return this.BackingStore.get("contentType");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { this.setContent(n.getStringValue()); });
        deserializerMap.put("contentType", (n) -> { this.setContentType(n.getStringValue()); });
        deserializerMap.put("task", (n) -> { this.setTask(n.getObjectValue(WorkbookDocumentTask::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the task property value. The task associated with the comment thread.
     * @return a WorkbookDocumentTask
     */
    @jakarta.annotation.Nullable
    public WorkbookDocumentTask getTask() {
        return this.BackingStore.get("task");
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
        writer.writeObjectValue("task", this.getTask());
    }
    /**
     * Sets the content property value. The content of replied comment.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("content", value);
    }
    /**
     * Sets the contentType property value. Indicates the type for the replied comment.
     * @param value Value to set for the contentType property.
     */
    public void setContentType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("contentType", value);
    }
    /**
     * Sets the task property value. The task associated with the comment thread.
     * @param value Value to set for the task property.
     */
    public void setTask(@jakarta.annotation.Nullable final WorkbookDocumentTask value) {
        this.BackingStore.set("task", value);
    }
}
