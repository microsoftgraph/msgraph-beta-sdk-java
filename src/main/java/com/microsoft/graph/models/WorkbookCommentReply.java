package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookCommentReply extends Entity implements Parsable {
    /**
     * The content of replied comment.
     */
    private String content;
    /**
     * Indicates the type for the replied comment.
     */
    private String contentType;
    /**
     * The task property
     */
    private WorkbookDocumentTask task;
    /**
     * Instantiates a new workbookCommentReply and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkbookCommentReply() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookCommentReply
     */
    @javax.annotation.Nonnull
    public static WorkbookCommentReply createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookCommentReply();
    }
    /**
     * Gets the content property value. The content of replied comment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContent() {
        return this.content;
    }
    /**
     * Gets the contentType property value. Indicates the type for the replied comment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentType() {
        return this.contentType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { this.setContent(n.getStringValue()); });
        deserializerMap.put("contentType", (n) -> { this.setContentType(n.getStringValue()); });
        deserializerMap.put("task", (n) -> { this.setTask(n.getObjectValue(WorkbookDocumentTask::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the task property value. The task property
     * @return a workbookDocumentTask
     */
    @javax.annotation.Nullable
    public WorkbookDocumentTask getTask() {
        return this.task;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("content", this.getContent());
        writer.writeStringValue("contentType", this.getContentType());
        writer.writeObjectValue("task", this.getTask());
    }
    /**
     * Sets the content property value. The content of replied comment.
     * @param value Value to set for the content property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContent(@javax.annotation.Nullable final String value) {
        this.content = value;
    }
    /**
     * Sets the contentType property value. Indicates the type for the replied comment.
     * @param value Value to set for the contentType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentType(@javax.annotation.Nullable final String value) {
        this.contentType = value;
    }
    /**
     * Sets the task property value. The task property
     * @param value Value to set for the task property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTask(@javax.annotation.Nullable final WorkbookDocumentTask value) {
        this.task = value;
    }
}
