package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OutlookUser extends Entity implements Parsable {
    /**
     * A list of categories defined for the user.
     */
    private java.util.List<OutlookCategory> masterCategories;
    /**
     * The taskFolders property
     */
    private java.util.List<OutlookTaskFolder> taskFolders;
    /**
     * The taskGroups property
     */
    private java.util.List<OutlookTaskGroup> taskGroups;
    /**
     * The tasks property
     */
    private java.util.List<OutlookTask> tasks;
    /**
     * Instantiates a new outlookUser and sets the default values.
     */
    public OutlookUser() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a outlookUser
     */
    @jakarta.annotation.Nonnull
    public static OutlookUser createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OutlookUser();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("masterCategories", (n) -> { this.setMasterCategories(n.getCollectionOfObjectValues(OutlookCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("taskFolders", (n) -> { this.setTaskFolders(n.getCollectionOfObjectValues(OutlookTaskFolder::createFromDiscriminatorValue)); });
        deserializerMap.put("taskGroups", (n) -> { this.setTaskGroups(n.getCollectionOfObjectValues(OutlookTaskGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("tasks", (n) -> { this.setTasks(n.getCollectionOfObjectValues(OutlookTask::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the masterCategories property value. A list of categories defined for the user.
     * @return a outlookCategory
     */
    @jakarta.annotation.Nullable
    public java.util.List<OutlookCategory> getMasterCategories() {
        return this.masterCategories;
    }
    /**
     * Gets the taskFolders property value. The taskFolders property
     * @return a outlookTaskFolder
     */
    @jakarta.annotation.Nullable
    public java.util.List<OutlookTaskFolder> getTaskFolders() {
        return this.taskFolders;
    }
    /**
     * Gets the taskGroups property value. The taskGroups property
     * @return a outlookTaskGroup
     */
    @jakarta.annotation.Nullable
    public java.util.List<OutlookTaskGroup> getTaskGroups() {
        return this.taskGroups;
    }
    /**
     * Gets the tasks property value. The tasks property
     * @return a outlookTask
     */
    @jakarta.annotation.Nullable
    public java.util.List<OutlookTask> getTasks() {
        return this.tasks;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setMasterCategories(@jakarta.annotation.Nullable final java.util.List<OutlookCategory> value) {
        this.masterCategories = value;
    }
    /**
     * Sets the taskFolders property value. The taskFolders property
     * @param value Value to set for the taskFolders property.
     */
    public void setTaskFolders(@jakarta.annotation.Nullable final java.util.List<OutlookTaskFolder> value) {
        this.taskFolders = value;
    }
    /**
     * Sets the taskGroups property value. The taskGroups property
     * @param value Value to set for the taskGroups property.
     */
    public void setTaskGroups(@jakarta.annotation.Nullable final java.util.List<OutlookTaskGroup> value) {
        this.taskGroups = value;
    }
    /**
     * Sets the tasks property value. The tasks property
     * @param value Value to set for the tasks property.
     */
    public void setTasks(@jakarta.annotation.Nullable final java.util.List<OutlookTask> value) {
        this.tasks = value;
    }
}
