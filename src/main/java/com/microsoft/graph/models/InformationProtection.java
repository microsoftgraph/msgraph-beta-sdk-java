package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InformationProtection extends Entity implements Parsable {
    /** The bitlocker property */
    private Bitlocker _bitlocker;
    /** The dataLossPreventionPolicies property */
    private java.util.List<DataLossPreventionPolicy> _dataLossPreventionPolicies;
    /** The policy property */
    private InformationProtectionPolicy _policy;
    /** The sensitivityLabels property */
    private java.util.List<SensitivityLabel> _sensitivityLabels;
    /** The sensitivityPolicySettings property */
    private SensitivityPolicySettings _sensitivityPolicySettings;
    /** The threatAssessmentRequests property */
    private java.util.List<ThreatAssessmentRequest> _threatAssessmentRequests;
    /**
     * Instantiates a new informationProtection and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public InformationProtection() {
        super();
        this.setOdataType("#microsoft.graph.informationProtection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a informationProtection
     */
    @javax.annotation.Nonnull
    public static InformationProtection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InformationProtection();
    }
    /**
     * Gets the bitlocker property value. The bitlocker property
     * @return a bitlocker
     */
    @javax.annotation.Nullable
    public Bitlocker getBitlocker() {
        return this._bitlocker;
    }
    /**
     * Gets the dataLossPreventionPolicies property value. The dataLossPreventionPolicies property
     * @return a dataLossPreventionPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<DataLossPreventionPolicy> getDataLossPreventionPolicies() {
        return this._dataLossPreventionPolicies;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final InformationProtection currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bitlocker", (n) -> { currentObject.setBitlocker(n.getObjectValue(Bitlocker::createFromDiscriminatorValue)); });
        deserializerMap.put("dataLossPreventionPolicies", (n) -> { currentObject.setDataLossPreventionPolicies(n.getCollectionOfObjectValues(DataLossPreventionPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("policy", (n) -> { currentObject.setPolicy(n.getObjectValue(InformationProtectionPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("sensitivityLabels", (n) -> { currentObject.setSensitivityLabels(n.getCollectionOfObjectValues(SensitivityLabel::createFromDiscriminatorValue)); });
        deserializerMap.put("sensitivityPolicySettings", (n) -> { currentObject.setSensitivityPolicySettings(n.getObjectValue(SensitivityPolicySettings::createFromDiscriminatorValue)); });
        deserializerMap.put("threatAssessmentRequests", (n) -> { currentObject.setThreatAssessmentRequests(n.getCollectionOfObjectValues(ThreatAssessmentRequest::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the policy property value. The policy property
     * @return a informationProtectionPolicy
     */
    @javax.annotation.Nullable
    public InformationProtectionPolicy getPolicy() {
        return this._policy;
    }
    /**
     * Gets the sensitivityLabels property value. The sensitivityLabels property
     * @return a sensitivityLabel
     */
    @javax.annotation.Nullable
    public java.util.List<SensitivityLabel> getSensitivityLabels() {
        return this._sensitivityLabels;
    }
    /**
     * Gets the sensitivityPolicySettings property value. The sensitivityPolicySettings property
     * @return a sensitivityPolicySettings
     */
    @javax.annotation.Nullable
    public SensitivityPolicySettings getSensitivityPolicySettings() {
        return this._sensitivityPolicySettings;
    }
    /**
     * Gets the threatAssessmentRequests property value. The threatAssessmentRequests property
     * @return a threatAssessmentRequest
     */
    @javax.annotation.Nullable
    public java.util.List<ThreatAssessmentRequest> getThreatAssessmentRequests() {
        return this._threatAssessmentRequests;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBitlocker(@javax.annotation.Nullable final Bitlocker value) {
        this._bitlocker = value;
    }
    /**
     * Sets the dataLossPreventionPolicies property value. The dataLossPreventionPolicies property
     * @param value Value to set for the dataLossPreventionPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDataLossPreventionPolicies(@javax.annotation.Nullable final java.util.List<DataLossPreventionPolicy> value) {
        this._dataLossPreventionPolicies = value;
    }
    /**
     * Sets the policy property value. The policy property
     * @param value Value to set for the policy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicy(@javax.annotation.Nullable final InformationProtectionPolicy value) {
        this._policy = value;
    }
    /**
     * Sets the sensitivityLabels property value. The sensitivityLabels property
     * @param value Value to set for the sensitivityLabels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSensitivityLabels(@javax.annotation.Nullable final java.util.List<SensitivityLabel> value) {
        this._sensitivityLabels = value;
    }
    /**
     * Sets the sensitivityPolicySettings property value. The sensitivityPolicySettings property
     * @param value Value to set for the sensitivityPolicySettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSensitivityPolicySettings(@javax.annotation.Nullable final SensitivityPolicySettings value) {
        this._sensitivityPolicySettings = value;
    }
    /**
     * Sets the threatAssessmentRequests property value. The threatAssessmentRequests property
     * @param value Value to set for the threatAssessmentRequests property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThreatAssessmentRequests(@javax.annotation.Nullable final java.util.List<ThreatAssessmentRequest> value) {
        this._threatAssessmentRequests = value;
    }
}
