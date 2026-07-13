package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerTaskData implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link PlannerTaskData} and sets the default values.
     */
    public PlannerTaskData() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlannerTaskData}
     */
    @jakarta.annotation.Nonnull
    public static PlannerTaskData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerTaskData();
    }
    /**
     * Gets the activeChecklistItemCount property value. The activeChecklistItemCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getActiveChecklistItemCount() {
        return this.backingStore.get("activeChecklistItemCount");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the appliedCategories property value. The appliedCategories property
     * @return a {@link PlannerAppliedCategories}
     */
    @jakarta.annotation.Nullable
    public PlannerAppliedCategories getAppliedCategories() {
        return this.backingStore.get("appliedCategories");
    }
    /**
     * Gets the archivalInfo property value. The archivalInfo property
     * @return a {@link PlannerArchivalInfo}
     */
    @jakarta.annotation.Nullable
    public PlannerArchivalInfo getArchivalInfo() {
        return this.backingStore.get("archivalInfo");
    }
    /**
     * Gets the assignments property value. The assignments property
     * @return a {@link PlannerAssignments}
     */
    @jakarta.annotation.Nullable
    public PlannerAssignments getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the bucketId property value. The bucketId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBucketId() {
        return this.backingStore.get("bucketId");
    }
    /**
     * Gets the checklistItemCount property value. The checklistItemCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getChecklistItemCount() {
        return this.backingStore.get("checklistItemCount");
    }
    /**
     * Gets the completedBy property value. The completedBy property
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCompletedBy() {
        return this.backingStore.get("completedBy");
    }
    /**
     * Gets the completedDateTime property value. The completedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this.backingStore.get("completedDateTime");
    }
    /**
     * Gets the conversationThreadId property value. The conversationThreadId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConversationThreadId() {
        return this.backingStore.get("conversationThreadId");
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
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
     * Gets the creationSource property value. The creationSource property
     * @return a {@link PlannerTaskCreation}
     */
    @jakarta.annotation.Nullable
    public PlannerTaskCreation getCreationSource() {
        return this.backingStore.get("creationSource");
    }
    /**
     * Gets the details property value. The details property
     * @return a {@link PlannerTaskDetailsData}
     */
    @jakarta.annotation.Nullable
    public PlannerTaskDetailsData getDetails() {
        return this.backingStore.get("details");
    }
    /**
     * Gets the dueDateTime property value. The dueDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDueDateTime() {
        return this.backingStore.get("dueDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(27);
        deserializerMap.put("activeChecklistItemCount", (n) -> { this.setActiveChecklistItemCount(n.getIntegerValue()); });
        deserializerMap.put("appliedCategories", (n) -> { this.setAppliedCategories(n.getObjectValue(PlannerAppliedCategories::createFromDiscriminatorValue)); });
        deserializerMap.put("archivalInfo", (n) -> { this.setArchivalInfo(n.getObjectValue(PlannerArchivalInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getObjectValue(PlannerAssignments::createFromDiscriminatorValue)); });
        deserializerMap.put("bucketId", (n) -> { this.setBucketId(n.getStringValue()); });
        deserializerMap.put("checklistItemCount", (n) -> { this.setChecklistItemCount(n.getIntegerValue()); });
        deserializerMap.put("completedBy", (n) -> { this.setCompletedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("completedDateTime", (n) -> { this.setCompletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("conversationThreadId", (n) -> { this.setConversationThreadId(n.getStringValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("creationSource", (n) -> { this.setCreationSource(n.getObjectValue(PlannerTaskCreation::createFromDiscriminatorValue)); });
        deserializerMap.put("details", (n) -> { this.setDetails(n.getObjectValue(PlannerTaskDetailsData::createFromDiscriminatorValue)); });
        deserializerMap.put("dueDateTime", (n) -> { this.setDueDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("hasChat", (n) -> { this.setHasChat(n.getBooleanValue()); });
        deserializerMap.put("hasDescription", (n) -> { this.setHasDescription(n.getBooleanValue()); });
        deserializerMap.put("isArchived", (n) -> { this.setIsArchived(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("orderHint", (n) -> { this.setOrderHint(n.getStringValue()); });
        deserializerMap.put("percentComplete", (n) -> { this.setPercentComplete(n.getIntegerValue()); });
        deserializerMap.put("previewType", (n) -> { this.setPreviewType(n.getEnumValue(PlannerPreviewType::forValue)); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        deserializerMap.put("recurrence", (n) -> { this.setRecurrence(n.getObjectValue(PlannerTaskRecurrence::createFromDiscriminatorValue)); });
        deserializerMap.put("referenceCount", (n) -> { this.setReferenceCount(n.getIntegerValue()); });
        deserializerMap.put("specifiedCompletionRequirements", (n) -> { this.setSpecifiedCompletionRequirements(n.getEnumSetValue(PlannerTaskCompletionRequirements::forValue)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hasChat property value. The hasChat property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasChat() {
        return this.backingStore.get("hasChat");
    }
    /**
     * Gets the hasDescription property value. The hasDescription property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasDescription() {
        return this.backingStore.get("hasDescription");
    }
    /**
     * Gets the isArchived property value. The isArchived property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsArchived() {
        return this.backingStore.get("isArchived");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the orderHint property value. The orderHint property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrderHint() {
        return this.backingStore.get("orderHint");
    }
    /**
     * Gets the percentComplete property value. The percentComplete property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPercentComplete() {
        return this.backingStore.get("percentComplete");
    }
    /**
     * Gets the previewType property value. The previewType property
     * @return a {@link PlannerPreviewType}
     */
    @jakarta.annotation.Nullable
    public PlannerPreviewType getPreviewType() {
        return this.backingStore.get("previewType");
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
     * Gets the recurrence property value. The recurrence property
     * @return a {@link PlannerTaskRecurrence}
     */
    @jakarta.annotation.Nullable
    public PlannerTaskRecurrence getRecurrence() {
        return this.backingStore.get("recurrence");
    }
    /**
     * Gets the referenceCount property value. The referenceCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getReferenceCount() {
        return this.backingStore.get("referenceCount");
    }
    /**
     * Gets the specifiedCompletionRequirements property value. The specifiedCompletionRequirements property
     * @return a {@link EnumSet<PlannerTaskCompletionRequirements>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<PlannerTaskCompletionRequirements> getSpecifiedCompletionRequirements() {
        return this.backingStore.get("specifiedCompletionRequirements");
    }
    /**
     * Gets the startDateTime property value. The startDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the title property value. The title property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.backingStore.get("title");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("activeChecklistItemCount", this.getActiveChecklistItemCount());
        writer.writeObjectValue("appliedCategories", this.getAppliedCategories());
        writer.writeObjectValue("archivalInfo", this.getArchivalInfo());
        writer.writeObjectValue("assignments", this.getAssignments());
        writer.writeStringValue("bucketId", this.getBucketId());
        writer.writeIntegerValue("checklistItemCount", this.getChecklistItemCount());
        writer.writeObjectValue("completedBy", this.getCompletedBy());
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeStringValue("conversationThreadId", this.getConversationThreadId());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("creationSource", this.getCreationSource());
        writer.writeObjectValue("details", this.getDetails());
        writer.writeOffsetDateTimeValue("dueDateTime", this.getDueDateTime());
        writer.writeBooleanValue("hasChat", this.getHasChat());
        writer.writeBooleanValue("hasDescription", this.getHasDescription());
        writer.writeBooleanValue("isArchived", this.getIsArchived());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("orderHint", this.getOrderHint());
        writer.writeIntegerValue("percentComplete", this.getPercentComplete());
        writer.writeEnumValue("previewType", this.getPreviewType());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeObjectValue("recurrence", this.getRecurrence());
        writer.writeIntegerValue("referenceCount", this.getReferenceCount());
        writer.writeEnumSetValue("specifiedCompletionRequirements", this.getSpecifiedCompletionRequirements());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeStringValue("title", this.getTitle());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activeChecklistItemCount property value. The activeChecklistItemCount property
     * @param value Value to set for the activeChecklistItemCount property.
     */
    public void setActiveChecklistItemCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("activeChecklistItemCount", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the appliedCategories property value. The appliedCategories property
     * @param value Value to set for the appliedCategories property.
     */
    public void setAppliedCategories(@jakarta.annotation.Nullable final PlannerAppliedCategories value) {
        this.backingStore.set("appliedCategories", value);
    }
    /**
     * Sets the archivalInfo property value. The archivalInfo property
     * @param value Value to set for the archivalInfo property.
     */
    public void setArchivalInfo(@jakarta.annotation.Nullable final PlannerArchivalInfo value) {
        this.backingStore.set("archivalInfo", value);
    }
    /**
     * Sets the assignments property value. The assignments property
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final PlannerAssignments value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the bucketId property value. The bucketId property
     * @param value Value to set for the bucketId property.
     */
    public void setBucketId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("bucketId", value);
    }
    /**
     * Sets the checklistItemCount property value. The checklistItemCount property
     * @param value Value to set for the checklistItemCount property.
     */
    public void setChecklistItemCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("checklistItemCount", value);
    }
    /**
     * Sets the completedBy property value. The completedBy property
     * @param value Value to set for the completedBy property.
     */
    public void setCompletedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("completedBy", value);
    }
    /**
     * Sets the completedDateTime property value. The completedDateTime property
     * @param value Value to set for the completedDateTime property.
     */
    public void setCompletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("completedDateTime", value);
    }
    /**
     * Sets the conversationThreadId property value. The conversationThreadId property
     * @param value Value to set for the conversationThreadId property.
     */
    public void setConversationThreadId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("conversationThreadId", value);
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the creationSource property value. The creationSource property
     * @param value Value to set for the creationSource property.
     */
    public void setCreationSource(@jakarta.annotation.Nullable final PlannerTaskCreation value) {
        this.backingStore.set("creationSource", value);
    }
    /**
     * Sets the details property value. The details property
     * @param value Value to set for the details property.
     */
    public void setDetails(@jakarta.annotation.Nullable final PlannerTaskDetailsData value) {
        this.backingStore.set("details", value);
    }
    /**
     * Sets the dueDateTime property value. The dueDateTime property
     * @param value Value to set for the dueDateTime property.
     */
    public void setDueDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("dueDateTime", value);
    }
    /**
     * Sets the hasChat property value. The hasChat property
     * @param value Value to set for the hasChat property.
     */
    public void setHasChat(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasChat", value);
    }
    /**
     * Sets the hasDescription property value. The hasDescription property
     * @param value Value to set for the hasDescription property.
     */
    public void setHasDescription(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasDescription", value);
    }
    /**
     * Sets the isArchived property value. The isArchived property
     * @param value Value to set for the isArchived property.
     */
    public void setIsArchived(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isArchived", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the orderHint property value. The orderHint property
     * @param value Value to set for the orderHint property.
     */
    public void setOrderHint(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("orderHint", value);
    }
    /**
     * Sets the percentComplete property value. The percentComplete property
     * @param value Value to set for the percentComplete property.
     */
    public void setPercentComplete(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("percentComplete", value);
    }
    /**
     * Sets the previewType property value. The previewType property
     * @param value Value to set for the previewType property.
     */
    public void setPreviewType(@jakarta.annotation.Nullable final PlannerPreviewType value) {
        this.backingStore.set("previewType", value);
    }
    /**
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("priority", value);
    }
    /**
     * Sets the recurrence property value. The recurrence property
     * @param value Value to set for the recurrence property.
     */
    public void setRecurrence(@jakarta.annotation.Nullable final PlannerTaskRecurrence value) {
        this.backingStore.set("recurrence", value);
    }
    /**
     * Sets the referenceCount property value. The referenceCount property
     * @param value Value to set for the referenceCount property.
     */
    public void setReferenceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("referenceCount", value);
    }
    /**
     * Sets the specifiedCompletionRequirements property value. The specifiedCompletionRequirements property
     * @param value Value to set for the specifiedCompletionRequirements property.
     */
    public void setSpecifiedCompletionRequirements(@jakarta.annotation.Nullable final EnumSet<PlannerTaskCompletionRequirements> value) {
        this.backingStore.set("specifiedCompletionRequirements", value);
    }
    /**
     * Sets the startDateTime property value. The startDateTime property
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the title property value. The title property
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("title", value);
    }
}
