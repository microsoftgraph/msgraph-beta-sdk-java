package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomFieldDefinition extends PlannerDelta implements Parsable {
    /**
     * Instantiates a new {@link CustomFieldDefinition} and sets the default values.
     */
    public CustomFieldDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomFieldDefinition}
     */
    @jakarta.annotation.Nonnull
    public static CustomFieldDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomFieldDefinition();
    }
    /**
     * Gets the archivalInfo property value. Information about whether the entity is archived, and when it was archived.
     * @return a {@link PlannerArchivalInfo}
     */
    @jakarta.annotation.Nullable
    public PlannerArchivalInfo getArchivalInfo() {
        return this.backingStore.get("archivalInfo");
    }
    /**
     * Gets the choiceOptions property value. The collection of selectable choice options for a single-choice or multiple-choice custom field. Read-only. Nullable.
     * @return a {@link java.util.List<CustomChoiceOption>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomChoiceOption> getChoiceOptions() {
        return this.backingStore.get("choiceOptions");
    }
    /**
     * Gets the createdBy property value. Identity of the user (or application) who created the entity. Read-only.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. Date and time the entity was created. The value is represented in ISO 8601 format and is always in UTC time. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the deletedBy property value. Identity of the user who deleted the custom field definition, if it was deleted.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getDeletedBy() {
        return this.backingStore.get("deletedBy");
    }
    /**
     * Gets the deletedDateTime property value. Date and time the custom field definition was deleted, if applicable.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDeletedDateTime() {
        return this.backingStore.get("deletedDateTime");
    }
    /**
     * Gets the displayName property value. Name of the custom field.
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
        deserializerMap.put("archivalInfo", (n) -> { this.setArchivalInfo(n.getObjectValue(PlannerArchivalInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("choiceOptions", (n) -> { this.setChoiceOptions(n.getCollectionOfObjectValues(CustomChoiceOption::createFromDiscriminatorValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deletedBy", (n) -> { this.setDeletedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("deletedDateTime", (n) -> { this.setDeletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("planId", (n) -> { this.setPlanId(n.getStringValue()); });
        deserializerMap.put("rollupType", (n) -> { this.setRollupType(n.getEnumValue(CustomFieldRollupType::forValue)); });
        deserializerMap.put("valueType", (n) -> { this.setValueType(n.getEnumValue(CustomFieldValueType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the user (or application) who last modified the entity. Read-only.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. Date and time the entity was last modified. The value is represented in ISO 8601 format and is always in UTC time. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the planId property value. ID of the plan the custom field is defined on. Required, and immutable after creation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlanId() {
        return this.backingStore.get("planId");
    }
    /**
     * Gets the rollupType property value. How values of this custom field are rolled up across tasks. The possible values are: noRollup, max, min, sum, average, unknownFutureValue.
     * @return a {@link CustomFieldRollupType}
     */
    @jakarta.annotation.Nullable
    public CustomFieldRollupType getRollupType() {
        return this.backingStore.get("rollupType");
    }
    /**
     * Gets the valueType property value. Data type of the custom field&apos;s values.. The possible values are: text, date, utcDateTime, number, decimal, flag, singleChoiceText, multipleChoiceText, unknownFutureValue.
     * @return a {@link CustomFieldValueType}
     */
    @jakarta.annotation.Nullable
    public CustomFieldValueType getValueType() {
        return this.backingStore.get("valueType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("archivalInfo", this.getArchivalInfo());
        writer.writeCollectionOfObjectValues("choiceOptions", this.getChoiceOptions());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("planId", this.getPlanId());
        writer.writeEnumValue("rollupType", this.getRollupType());
        writer.writeEnumValue("valueType", this.getValueType());
    }
    /**
     * Sets the archivalInfo property value. Information about whether the entity is archived, and when it was archived.
     * @param value Value to set for the archivalInfo property.
     */
    public void setArchivalInfo(@jakarta.annotation.Nullable final PlannerArchivalInfo value) {
        this.backingStore.set("archivalInfo", value);
    }
    /**
     * Sets the choiceOptions property value. The collection of selectable choice options for a single-choice or multiple-choice custom field. Read-only. Nullable.
     * @param value Value to set for the choiceOptions property.
     */
    public void setChoiceOptions(@jakarta.annotation.Nullable final java.util.List<CustomChoiceOption> value) {
        this.backingStore.set("choiceOptions", value);
    }
    /**
     * Sets the createdBy property value. Identity of the user (or application) who created the entity. Read-only.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. Date and time the entity was created. The value is represented in ISO 8601 format and is always in UTC time. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the deletedBy property value. Identity of the user who deleted the custom field definition, if it was deleted.
     * @param value Value to set for the deletedBy property.
     */
    public void setDeletedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("deletedBy", value);
    }
    /**
     * Sets the deletedDateTime property value. Date and time the custom field definition was deleted, if applicable.
     * @param value Value to set for the deletedDateTime property.
     */
    public void setDeletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("deletedDateTime", value);
    }
    /**
     * Sets the displayName property value. Name of the custom field.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the user (or application) who last modified the entity. Read-only.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Date and time the entity was last modified. The value is represented in ISO 8601 format and is always in UTC time. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the planId property value. ID of the plan the custom field is defined on. Required, and immutable after creation.
     * @param value Value to set for the planId property.
     */
    public void setPlanId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("planId", value);
    }
    /**
     * Sets the rollupType property value. How values of this custom field are rolled up across tasks. The possible values are: noRollup, max, min, sum, average, unknownFutureValue.
     * @param value Value to set for the rollupType property.
     */
    public void setRollupType(@jakarta.annotation.Nullable final CustomFieldRollupType value) {
        this.backingStore.set("rollupType", value);
    }
    /**
     * Sets the valueType property value. Data type of the custom field&apos;s values.. The possible values are: text, date, utcDateTime, number, decimal, flag, singleChoiceText, multipleChoiceText, unknownFutureValue.
     * @param value Value to set for the valueType property.
     */
    public void setValueType(@jakarta.annotation.Nullable final CustomFieldValueType value) {
        this.backingStore.set("valueType", value);
    }
}
