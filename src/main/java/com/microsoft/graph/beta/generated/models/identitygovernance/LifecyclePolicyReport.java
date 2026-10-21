package com.microsoft.graph.beta.models.identitygovernance;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LifecyclePolicyReport extends Entity implements Parsable {
    /**
     * Instantiates a new {@link LifecyclePolicyReport} and sets the default values.
     */
    public LifecyclePolicyReport() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LifecyclePolicyReport}
     */
    @jakarta.annotation.Nonnull
    public static LifecyclePolicyReport createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LifecyclePolicyReport();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("policyVersion", (n) -> { this.setPolicyVersion(n.getIntegerValue()); });
        deserializerMap.put("scopeProcessing", (n) -> { this.setScopeProcessing(n.getObjectValue(LifecyclePolicyScopeProcessing::createFromDiscriminatorValue)); });
        deserializerMap.put("subjects", (n) -> { this.setSubjects(n.getCollectionOfObjectValues(LifecyclePolicySubjectReport::createFromDiscriminatorValue)); });
        deserializerMap.put("subjectsInScopeCount", (n) -> { this.setSubjectsInScopeCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the policyVersion property value. The version of the lifecycle policy represented by the report.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPolicyVersion() {
        return this.backingStore.get("policyVersion");
    }
    /**
     * Gets the scopeProcessing property value. The scopeProcessing property
     * @return a {@link LifecyclePolicyScopeProcessing}
     */
    @jakarta.annotation.Nullable
    public LifecyclePolicyScopeProcessing getScopeProcessing() {
        return this.backingStore.get("scopeProcessing");
    }
    /**
     * Gets the subjects property value. The processing results for subjects included in the report.
     * @return a {@link java.util.List<LifecyclePolicySubjectReport>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LifecyclePolicySubjectReport> getSubjects() {
        return this.backingStore.get("subjects");
    }
    /**
     * Gets the subjectsInScopeCount property value. The number of subjects currently in scope for the policy.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSubjectsInScopeCount() {
        return this.backingStore.get("subjectsInScopeCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("policyVersion", this.getPolicyVersion());
        writer.writeObjectValue("scopeProcessing", this.getScopeProcessing());
        writer.writeCollectionOfObjectValues("subjects", this.getSubjects());
        writer.writeIntegerValue("subjectsInScopeCount", this.getSubjectsInScopeCount());
    }
    /**
     * Sets the policyVersion property value. The version of the lifecycle policy represented by the report.
     * @param value Value to set for the policyVersion property.
     */
    public void setPolicyVersion(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("policyVersion", value);
    }
    /**
     * Sets the scopeProcessing property value. The scopeProcessing property
     * @param value Value to set for the scopeProcessing property.
     */
    public void setScopeProcessing(@jakarta.annotation.Nullable final LifecyclePolicyScopeProcessing value) {
        this.backingStore.set("scopeProcessing", value);
    }
    /**
     * Sets the subjects property value. The processing results for subjects included in the report.
     * @param value Value to set for the subjects property.
     */
    public void setSubjects(@jakarta.annotation.Nullable final java.util.List<LifecyclePolicySubjectReport> value) {
        this.backingStore.set("subjects", value);
    }
    /**
     * Sets the subjectsInScopeCount property value. The number of subjects currently in scope for the policy.
     * @param value Value to set for the subjectsInScopeCount property.
     */
    public void setSubjectsInScopeCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("subjectsInScopeCount", value);
    }
}
