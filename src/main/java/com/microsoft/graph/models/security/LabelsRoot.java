package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LabelsRoot extends Entity implements Parsable {
    /**
     * Specifies the underlying authority that describes the type of content to be retained and its retention schedule.
     */
    private java.util.List<AuthorityTemplate> authorities;
    /**
     * Specifies a group of similar types of content in a particular department.
     */
    private java.util.List<CategoryTemplate> categories;
    /**
     * The specific rule or regulation created by a jurisdiction used to determine whether certain labels and content should be retained or deleted.
     */
    private java.util.List<CitationTemplate> citations;
    /**
     * Specifies the department or business unit of an organization to which a label belongs.
     */
    private java.util.List<DepartmentTemplate> departments;
    /**
     * Specifies a unique alpha-numeric identifier for an organizations retention schedule.
     */
    private java.util.List<FilePlanReferenceTemplate> filePlanReferences;
    /**
     * Represents how customers can manage their data, whether and for how long to retain or delete it.
     */
    private java.util.List<RetentionLabel> retentionLabels;
    /**
     * Instantiates a new labelsRoot and sets the default values.
     */
    public LabelsRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a labelsRoot
     */
    @jakarta.annotation.Nonnull
    public static LabelsRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LabelsRoot();
    }
    /**
     * Gets the authorities property value. Specifies the underlying authority that describes the type of content to be retained and its retention schedule.
     * @return a authorityTemplate
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthorityTemplate> getAuthorities() {
        return this.authorities;
    }
    /**
     * Gets the categories property value. Specifies a group of similar types of content in a particular department.
     * @return a categoryTemplate
     */
    @jakarta.annotation.Nullable
    public java.util.List<CategoryTemplate> getCategories() {
        return this.categories;
    }
    /**
     * Gets the citations property value. The specific rule or regulation created by a jurisdiction used to determine whether certain labels and content should be retained or deleted.
     * @return a citationTemplate
     */
    @jakarta.annotation.Nullable
    public java.util.List<CitationTemplate> getCitations() {
        return this.citations;
    }
    /**
     * Gets the departments property value. Specifies the department or business unit of an organization to which a label belongs.
     * @return a departmentTemplate
     */
    @jakarta.annotation.Nullable
    public java.util.List<DepartmentTemplate> getDepartments() {
        return this.departments;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authorities", (n) -> { this.setAuthorities(n.getCollectionOfObjectValues(AuthorityTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("categories", (n) -> { this.setCategories(n.getCollectionOfObjectValues(CategoryTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("citations", (n) -> { this.setCitations(n.getCollectionOfObjectValues(CitationTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("departments", (n) -> { this.setDepartments(n.getCollectionOfObjectValues(DepartmentTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("filePlanReferences", (n) -> { this.setFilePlanReferences(n.getCollectionOfObjectValues(FilePlanReferenceTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("retentionLabels", (n) -> { this.setRetentionLabels(n.getCollectionOfObjectValues(RetentionLabel::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the filePlanReferences property value. Specifies a unique alpha-numeric identifier for an organizations retention schedule.
     * @return a filePlanReferenceTemplate
     */
    @jakarta.annotation.Nullable
    public java.util.List<FilePlanReferenceTemplate> getFilePlanReferences() {
        return this.filePlanReferences;
    }
    /**
     * Gets the retentionLabels property value. Represents how customers can manage their data, whether and for how long to retain or delete it.
     * @return a retentionLabel
     */
    @jakarta.annotation.Nullable
    public java.util.List<RetentionLabel> getRetentionLabels() {
        return this.retentionLabels;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("authorities", this.getAuthorities());
        writer.writeCollectionOfObjectValues("categories", this.getCategories());
        writer.writeCollectionOfObjectValues("citations", this.getCitations());
        writer.writeCollectionOfObjectValues("departments", this.getDepartments());
        writer.writeCollectionOfObjectValues("filePlanReferences", this.getFilePlanReferences());
        writer.writeCollectionOfObjectValues("retentionLabels", this.getRetentionLabels());
    }
    /**
     * Sets the authorities property value. Specifies the underlying authority that describes the type of content to be retained and its retention schedule.
     * @param value Value to set for the authorities property.
     */
    public void setAuthorities(@jakarta.annotation.Nullable final java.util.List<AuthorityTemplate> value) {
        this.authorities = value;
    }
    /**
     * Sets the categories property value. Specifies a group of similar types of content in a particular department.
     * @param value Value to set for the categories property.
     */
    public void setCategories(@jakarta.annotation.Nullable final java.util.List<CategoryTemplate> value) {
        this.categories = value;
    }
    /**
     * Sets the citations property value. The specific rule or regulation created by a jurisdiction used to determine whether certain labels and content should be retained or deleted.
     * @param value Value to set for the citations property.
     */
    public void setCitations(@jakarta.annotation.Nullable final java.util.List<CitationTemplate> value) {
        this.citations = value;
    }
    /**
     * Sets the departments property value. Specifies the department or business unit of an organization to which a label belongs.
     * @param value Value to set for the departments property.
     */
    public void setDepartments(@jakarta.annotation.Nullable final java.util.List<DepartmentTemplate> value) {
        this.departments = value;
    }
    /**
     * Sets the filePlanReferences property value. Specifies a unique alpha-numeric identifier for an organizations retention schedule.
     * @param value Value to set for the filePlanReferences property.
     */
    public void setFilePlanReferences(@jakarta.annotation.Nullable final java.util.List<FilePlanReferenceTemplate> value) {
        this.filePlanReferences = value;
    }
    /**
     * Sets the retentionLabels property value. Represents how customers can manage their data, whether and for how long to retain or delete it.
     * @param value Value to set for the retentionLabels property.
     */
    public void setRetentionLabels(@jakarta.annotation.Nullable final java.util.List<RetentionLabel> value) {
        this.retentionLabels = value;
    }
}
