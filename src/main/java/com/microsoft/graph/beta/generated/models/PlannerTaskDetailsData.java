package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerTaskDetailsData implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link PlannerTaskDetailsData} and sets the default values.
     */
    public PlannerTaskDetailsData() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlannerTaskDetailsData}
     */
    @jakarta.annotation.Nonnull
    public static PlannerTaskDetailsData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerTaskDetailsData();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the approvalAttachment property value. The approvalAttachment property
     * @return a {@link PlannerBaseApprovalAttachment}
     */
    @jakarta.annotation.Nullable
    public PlannerBaseApprovalAttachment getApprovalAttachment() {
        return this.backingStore.get("approvalAttachment");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the checklist property value. The checklist property
     * @return a {@link PlannerChecklistItems}
     */
    @jakarta.annotation.Nullable
    public PlannerChecklistItems getChecklist() {
        return this.backingStore.get("checklist");
    }
    /**
     * Gets the completionRequirements property value. The completionRequirements property
     * @return a {@link PlannerTaskCompletionRequirementDetails}
     */
    @jakarta.annotation.Nullable
    public PlannerTaskCompletionRequirementDetails getCompletionRequirements() {
        return this.backingStore.get("completionRequirements");
    }
    /**
     * Gets the description property value. The description property
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("approvalAttachment", (n) -> { this.setApprovalAttachment(n.getObjectValue(PlannerBaseApprovalAttachment::createFromDiscriminatorValue)); });
        deserializerMap.put("checklist", (n) -> { this.setChecklist(n.getObjectValue(PlannerChecklistItems::createFromDiscriminatorValue)); });
        deserializerMap.put("completionRequirements", (n) -> { this.setCompletionRequirements(n.getObjectValue(PlannerTaskCompletionRequirementDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("forms", (n) -> { this.setForms(n.getObjectValue(PlannerFormsDictionary::createFromDiscriminatorValue)); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("previewType", (n) -> { this.setPreviewType(n.getEnumValue(PlannerPreviewType::forValue)); });
        deserializerMap.put("references", (n) -> { this.setReferences(n.getObjectValue(PlannerExternalReferences::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the forms property value. The forms property
     * @return a {@link PlannerFormsDictionary}
     */
    @jakarta.annotation.Nullable
    public PlannerFormsDictionary getForms() {
        return this.backingStore.get("forms");
    }
    /**
     * Gets the notes property value. The notes property
     * @return a {@link ItemBody}
     */
    @jakarta.annotation.Nullable
    public ItemBody getNotes() {
        return this.backingStore.get("notes");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the previewType property value. The previewType property
     * @return a {@link PlannerPreviewType}
     */
    @jakarta.annotation.Nullable
    public PlannerPreviewType getPreviewType() {
        return this.backingStore.get("previewType");
    }
    /**
     * Gets the references property value. The references property
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
        writer.writeObjectValue("approvalAttachment", this.getApprovalAttachment());
        writer.writeObjectValue("checklist", this.getChecklist());
        writer.writeObjectValue("completionRequirements", this.getCompletionRequirements());
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("forms", this.getForms());
        writer.writeObjectValue("notes", this.getNotes());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("previewType", this.getPreviewType());
        writer.writeObjectValue("references", this.getReferences());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the approvalAttachment property value. The approvalAttachment property
     * @param value Value to set for the approvalAttachment property.
     */
    public void setApprovalAttachment(@jakarta.annotation.Nullable final PlannerBaseApprovalAttachment value) {
        this.backingStore.set("approvalAttachment", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the checklist property value. The checklist property
     * @param value Value to set for the checklist property.
     */
    public void setChecklist(@jakarta.annotation.Nullable final PlannerChecklistItems value) {
        this.backingStore.set("checklist", value);
    }
    /**
     * Sets the completionRequirements property value. The completionRequirements property
     * @param value Value to set for the completionRequirements property.
     */
    public void setCompletionRequirements(@jakarta.annotation.Nullable final PlannerTaskCompletionRequirementDetails value) {
        this.backingStore.set("completionRequirements", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the forms property value. The forms property
     * @param value Value to set for the forms property.
     */
    public void setForms(@jakarta.annotation.Nullable final PlannerFormsDictionary value) {
        this.backingStore.set("forms", value);
    }
    /**
     * Sets the notes property value. The notes property
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final ItemBody value) {
        this.backingStore.set("notes", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the previewType property value. The previewType property
     * @param value Value to set for the previewType property.
     */
    public void setPreviewType(@jakarta.annotation.Nullable final PlannerPreviewType value) {
        this.backingStore.set("previewType", value);
    }
    /**
     * Sets the references property value. The references property
     * @param value Value to set for the references property.
     */
    public void setReferences(@jakarta.annotation.Nullable final PlannerExternalReferences value) {
        this.backingStore.set("references", value);
    }
}
