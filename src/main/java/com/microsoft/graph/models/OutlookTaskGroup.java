package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class OutlookTaskGroup extends Entity implements Parsable {
    /** The version of the task group. */
    private String _changeKey;
    /** The unique GUID identifier for the task group. */
    private String _groupKey;
    /** True if the task group is the default task group. */
    private Boolean _isDefaultGroup;
    /** The name of the task group. */
    private String _name;
    /** The collection of task folders in the task group. Read-only. Nullable. */
    private java.util.List<OutlookTaskFolder> _taskFolders;
    /**
     * Instantiates a new outlookTaskGroup and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OutlookTaskGroup() {
        super();
        this.setOdataType("#microsoft.graph.outlookTaskGroup");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a outlookTaskGroup
     */
    @javax.annotation.Nonnull
    public static OutlookTaskGroup createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OutlookTaskGroup();
    }
    /**
     * Gets the changeKey property value. The version of the task group.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getChangeKey() {
        return this._changeKey;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OutlookTaskGroup currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("changeKey", (n) -> { currentObject.setChangeKey(n.getStringValue()); });
            this.put("groupKey", (n) -> { currentObject.setGroupKey(n.getStringValue()); });
            this.put("isDefaultGroup", (n) -> { currentObject.setIsDefaultGroup(n.getBooleanValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("taskFolders", (n) -> { currentObject.setTaskFolders(n.getCollectionOfObjectValues(OutlookTaskFolder::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the groupKey property value. The unique GUID identifier for the task group.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroupKey() {
        return this._groupKey;
    }
    /**
     * Gets the isDefaultGroup property value. True if the task group is the default task group.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefaultGroup() {
        return this._isDefaultGroup;
    }
    /**
     * Gets the name property value. The name of the task group.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the taskFolders property value. The collection of task folders in the task group. Read-only. Nullable.
     * @return a outlookTaskFolder
     */
    @javax.annotation.Nullable
    public java.util.List<OutlookTaskFolder> getTaskFolders() {
        return this._taskFolders;
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
        writer.writeStringValue("changeKey", this.getChangeKey());
        writer.writeStringValue("groupKey", this.getGroupKey());
        writer.writeBooleanValue("isDefaultGroup", this.getIsDefaultGroup());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("taskFolders", this.getTaskFolders());
    }
    /**
     * Sets the changeKey property value. The version of the task group.
     * @param value Value to set for the changeKey property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChangeKey(@javax.annotation.Nullable final String value) {
        this._changeKey = value;
    }
    /**
     * Sets the groupKey property value. The unique GUID identifier for the task group.
     * @param value Value to set for the groupKey property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupKey(@javax.annotation.Nullable final String value) {
        this._groupKey = value;
    }
    /**
     * Sets the isDefaultGroup property value. True if the task group is the default task group.
     * @param value Value to set for the isDefaultGroup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDefaultGroup(@javax.annotation.Nullable final Boolean value) {
        this._isDefaultGroup = value;
    }
    /**
     * Sets the name property value. The name of the task group.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the taskFolders property value. The collection of task folders in the task group. Read-only. Nullable.
     * @param value Value to set for the taskFolders property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTaskFolders(@javax.annotation.Nullable final java.util.List<OutlookTaskFolder> value) {
        this._taskFolders = value;
    }
}
