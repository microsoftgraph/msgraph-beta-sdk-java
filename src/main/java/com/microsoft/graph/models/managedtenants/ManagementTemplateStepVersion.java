package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class ManagementTemplateStepVersion extends Entity implements Parsable {
    /** The acceptedFor property */
    private ManagementTemplateStep _acceptedFor;
    /** The contentMarkdown property */
    private String _contentMarkdown;
    /** The createdByUserId property */
    private String _createdByUserId;
    /** The createdDateTime property */
    private OffsetDateTime _createdDateTime;
    /** The deployments property */
    private java.util.List<ManagementTemplateStepDeployment> _deployments;
    /** The lastActionByUserId property */
    private String _lastActionByUserId;
    /** The lastActionDateTime property */
    private OffsetDateTime _lastActionDateTime;
    /** The name property */
    private String _name;
    /** The templateStep property */
    private ManagementTemplateStep _templateStep;
    /** The version property */
    private Integer _version;
    /** The versionInformation property */
    private String _versionInformation;
    /**
     * Instantiates a new managementTemplateStepVersion and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagementTemplateStepVersion() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managementTemplateStepVersion
     */
    @javax.annotation.Nonnull
    public static ManagementTemplateStepVersion createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementTemplateStepVersion();
    }
    /**
     * Gets the acceptedFor property value. The acceptedFor property
     * @return a managementTemplateStep
     */
    @javax.annotation.Nullable
    public ManagementTemplateStep getAcceptedFor() {
        return this._acceptedFor;
    }
    /**
     * Gets the contentMarkdown property value. The contentMarkdown property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentMarkdown() {
        return this._contentMarkdown;
    }
    /**
     * Gets the createdByUserId property value. The createdByUserId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreatedByUserId() {
        return this._createdByUserId;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the deployments property value. The deployments property
     * @return a managementTemplateStepDeployment
     */
    @javax.annotation.Nullable
    public java.util.List<ManagementTemplateStepDeployment> getDeployments() {
        return this._deployments;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("acceptedFor", (n) -> { this.setAcceptedFor(n.getObjectValue(ManagementTemplateStep::createFromDiscriminatorValue)); });
        deserializerMap.put("contentMarkdown", (n) -> { this.setContentMarkdown(n.getStringValue()); });
        deserializerMap.put("createdByUserId", (n) -> { this.setCreatedByUserId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deployments", (n) -> { this.setDeployments(n.getCollectionOfObjectValues(ManagementTemplateStepDeployment::createFromDiscriminatorValue)); });
        deserializerMap.put("lastActionByUserId", (n) -> { this.setLastActionByUserId(n.getStringValue()); });
        deserializerMap.put("lastActionDateTime", (n) -> { this.setLastActionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("templateStep", (n) -> { this.setTemplateStep(n.getObjectValue(ManagementTemplateStep::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        deserializerMap.put("versionInformation", (n) -> { this.setVersionInformation(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastActionByUserId property value. The lastActionByUserId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastActionByUserId() {
        return this._lastActionByUserId;
    }
    /**
     * Gets the lastActionDateTime property value. The lastActionDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this._lastActionDateTime;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the templateStep property value. The templateStep property
     * @return a managementTemplateStep
     */
    @javax.annotation.Nullable
    public ManagementTemplateStep getTemplateStep() {
        return this._templateStep;
    }
    /**
     * Gets the version property value. The version property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getVersion() {
        return this._version;
    }
    /**
     * Gets the versionInformation property value. The versionInformation property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersionInformation() {
        return this._versionInformation;
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
        writer.writeObjectValue("acceptedFor", this.getAcceptedFor());
        writer.writeStringValue("contentMarkdown", this.getContentMarkdown());
        writer.writeStringValue("createdByUserId", this.getCreatedByUserId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfObjectValues("deployments", this.getDeployments());
        writer.writeStringValue("lastActionByUserId", this.getLastActionByUserId());
        writer.writeOffsetDateTimeValue("lastActionDateTime", this.getLastActionDateTime());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("templateStep", this.getTemplateStep());
        writer.writeIntegerValue("version", this.getVersion());
        writer.writeStringValue("versionInformation", this.getVersionInformation());
    }
    /**
     * Sets the acceptedFor property value. The acceptedFor property
     * @param value Value to set for the acceptedFor property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAcceptedFor(@javax.annotation.Nullable final ManagementTemplateStep value) {
        this._acceptedFor = value;
    }
    /**
     * Sets the contentMarkdown property value. The contentMarkdown property
     * @param value Value to set for the contentMarkdown property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentMarkdown(@javax.annotation.Nullable final String value) {
        this._contentMarkdown = value;
    }
    /**
     * Sets the createdByUserId property value. The createdByUserId property
     * @param value Value to set for the createdByUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedByUserId(@javax.annotation.Nullable final String value) {
        this._createdByUserId = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the deployments property value. The deployments property
     * @param value Value to set for the deployments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeployments(@javax.annotation.Nullable final java.util.List<ManagementTemplateStepDeployment> value) {
        this._deployments = value;
    }
    /**
     * Sets the lastActionByUserId property value. The lastActionByUserId property
     * @param value Value to set for the lastActionByUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastActionByUserId(@javax.annotation.Nullable final String value) {
        this._lastActionByUserId = value;
    }
    /**
     * Sets the lastActionDateTime property value. The lastActionDateTime property
     * @param value Value to set for the lastActionDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastActionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastActionDateTime = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the templateStep property value. The templateStep property
     * @param value Value to set for the templateStep property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTemplateStep(@javax.annotation.Nullable final ManagementTemplateStep value) {
        this._templateStep = value;
    }
    /**
     * Sets the version property value. The version property
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final Integer value) {
        this._version = value;
    }
    /**
     * Sets the versionInformation property value. The versionInformation property
     * @param value Value to set for the versionInformation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersionInformation(@javax.annotation.Nullable final String value) {
        this._versionInformation = value;
    }
}
