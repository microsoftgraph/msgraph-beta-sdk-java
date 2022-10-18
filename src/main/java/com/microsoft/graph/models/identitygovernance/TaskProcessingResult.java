package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.Entity;
import com.microsoft.graph.models.User;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class TaskProcessingResult extends Entity implements Parsable {
    /** The date time when taskProcessingResult execution ended. Value is null if task execution is still in progress. */
    private OffsetDateTime _completedDateTime;
    /** The date time when the taskProcessingResult was created. Supports $filter(lt, gt) and orderBy. */
    private OffsetDateTime _createdDateTime;
    /** Describes why the taskProcessingResult has failed. */
    private String _failureReason;
    /** The processingStatus property */
    private LifecycleWorkflowProcessingStatus _processingStatus;
    /** The date time when taskProcessingResult execution started. Value is null if task execution has not yet started. Supports $filter(lt, gt) and orderBy. */
    private OffsetDateTime _startedDateTime;
    /** The subject property */
    private User _subject;
    /** The task property */
    private Task _task;
    /**
     * Instantiates a new taskProcessingResult and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TaskProcessingResult() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.taskProcessingResult");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a taskProcessingResult
     */
    @javax.annotation.Nonnull
    public static TaskProcessingResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TaskProcessingResult();
    }
    /**
     * Gets the completedDateTime property value. The date time when taskProcessingResult execution ended. Value is null if task execution is still in progress.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this._completedDateTime;
    }
    /**
     * Gets the createdDateTime property value. The date time when the taskProcessingResult was created. Supports $filter(lt, gt) and orderBy.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the failureReason property value. Describes why the taskProcessingResult has failed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFailureReason() {
        return this._failureReason;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TaskProcessingResult currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("completedDateTime", (n) -> { currentObject.setCompletedDateTime(n.getOffsetDateTimeValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("failureReason", (n) -> { currentObject.setFailureReason(n.getStringValue()); });
            this.put("processingStatus", (n) -> { currentObject.setProcessingStatus(n.getEnumValue(LifecycleWorkflowProcessingStatus.class)); });
            this.put("startedDateTime", (n) -> { currentObject.setStartedDateTime(n.getOffsetDateTimeValue()); });
            this.put("subject", (n) -> { currentObject.setSubject(n.getObjectValue(User::createFromDiscriminatorValue)); });
            this.put("task", (n) -> { currentObject.setTask(n.getObjectValue(Task::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the processingStatus property value. The processingStatus property
     * @return a lifecycleWorkflowProcessingStatus
     */
    @javax.annotation.Nullable
    public LifecycleWorkflowProcessingStatus getProcessingStatus() {
        return this._processingStatus;
    }
    /**
     * Gets the startedDateTime property value. The date time when taskProcessingResult execution started. Value is null if task execution has not yet started. Supports $filter(lt, gt) and orderBy.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartedDateTime() {
        return this._startedDateTime;
    }
    /**
     * Gets the subject property value. The subject property
     * @return a user
     */
    @javax.annotation.Nullable
    public User getSubject() {
        return this._subject;
    }
    /**
     * Gets the task property value. The task property
     * @return a task
     */
    @javax.annotation.Nullable
    public Task getTask() {
        return this._task;
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
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("failureReason", this.getFailureReason());
        writer.writeEnumValue("processingStatus", this.getProcessingStatus());
        writer.writeOffsetDateTimeValue("startedDateTime", this.getStartedDateTime());
        writer.writeObjectValue("subject", this.getSubject());
        writer.writeObjectValue("task", this.getTask());
    }
    /**
     * Sets the completedDateTime property value. The date time when taskProcessingResult execution ended. Value is null if task execution is still in progress.
     * @param value Value to set for the completedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompletedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._completedDateTime = value;
    }
    /**
     * Sets the createdDateTime property value. The date time when the taskProcessingResult was created. Supports $filter(lt, gt) and orderBy.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the failureReason property value. Describes why the taskProcessingResult has failed.
     * @param value Value to set for the failureReason property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailureReason(@javax.annotation.Nullable final String value) {
        this._failureReason = value;
    }
    /**
     * Sets the processingStatus property value. The processingStatus property
     * @param value Value to set for the processingStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProcessingStatus(@javax.annotation.Nullable final LifecycleWorkflowProcessingStatus value) {
        this._processingStatus = value;
    }
    /**
     * Sets the startedDateTime property value. The date time when taskProcessingResult execution started. Value is null if task execution has not yet started. Supports $filter(lt, gt) and orderBy.
     * @param value Value to set for the startedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startedDateTime = value;
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubject(@javax.annotation.Nullable final User value) {
        this._subject = value;
    }
    /**
     * Sets the task property value. The task property
     * @param value Value to set for the task property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTask(@javax.annotation.Nullable final Task value) {
        this._task = value;
    }
}
