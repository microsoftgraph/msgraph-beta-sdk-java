package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InformationProtection extends Entity implements Parsable {
    /**
     * Instantiates a new InformationProtection and sets the default values.
     */
    public InformationProtection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InformationProtection
     */
    @jakarta.annotation.Nonnull
    public static InformationProtection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InformationProtection();
    }
    /**
     * Gets the bitlocker property value. The bitlocker property
     * @return a Bitlocker
     */
    @jakarta.annotation.Nullable
    public Bitlocker getBitlocker() {
        return this.backingStore.get("bitlocker");
    }
    /**
     * Gets the dataLossPreventionPolicies property value. The dataLossPreventionPolicies property
     * @return a java.util.List<DataLossPreventionPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DataLossPreventionPolicy> getDataLossPreventionPolicies() {
        return this.backingStore.get("dataLossPreventionPolicies");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bitlocker", (n) -> { this.setBitlocker(n.getObjectValue(Bitlocker::createFromDiscriminatorValue)); });
        deserializerMap.put("dataLossPreventionPolicies", (n) -> { this.setDataLossPreventionPolicies(n.getCollectionOfObjectValues(DataLossPreventionPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("policy", (n) -> { this.setPolicy(n.getObjectValue(InformationProtectionPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("sensitivityLabels", (n) -> { this.setSensitivityLabels(n.getCollectionOfObjectValues(SensitivityLabel::createFromDiscriminatorValue)); });
        deserializerMap.put("sensitivityPolicySettings", (n) -> { this.setSensitivityPolicySettings(n.getObjectValue(SensitivityPolicySettings::createFromDiscriminatorValue)); });
        deserializerMap.put("threatAssessmentRequests", (n) -> { this.setThreatAssessmentRequests(n.getCollectionOfObjectValues(ThreatAssessmentRequest::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the policy property value. The policy property
     * @return a InformationProtectionPolicy
     */
    @jakarta.annotation.Nullable
    public InformationProtectionPolicy getPolicy() {
        return this.backingStore.get("policy");
    }
    /**
     * Gets the sensitivityLabels property value. The sensitivityLabels property
     * @return a java.util.List<SensitivityLabel>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SensitivityLabel> getSensitivityLabels() {
        return this.backingStore.get("sensitivityLabels");
    }
    /**
     * Gets the sensitivityPolicySettings property value. The sensitivityPolicySettings property
     * @return a SensitivityPolicySettings
     */
    @jakarta.annotation.Nullable
    public SensitivityPolicySettings getSensitivityPolicySettings() {
        return this.backingStore.get("sensitivityPolicySettings");
    }
    /**
     * Gets the threatAssessmentRequests property value. The threatAssessmentRequests property
     * @return a java.util.List<ThreatAssessmentRequest>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ThreatAssessmentRequest> getThreatAssessmentRequests() {
        return this.backingStore.get("threatAssessmentRequests");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("bitlocker", this.getBitlocker());
        writer.writeCollectionOfObjectValues("dataLossPreventionPolicies", this.getDataLossPreventionPolicies());
        writer.writeObjectValue("policy", this.getPolicy());
        writer.writeCollectionOfObjectValues("sensitivityLabels", this.getSensitivityLabels());
        writer.writeObjectValue("sensitivityPolicySettings", this.getSensitivityPolicySettings());
        writer.writeCollectionOfObjectValues("threatAssessmentRequests", this.getThreatAssessmentRequests());
    }
    /**
     * Sets the bitlocker property value. The bitlocker property
     * @param value Value to set for the bitlocker property.
     */
    public void setBitlocker(@jakarta.annotation.Nullable final Bitlocker value) {
        this.backingStore.set("bitlocker", value);
    }
    /**
     * Sets the dataLossPreventionPolicies property value. The dataLossPreventionPolicies property
     * @param value Value to set for the dataLossPreventionPolicies property.
     */
    public void setDataLossPreventionPolicies(@jakarta.annotation.Nullable final java.util.List<DataLossPreventionPolicy> value) {
        this.backingStore.set("dataLossPreventionPolicies", value);
    }
    /**
     * Sets the policy property value. The policy property
     * @param value Value to set for the policy property.
     */
    public void setPolicy(@jakarta.annotation.Nullable final InformationProtectionPolicy value) {
        this.backingStore.set("policy", value);
    }
    /**
     * Sets the sensitivityLabels property value. The sensitivityLabels property
     * @param value Value to set for the sensitivityLabels property.
     */
    public void setSensitivityLabels(@jakarta.annotation.Nullable final java.util.List<SensitivityLabel> value) {
        this.backingStore.set("sensitivityLabels", value);
    }
    /**
     * Sets the sensitivityPolicySettings property value. The sensitivityPolicySettings property
     * @param value Value to set for the sensitivityPolicySettings property.
     */
    public void setSensitivityPolicySettings(@jakarta.annotation.Nullable final SensitivityPolicySettings value) {
        this.backingStore.set("sensitivityPolicySettings", value);
    }
    /**
     * Sets the threatAssessmentRequests property value. The threatAssessmentRequests property
     * @param value Value to set for the threatAssessmentRequests property.
     */
    public void setThreatAssessmentRequests(@jakarta.annotation.Nullable final java.util.List<ThreatAssessmentRequest> value) {
        this.backingStore.set("threatAssessmentRequests", value);
    }
}
