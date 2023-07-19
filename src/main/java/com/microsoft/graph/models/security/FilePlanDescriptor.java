package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FilePlanDescriptor extends Entity implements Parsable {
    /**
     * Represents the file plan descriptor of type authority applied to a particular retention label.
     */
    private Authority authority;
    /**
     * Specifies the underlying authority that describes the type of content to be retained and its retention schedule.
     */
    private AuthorityTemplate authorityTemplate;
    /**
     * The category property
     */
    private AppliedCategory category;
    /**
     * Specifies a group of similar types of content in a particular department.
     */
    private CategoryTemplate categoryTemplate;
    /**
     * Represents the file plan descriptor of type citation applied to a particular retention label.
     */
    private Citation citation;
    /**
     * The specific rule or regulation created by a jurisdiction used to determine whether certain labels and content should be retained or deleted.
     */
    private CitationTemplate citationTemplate;
    /**
     * Represents the file plan descriptor of type department applied to a particular retention label.
     */
    private Department department;
    /**
     * Specifies the  department or business unit of an organization to which a label belongs.
     */
    private DepartmentTemplate departmentTemplate;
    /**
     * Represents the file plan descriptor of type filePlanReference applied to a particular retention label.
     */
    private FilePlanReference filePlanReference;
    /**
     * Specifies a unique alpha-numeric identifier for an organizations retention schedule.
     */
    private FilePlanReferenceTemplate filePlanReferenceTemplate;
    /**
     * Instantiates a new filePlanDescriptor and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public FilePlanDescriptor() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a filePlanDescriptor
     */
    @javax.annotation.Nonnull
    public static FilePlanDescriptor createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FilePlanDescriptor();
    }
    /**
     * Gets the authority property value. Represents the file plan descriptor of type authority applied to a particular retention label.
     * @return a authority
     */
    @javax.annotation.Nullable
    public Authority getAuthority() {
        return this.authority;
    }
    /**
     * Gets the authorityTemplate property value. Specifies the underlying authority that describes the type of content to be retained and its retention schedule.
     * @return a authorityTemplate
     */
    @javax.annotation.Nullable
    public AuthorityTemplate getAuthorityTemplate() {
        return this.authorityTemplate;
    }
    /**
     * Gets the category property value. The category property
     * @return a appliedCategory
     */
    @javax.annotation.Nullable
    public AppliedCategory getCategory() {
        return this.category;
    }
    /**
     * Gets the categoryTemplate property value. Specifies a group of similar types of content in a particular department.
     * @return a categoryTemplate
     */
    @javax.annotation.Nullable
    public CategoryTemplate getCategoryTemplate() {
        return this.categoryTemplate;
    }
    /**
     * Gets the citation property value. Represents the file plan descriptor of type citation applied to a particular retention label.
     * @return a citation
     */
    @javax.annotation.Nullable
    public Citation getCitation() {
        return this.citation;
    }
    /**
     * Gets the citationTemplate property value. The specific rule or regulation created by a jurisdiction used to determine whether certain labels and content should be retained or deleted.
     * @return a citationTemplate
     */
    @javax.annotation.Nullable
    public CitationTemplate getCitationTemplate() {
        return this.citationTemplate;
    }
    /**
     * Gets the department property value. Represents the file plan descriptor of type department applied to a particular retention label.
     * @return a department
     */
    @javax.annotation.Nullable
    public Department getDepartment() {
        return this.department;
    }
    /**
     * Gets the departmentTemplate property value. Specifies the  department or business unit of an organization to which a label belongs.
     * @return a departmentTemplate
     */
    @javax.annotation.Nullable
    public DepartmentTemplate getDepartmentTemplate() {
        return this.departmentTemplate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authority", (n) -> { this.setAuthority(n.getObjectValue(Authority::createFromDiscriminatorValue)); });
        deserializerMap.put("authorityTemplate", (n) -> { this.setAuthorityTemplate(n.getObjectValue(AuthorityTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getObjectValue(AppliedCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("categoryTemplate", (n) -> { this.setCategoryTemplate(n.getObjectValue(CategoryTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("citation", (n) -> { this.setCitation(n.getObjectValue(Citation::createFromDiscriminatorValue)); });
        deserializerMap.put("citationTemplate", (n) -> { this.setCitationTemplate(n.getObjectValue(CitationTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("department", (n) -> { this.setDepartment(n.getObjectValue(Department::createFromDiscriminatorValue)); });
        deserializerMap.put("departmentTemplate", (n) -> { this.setDepartmentTemplate(n.getObjectValue(DepartmentTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("filePlanReference", (n) -> { this.setFilePlanReference(n.getObjectValue(FilePlanReference::createFromDiscriminatorValue)); });
        deserializerMap.put("filePlanReferenceTemplate", (n) -> { this.setFilePlanReferenceTemplate(n.getObjectValue(FilePlanReferenceTemplate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the filePlanReference property value. Represents the file plan descriptor of type filePlanReference applied to a particular retention label.
     * @return a filePlanReference
     */
    @javax.annotation.Nullable
    public FilePlanReference getFilePlanReference() {
        return this.filePlanReference;
    }
    /**
     * Gets the filePlanReferenceTemplate property value. Specifies a unique alpha-numeric identifier for an organizations retention schedule.
     * @return a filePlanReferenceTemplate
     */
    @javax.annotation.Nullable
    public FilePlanReferenceTemplate getFilePlanReferenceTemplate() {
        return this.filePlanReferenceTemplate;
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
        writer.writeObjectValue("authority", this.getAuthority());
        writer.writeObjectValue("authorityTemplate", this.getAuthorityTemplate());
        writer.writeObjectValue("category", this.getCategory());
        writer.writeObjectValue("categoryTemplate", this.getCategoryTemplate());
        writer.writeObjectValue("citation", this.getCitation());
        writer.writeObjectValue("citationTemplate", this.getCitationTemplate());
        writer.writeObjectValue("department", this.getDepartment());
        writer.writeObjectValue("departmentTemplate", this.getDepartmentTemplate());
        writer.writeObjectValue("filePlanReference", this.getFilePlanReference());
        writer.writeObjectValue("filePlanReferenceTemplate", this.getFilePlanReferenceTemplate());
    }
    /**
     * Sets the authority property value. Represents the file plan descriptor of type authority applied to a particular retention label.
     * @param value Value to set for the authority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthority(@javax.annotation.Nullable final Authority value) {
        this.authority = value;
    }
    /**
     * Sets the authorityTemplate property value. Specifies the underlying authority that describes the type of content to be retained and its retention schedule.
     * @param value Value to set for the authorityTemplate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthorityTemplate(@javax.annotation.Nullable final AuthorityTemplate value) {
        this.authorityTemplate = value;
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategory(@javax.annotation.Nullable final AppliedCategory value) {
        this.category = value;
    }
    /**
     * Sets the categoryTemplate property value. Specifies a group of similar types of content in a particular department.
     * @param value Value to set for the categoryTemplate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategoryTemplate(@javax.annotation.Nullable final CategoryTemplate value) {
        this.categoryTemplate = value;
    }
    /**
     * Sets the citation property value. Represents the file plan descriptor of type citation applied to a particular retention label.
     * @param value Value to set for the citation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCitation(@javax.annotation.Nullable final Citation value) {
        this.citation = value;
    }
    /**
     * Sets the citationTemplate property value. The specific rule or regulation created by a jurisdiction used to determine whether certain labels and content should be retained or deleted.
     * @param value Value to set for the citationTemplate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCitationTemplate(@javax.annotation.Nullable final CitationTemplate value) {
        this.citationTemplate = value;
    }
    /**
     * Sets the department property value. Represents the file plan descriptor of type department applied to a particular retention label.
     * @param value Value to set for the department property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDepartment(@javax.annotation.Nullable final Department value) {
        this.department = value;
    }
    /**
     * Sets the departmentTemplate property value. Specifies the  department or business unit of an organization to which a label belongs.
     * @param value Value to set for the departmentTemplate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDepartmentTemplate(@javax.annotation.Nullable final DepartmentTemplate value) {
        this.departmentTemplate = value;
    }
    /**
     * Sets the filePlanReference property value. Represents the file plan descriptor of type filePlanReference applied to a particular retention label.
     * @param value Value to set for the filePlanReference property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFilePlanReference(@javax.annotation.Nullable final FilePlanReference value) {
        this.filePlanReference = value;
    }
    /**
     * Sets the filePlanReferenceTemplate property value. Specifies a unique alpha-numeric identifier for an organizations retention schedule.
     * @param value Value to set for the filePlanReferenceTemplate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFilePlanReferenceTemplate(@javax.annotation.Nullable final FilePlanReferenceTemplate value) {
        this.filePlanReferenceTemplate = value;
    }
}
