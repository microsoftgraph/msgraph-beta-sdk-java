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
public class PlannerTaskCompletionRequirementDetails implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link PlannerTaskCompletionRequirementDetails} and sets the default values.
     */
    public PlannerTaskCompletionRequirementDetails() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlannerTaskCompletionRequirementDetails}
     */
    @jakarta.annotation.Nonnull
    public static PlannerTaskCompletionRequirementDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerTaskCompletionRequirementDetails();
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
     * Gets the approvalRequirement property value. The approvalRequirement property
     * @return a {@link PlannerApprovalRequirement}
     */
    @jakarta.annotation.Nullable
    public PlannerApprovalRequirement getApprovalRequirement() {
        return this.backingStore.get("approvalRequirement");
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
     * Gets the checklistRequirement property value. Information about the requirements for completing the checklist.
     * @return a {@link PlannerChecklistRequirement}
     */
    @jakarta.annotation.Nullable
    public PlannerChecklistRequirement getChecklistRequirement() {
        return this.backingStore.get("checklistRequirement");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("approvalRequirement", (n) -> { this.setApprovalRequirement(n.getObjectValue(PlannerApprovalRequirement::createFromDiscriminatorValue)); });
        deserializerMap.put("checklistRequirement", (n) -> { this.setChecklistRequirement(n.getObjectValue(PlannerChecklistRequirement::createFromDiscriminatorValue)); });
        deserializerMap.put("formsRequirement", (n) -> { this.setFormsRequirement(n.getObjectValue(PlannerFormsRequirement::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the formsRequirement property value. The formsRequirement property
     * @return a {@link PlannerFormsRequirement}
     */
    @jakarta.annotation.Nullable
    public PlannerFormsRequirement getFormsRequirement() {
        return this.backingStore.get("formsRequirement");
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("approvalRequirement", this.getApprovalRequirement());
        writer.writeObjectValue("checklistRequirement", this.getChecklistRequirement());
        writer.writeObjectValue("formsRequirement", this.getFormsRequirement());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the approvalRequirement property value. The approvalRequirement property
     * @param value Value to set for the approvalRequirement property.
     */
    public void setApprovalRequirement(@jakarta.annotation.Nullable final PlannerApprovalRequirement value) {
        this.backingStore.set("approvalRequirement", value);
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
     * Sets the checklistRequirement property value. Information about the requirements for completing the checklist.
     * @param value Value to set for the checklistRequirement property.
     */
    public void setChecklistRequirement(@jakarta.annotation.Nullable final PlannerChecklistRequirement value) {
        this.backingStore.set("checklistRequirement", value);
    }
    /**
     * Sets the formsRequirement property value. The formsRequirement property
     * @param value Value to set for the formsRequirement property.
     */
    public void setFormsRequirement(@jakarta.annotation.Nullable final PlannerFormsRequirement value) {
        this.backingStore.set("formsRequirement", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
