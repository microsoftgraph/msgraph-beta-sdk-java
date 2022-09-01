package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class OutlookTaskFolder extends Entity implements Parsable {
    /** The version of the task folder. */
    private String _changeKey;
    /** True if the folder is the default task folder. */
    private Boolean _isDefaultFolder;
    /** The collection of multi-value extended properties defined for the task folder. Read-only. Nullable. */
    private java.util.List<MultiValueLegacyExtendedProperty> _multiValueExtendedProperties;
    /** The name of the task folder. */
    private String _name;
    /** The unique GUID identifier for the task folder's parent group. */
    private String _parentGroupKey;
    /** The collection of single-value extended properties defined for the task folder. Read-only. Nullable. */
    private java.util.List<SingleValueLegacyExtendedProperty> _singleValueExtendedProperties;
    /** The tasks in this task folder. Read-only. Nullable. */
    private java.util.List<OutlookTask> _tasks;
    /**
     * Instantiates a new outlookTaskFolder and sets the default values.
     * @return a void
     */
    public OutlookTaskFolder() {
        super();
        this.setOdataType("#microsoft.graph.outlookTaskFolder");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a outlookTaskFolder
     */
    @javax.annotation.Nonnull
    public static OutlookTaskFolder createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OutlookTaskFolder();
    }
    /**
     * Gets the changeKey property value. The version of the task folder.
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
        final OutlookTaskFolder currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("changeKey", (n) -> { currentObject.setChangeKey(n.getStringValue()); });
            this.put("isDefaultFolder", (n) -> { currentObject.setIsDefaultFolder(n.getBooleanValue()); });
            this.put("multiValueExtendedProperties", (n) -> { currentObject.setMultiValueExtendedProperties(n.getCollectionOfObjectValues(MultiValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("parentGroupKey", (n) -> { currentObject.setParentGroupKey(n.getStringValue()); });
            this.put("singleValueExtendedProperties", (n) -> { currentObject.setSingleValueExtendedProperties(n.getCollectionOfObjectValues(SingleValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
            this.put("tasks", (n) -> { currentObject.setTasks(n.getCollectionOfObjectValues(OutlookTask::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isDefaultFolder property value. True if the folder is the default task folder.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefaultFolder() {
        return this._isDefaultFolder;
    }
    /**
     * Gets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the task folder. Read-only. Nullable.
     * @return a multiValueLegacyExtendedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<MultiValueLegacyExtendedProperty> getMultiValueExtendedProperties() {
        return this._multiValueExtendedProperties;
    }
    /**
     * Gets the name property value. The name of the task folder.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the parentGroupKey property value. The unique GUID identifier for the task folder's parent group.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getParentGroupKey() {
        return this._parentGroupKey;
    }
    /**
     * Gets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the task folder. Read-only. Nullable.
     * @return a singleValueLegacyExtendedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<SingleValueLegacyExtendedProperty> getSingleValueExtendedProperties() {
        return this._singleValueExtendedProperties;
    }
    /**
     * Gets the tasks property value. The tasks in this task folder. Read-only. Nullable.
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
        writer.writeStringValue("changeKey", this.getChangeKey());
        writer.writeBooleanValue("isDefaultFolder", this.getIsDefaultFolder());
        writer.writeCollectionOfObjectValues("multiValueExtendedProperties", this.getMultiValueExtendedProperties());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("parentGroupKey", this.getParentGroupKey());
        writer.writeCollectionOfObjectValues("singleValueExtendedProperties", this.getSingleValueExtendedProperties());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
    }
    /**
     * Sets the changeKey property value. The version of the task folder.
     * @param value Value to set for the changeKey property.
     * @return a void
     */
    public void setChangeKey(@javax.annotation.Nullable final String value) {
        this._changeKey = value;
    }
    /**
     * Sets the isDefaultFolder property value. True if the folder is the default task folder.
     * @param value Value to set for the isDefaultFolder property.
     * @return a void
     */
    public void setIsDefaultFolder(@javax.annotation.Nullable final Boolean value) {
        this._isDefaultFolder = value;
    }
    /**
     * Sets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the task folder. Read-only. Nullable.
     * @param value Value to set for the multiValueExtendedProperties property.
     * @return a void
     */
    public void setMultiValueExtendedProperties(@javax.annotation.Nullable final java.util.List<MultiValueLegacyExtendedProperty> value) {
        this._multiValueExtendedProperties = value;
    }
    /**
     * Sets the name property value. The name of the task folder.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the parentGroupKey property value. The unique GUID identifier for the task folder's parent group.
     * @param value Value to set for the parentGroupKey property.
     * @return a void
     */
    public void setParentGroupKey(@javax.annotation.Nullable final String value) {
        this._parentGroupKey = value;
    }
    /**
     * Sets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the task folder. Read-only. Nullable.
     * @param value Value to set for the singleValueExtendedProperties property.
     * @return a void
     */
    public void setSingleValueExtendedProperties(@javax.annotation.Nullable final java.util.List<SingleValueLegacyExtendedProperty> value) {
        this._singleValueExtendedProperties = value;
    }
    /**
     * Sets the tasks property value. The tasks in this task folder. Read-only. Nullable.
     * @param value Value to set for the tasks property.
     * @return a void
     */
    public void setTasks(@javax.annotation.Nullable final java.util.List<OutlookTask> value) {
        this._tasks = value;
    }
}
