package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TrainingCampaign extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TrainingCampaign} and sets the default values.
     */
    public TrainingCampaign() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TrainingCampaign}
     */
    @jakarta.annotation.Nonnull
    public static TrainingCampaign createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TrainingCampaign();
    }
    /**
     * Gets the campaignSchedule property value. Details about the schedule and current status for a training campaign
     * @return a {@link CampaignSchedule}
     */
    @jakarta.annotation.Nullable
    public CampaignSchedule getCampaignSchedule() {
        return this.backingStore.get("campaignSchedule");
    }
    /**
     * Gets the createdBy property value. Identity of the user who created the training campaign
     * @return a {@link EmailIdentity}
     */
    @jakarta.annotation.Nullable
    public EmailIdentity getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. Date and time of creation of the training campaign.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. Description of the training campaign.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Display name of the training campaign. Supports $filter and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the endUserNotificationSetting property value. Details about the end user notification setting.
     * @return a {@link EndUserNotificationSetting}
     */
    @jakarta.annotation.Nullable
    public EndUserNotificationSetting getEndUserNotificationSetting() {
        return this.backingStore.get("endUserNotificationSetting");
    }
    /**
     * Gets the excludedAccountTarget property value. Users excluded from the training campaign.
     * @return a {@link AccountTargetContent}
     */
    @jakarta.annotation.Nullable
    public AccountTargetContent getExcludedAccountTarget() {
        return this.backingStore.get("excludedAccountTarget");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("campaignSchedule", (n) -> { this.setCampaignSchedule(n.getObjectValue(CampaignSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(EmailIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("endUserNotificationSetting", (n) -> { this.setEndUserNotificationSetting(n.getObjectValue(EndUserNotificationSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("excludedAccountTarget", (n) -> { this.setExcludedAccountTarget(n.getObjectValue(AccountTargetContent::createFromDiscriminatorValue)); });
        deserializerMap.put("includedAccountTarget", (n) -> { this.setIncludedAccountTarget(n.getObjectValue(AccountTargetContent::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(EmailIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("report", (n) -> { this.setReport(n.getObjectValue(TrainingCampaignReport::createFromDiscriminatorValue)); });
        deserializerMap.put("trainingSetting", (n) -> { this.setTrainingSetting(n.getObjectValue(TrainingSetting::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the includedAccountTarget property value. Users targeted in the training campaign.
     * @return a {@link AccountTargetContent}
     */
    @jakarta.annotation.Nullable
    public AccountTargetContent getIncludedAccountTarget() {
        return this.backingStore.get("includedAccountTarget");
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the user who most recently modified the training campaign.
     * @return a {@link EmailIdentity}
     */
    @jakarta.annotation.Nullable
    public EmailIdentity getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. Date and time of the most recent modification of the training campaign.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the report property value. Report of the training campaign.
     * @return a {@link TrainingCampaignReport}
     */
    @jakarta.annotation.Nullable
    public TrainingCampaignReport getReport() {
        return this.backingStore.get("report");
    }
    /**
     * Gets the trainingSetting property value. Details about the training settings for a training campaign.
     * @return a {@link TrainingSetting}
     */
    @jakarta.annotation.Nullable
    public TrainingSetting getTrainingSetting() {
        return this.backingStore.get("trainingSetting");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("campaignSchedule", this.getCampaignSchedule());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("endUserNotificationSetting", this.getEndUserNotificationSetting());
        writer.writeObjectValue("excludedAccountTarget", this.getExcludedAccountTarget());
        writer.writeObjectValue("includedAccountTarget", this.getIncludedAccountTarget());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("report", this.getReport());
        writer.writeObjectValue("trainingSetting", this.getTrainingSetting());
    }
    /**
     * Sets the campaignSchedule property value. Details about the schedule and current status for a training campaign
     * @param value Value to set for the campaignSchedule property.
     */
    public void setCampaignSchedule(@jakarta.annotation.Nullable final CampaignSchedule value) {
        this.backingStore.set("campaignSchedule", value);
    }
    /**
     * Sets the createdBy property value. Identity of the user who created the training campaign
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final EmailIdentity value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. Date and time of creation of the training campaign.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. Description of the training campaign.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Display name of the training campaign. Supports $filter and $orderby.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the endUserNotificationSetting property value. Details about the end user notification setting.
     * @param value Value to set for the endUserNotificationSetting property.
     */
    public void setEndUserNotificationSetting(@jakarta.annotation.Nullable final EndUserNotificationSetting value) {
        this.backingStore.set("endUserNotificationSetting", value);
    }
    /**
     * Sets the excludedAccountTarget property value. Users excluded from the training campaign.
     * @param value Value to set for the excludedAccountTarget property.
     */
    public void setExcludedAccountTarget(@jakarta.annotation.Nullable final AccountTargetContent value) {
        this.backingStore.set("excludedAccountTarget", value);
    }
    /**
     * Sets the includedAccountTarget property value. Users targeted in the training campaign.
     * @param value Value to set for the includedAccountTarget property.
     */
    public void setIncludedAccountTarget(@jakarta.annotation.Nullable final AccountTargetContent value) {
        this.backingStore.set("includedAccountTarget", value);
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the user who most recently modified the training campaign.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final EmailIdentity value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Date and time of the most recent modification of the training campaign.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the report property value. Report of the training campaign.
     * @param value Value to set for the report property.
     */
    public void setReport(@jakarta.annotation.Nullable final TrainingCampaignReport value) {
        this.backingStore.set("report", value);
    }
    /**
     * Sets the trainingSetting property value. Details about the training settings for a training campaign.
     * @param value Value to set for the trainingSetting property.
     */
    public void setTrainingSetting(@jakarta.annotation.Nullable final TrainingSetting value) {
        this.backingStore.set("trainingSetting", value);
    }
}
