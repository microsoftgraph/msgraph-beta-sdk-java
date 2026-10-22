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
public class AppliedAppManagementPolicyRestriction implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AppliedAppManagementPolicyRestriction} and sets the default values.
     */
    public AppliedAppManagementPolicyRestriction() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AppliedAppManagementPolicyRestriction}
     */
    @jakarta.annotation.Nonnull
    public static AppliedAppManagementPolicyRestriction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppliedAppManagementPolicyRestriction();
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
     * Gets the attemptedChanges property value. The attemptedChanges property
     * @return a {@link Dictionary}
     */
    @jakarta.annotation.Nullable
    public Dictionary getAttemptedChanges() {
        return this.backingStore.get("attemptedChanges");
    }
    /**
     * Gets the auditResult property value. The auditResult property
     * @return a {@link AppManagementAuditLogAuditResult}
     */
    @jakarta.annotation.Nullable
    public AppManagementAuditLogAuditResult getAuditResult() {
        return this.backingStore.get("auditResult");
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("attemptedChanges", (n) -> { this.setAttemptedChanges(n.getObjectValue(Dictionary::createFromDiscriminatorValue)); });
        deserializerMap.put("auditResult", (n) -> { this.setAuditResult(n.getEnumValue(AppManagementAuditLogAuditResult::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("policyId", (n) -> { this.setPolicyId(n.getStringValue()); });
        deserializerMap.put("policyType", (n) -> { this.setPolicyType(n.getEnumValue(AppManagementAuditLogPolicyType::forValue)); });
        deserializerMap.put("restrictionDetails", (n) -> { this.setRestrictionDetails(n.getObjectValue(Dictionary::createFromDiscriminatorValue)); });
        deserializerMap.put("restrictionResult", (n) -> { this.setRestrictionResult(n.getEnumValue(AppManagementAuditLogRestrictionResult::forValue)); });
        deserializerMap.put("restrictionState", (n) -> { this.setRestrictionState(n.getEnumValue(AppManagementAuditLogRestrictionState::forValue)); });
        deserializerMap.put("restrictionType", (n) -> { this.setRestrictionType(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the policyId property value. The policyId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyId() {
        return this.backingStore.get("policyId");
    }
    /**
     * Gets the policyType property value. The policyType property
     * @return a {@link AppManagementAuditLogPolicyType}
     */
    @jakarta.annotation.Nullable
    public AppManagementAuditLogPolicyType getPolicyType() {
        return this.backingStore.get("policyType");
    }
    /**
     * Gets the restrictionDetails property value. The restrictionDetails property
     * @return a {@link Dictionary}
     */
    @jakarta.annotation.Nullable
    public Dictionary getRestrictionDetails() {
        return this.backingStore.get("restrictionDetails");
    }
    /**
     * Gets the restrictionResult property value. The restrictionResult property
     * @return a {@link AppManagementAuditLogRestrictionResult}
     */
    @jakarta.annotation.Nullable
    public AppManagementAuditLogRestrictionResult getRestrictionResult() {
        return this.backingStore.get("restrictionResult");
    }
    /**
     * Gets the restrictionState property value. The restrictionState property
     * @return a {@link AppManagementAuditLogRestrictionState}
     */
    @jakarta.annotation.Nullable
    public AppManagementAuditLogRestrictionState getRestrictionState() {
        return this.backingStore.get("restrictionState");
    }
    /**
     * Gets the restrictionType property value. The restrictionType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRestrictionType() {
        return this.backingStore.get("restrictionType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("attemptedChanges", this.getAttemptedChanges());
        writer.writeEnumValue("auditResult", this.getAuditResult());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("policyId", this.getPolicyId());
        writer.writeEnumValue("policyType", this.getPolicyType());
        writer.writeObjectValue("restrictionDetails", this.getRestrictionDetails());
        writer.writeEnumValue("restrictionResult", this.getRestrictionResult());
        writer.writeEnumValue("restrictionState", this.getRestrictionState());
        writer.writeStringValue("restrictionType", this.getRestrictionType());
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
     * Sets the attemptedChanges property value. The attemptedChanges property
     * @param value Value to set for the attemptedChanges property.
     */
    public void setAttemptedChanges(@jakarta.annotation.Nullable final Dictionary value) {
        this.backingStore.set("attemptedChanges", value);
    }
    /**
     * Sets the auditResult property value. The auditResult property
     * @param value Value to set for the auditResult property.
     */
    public void setAuditResult(@jakarta.annotation.Nullable final AppManagementAuditLogAuditResult value) {
        this.backingStore.set("auditResult", value);
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the policyId property value. The policyId property
     * @param value Value to set for the policyId property.
     */
    public void setPolicyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyId", value);
    }
    /**
     * Sets the policyType property value. The policyType property
     * @param value Value to set for the policyType property.
     */
    public void setPolicyType(@jakarta.annotation.Nullable final AppManagementAuditLogPolicyType value) {
        this.backingStore.set("policyType", value);
    }
    /**
     * Sets the restrictionDetails property value. The restrictionDetails property
     * @param value Value to set for the restrictionDetails property.
     */
    public void setRestrictionDetails(@jakarta.annotation.Nullable final Dictionary value) {
        this.backingStore.set("restrictionDetails", value);
    }
    /**
     * Sets the restrictionResult property value. The restrictionResult property
     * @param value Value to set for the restrictionResult property.
     */
    public void setRestrictionResult(@jakarta.annotation.Nullable final AppManagementAuditLogRestrictionResult value) {
        this.backingStore.set("restrictionResult", value);
    }
    /**
     * Sets the restrictionState property value. The restrictionState property
     * @param value Value to set for the restrictionState property.
     */
    public void setRestrictionState(@jakarta.annotation.Nullable final AppManagementAuditLogRestrictionState value) {
        this.backingStore.set("restrictionState", value);
    }
    /**
     * Sets the restrictionType property value. The restrictionType property
     * @param value Value to set for the restrictionType property.
     */
    public void setRestrictionType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("restrictionType", value);
    }
}
