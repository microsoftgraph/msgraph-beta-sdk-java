package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DataClassificationService extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DataClassificationService} and sets the default values.
     */
    public DataClassificationService() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DataClassificationService}
     */
    @jakarta.annotation.Nonnull
    public static DataClassificationService createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DataClassificationService();
    }
    /**
     * Gets the classifyFileJobs property value. The classifyFileJobs property
     * @return a {@link java.util.List<JobResponseBase>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<JobResponseBase> getClassifyFileJobs() {
        return this.backingStore.get("classifyFileJobs");
    }
    /**
     * Gets the classifyTextJobs property value. The classifyTextJobs property
     * @return a {@link java.util.List<JobResponseBase>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<JobResponseBase> getClassifyTextJobs() {
        return this.backingStore.get("classifyTextJobs");
    }
    /**
     * Gets the evaluateDlpPoliciesJobs property value. The evaluateDlpPoliciesJobs property
     * @return a {@link java.util.List<JobResponseBase>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<JobResponseBase> getEvaluateDlpPoliciesJobs() {
        return this.backingStore.get("evaluateDlpPoliciesJobs");
    }
    /**
     * Gets the evaluateLabelJobs property value. The evaluateLabelJobs property
     * @return a {@link java.util.List<JobResponseBase>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<JobResponseBase> getEvaluateLabelJobs() {
        return this.backingStore.get("evaluateLabelJobs");
    }
    /**
     * Gets the exactMatchDataStores property value. The exactMatchDataStores property
     * @return a {@link java.util.List<ExactMatchDataStore>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExactMatchDataStore> getExactMatchDataStores() {
        return this.backingStore.get("exactMatchDataStores");
    }
    /**
     * Gets the exactMatchUploadAgents property value. The exactMatchUploadAgents property
     * @return a {@link java.util.List<ExactMatchUploadAgent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExactMatchUploadAgent> getExactMatchUploadAgents() {
        return this.backingStore.get("exactMatchUploadAgents");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("classifyFileJobs", (n) -> { this.setClassifyFileJobs(n.getCollectionOfObjectValues(JobResponseBase::createFromDiscriminatorValue)); });
        deserializerMap.put("classifyTextJobs", (n) -> { this.setClassifyTextJobs(n.getCollectionOfObjectValues(JobResponseBase::createFromDiscriminatorValue)); });
        deserializerMap.put("evaluateDlpPoliciesJobs", (n) -> { this.setEvaluateDlpPoliciesJobs(n.getCollectionOfObjectValues(JobResponseBase::createFromDiscriminatorValue)); });
        deserializerMap.put("evaluateLabelJobs", (n) -> { this.setEvaluateLabelJobs(n.getCollectionOfObjectValues(JobResponseBase::createFromDiscriminatorValue)); });
        deserializerMap.put("exactMatchDataStores", (n) -> { this.setExactMatchDataStores(n.getCollectionOfObjectValues(ExactMatchDataStore::createFromDiscriminatorValue)); });
        deserializerMap.put("exactMatchUploadAgents", (n) -> { this.setExactMatchUploadAgents(n.getCollectionOfObjectValues(ExactMatchUploadAgent::createFromDiscriminatorValue)); });
        deserializerMap.put("jobs", (n) -> { this.setJobs(n.getCollectionOfObjectValues(JobResponseBase::createFromDiscriminatorValue)); });
        deserializerMap.put("sensitiveTypes", (n) -> { this.setSensitiveTypes(n.getCollectionOfObjectValues(SensitiveType::createFromDiscriminatorValue)); });
        deserializerMap.put("sensitivityLabels", (n) -> { this.setSensitivityLabels(n.getCollectionOfObjectValues(SensitivityLabel::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the jobs property value. The jobs property
     * @return a {@link java.util.List<JobResponseBase>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<JobResponseBase> getJobs() {
        return this.backingStore.get("jobs");
    }
    /**
     * Gets the sensitiveTypes property value. The sensitiveTypes property
     * @return a {@link java.util.List<SensitiveType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SensitiveType> getSensitiveTypes() {
        return this.backingStore.get("sensitiveTypes");
    }
    /**
     * Gets the sensitivityLabels property value. The sensitivityLabels property
     * @return a {@link java.util.List<SensitivityLabel>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SensitivityLabel> getSensitivityLabels() {
        return this.backingStore.get("sensitivityLabels");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("classifyFileJobs", this.getClassifyFileJobs());
        writer.writeCollectionOfObjectValues("classifyTextJobs", this.getClassifyTextJobs());
        writer.writeCollectionOfObjectValues("evaluateDlpPoliciesJobs", this.getEvaluateDlpPoliciesJobs());
        writer.writeCollectionOfObjectValues("evaluateLabelJobs", this.getEvaluateLabelJobs());
        writer.writeCollectionOfObjectValues("exactMatchDataStores", this.getExactMatchDataStores());
        writer.writeCollectionOfObjectValues("exactMatchUploadAgents", this.getExactMatchUploadAgents());
        writer.writeCollectionOfObjectValues("jobs", this.getJobs());
        writer.writeCollectionOfObjectValues("sensitiveTypes", this.getSensitiveTypes());
        writer.writeCollectionOfObjectValues("sensitivityLabels", this.getSensitivityLabels());
    }
    /**
     * Sets the classifyFileJobs property value. The classifyFileJobs property
     * @param value Value to set for the classifyFileJobs property.
     */
    public void setClassifyFileJobs(@jakarta.annotation.Nullable final java.util.List<JobResponseBase> value) {
        this.backingStore.set("classifyFileJobs", value);
    }
    /**
     * Sets the classifyTextJobs property value. The classifyTextJobs property
     * @param value Value to set for the classifyTextJobs property.
     */
    public void setClassifyTextJobs(@jakarta.annotation.Nullable final java.util.List<JobResponseBase> value) {
        this.backingStore.set("classifyTextJobs", value);
    }
    /**
     * Sets the evaluateDlpPoliciesJobs property value. The evaluateDlpPoliciesJobs property
     * @param value Value to set for the evaluateDlpPoliciesJobs property.
     */
    public void setEvaluateDlpPoliciesJobs(@jakarta.annotation.Nullable final java.util.List<JobResponseBase> value) {
        this.backingStore.set("evaluateDlpPoliciesJobs", value);
    }
    /**
     * Sets the evaluateLabelJobs property value. The evaluateLabelJobs property
     * @param value Value to set for the evaluateLabelJobs property.
     */
    public void setEvaluateLabelJobs(@jakarta.annotation.Nullable final java.util.List<JobResponseBase> value) {
        this.backingStore.set("evaluateLabelJobs", value);
    }
    /**
     * Sets the exactMatchDataStores property value. The exactMatchDataStores property
     * @param value Value to set for the exactMatchDataStores property.
     */
    public void setExactMatchDataStores(@jakarta.annotation.Nullable final java.util.List<ExactMatchDataStore> value) {
        this.backingStore.set("exactMatchDataStores", value);
    }
    /**
     * Sets the exactMatchUploadAgents property value. The exactMatchUploadAgents property
     * @param value Value to set for the exactMatchUploadAgents property.
     */
    public void setExactMatchUploadAgents(@jakarta.annotation.Nullable final java.util.List<ExactMatchUploadAgent> value) {
        this.backingStore.set("exactMatchUploadAgents", value);
    }
    /**
     * Sets the jobs property value. The jobs property
     * @param value Value to set for the jobs property.
     */
    public void setJobs(@jakarta.annotation.Nullable final java.util.List<JobResponseBase> value) {
        this.backingStore.set("jobs", value);
    }
    /**
     * Sets the sensitiveTypes property value. The sensitiveTypes property
     * @param value Value to set for the sensitiveTypes property.
     */
    public void setSensitiveTypes(@jakarta.annotation.Nullable final java.util.List<SensitiveType> value) {
        this.backingStore.set("sensitiveTypes", value);
    }
    /**
     * Sets the sensitivityLabels property value. The sensitivityLabels property
     * @param value Value to set for the sensitivityLabels property.
     */
    public void setSensitivityLabels(@jakarta.annotation.Nullable final java.util.List<SensitivityLabel> value) {
        this.backingStore.set("sensitivityLabels", value);
    }
}
