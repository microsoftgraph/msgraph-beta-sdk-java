package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.ActionUrl;
import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class ManagementTemplateStep extends Entity implements Parsable {
    /** The acceptedVersion property */
    private ManagementTemplateStepVersion _acceptedVersion;
    /** The category property */
    private ManagementCategory _category;
    /** The createdByUserId property */
    private String _createdByUserId;
    /** The createdDateTime property */
    private OffsetDateTime _createdDateTime;
    /** The description property */
    private String _description;
    /** The displayName property */
    private String _displayName;
    /** The lastActionByUserId property */
    private String _lastActionByUserId;
    /** The lastActionDateTime property */
    private OffsetDateTime _lastActionDateTime;
    /** The managementTemplate property */
    private ManagementTemplate _managementTemplate;
    /** The portalLink property */
    private ActionUrl _portalLink;
    /** The priority property */
    private Integer _priority;
    /** The versions property */
    private java.util.List<ManagementTemplateStepVersion> _versions;
    /**
     * Instantiates a new managementTemplateStep and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagementTemplateStep() {
        super();
        this.setOdataType("#microsoft.graph.managedTenants.managementTemplateStep");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managementTemplateStep
     */
    @javax.annotation.Nonnull
    public static ManagementTemplateStep createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementTemplateStep();
    }
    /**
     * Gets the acceptedVersion property value. The acceptedVersion property
     * @return a managementTemplateStepVersion
     */
    @javax.annotation.Nullable
    public ManagementTemplateStepVersion getAcceptedVersion() {
        return this._acceptedVersion;
    }
    /**
     * Gets the category property value. The category property
     * @return a managementCategory
     */
    @javax.annotation.Nullable
    public ManagementCategory getCategory() {
        return this._category;
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
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagementTemplateStep currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("acceptedVersion", (n) -> { currentObject.setAcceptedVersion(n.getObjectValue(ManagementTemplateStepVersion::createFromDiscriminatorValue)); });
            this.put("category", (n) -> { currentObject.setCategory(n.getEnumValue(ManagementCategory.class)); });
            this.put("createdByUserId", (n) -> { currentObject.setCreatedByUserId(n.getStringValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastActionByUserId", (n) -> { currentObject.setLastActionByUserId(n.getStringValue()); });
            this.put("lastActionDateTime", (n) -> { currentObject.setLastActionDateTime(n.getOffsetDateTimeValue()); });
            this.put("managementTemplate", (n) -> { currentObject.setManagementTemplate(n.getObjectValue(ManagementTemplate::createFromDiscriminatorValue)); });
            this.put("portalLink", (n) -> { currentObject.setPortalLink(n.getObjectValue(ActionUrl::createFromDiscriminatorValue)); });
            this.put("priority", (n) -> { currentObject.setPriority(n.getIntegerValue()); });
            this.put("versions", (n) -> { currentObject.setVersions(n.getCollectionOfObjectValues(ManagementTemplateStepVersion::createFromDiscriminatorValue)); });
        }};
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
     * Gets the managementTemplate property value. The managementTemplate property
     * @return a managementTemplate
     */
    @javax.annotation.Nullable
    public ManagementTemplate getManagementTemplate() {
        return this._managementTemplate;
    }
    /**
     * Gets the portalLink property value. The portalLink property
     * @return a actionUrl
     */
    @javax.annotation.Nullable
    public ActionUrl getPortalLink() {
        return this._portalLink;
    }
    /**
     * Gets the priority property value. The priority property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return this._priority;
    }
    /**
     * Gets the versions property value. The versions property
     * @return a managementTemplateStepVersion
     */
    @javax.annotation.Nullable
    public java.util.List<ManagementTemplateStepVersion> getVersions() {
        return this._versions;
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
        writer.writeObjectValue("acceptedVersion", this.getAcceptedVersion());
        writer.writeEnumValue("category", this.getCategory());
        writer.writeStringValue("createdByUserId", this.getCreatedByUserId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("lastActionByUserId", this.getLastActionByUserId());
        writer.writeOffsetDateTimeValue("lastActionDateTime", this.getLastActionDateTime());
        writer.writeObjectValue("managementTemplate", this.getManagementTemplate());
        writer.writeObjectValue("portalLink", this.getPortalLink());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeCollectionOfObjectValues("versions", this.getVersions());
    }
    /**
     * Sets the acceptedVersion property value. The acceptedVersion property
     * @param value Value to set for the acceptedVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAcceptedVersion(@javax.annotation.Nullable final ManagementTemplateStepVersion value) {
        this._acceptedVersion = value;
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategory(@javax.annotation.Nullable final ManagementCategory value) {
        this._category = value;
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
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
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
     * Sets the managementTemplate property value. The managementTemplate property
     * @param value Value to set for the managementTemplate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementTemplate(@javax.annotation.Nullable final ManagementTemplate value) {
        this._managementTemplate = value;
    }
    /**
     * Sets the portalLink property value. The portalLink property
     * @param value Value to set for the portalLink property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPortalLink(@javax.annotation.Nullable final ActionUrl value) {
        this._portalLink = value;
    }
    /**
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPriority(@javax.annotation.Nullable final Integer value) {
        this._priority = value;
    }
    /**
     * Sets the versions property value. The versions property
     * @param value Value to set for the versions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersions(@javax.annotation.Nullable final java.util.List<ManagementTemplateStepVersion> value) {
        this._versions = value;
    }
}
