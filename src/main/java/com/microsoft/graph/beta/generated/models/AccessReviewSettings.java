package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new AccessReviewSettings and sets the default values.
     */
    public AccessReviewSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessReviewSettings
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.businessFlowSettings": return new BusinessFlowSettings();
            }
        }
        return new AccessReviewSettings();
    }
    /**
     * Gets the accessRecommendationsEnabled property value. Indicates whether showing recommendations to reviewers is enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAccessRecommendationsEnabled() {
        return this.backingStore.get("accessRecommendationsEnabled");
    }
    /**
     * Gets the activityDurationInDays property value. The number of days of user activities to show to reviewers.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getActivityDurationInDays() {
        return this.backingStore.get("activityDurationInDays");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * Gets the autoApplyReviewResultsEnabled property value. Indicates whether the auto-apply capability, to automatically change the target object access resource, is enabled.  If not enabled, a user must, after the review completes, apply the access review.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoApplyReviewResultsEnabled() {
        return this.backingStore.get("autoApplyReviewResultsEnabled");
    }
    /**
     * Gets the autoReviewEnabled property value. Indicates whether a decision should be set if the reviewer didn't supply one. For use when, auto-apply is enabled. If you don't want to have a review decision recorded unless the reviewer makes an explicit choice, set it to false.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoReviewEnabled() {
        return this.backingStore.get("autoReviewEnabled");
    }
    /**
     * Gets the autoReviewSettings property value. Detailed settings for how the feature should set the review decision. For use when, auto-apply is enabled.
     * @return a AutoReviewSettings
     */
    @jakarta.annotation.Nullable
    public AutoReviewSettings getAutoReviewSettings() {
        return this.backingStore.get("autoReviewSettings");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("accessRecommendationsEnabled", (n) -> { this.setAccessRecommendationsEnabled(n.getBooleanValue()); });
        deserializerMap.put("activityDurationInDays", (n) -> { this.setActivityDurationInDays(n.getIntegerValue()); });
        deserializerMap.put("autoApplyReviewResultsEnabled", (n) -> { this.setAutoApplyReviewResultsEnabled(n.getBooleanValue()); });
        deserializerMap.put("autoReviewEnabled", (n) -> { this.setAutoReviewEnabled(n.getBooleanValue()); });
        deserializerMap.put("autoReviewSettings", (n) -> { this.setAutoReviewSettings(n.getObjectValue(AutoReviewSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("justificationRequiredOnApproval", (n) -> { this.setJustificationRequiredOnApproval(n.getBooleanValue()); });
        deserializerMap.put("mailNotificationsEnabled", (n) -> { this.setMailNotificationsEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recurrenceSettings", (n) -> { this.setRecurrenceSettings(n.getObjectValue(AccessReviewRecurrenceSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("remindersEnabled", (n) -> { this.setRemindersEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the justificationRequiredOnApproval property value. Indicates whether reviewers are required to provide a justification when reviewing access.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getJustificationRequiredOnApproval() {
        return this.backingStore.get("justificationRequiredOnApproval");
    }
    /**
     * Gets the mailNotificationsEnabled property value. Indicates whether sending mails to reviewers and the review creator is enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMailNotificationsEnabled() {
        return this.backingStore.get("mailNotificationsEnabled");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the recurrenceSettings property value. Detailed settings for recurrence.
     * @return a AccessReviewRecurrenceSettings
     */
    @jakarta.annotation.Nullable
    public AccessReviewRecurrenceSettings getRecurrenceSettings() {
        return this.backingStore.get("recurrenceSettings");
    }
    /**
     * Gets the remindersEnabled property value. Indicates whether sending reminder emails to reviewers is enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRemindersEnabled() {
        return this.backingStore.get("remindersEnabled");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("accessRecommendationsEnabled", this.getAccessRecommendationsEnabled());
        writer.writeIntegerValue("activityDurationInDays", this.getActivityDurationInDays());
        writer.writeBooleanValue("autoApplyReviewResultsEnabled", this.getAutoApplyReviewResultsEnabled());
        writer.writeBooleanValue("autoReviewEnabled", this.getAutoReviewEnabled());
        writer.writeObjectValue("autoReviewSettings", this.getAutoReviewSettings());
        writer.writeBooleanValue("justificationRequiredOnApproval", this.getJustificationRequiredOnApproval());
        writer.writeBooleanValue("mailNotificationsEnabled", this.getMailNotificationsEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("recurrenceSettings", this.getRecurrenceSettings());
        writer.writeBooleanValue("remindersEnabled", this.getRemindersEnabled());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessRecommendationsEnabled property value. Indicates whether showing recommendations to reviewers is enabled.
     * @param value Value to set for the accessRecommendationsEnabled property.
     */
    public void setAccessRecommendationsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("accessRecommendationsEnabled", value);
    }
    /**
     * Sets the activityDurationInDays property value. The number of days of user activities to show to reviewers.
     * @param value Value to set for the activityDurationInDays property.
     */
    public void setActivityDurationInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("activityDurationInDays", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the autoApplyReviewResultsEnabled property value. Indicates whether the auto-apply capability, to automatically change the target object access resource, is enabled.  If not enabled, a user must, after the review completes, apply the access review.
     * @param value Value to set for the autoApplyReviewResultsEnabled property.
     */
    public void setAutoApplyReviewResultsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("autoApplyReviewResultsEnabled", value);
    }
    /**
     * Sets the autoReviewEnabled property value. Indicates whether a decision should be set if the reviewer didn't supply one. For use when, auto-apply is enabled. If you don't want to have a review decision recorded unless the reviewer makes an explicit choice, set it to false.
     * @param value Value to set for the autoReviewEnabled property.
     */
    public void setAutoReviewEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("autoReviewEnabled", value);
    }
    /**
     * Sets the autoReviewSettings property value. Detailed settings for how the feature should set the review decision. For use when, auto-apply is enabled.
     * @param value Value to set for the autoReviewSettings property.
     */
    public void setAutoReviewSettings(@jakarta.annotation.Nullable final AutoReviewSettings value) {
        this.backingStore.set("autoReviewSettings", value);
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
     * Sets the justificationRequiredOnApproval property value. Indicates whether reviewers are required to provide a justification when reviewing access.
     * @param value Value to set for the justificationRequiredOnApproval property.
     */
    public void setJustificationRequiredOnApproval(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("justificationRequiredOnApproval", value);
    }
    /**
     * Sets the mailNotificationsEnabled property value. Indicates whether sending mails to reviewers and the review creator is enabled.
     * @param value Value to set for the mailNotificationsEnabled property.
     */
    public void setMailNotificationsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("mailNotificationsEnabled", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the recurrenceSettings property value. Detailed settings for recurrence.
     * @param value Value to set for the recurrenceSettings property.
     */
    public void setRecurrenceSettings(@jakarta.annotation.Nullable final AccessReviewRecurrenceSettings value) {
        this.backingStore.set("recurrenceSettings", value);
    }
    /**
     * Sets the remindersEnabled property value. Indicates whether sending reminder emails to reviewers is enabled.
     * @param value Value to set for the remindersEnabled property.
     */
    public void setRemindersEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("remindersEnabled", value);
    }
}
