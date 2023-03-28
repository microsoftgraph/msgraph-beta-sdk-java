package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DataClassificationService extends Entity implements Parsable {
    /** The classifyFileJobs property */
    private java.util.List<JobResponseBase> classifyFileJobs;
    /** The classifyTextJobs property */
    private java.util.List<JobResponseBase> classifyTextJobs;
    /** The evaluateDlpPoliciesJobs property */
    private java.util.List<JobResponseBase> evaluateDlpPoliciesJobs;
    /** The evaluateLabelJobs property */
    private java.util.List<JobResponseBase> evaluateLabelJobs;
    /** The exactMatchDataStores property */
    private java.util.List<ExactMatchDataStore> exactMatchDataStores;
    /** The exactMatchUploadAgents property */
    private java.util.List<ExactMatchUploadAgent> exactMatchUploadAgents;
    /** The jobs property */
    private java.util.List<JobResponseBase> jobs;
    /** The sensitiveTypes property */
    private java.util.List<SensitiveType> sensitiveTypes;
    /** The sensitivityLabels property */
    private java.util.List<SensitivityLabel> sensitivityLabels;
    /**
     * Instantiates a new DataClassificationService and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DataClassificationService() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DataClassificationService
     */
    @javax.annotation.Nonnull
    public static DataClassificationService createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DataClassificationService();
    }
    /**
     * Gets the classifyFileJobs property value. The classifyFileJobs property
     * @return a jobResponseBase
     */
    @javax.annotation.Nullable
    public java.util.List<JobResponseBase> getClassifyFileJobs() {
        return this.classifyFileJobs;
    }
    /**
     * Gets the classifyTextJobs property value. The classifyTextJobs property
     * @return a jobResponseBase
     */
    @javax.annotation.Nullable
    public java.util.List<JobResponseBase> getClassifyTextJobs() {
        return this.classifyTextJobs;
    }
    /**
     * Gets the evaluateDlpPoliciesJobs property value. The evaluateDlpPoliciesJobs property
     * @return a jobResponseBase
     */
    @javax.annotation.Nullable
    public java.util.List<JobResponseBase> getEvaluateDlpPoliciesJobs() {
        return this.evaluateDlpPoliciesJobs;
    }
    /**
     * Gets the evaluateLabelJobs property value. The evaluateLabelJobs property
     * @return a jobResponseBase
     */
    @javax.annotation.Nullable
    public java.util.List<JobResponseBase> getEvaluateLabelJobs() {
        return this.evaluateLabelJobs;
    }
    /**
     * Gets the exactMatchDataStores property value. The exactMatchDataStores property
     * @return a exactMatchDataStore
     */
    @javax.annotation.Nullable
    public java.util.List<ExactMatchDataStore> getExactMatchDataStores() {
        return this.exactMatchDataStores;
    }
    /**
     * Gets the exactMatchUploadAgents property value. The exactMatchUploadAgents property
     * @return a exactMatchUploadAgent
     */
    @javax.annotation.Nullable
    public java.util.List<ExactMatchUploadAgent> getExactMatchUploadAgents() {
        return this.exactMatchUploadAgents;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a jobResponseBase
     */
    @javax.annotation.Nullable
    public java.util.List<JobResponseBase> getJobs() {
        return this.jobs;
    }
    /**
     * Gets the sensitiveTypes property value. The sensitiveTypes property
     * @return a sensitiveType
     */
    @javax.annotation.Nullable
    public java.util.List<SensitiveType> getSensitiveTypes() {
        return this.sensitiveTypes;
    }
    /**
     * Gets the sensitivityLabels property value. The sensitivityLabels property
     * @return a sensitivityLabel
     */
    @javax.annotation.Nullable
    public java.util.List<SensitivityLabel> getSensitivityLabels() {
        return this.sensitivityLabels;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClassifyFileJobs(@javax.annotation.Nullable final java.util.List<JobResponseBase> value) {
        this.classifyFileJobs = value;
    }
    /**
     * Sets the classifyTextJobs property value. The classifyTextJobs property
     * @param value Value to set for the classifyTextJobs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClassifyTextJobs(@javax.annotation.Nullable final java.util.List<JobResponseBase> value) {
        this.classifyTextJobs = value;
    }
    /**
     * Sets the evaluateDlpPoliciesJobs property value. The evaluateDlpPoliciesJobs property
     * @param value Value to set for the evaluateDlpPoliciesJobs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEvaluateDlpPoliciesJobs(@javax.annotation.Nullable final java.util.List<JobResponseBase> value) {
        this.evaluateDlpPoliciesJobs = value;
    }
    /**
     * Sets the evaluateLabelJobs property value. The evaluateLabelJobs property
     * @param value Value to set for the evaluateLabelJobs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEvaluateLabelJobs(@javax.annotation.Nullable final java.util.List<JobResponseBase> value) {
        this.evaluateLabelJobs = value;
    }
    /**
     * Sets the exactMatchDataStores property value. The exactMatchDataStores property
     * @param value Value to set for the exactMatchDataStores property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExactMatchDataStores(@javax.annotation.Nullable final java.util.List<ExactMatchDataStore> value) {
        this.exactMatchDataStores = value;
    }
    /**
     * Sets the exactMatchUploadAgents property value. The exactMatchUploadAgents property
     * @param value Value to set for the exactMatchUploadAgents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExactMatchUploadAgents(@javax.annotation.Nullable final java.util.List<ExactMatchUploadAgent> value) {
        this.exactMatchUploadAgents = value;
    }
    /**
     * Sets the jobs property value. The jobs property
     * @param value Value to set for the jobs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJobs(@javax.annotation.Nullable final java.util.List<JobResponseBase> value) {
        this.jobs = value;
    }
    /**
     * Sets the sensitiveTypes property value. The sensitiveTypes property
     * @param value Value to set for the sensitiveTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSensitiveTypes(@javax.annotation.Nullable final java.util.List<SensitiveType> value) {
        this.sensitiveTypes = value;
    }
    /**
     * Sets the sensitivityLabels property value. The sensitivityLabels property
     * @param value Value to set for the sensitivityLabels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSensitivityLabels(@javax.annotation.Nullable final java.util.List<SensitivityLabel> value) {
        this.sensitivityLabels = value;
    }
}
