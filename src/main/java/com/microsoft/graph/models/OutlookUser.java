package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OutlookUser extends Entity implements Parsable {
    /** A list of categories defined for the user. */
    private java.util.List<OutlookCategory> _masterCategories;
    /** The taskFolders property */
    private java.util.List<OutlookTaskFolder> _taskFolders;
    /** The taskGroups property */
    private java.util.List<OutlookTaskGroup> _taskGroups;
    /** The tasks property */
    private java.util.List<OutlookTask> _tasks;
    /**
     * Instantiates a new outlookUser and sets the default values.
     * @return a void
     */
    public OutlookUser() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a outlookUser
     */
    @javax.annotation.Nonnull
    public static OutlookUser createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OutlookUser();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OutlookUser currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("masterCategories", (n) -> { currentObject.setMasterCategories(n.getCollectionOfObjectValues(OutlookCategory::createFromDiscriminatorValue)); });
            this.put("taskFolders", (n) -> { currentObject.setTaskFolders(n.getCollectionOfObjectValues(OutlookTaskFolder::createFromDiscriminatorValue)); });
            this.put("taskGroups", (n) -> { currentObject.setTaskGroups(n.getCollectionOfObjectValues(OutlookTaskGroup::createFromDiscriminatorValue)); });
            this.put("tasks", (n) -> { currentObject.setTasks(n.getCollectionOfObjectValues(OutlookTask::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the masterCategories property value. A list of categories defined for the user.
     * @return a outlookCategory
     */
    @javax.annotation.Nullable
    public java.util.List<OutlookCategory> getMasterCategories() {
        return this._masterCategories;
    }
    /**
     * Gets the taskFolders property value. The taskFolders property
     * @return a outlookTaskFolder
     */
    @javax.annotation.Nullable
    public java.util.List<OutlookTaskFolder> getTaskFolders() {
        return this._taskFolders;
    }
    /**
     * Gets the taskGroups property value. The taskGroups property
     * @return a outlookTaskGroup
     */
    @javax.annotation.Nullable
    public java.util.List<OutlookTaskGroup> getTaskGroups() {
        return this._taskGroups;
    }
    /**
     * Gets the tasks property value. The tasks property
     * @return a outlookTask
     */
    @javax.annotation.Nullable
    public java.util.List<OutlookTask> getTasks() {
        return this._tasks;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("masterCategories", this.getMasterCategories());
        writer.writeCollectionOfObjectValues("taskFolders", this.getTaskFolders());
        writer.writeCollectionOfObjectValues("taskGroups", this.getTaskGroups());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
    }
    /**
     * Sets the masterCategories property value. A list of categories defined for the user.
     * @param value Value to set for the masterCategories property.
     * @return a void
     */
    public void setMasterCategories(@javax.annotation.Nullable final java.util.List<OutlookCategory> value) {
        this._masterCategories = value;
    }
    /**
     * Sets the taskFolders property value. The taskFolders property
     * @param value Value to set for the taskFolders property.
     * @return a void
     */
    public void setTaskFolders(@javax.annotation.Nullable final java.util.List<OutlookTaskFolder> value) {
        this._taskFolders = value;
    }
    /**
     * Sets the taskGroups property value. The taskGroups property
     * @param value Value to set for the taskGroups property.
     * @return a void
     */
    public void setTaskGroups(@javax.annotation.Nullable final java.util.List<OutlookTaskGroup> value) {
        this._taskGroups = value;
    }
    /**
     * Sets the tasks property value. The tasks property
     * @param value Value to set for the tasks property.
     * @return a void
     */
    public void setTasks(@javax.annotation.Nullable final java.util.List<OutlookTask> value) {
        this._tasks = value;
    }
}
