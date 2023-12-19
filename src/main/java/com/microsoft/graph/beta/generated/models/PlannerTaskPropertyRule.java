package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerTaskPropertyRule extends PlannerPropertyRule implements Parsable {
    /**
     * Instantiates a new PlannerTaskPropertyRule and sets the default values.
     */
    public PlannerTaskPropertyRule() {
        super();
        this.setOdataType("#microsoft.graph.plannerTaskPropertyRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PlannerTaskPropertyRule
     */
    @jakarta.annotation.Nonnull
    public static PlannerTaskPropertyRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerTaskPropertyRule();
    }
    /**
     * Gets the appliedCategories property value. Rules and restrictions for applied categories. This value does not currently support overrides. Accepted values for the default rule and individual overrides are allow, block.
     * @return a PlannerFieldRules
     */
    @jakarta.annotation.Nullable
    public PlannerFieldRules getAppliedCategories() {
        return this.backingStore.get("appliedCategories");
    }
    /**
     * Gets the assignments property value. Rules and restrictions for assignments. Allowed overrides are userCreated and applicationCreated. Accepted values for the default rule and individual overrides are allow, add, addSelf, addOther, remove, removeSelf, removeOther, block.
     * @return a PlannerFieldRules
     */
    @jakarta.annotation.Nullable
    public PlannerFieldRules getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the checkLists property value. Rules and restrictions for checklist. Allowed overrides are userCreated and applicationCreated. Accepted values for the default rule and individual overrides are allow, add, remove, update, check, reorder, block.
     * @return a PlannerFieldRules
     */
    @jakarta.annotation.Nullable
    public PlannerFieldRules getCheckLists() {
        return this.backingStore.get("checkLists");
    }
    /**
     * Gets the completionRequirements property value. Rules and restrictions for completion requirements of the task. Accepted values are allow, add, remove, edit, and block.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCompletionRequirements() {
        return this.backingStore.get("completionRequirements");
    }
    /**
     * Gets the delete property value. Rules and restrictions for deleting the task. Accepted values are allow and block.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDelete() {
        return this.backingStore.get("delete");
    }
    /**
     * Gets the dueDate property value. Rules and restrictions for changing the due date of the task. Accepted values are allow and block.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDueDate() {
        return this.backingStore.get("dueDate");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appliedCategories", (n) -> { this.setAppliedCategories(n.getObjectValue(PlannerFieldRules::createFromDiscriminatorValue)); });
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getObjectValue(PlannerFieldRules::createFromDiscriminatorValue)); });
        deserializerMap.put("checkLists", (n) -> { this.setCheckLists(n.getObjectValue(PlannerFieldRules::createFromDiscriminatorValue)); });
        deserializerMap.put("completionRequirements", (n) -> { this.setCompletionRequirements(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("delete", (n) -> { this.setDelete(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("dueDate", (n) -> { this.setDueDate(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("forms", (n) -> { this.setForms(n.getObjectValue(PlannerFieldRules::createFromDiscriminatorValue)); });
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
     * Gets the forms property value. The forms property
     * @return a PlannerFieldRules
     */
    @jakarta.annotation.Nullable
    public PlannerFieldRules getForms() {
        return this.backingStore.get("forms");
    }
    /**
     * Gets the move property value. Rules and restrictions for moving the task between buckets or plans. Accepted values are allow, moveBetweenPlans, moveBetweenBuckets, and block.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMove() {
        return this.backingStore.get("move");
    }
    /**
     * Gets the notes property value. Rules and restrictions for changing the notes of the task. Accepted values are allow and block.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getNotes() {
        return this.backingStore.get("notes");
    }
    /**
     * Gets the order property value. Rules and restrictions for changing the order of the task. Accepted values are allow and block.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOrder() {
        return this.backingStore.get("order");
    }
    /**
     * Gets the percentComplete property value. Rules and restrictions for changing the completion percentage of the task. Accepted values are allow, setToComplete, overrideRequirements, setToNotStarted, setToInProgress, and block.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPercentComplete() {
        return this.backingStore.get("percentComplete");
    }
    /**
     * Gets the previewType property value. Rules and restrictions for changing the preview type of the task. Accepted values are allow and block.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPreviewType() {
        return this.backingStore.get("previewType");
    }
    /**
     * Gets the priority property value. Rules and restrictions for changing the priority of the task. Accepted values are allow and block.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPriority() {
        return this.backingStore.get("priority");
    }
    /**
     * Gets the references property value. Rules and restrictions for references. Allowed overrides are userCreated and applicationCreated. Accepted values for the default rule and individual overrides are allow, add, remove, block.
     * @return a PlannerFieldRules
     */
    @jakarta.annotation.Nullable
    public PlannerFieldRules getReferences() {
        return this.backingStore.get("references");
    }
    /**
     * Gets the startDate property value. Rules and restrictions for changing the start date of the task. Accepted values are allow and block.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getStartDate() {
        return this.backingStore.get("startDate");
    }
    /**
     * Gets the title property value. Rules and restrictions for changing the title of the task. Accepted values are allow and block.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTitle() {
        return this.backingStore.get("title");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("appliedCategories", this.getAppliedCategories());
        writer.writeObjectValue("assignments", this.getAssignments());
        writer.writeObjectValue("checkLists", this.getCheckLists());
        writer.writeCollectionOfPrimitiveValues("completionRequirements", this.getCompletionRequirements());
        writer.writeCollectionOfPrimitiveValues("delete", this.getDelete());
        writer.writeCollectionOfPrimitiveValues("dueDate", this.getDueDate());
        writer.writeObjectValue("forms", this.getForms());
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
     * Sets the appliedCategories property value. Rules and restrictions for applied categories. This value does not currently support overrides. Accepted values for the default rule and individual overrides are allow, block.
     * @param value Value to set for the appliedCategories property.
     */
    public void setAppliedCategories(@jakarta.annotation.Nullable final PlannerFieldRules value) {
        this.backingStore.set("appliedCategories", value);
    }
    /**
     * Sets the assignments property value. Rules and restrictions for assignments. Allowed overrides are userCreated and applicationCreated. Accepted values for the default rule and individual overrides are allow, add, addSelf, addOther, remove, removeSelf, removeOther, block.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final PlannerFieldRules value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the checkLists property value. Rules and restrictions for checklist. Allowed overrides are userCreated and applicationCreated. Accepted values for the default rule and individual overrides are allow, add, remove, update, check, reorder, block.
     * @param value Value to set for the checkLists property.
     */
    public void setCheckLists(@jakarta.annotation.Nullable final PlannerFieldRules value) {
        this.backingStore.set("checkLists", value);
    }
    /**
     * Sets the completionRequirements property value. Rules and restrictions for completion requirements of the task. Accepted values are allow, add, remove, edit, and block.
     * @param value Value to set for the completionRequirements property.
     */
    public void setCompletionRequirements(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("completionRequirements", value);
    }
    /**
     * Sets the delete property value. Rules and restrictions for deleting the task. Accepted values are allow and block.
     * @param value Value to set for the delete property.
     */
    public void setDelete(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("delete", value);
    }
    /**
     * Sets the dueDate property value. Rules and restrictions for changing the due date of the task. Accepted values are allow and block.
     * @param value Value to set for the dueDate property.
     */
    public void setDueDate(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("dueDate", value);
    }
    /**
     * Sets the forms property value. The forms property
     * @param value Value to set for the forms property.
     */
    public void setForms(@jakarta.annotation.Nullable final PlannerFieldRules value) {
        this.backingStore.set("forms", value);
    }
    /**
     * Sets the move property value. Rules and restrictions for moving the task between buckets or plans. Accepted values are allow, moveBetweenPlans, moveBetweenBuckets, and block.
     * @param value Value to set for the move property.
     */
    public void setMove(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("move", value);
    }
    /**
     * Sets the notes property value. Rules and restrictions for changing the notes of the task. Accepted values are allow and block.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("notes", value);
    }
    /**
     * Sets the order property value. Rules and restrictions for changing the order of the task. Accepted values are allow and block.
     * @param value Value to set for the order property.
     */
    public void setOrder(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("order", value);
    }
    /**
     * Sets the percentComplete property value. Rules and restrictions for changing the completion percentage of the task. Accepted values are allow, setToComplete, overrideRequirements, setToNotStarted, setToInProgress, and block.
     * @param value Value to set for the percentComplete property.
     */
    public void setPercentComplete(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("percentComplete", value);
    }
    /**
     * Sets the previewType property value. Rules and restrictions for changing the preview type of the task. Accepted values are allow and block.
     * @param value Value to set for the previewType property.
     */
    public void setPreviewType(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("previewType", value);
    }
    /**
     * Sets the priority property value. Rules and restrictions for changing the priority of the task. Accepted values are allow and block.
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("priority", value);
    }
    /**
     * Sets the references property value. Rules and restrictions for references. Allowed overrides are userCreated and applicationCreated. Accepted values for the default rule and individual overrides are allow, add, remove, block.
     * @param value Value to set for the references property.
     */
    public void setReferences(@jakarta.annotation.Nullable final PlannerFieldRules value) {
        this.backingStore.set("references", value);
    }
    /**
     * Sets the startDate property value. Rules and restrictions for changing the start date of the task. Accepted values are allow and block.
     * @param value Value to set for the startDate property.
     */
    public void setStartDate(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("startDate", value);
    }
    /**
     * Sets the title property value. Rules and restrictions for changing the title of the task. Accepted values are allow and block.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("title", value);
    }
}
