package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerTaskDetails extends PlannerDelta implements Parsable {
    /**
     * Instantiates a new {@link PlannerTaskDetails} and sets the default values.
     */
    public PlannerTaskDetails() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlannerTaskDetails}
     */
    @jakarta.annotation.Nonnull
    public static PlannerTaskDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerTaskDetails();
    }
    /**
     * Gets the approvalAttachment property value. Detailed information about the approval that is attached to the task.
     * @return a {@link PlannerBaseApprovalAttachment}
     */
    @jakarta.annotation.Nullable
    public PlannerBaseApprovalAttachment getApprovalAttachment() {
        return this.backingStore.get("approvalAttachment");
    }
    /**
     * Gets the checklist property value. The collection of checklist items on the task.
     * @return a {@link PlannerChecklistItems}
     */
    @jakarta.annotation.Nullable
    public PlannerChecklistItems getChecklist() {
        return this.backingStore.get("checklist");
    }
    /**
     * Gets the completionRequirements property value. Contains detailed information about requirements on the task.
     * @return a {@link PlannerTaskCompletionRequirementDetails}
     */
    @jakarta.annotation.Nullable
    public PlannerTaskCompletionRequirementDetails getCompletionRequirements() {
        return this.backingStore.get("completionRequirements");
    }
    /**
     * Gets the description property value. Description of the task.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("approvalAttachment", (n) -> { this.setApprovalAttachment(n.getObjectValue(PlannerBaseApprovalAttachment::createFromDiscriminatorValue)); });
        deserializerMap.put("checklist", (n) -> { this.setChecklist(n.getObjectValue(PlannerChecklistItems::createFromDiscriminatorValue)); });
        deserializerMap.put("completionRequirements", (n) -> { this.setCompletionRequirements(n.getObjectValue(PlannerTaskCompletionRequirementDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("forms", (n) -> { this.setForms(n.getObjectValue(PlannerFormsDictionary::createFromDiscriminatorValue)); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("previewType", (n) -> { this.setPreviewType(n.getEnumValue(PlannerPreviewType::forValue)); });
        deserializerMap.put("references", (n) -> { this.setReferences(n.getObjectValue(PlannerExternalReferences::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the forms property value. Read-only. Represents a dictionary of data about the forms associated with a task. Each entry in the dictionary is a key-value pair, and the value is a plannerFormReference object.
     * @return a {@link PlannerFormsDictionary}
     */
    @jakarta.annotation.Nullable
    public PlannerFormsDictionary getForms() {
        return this.backingStore.get("forms");
    }
    /**
     * Gets the notes property value. Rich text description of the task. To be used by HTML-aware clients. For backwards compatibility, a plain-text version of the HTML description will be synced to the &apos;description&apos; field. If this field hasn&apos;t previously been set but &apos;description&apos; has been, the existing description is synchronized to &apos;notes&apos; with minimal whitespace-preserving HTML markup. Setting both &apos;description&apos; and &apos;notes&apos; is an error and will result in an exception.
     * @return a {@link ItemBody}
     */
    @jakarta.annotation.Nullable
    public ItemBody getNotes() {
        return this.backingStore.get("notes");
    }
    /**
     * Gets the previewType property value. This sets the type of preview that shows up on the task. Possible values are: automatic, noPreview, checklist, description, reference. When set to automatic the displayed preview is chosen by the app viewing the task.
     * @return a {@link PlannerPreviewType}
     */
    @jakarta.annotation.Nullable
    public PlannerPreviewType getPreviewType() {
        return this.backingStore.get("previewType");
    }
    /**
     * Gets the references property value. The collection of references on the task.
     * @return a {@link PlannerExternalReferences}
     */
    @jakarta.annotation.Nullable
    public PlannerExternalReferences getReferences() {
        return this.backingStore.get("references");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("approvalAttachment", this.getApprovalAttachment());
        writer.writeObjectValue("checklist", this.getChecklist());
        writer.writeObjectValue("completionRequirements", this.getCompletionRequirements());
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("forms", this.getForms());
        writer.writeObjectValue("notes", this.getNotes());
        writer.writeEnumValue("previewType", this.getPreviewType());
        writer.writeObjectValue("references", this.getReferences());
    }
    /**
     * Sets the approvalAttachment property value. Detailed information about the approval that is attached to the task.
     * @param value Value to set for the approvalAttachment property.
     */
    public void setApprovalAttachment(@jakarta.annotation.Nullable final PlannerBaseApprovalAttachment value) {
        this.backingStore.set("approvalAttachment", value);
    }
    /**
     * Sets the checklist property value. The collection of checklist items on the task.
     * @param value Value to set for the checklist property.
     */
    public void setChecklist(@jakarta.annotation.Nullable final PlannerChecklistItems value) {
        this.backingStore.set("checklist", value);
    }
    /**
     * Sets the completionRequirements property value. Contains detailed information about requirements on the task.
     * @param value Value to set for the completionRequirements property.
     */
    public void setCompletionRequirements(@jakarta.annotation.Nullable final PlannerTaskCompletionRequirementDetails value) {
        this.backingStore.set("completionRequirements", value);
    }
    /**
     * Sets the description property value. Description of the task.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the forms property value. Read-only. Represents a dictionary of data about the forms associated with a task. Each entry in the dictionary is a key-value pair, and the value is a plannerFormReference object.
     * @param value Value to set for the forms property.
     */
    public void setForms(@jakarta.annotation.Nullable final PlannerFormsDictionary value) {
        this.backingStore.set("forms", value);
    }
    /**
     * Sets the notes property value. Rich text description of the task. To be used by HTML-aware clients. For backwards compatibility, a plain-text version of the HTML description will be synced to the &apos;description&apos; field. If this field hasn&apos;t previously been set but &apos;description&apos; has been, the existing description is synchronized to &apos;notes&apos; with minimal whitespace-preserving HTML markup. Setting both &apos;description&apos; and &apos;notes&apos; is an error and will result in an exception.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final ItemBody value) {
        this.backingStore.set("notes", value);
    }
    /**
     * Sets the previewType property value. This sets the type of preview that shows up on the task. Possible values are: automatic, noPreview, checklist, description, reference. When set to automatic the displayed preview is chosen by the app viewing the task.
     * @param value Value to set for the previewType property.
     */
    public void setPreviewType(@jakarta.annotation.Nullable final PlannerPreviewType value) {
        this.backingStore.set("previewType", value);
    }
    /**
     * Sets the references property value. The collection of references on the task.
     * @param value Value to set for the references property.
     */
    public void setReferences(@jakarta.annotation.Nullable final PlannerExternalReferences value) {
        this.backingStore.set("references", value);
    }
}
