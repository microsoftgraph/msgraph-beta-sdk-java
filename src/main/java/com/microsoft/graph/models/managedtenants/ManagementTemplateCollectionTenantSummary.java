package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagementTemplateCollectionTenantSummary extends Entity implements Parsable {
    /**
     * Instantiates a new ManagementTemplateCollectionTenantSummary and sets the default values.
     */
    public ManagementTemplateCollectionTenantSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagementTemplateCollectionTenantSummary
     */
    @jakarta.annotation.Nonnull
    public static ManagementTemplateCollectionTenantSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementTemplateCollectionTenantSummary();
    }
    /**
     * Gets the completeStepsCount property value. The completeStepsCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCompleteStepsCount() {
        return this.backingStore.get("completeStepsCount");
    }
    /**
     * Gets the completeUsersCount property value. The completeUsersCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCompleteUsersCount() {
        return this.backingStore.get("completeUsersCount");
    }
    /**
     * Gets the createdByUserId property value. The createdByUserId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCreatedByUserId() {
        return this.backingStore.get("createdByUserId");
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the dismissedStepsCount property value. The dismissedStepsCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDismissedStepsCount() {
        return this.backingStore.get("dismissedStepsCount");
    }
    /**
     * Gets the excludedUsersCount property value. The excludedUsersCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getExcludedUsersCount() {
        return this.backingStore.get("excludedUsersCount");
    }
    /**
     * Gets the excludedUsersDistinctCount property value. The excludedUsersDistinctCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getExcludedUsersDistinctCount() {
        return this.backingStore.get("excludedUsersDistinctCount");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("completeStepsCount", (n) -> { this.setCompleteStepsCount(n.getIntegerValue()); });
        deserializerMap.put("completeUsersCount", (n) -> { this.setCompleteUsersCount(n.getIntegerValue()); });
        deserializerMap.put("createdByUserId", (n) -> { this.setCreatedByUserId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("dismissedStepsCount", (n) -> { this.setDismissedStepsCount(n.getIntegerValue()); });
        deserializerMap.put("excludedUsersCount", (n) -> { this.setExcludedUsersCount(n.getIntegerValue()); });
        deserializerMap.put("excludedUsersDistinctCount", (n) -> { this.setExcludedUsersDistinctCount(n.getIntegerValue()); });
        deserializerMap.put("incompleteStepsCount", (n) -> { this.setIncompleteStepsCount(n.getIntegerValue()); });
        deserializerMap.put("incompleteUsersCount", (n) -> { this.setIncompleteUsersCount(n.getIntegerValue()); });
        deserializerMap.put("ineligibleStepsCount", (n) -> { this.setIneligibleStepsCount(n.getIntegerValue()); });
        deserializerMap.put("isComplete", (n) -> { this.setIsComplete(n.getBooleanValue()); });
        deserializerMap.put("lastActionByUserId", (n) -> { this.setLastActionByUserId(n.getStringValue()); });
        deserializerMap.put("lastActionDateTime", (n) -> { this.setLastActionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managementTemplateCollectionDisplayName", (n) -> { this.setManagementTemplateCollectionDisplayName(n.getStringValue()); });
        deserializerMap.put("managementTemplateCollectionId", (n) -> { this.setManagementTemplateCollectionId(n.getStringValue()); });
        deserializerMap.put("regressedStepsCount", (n) -> { this.setRegressedStepsCount(n.getIntegerValue()); });
        deserializerMap.put("regressedUsersCount", (n) -> { this.setRegressedUsersCount(n.getIntegerValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("unlicensedUsersCount", (n) -> { this.setUnlicensedUsersCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the incompleteStepsCount property value. The incompleteStepsCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getIncompleteStepsCount() {
        return this.backingStore.get("incompleteStepsCount");
    }
    /**
     * Gets the incompleteUsersCount property value. The incompleteUsersCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getIncompleteUsersCount() {
        return this.backingStore.get("incompleteUsersCount");
    }
    /**
     * Gets the ineligibleStepsCount property value. The ineligibleStepsCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getIneligibleStepsCount() {
        return this.backingStore.get("ineligibleStepsCount");
    }
    /**
     * Gets the isComplete property value. The isComplete property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsComplete() {
        return this.backingStore.get("isComplete");
    }
    /**
     * Gets the lastActionByUserId property value. The lastActionByUserId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLastActionByUserId() {
        return this.backingStore.get("lastActionByUserId");
    }
    /**
     * Gets the lastActionDateTime property value. The lastActionDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this.backingStore.get("lastActionDateTime");
    }
    /**
     * Gets the managementTemplateCollectionDisplayName property value. The managementTemplateCollectionDisplayName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagementTemplateCollectionDisplayName() {
        return this.backingStore.get("managementTemplateCollectionDisplayName");
    }
    /**
     * Gets the managementTemplateCollectionId property value. The managementTemplateCollectionId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagementTemplateCollectionId() {
        return this.backingStore.get("managementTemplateCollectionId");
    }
    /**
     * Gets the regressedStepsCount property value. The regressedStepsCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRegressedStepsCount() {
        return this.backingStore.get("regressedStepsCount");
    }
    /**
     * Gets the regressedUsersCount property value. The regressedUsersCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRegressedUsersCount() {
        return this.backingStore.get("regressedUsersCount");
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.backingStore.get("tenantId");
    }
    /**
     * Gets the unlicensedUsersCount property value. The unlicensedUsersCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getUnlicensedUsersCount() {
        return this.backingStore.get("unlicensedUsersCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("completeStepsCount", this.getCompleteStepsCount());
        writer.writeIntegerValue("completeUsersCount", this.getCompleteUsersCount());
        writer.writeStringValue("createdByUserId", this.getCreatedByUserId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeIntegerValue("dismissedStepsCount", this.getDismissedStepsCount());
        writer.writeIntegerValue("excludedUsersCount", this.getExcludedUsersCount());
        writer.writeIntegerValue("excludedUsersDistinctCount", this.getExcludedUsersDistinctCount());
        writer.writeIntegerValue("incompleteStepsCount", this.getIncompleteStepsCount());
        writer.writeIntegerValue("incompleteUsersCount", this.getIncompleteUsersCount());
        writer.writeIntegerValue("ineligibleStepsCount", this.getIneligibleStepsCount());
        writer.writeBooleanValue("isComplete", this.getIsComplete());
        writer.writeStringValue("lastActionByUserId", this.getLastActionByUserId());
        writer.writeOffsetDateTimeValue("lastActionDateTime", this.getLastActionDateTime());
        writer.writeStringValue("managementTemplateCollectionDisplayName", this.getManagementTemplateCollectionDisplayName());
        writer.writeStringValue("managementTemplateCollectionId", this.getManagementTemplateCollectionId());
        writer.writeIntegerValue("regressedStepsCount", this.getRegressedStepsCount());
        writer.writeIntegerValue("regressedUsersCount", this.getRegressedUsersCount());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeIntegerValue("unlicensedUsersCount", this.getUnlicensedUsersCount());
    }
    /**
     * Sets the completeStepsCount property value. The completeStepsCount property
     * @param value Value to set for the completeStepsCount property.
     */
    public void setCompleteStepsCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("completeStepsCount", value);
    }
    /**
     * Sets the completeUsersCount property value. The completeUsersCount property
     * @param value Value to set for the completeUsersCount property.
     */
    public void setCompleteUsersCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("completeUsersCount", value);
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
     * Sets the dismissedStepsCount property value. The dismissedStepsCount property
     * @param value Value to set for the dismissedStepsCount property.
     */
    public void setDismissedStepsCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("dismissedStepsCount", value);
    }
    /**
     * Sets the excludedUsersCount property value. The excludedUsersCount property
     * @param value Value to set for the excludedUsersCount property.
     */
    public void setExcludedUsersCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("excludedUsersCount", value);
    }
    /**
     * Sets the excludedUsersDistinctCount property value. The excludedUsersDistinctCount property
     * @param value Value to set for the excludedUsersDistinctCount property.
     */
    public void setExcludedUsersDistinctCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("excludedUsersDistinctCount", value);
    }
    /**
     * Sets the incompleteStepsCount property value. The incompleteStepsCount property
     * @param value Value to set for the incompleteStepsCount property.
     */
    public void setIncompleteStepsCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("incompleteStepsCount", value);
    }
    /**
     * Sets the incompleteUsersCount property value. The incompleteUsersCount property
     * @param value Value to set for the incompleteUsersCount property.
     */
    public void setIncompleteUsersCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("incompleteUsersCount", value);
    }
    /**
     * Sets the ineligibleStepsCount property value. The ineligibleStepsCount property
     * @param value Value to set for the ineligibleStepsCount property.
     */
    public void setIneligibleStepsCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("ineligibleStepsCount", value);
    }
    /**
     * Sets the isComplete property value. The isComplete property
     * @param value Value to set for the isComplete property.
     */
    public void setIsComplete(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isComplete", value);
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
     * Sets the regressedStepsCount property value. The regressedStepsCount property
     * @param value Value to set for the regressedStepsCount property.
     */
    public void setRegressedStepsCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("regressedStepsCount", value);
    }
    /**
     * Sets the regressedUsersCount property value. The regressedUsersCount property
     * @param value Value to set for the regressedUsersCount property.
     */
    public void setRegressedUsersCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("regressedUsersCount", value);
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
    /**
     * Sets the unlicensedUsersCount property value. The unlicensedUsersCount property
     * @param value Value to set for the unlicensedUsersCount property.
     */
    public void setUnlicensedUsersCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("unlicensedUsersCount", value);
    }
}
