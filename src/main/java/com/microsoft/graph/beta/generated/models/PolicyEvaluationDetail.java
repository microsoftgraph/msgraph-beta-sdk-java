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
public class PolicyEvaluationDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link PolicyEvaluationDetail} and sets the default values.
     */
    public PolicyEvaluationDetail() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PolicyEvaluationDetail}
     */
    @jakarta.annotation.Nonnull
    public static PolicyEvaluationDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PolicyEvaluationDetail();
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
     * Gets the applicabilityEvaluationError property value. The applicabilityEvaluationError property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApplicabilityEvaluationError() {
        return this.backingStore.get("applicabilityEvaluationError");
    }
    /**
     * Gets the appliedPolicyEffects property value. The appliedPolicyEffects property
     * @return a {@link PolicyEffect}
     */
    @jakarta.annotation.Nullable
    public PolicyEffect getAppliedPolicyEffects() {
        return this.backingStore.get("appliedPolicyEffects");
    }
    /**
     * Gets the assignedPolicyDisplayName property value. The assignedPolicyDisplayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignedPolicyDisplayName() {
        return this.backingStore.get("assignedPolicyDisplayName");
    }
    /**
     * Gets the assignmentUniqueName property value. The assignmentUniqueName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignmentUniqueName() {
        return this.backingStore.get("assignmentUniqueName");
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
     * Gets the evaluationError property value. The evaluationError property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEvaluationError() {
        return this.backingStore.get("evaluationError");
    }
    /**
     * Gets the fetchDetails property value. The fetchDetails property
     * @return a {@link java.util.List<FetchDetail>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FetchDetail> getFetchDetails() {
        return this.backingStore.get("fetchDetails");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("applicabilityEvaluationError", (n) -> { this.setApplicabilityEvaluationError(n.getStringValue()); });
        deserializerMap.put("appliedPolicyEffects", (n) -> { this.setAppliedPolicyEffects(n.getEnumValue(PolicyEffect::forValue)); });
        deserializerMap.put("assignedPolicyDisplayName", (n) -> { this.setAssignedPolicyDisplayName(n.getStringValue()); });
        deserializerMap.put("assignmentUniqueName", (n) -> { this.setAssignmentUniqueName(n.getStringValue()); });
        deserializerMap.put("evaluationError", (n) -> { this.setEvaluationError(n.getStringValue()); });
        deserializerMap.put("fetchDetails", (n) -> { this.setFetchDetails(n.getCollectionOfObjectValues(FetchDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("isApplicable", (n) -> { this.setIsApplicable(n.getBooleanValue()); });
        deserializerMap.put("isCompliant", (n) -> { this.setIsCompliant(n.getBooleanValue()); });
        deserializerMap.put("isEnforced", (n) -> { this.setIsEnforced(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("policyLoadingError", (n) -> { this.setPolicyLoadingError(n.getStringValue()); });
        deserializerMap.put("policyMessage", (n) -> { this.setPolicyMessage(n.getStringValue()); });
        deserializerMap.put("policyVersion", (n) -> { this.setPolicyVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isApplicable property value. The isApplicable property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsApplicable() {
        return this.backingStore.get("isApplicable");
    }
    /**
     * Gets the isCompliant property value. The isCompliant property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCompliant() {
        return this.backingStore.get("isCompliant");
    }
    /**
     * Gets the isEnforced property value. The isEnforced property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnforced() {
        return this.backingStore.get("isEnforced");
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
     * Gets the policyLoadingError property value. The policyLoadingError property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyLoadingError() {
        return this.backingStore.get("policyLoadingError");
    }
    /**
     * Gets the policyMessage property value. The policyMessage property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyMessage() {
        return this.backingStore.get("policyMessage");
    }
    /**
     * Gets the policyVersion property value. The policyVersion property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyVersion() {
        return this.backingStore.get("policyVersion");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("applicabilityEvaluationError", this.getApplicabilityEvaluationError());
        writer.writeEnumValue("appliedPolicyEffects", this.getAppliedPolicyEffects());
        writer.writeStringValue("assignedPolicyDisplayName", this.getAssignedPolicyDisplayName());
        writer.writeStringValue("assignmentUniqueName", this.getAssignmentUniqueName());
        writer.writeStringValue("evaluationError", this.getEvaluationError());
        writer.writeCollectionOfObjectValues("fetchDetails", this.getFetchDetails());
        writer.writeBooleanValue("isApplicable", this.getIsApplicable());
        writer.writeBooleanValue("isCompliant", this.getIsCompliant());
        writer.writeBooleanValue("isEnforced", this.getIsEnforced());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("policyLoadingError", this.getPolicyLoadingError());
        writer.writeStringValue("policyMessage", this.getPolicyMessage());
        writer.writeStringValue("policyVersion", this.getPolicyVersion());
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
     * Sets the applicabilityEvaluationError property value. The applicabilityEvaluationError property
     * @param value Value to set for the applicabilityEvaluationError property.
     */
    public void setApplicabilityEvaluationError(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("applicabilityEvaluationError", value);
    }
    /**
     * Sets the appliedPolicyEffects property value. The appliedPolicyEffects property
     * @param value Value to set for the appliedPolicyEffects property.
     */
    public void setAppliedPolicyEffects(@jakarta.annotation.Nullable final PolicyEffect value) {
        this.backingStore.set("appliedPolicyEffects", value);
    }
    /**
     * Sets the assignedPolicyDisplayName property value. The assignedPolicyDisplayName property
     * @param value Value to set for the assignedPolicyDisplayName property.
     */
    public void setAssignedPolicyDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignedPolicyDisplayName", value);
    }
    /**
     * Sets the assignmentUniqueName property value. The assignmentUniqueName property
     * @param value Value to set for the assignmentUniqueName property.
     */
    public void setAssignmentUniqueName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignmentUniqueName", value);
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
     * Sets the evaluationError property value. The evaluationError property
     * @param value Value to set for the evaluationError property.
     */
    public void setEvaluationError(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("evaluationError", value);
    }
    /**
     * Sets the fetchDetails property value. The fetchDetails property
     * @param value Value to set for the fetchDetails property.
     */
    public void setFetchDetails(@jakarta.annotation.Nullable final java.util.List<FetchDetail> value) {
        this.backingStore.set("fetchDetails", value);
    }
    /**
     * Sets the isApplicable property value. The isApplicable property
     * @param value Value to set for the isApplicable property.
     */
    public void setIsApplicable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isApplicable", value);
    }
    /**
     * Sets the isCompliant property value. The isCompliant property
     * @param value Value to set for the isCompliant property.
     */
    public void setIsCompliant(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCompliant", value);
    }
    /**
     * Sets the isEnforced property value. The isEnforced property
     * @param value Value to set for the isEnforced property.
     */
    public void setIsEnforced(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnforced", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the policyLoadingError property value. The policyLoadingError property
     * @param value Value to set for the policyLoadingError property.
     */
    public void setPolicyLoadingError(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyLoadingError", value);
    }
    /**
     * Sets the policyMessage property value. The policyMessage property
     * @param value Value to set for the policyMessage property.
     */
    public void setPolicyMessage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyMessage", value);
    }
    /**
     * Sets the policyVersion property value. The policyVersion property
     * @param value Value to set for the policyVersion property.
     */
    public void setPolicyVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyVersion", value);
    }
}
