package com.microsoft.graph.beta.models.managedtenants;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagementTemplateStepTenantSummary extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ManagementTemplateStepTenantSummary} and sets the default values.
     */
    public ManagementTemplateStepTenantSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ManagementTemplateStepTenantSummary}
     */
    @jakarta.annotation.Nonnull
    public static ManagementTemplateStepTenantSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementTemplateStepTenantSummary();
    }
    /**
     * Gets the assignedTenantsCount property value. The assignedTenantsCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAssignedTenantsCount() {
        return this.backingStore.get("assignedTenantsCount");
    }
    /**
     * Gets the compliantTenantsCount property value. The compliantTenantsCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCompliantTenantsCount() {
        return this.backingStore.get("compliantTenantsCount");
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
     * Gets the dismissedTenantsCount property value. The dismissedTenantsCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDismissedTenantsCount() {
        return this.backingStore.get("dismissedTenantsCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignedTenantsCount", (n) -> { this.setAssignedTenantsCount(n.getIntegerValue()); });
        deserializerMap.put("compliantTenantsCount", (n) -> { this.setCompliantTenantsCount(n.getIntegerValue()); });
        deserializerMap.put("createdByUserId", (n) -> { this.setCreatedByUserId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("dismissedTenantsCount", (n) -> { this.setDismissedTenantsCount(n.getIntegerValue()); });
        deserializerMap.put("ineligibleTenantsCount", (n) -> { this.setIneligibleTenantsCount(n.getIntegerValue()); });
        deserializerMap.put("lastActionByUserId", (n) -> { this.setLastActionByUserId(n.getStringValue()); });
        deserializerMap.put("lastActionDateTime", (n) -> { this.setLastActionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managementTemplateCollectionDisplayName", (n) -> { this.setManagementTemplateCollectionDisplayName(n.getStringValue()); });
        deserializerMap.put("managementTemplateCollectionId", (n) -> { this.setManagementTemplateCollectionId(n.getStringValue()); });
        deserializerMap.put("managementTemplateDisplayName", (n) -> { this.setManagementTemplateDisplayName(n.getStringValue()); });
        deserializerMap.put("managementTemplateId", (n) -> { this.setManagementTemplateId(n.getStringValue()); });
        deserializerMap.put("managementTemplateStepDisplayName", (n) -> { this.setManagementTemplateStepDisplayName(n.getStringValue()); });
        deserializerMap.put("managementTemplateStepId", (n) -> { this.setManagementTemplateStepId(n.getStringValue()); });
        deserializerMap.put("notCompliantTenantsCount", (n) -> { this.setNotCompliantTenantsCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ineligibleTenantsCount property value. The ineligibleTenantsCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getIneligibleTenantsCount() {
        return this.backingStore.get("ineligibleTenantsCount");
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
     * Gets the managementTemplateCollectionDisplayName property value. The managementTemplateCollectionDisplayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagementTemplateCollectionDisplayName() {
        return this.backingStore.get("managementTemplateCollectionDisplayName");
    }
    /**
     * Gets the managementTemplateCollectionId property value. The managementTemplateCollectionId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagementTemplateCollectionId() {
        return this.backingStore.get("managementTemplateCollectionId");
    }
    /**
     * Gets the managementTemplateDisplayName property value. The managementTemplateDisplayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagementTemplateDisplayName() {
        return this.backingStore.get("managementTemplateDisplayName");
    }
    /**
     * Gets the managementTemplateId property value. The managementTemplateId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagementTemplateId() {
        return this.backingStore.get("managementTemplateId");
    }
    /**
     * Gets the managementTemplateStepDisplayName property value. The managementTemplateStepDisplayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagementTemplateStepDisplayName() {
        return this.backingStore.get("managementTemplateStepDisplayName");
    }
    /**
     * Gets the managementTemplateStepId property value. The managementTemplateStepId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagementTemplateStepId() {
        return this.backingStore.get("managementTemplateStepId");
    }
    /**
     * Gets the notCompliantTenantsCount property value. The notCompliantTenantsCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNotCompliantTenantsCount() {
        return this.backingStore.get("notCompliantTenantsCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("assignedTenantsCount", this.getAssignedTenantsCount());
        writer.writeIntegerValue("compliantTenantsCount", this.getCompliantTenantsCount());
        writer.writeStringValue("createdByUserId", this.getCreatedByUserId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeIntegerValue("dismissedTenantsCount", this.getDismissedTenantsCount());
        writer.writeIntegerValue("ineligibleTenantsCount", this.getIneligibleTenantsCount());
        writer.writeStringValue("lastActionByUserId", this.getLastActionByUserId());
        writer.writeOffsetDateTimeValue("lastActionDateTime", this.getLastActionDateTime());
        writer.writeStringValue("managementTemplateCollectionDisplayName", this.getManagementTemplateCollectionDisplayName());
        writer.writeStringValue("managementTemplateCollectionId", this.getManagementTemplateCollectionId());
        writer.writeStringValue("managementTemplateDisplayName", this.getManagementTemplateDisplayName());
        writer.writeStringValue("managementTemplateId", this.getManagementTemplateId());
        writer.writeStringValue("managementTemplateStepDisplayName", this.getManagementTemplateStepDisplayName());
        writer.writeStringValue("managementTemplateStepId", this.getManagementTemplateStepId());
        writer.writeIntegerValue("notCompliantTenantsCount", this.getNotCompliantTenantsCount());
    }
    /**
     * Sets the assignedTenantsCount property value. The assignedTenantsCount property
     * @param value Value to set for the assignedTenantsCount property.
     */
    public void setAssignedTenantsCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("assignedTenantsCount", value);
    }
    /**
     * Sets the compliantTenantsCount property value. The compliantTenantsCount property
     * @param value Value to set for the compliantTenantsCount property.
     */
    public void setCompliantTenantsCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("compliantTenantsCount", value);
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
     * Sets the dismissedTenantsCount property value. The dismissedTenantsCount property
     * @param value Value to set for the dismissedTenantsCount property.
     */
    public void setDismissedTenantsCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("dismissedTenantsCount", value);
    }
    /**
     * Sets the ineligibleTenantsCount property value. The ineligibleTenantsCount property
     * @param value Value to set for the ineligibleTenantsCount property.
     */
    public void setIneligibleTenantsCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("ineligibleTenantsCount", value);
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
     * Sets the managementTemplateCollectionDisplayName property value. The managementTemplateCollectionDisplayName property
     * @param value Value to set for the managementTemplateCollectionDisplayName property.
     */
    public void setManagementTemplateCollectionDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managementTemplateCollectionDisplayName", value);
    }
    /**
     * Sets the managementTemplateCollectionId property value. The managementTemplateCollectionId property
     * @param value Value to set for the managementTemplateCollectionId property.
     */
    public void setManagementTemplateCollectionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managementTemplateCollectionId", value);
    }
    /**
     * Sets the managementTemplateDisplayName property value. The managementTemplateDisplayName property
     * @param value Value to set for the managementTemplateDisplayName property.
     */
    public void setManagementTemplateDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managementTemplateDisplayName", value);
    }
    /**
     * Sets the managementTemplateId property value. The managementTemplateId property
     * @param value Value to set for the managementTemplateId property.
     */
    public void setManagementTemplateId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managementTemplateId", value);
    }
    /**
     * Sets the managementTemplateStepDisplayName property value. The managementTemplateStepDisplayName property
     * @param value Value to set for the managementTemplateStepDisplayName property.
     */
    public void setManagementTemplateStepDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managementTemplateStepDisplayName", value);
    }
    /**
     * Sets the managementTemplateStepId property value. The managementTemplateStepId property
     * @param value Value to set for the managementTemplateStepId property.
     */
    public void setManagementTemplateStepId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managementTemplateStepId", value);
    }
    /**
     * Sets the notCompliantTenantsCount property value. The notCompliantTenantsCount property
     * @param value Value to set for the notCompliantTenantsCount property.
     */
    public void setNotCompliantTenantsCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("notCompliantTenantsCount", value);
    }
}
