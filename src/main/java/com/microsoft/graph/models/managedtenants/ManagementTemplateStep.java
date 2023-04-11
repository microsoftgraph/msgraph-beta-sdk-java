package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.ActionUrl;
import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagementTemplateStep extends Entity implements Parsable {
    /** The acceptedVersion property */
    private ManagementTemplateStepVersion acceptedVersion;
    /** The category property */
    private ManagementCategory category;
    /** The createdByUserId property */
    private String createdByUserId;
    /** The createdDateTime property */
    private OffsetDateTime createdDateTime;
    /** The description property */
    private String description;
    /** The displayName property */
    private String displayName;
    /** The lastActionByUserId property */
    private String lastActionByUserId;
    /** The lastActionDateTime property */
    private OffsetDateTime lastActionDateTime;
    /** The managementTemplate property */
    private ManagementTemplate managementTemplate;
    /** The portalLink property */
    private ActionUrl portalLink;
    /** The priority property */
    private Integer priority;
    /** The versions property */
    private java.util.List<ManagementTemplateStepVersion> versions;
    /**
     * Instantiates a new managementTemplateStep and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagementTemplateStep() {
        super();
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
        return this.acceptedVersion;
    }
    /**
     * Gets the category property value. The category property
     * @return a managementCategory
     */
    @javax.annotation.Nullable
    public ManagementCategory getCategory() {
        return this.category;
    }
    /**
     * Gets the createdByUserId property value. The createdByUserId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreatedByUserId() {
        return this.createdByUserId;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("acceptedVersion", (n) -> { this.setAcceptedVersion(n.getObjectValue(ManagementTemplateStepVersion::createFromDiscriminatorValue)); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(ManagementCategory.class)); });
        deserializerMap.put("createdByUserId", (n) -> { this.setCreatedByUserId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastActionByUserId", (n) -> { this.setLastActionByUserId(n.getStringValue()); });
        deserializerMap.put("lastActionDateTime", (n) -> { this.setLastActionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managementTemplate", (n) -> { this.setManagementTemplate(n.getObjectValue(ManagementTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("portalLink", (n) -> { this.setPortalLink(n.getObjectValue(ActionUrl::createFromDiscriminatorValue)); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        deserializerMap.put("versions", (n) -> { this.setVersions(n.getCollectionOfObjectValues(ManagementTemplateStepVersion::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastActionByUserId property value. The lastActionByUserId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastActionByUserId() {
        return this.lastActionByUserId;
    }
    /**
     * Gets the lastActionDateTime property value. The lastActionDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this.lastActionDateTime;
    }
    /**
     * Gets the managementTemplate property value. The managementTemplate property
     * @return a managementTemplate
     */
    @javax.annotation.Nullable
    public ManagementTemplate getManagementTemplate() {
        return this.managementTemplate;
    }
    /**
     * Gets the portalLink property value. The portalLink property
     * @return a actionUrl
     */
    @javax.annotation.Nullable
    public ActionUrl getPortalLink() {
        return this.portalLink;
    }
    /**
     * Gets the priority property value. The priority property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Gets the versions property value. The versions property
     * @return a managementTemplateStepVersion
     */
    @javax.annotation.Nullable
    public java.util.List<ManagementTemplateStepVersion> getVersions() {
        return this.versions;
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
        this.acceptedVersion = value;
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategory(@javax.annotation.Nullable final ManagementCategory value) {
        this.category = value;
    }
    /**
     * Sets the createdByUserId property value. The createdByUserId property
     * @param value Value to set for the createdByUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedByUserId(@javax.annotation.Nullable final String value) {
        this.createdByUserId = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastActionByUserId property value. The lastActionByUserId property
     * @param value Value to set for the lastActionByUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastActionByUserId(@javax.annotation.Nullable final String value) {
        this.lastActionByUserId = value;
    }
    /**
     * Sets the lastActionDateTime property value. The lastActionDateTime property
     * @param value Value to set for the lastActionDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastActionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastActionDateTime = value;
    }
    /**
     * Sets the managementTemplate property value. The managementTemplate property
     * @param value Value to set for the managementTemplate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementTemplate(@javax.annotation.Nullable final ManagementTemplate value) {
        this.managementTemplate = value;
    }
    /**
     * Sets the portalLink property value. The portalLink property
     * @param value Value to set for the portalLink property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPortalLink(@javax.annotation.Nullable final ActionUrl value) {
        this.portalLink = value;
    }
    /**
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPriority(@javax.annotation.Nullable final Integer value) {
        this.priority = value;
    }
    /**
     * Sets the versions property value. The versions property
     * @param value Value to set for the versions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersions(@javax.annotation.Nullable final java.util.List<ManagementTemplateStepVersion> value) {
        this.versions = value;
    }
}
