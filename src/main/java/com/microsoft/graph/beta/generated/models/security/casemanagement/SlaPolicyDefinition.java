package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SlaPolicyDefinition extends CaseManagementEntity implements Parsable {
    /**
     * Instantiates a new {@link SlaPolicyDefinition} and sets the default values.
     */
    public SlaPolicyDefinition() {
        super();
        this.setOdataType("#microsoft.graph.security.caseManagement.slaPolicyDefinition");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SlaPolicyDefinition}
     */
    @jakarta.annotation.Nonnull
    public static SlaPolicyDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SlaPolicyDefinition();
    }
    /**
     * Gets the description property value. The description of the policy. Maximum length: 5,000 characters.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name of the policy. Must be unique across the tenant, using a case-insensitive comparison. Maximum length: 150 characters.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the exitCriteria property value. The condition that removes a case from the policy&apos;s scope.
     * @return a {@link SlaPolicyCriteriaBlock}
     */
    @jakarta.annotation.Nullable
    public SlaPolicyCriteriaBlock getExitCriteria() {
        return this.backingStore.get("exitCriteria");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("exitCriteria", (n) -> { this.setExitCriteria(n.getObjectValue(SlaPolicyCriteriaBlock::createFromDiscriminatorValue)); });
        deserializerMap.put("isActive", (n) -> { this.setIsActive(n.getBooleanValue()); });
        deserializerMap.put("pauseCriteria", (n) -> { this.setPauseCriteria(n.getObjectValue(SlaPolicyCriteriaBlock::createFromDiscriminatorValue)); });
        deserializerMap.put("recalculateCondition", (n) -> { this.setRecalculateCondition(n.getObjectValue(SlaPolicyRecalculateCondition::createFromDiscriminatorValue)); });
        deserializerMap.put("setCriteria", (n) -> { this.setSetCriteria(n.getObjectValue(SlaPolicyCriteriaBlock::createFromDiscriminatorValue)); });
        deserializerMap.put("timers", (n) -> { this.setTimers(n.getCollectionOfObjectValues(SlaPolicyTimer::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isActive property value. Whether the policy is actively evaluated. Inactive policies are excluded from new case evaluations. The default value on creation is true.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsActive() {
        return this.backingStore.get("isActive");
    }
    /**
     * Gets the pauseCriteria property value. The condition that pauses the timer while a case matches it.
     * @return a {@link SlaPolicyCriteriaBlock}
     */
    @jakarta.annotation.Nullable
    public SlaPolicyCriteriaBlock getPauseCriteria() {
        return this.backingStore.get("pauseCriteria");
    }
    /**
     * Gets the recalculateCondition property value. The settings that control whether elapsed time resets when the policy is recalculated.
     * @return a {@link SlaPolicyRecalculateCondition}
     */
    @jakarta.annotation.Nullable
    public SlaPolicyRecalculateCondition getRecalculateCondition() {
        return this.backingStore.get("recalculateCondition");
    }
    /**
     * Gets the setCriteria property value. The condition a case must match to enter the policy&apos;s scope. When omitted, the policy applies to all cases of its owning case type. The maximum nesting depth is two.
     * @return a {@link SlaPolicyCriteriaBlock}
     */
    @jakarta.annotation.Nullable
    public SlaPolicyCriteriaBlock getSetCriteria() {
        return this.backingStore.get("setCriteria");
    }
    /**
     * Gets the timers property value. The embedded warning and breach timers, evaluated in order, lowest first. Maximum: 15 timers. Exactly one timer must have isDefault set to true. Updating this property replaces the entire collection.
     * @return a {@link java.util.List<SlaPolicyTimer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SlaPolicyTimer> getTimers() {
        return this.backingStore.get("timers");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("exitCriteria", this.getExitCriteria());
        writer.writeBooleanValue("isActive", this.getIsActive());
        writer.writeObjectValue("pauseCriteria", this.getPauseCriteria());
        writer.writeObjectValue("recalculateCondition", this.getRecalculateCondition());
        writer.writeObjectValue("setCriteria", this.getSetCriteria());
        writer.writeCollectionOfObjectValues("timers", this.getTimers());
    }
    /**
     * Sets the description property value. The description of the policy. Maximum length: 5,000 characters.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name of the policy. Must be unique across the tenant, using a case-insensitive comparison. Maximum length: 150 characters.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the exitCriteria property value. The condition that removes a case from the policy&apos;s scope.
     * @param value Value to set for the exitCriteria property.
     */
    public void setExitCriteria(@jakarta.annotation.Nullable final SlaPolicyCriteriaBlock value) {
        this.backingStore.set("exitCriteria", value);
    }
    /**
     * Sets the isActive property value. Whether the policy is actively evaluated. Inactive policies are excluded from new case evaluations. The default value on creation is true.
     * @param value Value to set for the isActive property.
     */
    public void setIsActive(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isActive", value);
    }
    /**
     * Sets the pauseCriteria property value. The condition that pauses the timer while a case matches it.
     * @param value Value to set for the pauseCriteria property.
     */
    public void setPauseCriteria(@jakarta.annotation.Nullable final SlaPolicyCriteriaBlock value) {
        this.backingStore.set("pauseCriteria", value);
    }
    /**
     * Sets the recalculateCondition property value. The settings that control whether elapsed time resets when the policy is recalculated.
     * @param value Value to set for the recalculateCondition property.
     */
    public void setRecalculateCondition(@jakarta.annotation.Nullable final SlaPolicyRecalculateCondition value) {
        this.backingStore.set("recalculateCondition", value);
    }
    /**
     * Sets the setCriteria property value. The condition a case must match to enter the policy&apos;s scope. When omitted, the policy applies to all cases of its owning case type. The maximum nesting depth is two.
     * @param value Value to set for the setCriteria property.
     */
    public void setSetCriteria(@jakarta.annotation.Nullable final SlaPolicyCriteriaBlock value) {
        this.backingStore.set("setCriteria", value);
    }
    /**
     * Sets the timers property value. The embedded warning and breach timers, evaluated in order, lowest first. Maximum: 15 timers. Exactly one timer must have isDefault set to true. Updating this property replaces the entire collection.
     * @param value Value to set for the timers property.
     */
    public void setTimers(@jakarta.annotation.Nullable final java.util.List<SlaPolicyTimer> value) {
        this.backingStore.set("timers", value);
    }
}
