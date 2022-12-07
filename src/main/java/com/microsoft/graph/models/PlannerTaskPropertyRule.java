package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerTaskPropertyRule extends PlannerPropertyRule implements Parsable {
    /** The appliedCategories property */
    private PlannerFieldRules _appliedCategories;
    /** The assignments property */
    private PlannerFieldRules _assignments;
    /** The checkLists property */
    private PlannerFieldRules _checkLists;
    /** The delete property */
    private java.util.List<String> _delete;
    /** The dueDate property */
    private java.util.List<String> _dueDate;
    /** The move property */
    private java.util.List<String> _move;
    /** The notes property */
    private java.util.List<String> _notes;
    /** The order property */
    private java.util.List<String> _order;
    /** The percentComplete property */
    private java.util.List<String> _percentComplete;
    /** The previewType property */
    private java.util.List<String> _previewType;
    /** The priority property */
    private java.util.List<String> _priority;
    /** The references property */
    private PlannerFieldRules _references;
    /** The startDate property */
    private java.util.List<String> _startDate;
    /** The title property */
    private java.util.List<String> _title;
    /**
     * Instantiates a new PlannerTaskPropertyRule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PlannerTaskPropertyRule() {
        super();
        this.setOdataType("#microsoft.graph.plannerTaskPropertyRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PlannerTaskPropertyRule
     */
    @javax.annotation.Nonnull
    public static PlannerTaskPropertyRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerTaskPropertyRule();
    }
    /**
     * Gets the appliedCategories property value. The appliedCategories property
     * @return a plannerFieldRules
     */
    @javax.annotation.Nullable
    public PlannerFieldRules getAppliedCategories() {
        return this._appliedCategories;
    }
    /**
     * Gets the assignments property value. The assignments property
     * @return a plannerFieldRules
     */
    @javax.annotation.Nullable
    public PlannerFieldRules getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the checkLists property value. The checkLists property
     * @return a plannerFieldRules
     */
    @javax.annotation.Nullable
    public PlannerFieldRules getCheckLists() {
        return this._checkLists;
    }
    /**
     * Gets the delete property value. The delete property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDelete() {
        return this._delete;
    }
    /**
     * Gets the dueDate property value. The dueDate property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDueDate() {
        return this._dueDate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appliedCategories", (n) -> { this.setAppliedCategories(n.getObjectValue(PlannerFieldRules::createFromDiscriminatorValue)); });
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getObjectValue(PlannerFieldRules::createFromDiscriminatorValue)); });
        deserializerMap.put("checkLists", (n) -> { this.setCheckLists(n.getObjectValue(PlannerFieldRules::createFromDiscriminatorValue)); });
        deserializerMap.put("delete", (n) -> { this.setDelete(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("dueDate", (n) -> { this.setDueDate(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("move", (n) -> { this.setMove(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("order", (n) -> { this.setOrder(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("percentComplete", (n) -> { this.setPercentComplete(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("previewType", (n) -> { this.setPreviewType(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("references", (n) -> { this.setReferences(n.getObjectValue(PlannerFieldRules::createFromDiscriminatorValue)); });
        deserializerMap.put("startDate", (n) -> { this.setStartDate(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the move property value. The move property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getMove() {
        return this._move;
    }
    /**
     * Gets the notes property value. The notes property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getNotes() {
        return this._notes;
    }
    /**
     * Gets the order property value. The order property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getOrder() {
        return this._order;
    }
    /**
     * Gets the percentComplete property value. The percentComplete property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getPercentComplete() {
        return this._percentComplete;
    }
    /**
     * Gets the previewType property value. The previewType property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getPreviewType() {
        return this._previewType;
    }
    /**
     * Gets the priority property value. The priority property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getPriority() {
        return this._priority;
    }
    /**
     * Gets the references property value. The references property
     * @return a plannerFieldRules
     */
    @javax.annotation.Nullable
    public PlannerFieldRules getReferences() {
        return this._references;
    }
    /**
     * Gets the startDate property value. The startDate property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getStartDate() {
        return this._startDate;
    }
    /**
     * Gets the title property value. The title property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTitle() {
        return this._title;
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
        writer.writeObjectValue("appliedCategories", this.getAppliedCategories());
        writer.writeObjectValue("assignments", this.getAssignments());
        writer.writeObjectValue("checkLists", this.getCheckLists());
        writer.writeCollectionOfPrimitiveValues("delete", this.getDelete());
        writer.writeCollectionOfPrimitiveValues("dueDate", this.getDueDate());
        writer.writeCollectionOfPrimitiveValues("move", this.getMove());
        writer.writeCollectionOfPrimitiveValues("notes", this.getNotes());
        writer.writeCollectionOfPrimitiveValues("order", this.getOrder());
        writer.writeCollectionOfPrimitiveValues("percentComplete", this.getPercentComplete());
        writer.writeCollectionOfPrimitiveValues("previewType", this.getPreviewType());
        writer.writeCollectionOfPrimitiveValues("priority", this.getPriority());
        writer.writeObjectValue("references", this.getReferences());
        writer.writeCollectionOfPrimitiveValues("startDate", this.getStartDate());
        writer.writeCollectionOfPrimitiveValues("title", this.getTitle());
    }
    /**
     * Sets the appliedCategories property value. The appliedCategories property
     * @param value Value to set for the appliedCategories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppliedCategories(@javax.annotation.Nullable final PlannerFieldRules value) {
        this._appliedCategories = value;
    }
    /**
     * Sets the assignments property value. The assignments property
     * @param value Value to set for the assignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final PlannerFieldRules value) {
        this._assignments = value;
    }
    /**
     * Sets the checkLists property value. The checkLists property
     * @param value Value to set for the checkLists property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCheckLists(@javax.annotation.Nullable final PlannerFieldRules value) {
        this._checkLists = value;
    }
    /**
     * Sets the delete property value. The delete property
     * @param value Value to set for the delete property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDelete(@javax.annotation.Nullable final java.util.List<String> value) {
        this._delete = value;
    }
    /**
     * Sets the dueDate property value. The dueDate property
     * @param value Value to set for the dueDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDueDate(@javax.annotation.Nullable final java.util.List<String> value) {
        this._dueDate = value;
    }
    /**
     * Sets the move property value. The move property
     * @param value Value to set for the move property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMove(@javax.annotation.Nullable final java.util.List<String> value) {
        this._move = value;
    }
    /**
     * Sets the notes property value. The notes property
     * @param value Value to set for the notes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._notes = value;
    }
    /**
     * Sets the order property value. The order property
     * @param value Value to set for the order property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrder(@javax.annotation.Nullable final java.util.List<String> value) {
        this._order = value;
    }
    /**
     * Sets the percentComplete property value. The percentComplete property
     * @param value Value to set for the percentComplete property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPercentComplete(@javax.annotation.Nullable final java.util.List<String> value) {
        this._percentComplete = value;
    }
    /**
     * Sets the previewType property value. The previewType property
     * @param value Value to set for the previewType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreviewType(@javax.annotation.Nullable final java.util.List<String> value) {
        this._previewType = value;
    }
    /**
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPriority(@javax.annotation.Nullable final java.util.List<String> value) {
        this._priority = value;
    }
    /**
     * Sets the references property value. The references property
     * @param value Value to set for the references property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReferences(@javax.annotation.Nullable final PlannerFieldRules value) {
        this._references = value;
    }
    /**
     * Sets the startDate property value. The startDate property
     * @param value Value to set for the startDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDate(@javax.annotation.Nullable final java.util.List<String> value) {
        this._startDate = value;
    }
    /**
     * Sets the title property value. The title property
     * @param value Value to set for the title property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTitle(@javax.annotation.Nullable final java.util.List<String> value) {
        this._title = value;
    }
}
