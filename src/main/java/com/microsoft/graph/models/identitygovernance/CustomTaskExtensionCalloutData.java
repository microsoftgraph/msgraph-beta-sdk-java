package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.CustomExtensionData;
import com.microsoft.graph.models.User;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CustomTaskExtensionCalloutData extends CustomExtensionData implements Parsable {
    /** The subject property */
    private User _subject;
    /** The task property */
    private Task _task;
    /** The taskProcessingresult property */
    private TaskProcessingResult _taskProcessingresult;
    /** The workflow property */
    private Workflow _workflow;
    /**
     * Instantiates a new CustomTaskExtensionCalloutData and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CustomTaskExtensionCalloutData() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.customTaskExtensionCalloutData");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CustomTaskExtensionCalloutData
     */
    @javax.annotation.Nonnull
    public static CustomTaskExtensionCalloutData createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomTaskExtensionCalloutData();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CustomTaskExtensionCalloutData currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("subject", (n) -> { currentObject.setSubject(n.getObjectValue(User::createFromDiscriminatorValue)); });
        deserializerMap.put("task", (n) -> { currentObject.setTask(n.getObjectValue(Task::createFromDiscriminatorValue)); });
        deserializerMap.put("taskProcessingresult", (n) -> { currentObject.setTaskProcessingresult(n.getObjectValue(TaskProcessingResult::createFromDiscriminatorValue)); });
        deserializerMap.put("workflow", (n) -> { currentObject.setWorkflow(n.getObjectValue(Workflow::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the taskProcessingresult property value. The taskProcessingresult property
     * @return a taskProcessingResult
     */
    @javax.annotation.Nullable
    public TaskProcessingResult getTaskProcessingresult() {
        return this._taskProcessingresult;
    }
    /**
     * Gets the workflow property value. The workflow property
     * @return a workflow
     */
    @javax.annotation.Nullable
    public Workflow getWorkflow() {
        return this._workflow;
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
        writer.writeObjectValue("subject", this.getSubject());
        writer.writeObjectValue("task", this.getTask());
        writer.writeObjectValue("taskProcessingresult", this.getTaskProcessingresult());
        writer.writeObjectValue("workflow", this.getWorkflow());
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
    /**
     * Sets the taskProcessingresult property value. The taskProcessingresult property
     * @param value Value to set for the taskProcessingresult property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTaskProcessingresult(@javax.annotation.Nullable final TaskProcessingResult value) {
        this._taskProcessingresult = value;
    }
    /**
     * Sets the workflow property value. The workflow property
     * @param value Value to set for the workflow property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkflow(@javax.annotation.Nullable final Workflow value) {
        this._workflow = value;
    }
}
