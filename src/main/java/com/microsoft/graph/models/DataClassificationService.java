package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DataClassificationService extends Entity implements Parsable {
    /** The classifyFileJobs property */
    private java.util.List<JobResponseBase> _classifyFileJobs;
    /** The classifyTextJobs property */
    private java.util.List<JobResponseBase> _classifyTextJobs;
    /** The evaluateDlpPoliciesJobs property */
    private java.util.List<JobResponseBase> _evaluateDlpPoliciesJobs;
    /** The evaluateLabelJobs property */
    private java.util.List<JobResponseBase> _evaluateLabelJobs;
    /** The exactMatchDataStores property */
    private java.util.List<ExactMatchDataStore> _exactMatchDataStores;
    /** The exactMatchUploadAgents property */
    private java.util.List<ExactMatchUploadAgent> _exactMatchUploadAgents;
    /** The jobs property */
    private java.util.List<JobResponseBase> _jobs;
    /** The sensitiveTypes property */
    private java.util.List<SensitiveType> _sensitiveTypes;
    /** The sensitivityLabels property */
    private java.util.List<SensitivityLabel> _sensitivityLabels;
    /**
     * Instantiates a new DataClassificationService and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DataClassificationService() {
        super();
        this.setOdataType("#microsoft.graph.dataClassificationService");
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
        return this._classifyFileJobs;
    }
    /**
     * Gets the classifyTextJobs property value. The classifyTextJobs property
     * @return a jobResponseBase
     */
    @javax.annotation.Nullable
    public java.util.List<JobResponseBase> getClassifyTextJobs() {
        return this._classifyTextJobs;
    }
    /**
     * Gets the evaluateDlpPoliciesJobs property value. The evaluateDlpPoliciesJobs property
     * @return a jobResponseBase
     */
    @javax.annotation.Nullable
    public java.util.List<JobResponseBase> getEvaluateDlpPoliciesJobs() {
        return this._evaluateDlpPoliciesJobs;
    }
    /**
     * Gets the evaluateLabelJobs property value. The evaluateLabelJobs property
     * @return a jobResponseBase
     */
    @javax.annotation.Nullable
    public java.util.List<JobResponseBase> getEvaluateLabelJobs() {
        return this._evaluateLabelJobs;
    }
    /**
     * Gets the exactMatchDataStores property value. The exactMatchDataStores property
     * @return a exactMatchDataStore
     */
    @javax.annotation.Nullable
    public java.util.List<ExactMatchDataStore> getExactMatchDataStores() {
        return this._exactMatchDataStores;
    }
    /**
     * Gets the exactMatchUploadAgents property value. The exactMatchUploadAgents property
     * @return a exactMatchUploadAgent
     */
    @javax.annotation.Nullable
    public java.util.List<ExactMatchUploadAgent> getExactMatchUploadAgents() {
        return this._exactMatchUploadAgents;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DataClassificationService currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("classifyFileJobs", (n) -> { currentObject.setClassifyFileJobs(n.getCollectionOfObjectValues(JobResponseBase::createFromDiscriminatorValue)); });
            this.put("classifyTextJobs", (n) -> { currentObject.setClassifyTextJobs(n.getCollectionOfObjectValues(JobResponseBase::createFromDiscriminatorValue)); });
            this.put("evaluateDlpPoliciesJobs", (n) -> { currentObject.setEvaluateDlpPoliciesJobs(n.getCollectionOfObjectValues(JobResponseBase::createFromDiscriminatorValue)); });
            this.put("evaluateLabelJobs", (n) -> { currentObject.setEvaluateLabelJobs(n.getCollectionOfObjectValues(JobResponseBase::createFromDiscriminatorValue)); });
            this.put("exactMatchDataStores", (n) -> { currentObject.setExactMatchDataStores(n.getCollectionOfObjectValues(ExactMatchDataStore::createFromDiscriminatorValue)); });
            this.put("exactMatchUploadAgents", (n) -> { currentObject.setExactMatchUploadAgents(n.getCollectionOfObjectValues(ExactMatchUploadAgent::createFromDiscriminatorValue)); });
            this.put("jobs", (n) -> { currentObject.setJobs(n.getCollectionOfObjectValues(JobResponseBase::createFromDiscriminatorValue)); });
            this.put("sensitiveTypes", (n) -> { currentObject.setSensitiveTypes(n.getCollectionOfObjectValues(SensitiveType::createFromDiscriminatorValue)); });
            this.put("sensitivityLabels", (n) -> { currentObject.setSensitivityLabels(n.getCollectionOfObjectValues(SensitivityLabel::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the jobs property value. The jobs property
     * @return a jobResponseBase
     */
    @javax.annotation.Nullable
    public java.util.List<JobResponseBase> getJobs() {
        return this._jobs;
    }
    /**
     * Gets the sensitiveTypes property value. The sensitiveTypes property
     * @return a sensitiveType
     */
    @javax.annotation.Nullable
    public java.util.List<SensitiveType> getSensitiveTypes() {
        return this._sensitiveTypes;
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
        this._classifyFileJobs = value;
    }
    /**
     * Sets the classifyTextJobs property value. The classifyTextJobs property
     * @param value Value to set for the classifyTextJobs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClassifyTextJobs(@javax.annotation.Nullable final java.util.List<JobResponseBase> value) {
        this._classifyTextJobs = value;
    }
    /**
     * Sets the evaluateDlpPoliciesJobs property value. The evaluateDlpPoliciesJobs property
     * @param value Value to set for the evaluateDlpPoliciesJobs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEvaluateDlpPoliciesJobs(@javax.annotation.Nullable final java.util.List<JobResponseBase> value) {
        this._evaluateDlpPoliciesJobs = value;
    }
    /**
     * Sets the evaluateLabelJobs property value. The evaluateLabelJobs property
     * @param value Value to set for the evaluateLabelJobs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEvaluateLabelJobs(@javax.annotation.Nullable final java.util.List<JobResponseBase> value) {
        this._evaluateLabelJobs = value;
    }
    /**
     * Sets the exactMatchDataStores property value. The exactMatchDataStores property
     * @param value Value to set for the exactMatchDataStores property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExactMatchDataStores(@javax.annotation.Nullable final java.util.List<ExactMatchDataStore> value) {
        this._exactMatchDataStores = value;
    }
    /**
     * Sets the exactMatchUploadAgents property value. The exactMatchUploadAgents property
     * @param value Value to set for the exactMatchUploadAgents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExactMatchUploadAgents(@javax.annotation.Nullable final java.util.List<ExactMatchUploadAgent> value) {
        this._exactMatchUploadAgents = value;
    }
    /**
     * Sets the jobs property value. The jobs property
     * @param value Value to set for the jobs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJobs(@javax.annotation.Nullable final java.util.List<JobResponseBase> value) {
        this._jobs = value;
    }
    /**
     * Sets the sensitiveTypes property value. The sensitiveTypes property
     * @param value Value to set for the sensitiveTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSensitiveTypes(@javax.annotation.Nullable final java.util.List<SensitiveType> value) {
        this._sensitiveTypes = value;
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
}
