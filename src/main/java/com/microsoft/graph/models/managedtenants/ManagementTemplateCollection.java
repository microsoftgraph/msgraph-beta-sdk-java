package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagementTemplateCollection extends Entity implements Parsable {
    /**
     * The createdByUserId property
     */
    private String createdByUserId;
    /**
     * The createdDateTime property
     */
    private OffsetDateTime createdDateTime;
    /**
     * The description property
     */
    private String description;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The lastActionByUserId property
     */
    private String lastActionByUserId;
    /**
     * The lastActionDateTime property
     */
    private OffsetDateTime lastActionDateTime;
    /**
     * The managementTemplates property
     */
    private java.util.List<ManagementTemplate> managementTemplates;
    /**
     * Instantiates a new managementTemplateCollection and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagementTemplateCollection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managementTemplateCollection
     */
    @javax.annotation.Nonnull
    public static ManagementTemplateCollection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementTemplateCollection();
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
        deserializerMap.put("createdByUserId", (n) -> { this.setCreatedByUserId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastActionByUserId", (n) -> { this.setLastActionByUserId(n.getStringValue()); });
        deserializerMap.put("lastActionDateTime", (n) -> { this.setLastActionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managementTemplates", (n) -> { this.setManagementTemplates(n.getCollectionOfObjectValues(ManagementTemplate::createFromDiscriminatorValue)); });
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
     * Gets the managementTemplates property value. The managementTemplates property
     * @return a managementTemplate
     */
    @javax.annotation.Nullable
    public java.util.List<ManagementTemplate> getManagementTemplates() {
        return this.managementTemplates;
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
        writer.writeStringValue("createdByUserId", this.getCreatedByUserId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("lastActionByUserId", this.getLastActionByUserId());
        writer.writeOffsetDateTimeValue("lastActionDateTime", this.getLastActionDateTime());
        writer.writeCollectionOfObjectValues("managementTemplates", this.getManagementTemplates());
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
     * Sets the managementTemplates property value. The managementTemplates property
     * @param value Value to set for the managementTemplates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementTemplates(@javax.annotation.Nullable final java.util.List<ManagementTemplate> value) {
        this.managementTemplates = value;
    }
}
