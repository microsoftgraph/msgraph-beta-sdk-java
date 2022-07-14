package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessReviewSettings implements AdditionalDataHolder, Parsable {
    /** Indicates whether showing recommendations to reviewers is enabled. */
    private Boolean _accessRecommendationsEnabled;
    /** The number of days of user activities to show to reviewers. */
    private Integer _activityDurationInDays;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Indicates whether the auto-apply capability, to automatically change the target object access resource, is enabled.  If not enabled, a user must, after the review completes, apply the access review. */
    private Boolean _autoApplyReviewResultsEnabled;
    /** Indicates whether a decision should be set if the reviewer did not supply one. For use when auto-apply is enabled. If you don't want to have a review decision recorded unless the reviewer makes an explicit choice, set it to false. */
    private Boolean _autoReviewEnabled;
    /** Detailed settings for how the feature should set the review decision. For use when auto-apply is enabled. */
    private AutoReviewSettings _autoReviewSettings;
    /** Indicates whether reviewers are required to provide a justification when reviewing access. */
    private Boolean _justificationRequiredOnApproval;
    /** Indicates whether sending mails to reviewers and the review creator is enabled. */
    private Boolean _mailNotificationsEnabled;
    /** Detailed settings for recurrence. */
    private AccessReviewRecurrenceSettings _recurrenceSettings;
    /** Indicates whether sending reminder emails to reviewers is enabled. */
    private Boolean _remindersEnabled;
    /** The type property */
    private String _type;
    /**
     * Instantiates a new accessReviewSettings and sets the default values.
     * @return a void
     */
    public AccessReviewSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setType("#microsoft.graph.accessReviewSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessReviewSettings
     */
    @javax.annotation.Nonnull
    public static AccessReviewSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAccessRecommendationsEnabled() {
        return this._accessRecommendationsEnabled;
    }
    /**
     * Gets the activityDurationInDays property value. The number of days of user activities to show to reviewers.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getActivityDurationInDays() {
        return this._activityDurationInDays;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the autoApplyReviewResultsEnabled property value. Indicates whether the auto-apply capability, to automatically change the target object access resource, is enabled.  If not enabled, a user must, after the review completes, apply the access review.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAutoApplyReviewResultsEnabled() {
        return this._autoApplyReviewResultsEnabled;
    }
    /**
     * Gets the autoReviewEnabled property value. Indicates whether a decision should be set if the reviewer did not supply one. For use when auto-apply is enabled. If you don't want to have a review decision recorded unless the reviewer makes an explicit choice, set it to false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAutoReviewEnabled() {
        return this._autoReviewEnabled;
    }
    /**
     * Gets the autoReviewSettings property value. Detailed settings for how the feature should set the review decision. For use when auto-apply is enabled.
     * @return a autoReviewSettings
     */
    @javax.annotation.Nullable
    public AutoReviewSettings getAutoReviewSettings() {
        return this._autoReviewSettings;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessReviewSettings currentObject = this;
        return new HashMap<>(10) {{
            this.put("accessRecommendationsEnabled", (n) -> { currentObject.setAccessRecommendationsEnabled(n.getBooleanValue()); });
            this.put("activityDurationInDays", (n) -> { currentObject.setActivityDurationInDays(n.getIntegerValue()); });
            this.put("autoApplyReviewResultsEnabled", (n) -> { currentObject.setAutoApplyReviewResultsEnabled(n.getBooleanValue()); });
            this.put("autoReviewEnabled", (n) -> { currentObject.setAutoReviewEnabled(n.getBooleanValue()); });
            this.put("autoReviewSettings", (n) -> { currentObject.setAutoReviewSettings(n.getObjectValue(AutoReviewSettings::createFromDiscriminatorValue)); });
            this.put("justificationRequiredOnApproval", (n) -> { currentObject.setJustificationRequiredOnApproval(n.getBooleanValue()); });
            this.put("mailNotificationsEnabled", (n) -> { currentObject.setMailNotificationsEnabled(n.getBooleanValue()); });
            this.put("recurrenceSettings", (n) -> { currentObject.setRecurrenceSettings(n.getObjectValue(AccessReviewRecurrenceSettings::createFromDiscriminatorValue)); });
            this.put("remindersEnabled", (n) -> { currentObject.setRemindersEnabled(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the justificationRequiredOnApproval property value. Indicates whether reviewers are required to provide a justification when reviewing access.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getJustificationRequiredOnApproval() {
        return this._justificationRequiredOnApproval;
    }
    /**
     * Gets the mailNotificationsEnabled property value. Indicates whether sending mails to reviewers and the review creator is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMailNotificationsEnabled() {
        return this._mailNotificationsEnabled;
    }
    /**
     * Gets the recurrenceSettings property value. Detailed settings for recurrence.
     * @return a accessReviewRecurrenceSettings
     */
    @javax.annotation.Nullable
    public AccessReviewRecurrenceSettings getRecurrenceSettings() {
        return this._recurrenceSettings;
    }
    /**
     * Gets the remindersEnabled property value. Indicates whether sending reminder emails to reviewers is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRemindersEnabled() {
        return this._remindersEnabled;
    }
    /**
     * Gets the @odata.type property value. The type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("accessRecommendationsEnabled", this.getAccessRecommendationsEnabled());
        writer.writeIntegerValue("activityDurationInDays", this.getActivityDurationInDays());
        writer.writeBooleanValue("autoApplyReviewResultsEnabled", this.getAutoApplyReviewResultsEnabled());
        writer.writeBooleanValue("autoReviewEnabled", this.getAutoReviewEnabled());
        writer.writeObjectValue("autoReviewSettings", this.getAutoReviewSettings());
        writer.writeBooleanValue("justificationRequiredOnApproval", this.getJustificationRequiredOnApproval());
        writer.writeBooleanValue("mailNotificationsEnabled", this.getMailNotificationsEnabled());
        writer.writeObjectValue("recurrenceSettings", this.getRecurrenceSettings());
        writer.writeBooleanValue("remindersEnabled", this.getRemindersEnabled());
        writer.writeStringValue("@odata.type", this.getType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessRecommendationsEnabled property value. Indicates whether showing recommendations to reviewers is enabled.
     * @param value Value to set for the accessRecommendationsEnabled property.
     * @return a void
     */
    public void setAccessRecommendationsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._accessRecommendationsEnabled = value;
    }
    /**
     * Sets the activityDurationInDays property value. The number of days of user activities to show to reviewers.
     * @param value Value to set for the activityDurationInDays property.
     * @return a void
     */
    public void setActivityDurationInDays(@javax.annotation.Nullable final Integer value) {
        this._activityDurationInDays = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the autoApplyReviewResultsEnabled property value. Indicates whether the auto-apply capability, to automatically change the target object access resource, is enabled.  If not enabled, a user must, after the review completes, apply the access review.
     * @param value Value to set for the autoApplyReviewResultsEnabled property.
     * @return a void
     */
    public void setAutoApplyReviewResultsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._autoApplyReviewResultsEnabled = value;
    }
    /**
     * Sets the autoReviewEnabled property value. Indicates whether a decision should be set if the reviewer did not supply one. For use when auto-apply is enabled. If you don't want to have a review decision recorded unless the reviewer makes an explicit choice, set it to false.
     * @param value Value to set for the autoReviewEnabled property.
     * @return a void
     */
    public void setAutoReviewEnabled(@javax.annotation.Nullable final Boolean value) {
        this._autoReviewEnabled = value;
    }
    /**
     * Sets the autoReviewSettings property value. Detailed settings for how the feature should set the review decision. For use when auto-apply is enabled.
     * @param value Value to set for the autoReviewSettings property.
     * @return a void
     */
    public void setAutoReviewSettings(@javax.annotation.Nullable final AutoReviewSettings value) {
        this._autoReviewSettings = value;
    }
    /**
     * Sets the justificationRequiredOnApproval property value. Indicates whether reviewers are required to provide a justification when reviewing access.
     * @param value Value to set for the justificationRequiredOnApproval property.
     * @return a void
     */
    public void setJustificationRequiredOnApproval(@javax.annotation.Nullable final Boolean value) {
        this._justificationRequiredOnApproval = value;
    }
    /**
     * Sets the mailNotificationsEnabled property value. Indicates whether sending mails to reviewers and the review creator is enabled.
     * @param value Value to set for the mailNotificationsEnabled property.
     * @return a void
     */
    public void setMailNotificationsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._mailNotificationsEnabled = value;
    }
    /**
     * Sets the recurrenceSettings property value. Detailed settings for recurrence.
     * @param value Value to set for the recurrenceSettings property.
     * @return a void
     */
    public void setRecurrenceSettings(@javax.annotation.Nullable final AccessReviewRecurrenceSettings value) {
        this._recurrenceSettings = value;
    }
    /**
     * Sets the remindersEnabled property value. Indicates whether sending reminder emails to reviewers is enabled.
     * @param value Value to set for the remindersEnabled property.
     * @return a void
     */
    public void setRemindersEnabled(@javax.annotation.Nullable final Boolean value) {
        this._remindersEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
}
