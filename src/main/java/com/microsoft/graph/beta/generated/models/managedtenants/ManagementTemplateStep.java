package com.microsoft.graph.beta.models.managedtenants;

import com.microsoft.graph.beta.models.ActionUrl;
import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagementTemplateStep extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ManagementTemplateStep} and sets the default values.
     */
    public ManagementTemplateStep() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ManagementTemplateStep}
     */
    @jakarta.annotation.Nonnull
    public static ManagementTemplateStep createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementTemplateStep();
    }
    /**
     * Gets the acceptedVersion property value. The acceptedVersion property
     * @return a {@link ManagementTemplateStepVersion}
     */
    @jakarta.annotation.Nullable
    public ManagementTemplateStepVersion getAcceptedVersion() {
        return this.backingStore.get("acceptedVersion");
    }
    /**
     * Gets the category property value. The category property
     * @return a {@link ManagementCategory}
     */
    @jakarta.annotation.Nullable
    public ManagementCategory getCategory() {
        return this.backingStore.get("category");
    }
    /**
     * Gets the createdByUserId property value. The createdByUserId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedByUserId() {
        return this.backingStore.get("createdByUserId");
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("acceptedVersion", (n) -> { this.setAcceptedVersion(n.getObjectValue(ManagementTemplateStepVersion::createFromDiscriminatorValue)); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(ManagementCategory::forValue)); });
        deserializerMap.put("createdByUserId", (n) -> { this.setCreatedByUserId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("informationLinks", (n) -> { this.setInformationLinks(n.getCollectionOfObjectValues(ActionUrl::createFromDiscriminatorValue)); });
        deserializerMap.put("lastActionByUserId", (n) -> { this.setLastActionByUserId(n.getStringValue()); });
        deserializerMap.put("lastActionDateTime", (n) -> { this.setLastActionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managementTemplate", (n) -> { this.setManagementTemplate(n.getObjectValue(ManagementTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("portalLink", (n) -> { this.setPortalLink(n.getObjectValue(ActionUrl::createFromDiscriminatorValue)); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        deserializerMap.put("userImpact", (n) -> { this.setUserImpact(n.getStringValue()); });
        deserializerMap.put("versions", (n) -> { this.setVersions(n.getCollectionOfObjectValues(ManagementTemplateStepVersion::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the informationLinks property value. The informationLinks property
     * @return a {@link java.util.List<ActionUrl>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ActionUrl> getInformationLinks() {
        return this.backingStore.get("informationLinks");
    }
    /**
     * Gets the lastActionByUserId property value. The lastActionByUserId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastActionByUserId() {
        return this.backingStore.get("lastActionByUserId");
    }
    /**
     * Gets the lastActionDateTime property value. The lastActionDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this.backingStore.get("lastActionDateTime");
    }
    /**
     * Gets the managementTemplate property value. The managementTemplate property
     * @return a {@link ManagementTemplate}
     */
    @jakarta.annotation.Nullable
    public ManagementTemplate getManagementTemplate() {
        return this.backingStore.get("managementTemplate");
    }
    /**
     * Gets the portalLink property value. The portalLink property
     * @return a {@link ActionUrl}
     */
    @jakarta.annotation.Nullable
    public ActionUrl getPortalLink() {
        return this.backingStore.get("portalLink");
    }
    /**
     * Gets the priority property value. The priority property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPriority() {
        return this.backingStore.get("priority");
    }
    /**
     * Gets the userImpact property value. The userImpact property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserImpact() {
        return this.backingStore.get("userImpact");
    }
    /**
     * Gets the versions property value. The versions property
     * @return a {@link java.util.List<ManagementTemplateStepVersion>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementTemplateStepVersion> getVersions() {
        return this.backingStore.get("versions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("acceptedVersion", this.getAcceptedVersion());
        writer.writeEnumValue("category", this.getCategory());
        writer.writeStringValue("createdByUserId", this.getCreatedByUserId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("informationLinks", this.getInformationLinks());
        writer.writeStringValue("lastActionByUserId", this.getLastActionByUserId());
        writer.writeOffsetDateTimeValue("lastActionDateTime", this.getLastActionDateTime());
        writer.writeObjectValue("managementTemplate", this.getManagementTemplate());
        writer.writeObjectValue("portalLink", this.getPortalLink());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeStringValue("userImpact", this.getUserImpact());
        writer.writeCollectionOfObjectValues("versions", this.getVersions());
    }
    /**
     * Sets the acceptedVersion property value. The acceptedVersion property
     * @param value Value to set for the acceptedVersion property.
     */
    public void setAcceptedVersion(@jakarta.annotation.Nullable final ManagementTemplateStepVersion value) {
        this.backingStore.set("acceptedVersion", value);
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final ManagementCategory value) {
        this.backingStore.set("category", value);
    }
    /**
     * Sets the createdByUserId property value. The createdByUserId property
     * @param value Value to set for the createdByUserId property.
     */
    public void setCreatedByUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("createdByUserId", value);
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the informationLinks property value. The informationLinks property
     * @param value Value to set for the informationLinks property.
     */
    public void setInformationLinks(@jakarta.annotation.Nullable final java.util.List<ActionUrl> value) {
        this.backingStore.set("informationLinks", value);
    }
    /**
     * Sets the lastActionByUserId property value. The lastActionByUserId property
     * @param value Value to set for the lastActionByUserId property.
     */
    public void setLastActionByUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lastActionByUserId", value);
    }
    /**
     * Sets the lastActionDateTime property value. The lastActionDateTime property
     * @param value Value to set for the lastActionDateTime property.
     */
    public void setLastActionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastActionDateTime", value);
    }
    /**
     * Sets the managementTemplate property value. The managementTemplate property
     * @param value Value to set for the managementTemplate property.
     */
    public void setManagementTemplate(@jakarta.annotation.Nullable final ManagementTemplate value) {
        this.backingStore.set("managementTemplate", value);
    }
    /**
     * Sets the portalLink property value. The portalLink property
     * @param value Value to set for the portalLink property.
     */
    public void setPortalLink(@jakarta.annotation.Nullable final ActionUrl value) {
        this.backingStore.set("portalLink", value);
    }
    /**
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("priority", value);
    }
    /**
     * Sets the userImpact property value. The userImpact property
     * @param value Value to set for the userImpact property.
     */
    public void setUserImpact(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userImpact", value);
    }
    /**
     * Sets the versions property value. The versions property
     * @param value Value to set for the versions property.
     */
    public void setVersions(@jakarta.annotation.Nullable final java.util.List<ManagementTemplateStepVersion> value) {
        this.backingStore.set("versions", value);
    }
}
