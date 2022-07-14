package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class EmailThreatSubmissionPolicy extends Entity implements Parsable {
    /** The customizedNotificationSenderEmailAddress property */
    private String _customizedNotificationSenderEmailAddress;
    /** The customizedReportRecipientEmailAddress property */
    private String _customizedReportRecipientEmailAddress;
    /** The isAlwaysReportEnabledForUsers property */
    private Boolean _isAlwaysReportEnabledForUsers;
    /** The isAskMeEnabledForUsers property */
    private Boolean _isAskMeEnabledForUsers;
    /** The isCustomizedMessageEnabled property */
    private Boolean _isCustomizedMessageEnabled;
    /** The isCustomizedMessageEnabledForPhishing property */
    private Boolean _isCustomizedMessageEnabledForPhishing;
    /** The isCustomizedNotificationSenderEnabled property */
    private Boolean _isCustomizedNotificationSenderEnabled;
    /** The isNeverReportEnabledForUsers property */
    private Boolean _isNeverReportEnabledForUsers;
    /** The isOrganizationBrandingEnabled property */
    private Boolean _isOrganizationBrandingEnabled;
    /** The isReportFromQuarantineEnabled property */
    private Boolean _isReportFromQuarantineEnabled;
    /** The isReportToCustomizedEmailAddressEnabled property */
    private Boolean _isReportToCustomizedEmailAddressEnabled;
    /** The isReportToMicrosoftEnabled property */
    private Boolean _isReportToMicrosoftEnabled;
    /** The isReviewEmailNotificationEnabled property */
    private Boolean _isReviewEmailNotificationEnabled;
    /**
     * Instantiates a new emailThreatSubmissionPolicy and sets the default values.
     * @return a void
     */
    public EmailThreatSubmissionPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a emailThreatSubmissionPolicy
     */
    @javax.annotation.Nonnull
    public static EmailThreatSubmissionPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmailThreatSubmissionPolicy();
    }
    /**
     * Gets the customizedNotificationSenderEmailAddress property value. The customizedNotificationSenderEmailAddress property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomizedNotificationSenderEmailAddress() {
        return this._customizedNotificationSenderEmailAddress;
    }
    /**
     * Gets the customizedReportRecipientEmailAddress property value. The customizedReportRecipientEmailAddress property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomizedReportRecipientEmailAddress() {
        return this._customizedReportRecipientEmailAddress;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EmailThreatSubmissionPolicy currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("customizedNotificationSenderEmailAddress", (n) -> { currentObject.setCustomizedNotificationSenderEmailAddress(n.getStringValue()); });
            this.put("customizedReportRecipientEmailAddress", (n) -> { currentObject.setCustomizedReportRecipientEmailAddress(n.getStringValue()); });
            this.put("isAlwaysReportEnabledForUsers", (n) -> { currentObject.setIsAlwaysReportEnabledForUsers(n.getBooleanValue()); });
            this.put("isAskMeEnabledForUsers", (n) -> { currentObject.setIsAskMeEnabledForUsers(n.getBooleanValue()); });
            this.put("isCustomizedMessageEnabled", (n) -> { currentObject.setIsCustomizedMessageEnabled(n.getBooleanValue()); });
            this.put("isCustomizedMessageEnabledForPhishing", (n) -> { currentObject.setIsCustomizedMessageEnabledForPhishing(n.getBooleanValue()); });
            this.put("isCustomizedNotificationSenderEnabled", (n) -> { currentObject.setIsCustomizedNotificationSenderEnabled(n.getBooleanValue()); });
            this.put("isNeverReportEnabledForUsers", (n) -> { currentObject.setIsNeverReportEnabledForUsers(n.getBooleanValue()); });
            this.put("isOrganizationBrandingEnabled", (n) -> { currentObject.setIsOrganizationBrandingEnabled(n.getBooleanValue()); });
            this.put("isReportFromQuarantineEnabled", (n) -> { currentObject.setIsReportFromQuarantineEnabled(n.getBooleanValue()); });
            this.put("isReportToCustomizedEmailAddressEnabled", (n) -> { currentObject.setIsReportToCustomizedEmailAddressEnabled(n.getBooleanValue()); });
            this.put("isReportToMicrosoftEnabled", (n) -> { currentObject.setIsReportToMicrosoftEnabled(n.getBooleanValue()); });
            this.put("isReviewEmailNotificationEnabled", (n) -> { currentObject.setIsReviewEmailNotificationEnabled(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the isAlwaysReportEnabledForUsers property value. The isAlwaysReportEnabledForUsers property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAlwaysReportEnabledForUsers() {
        return this._isAlwaysReportEnabledForUsers;
    }
    /**
     * Gets the isAskMeEnabledForUsers property value. The isAskMeEnabledForUsers property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAskMeEnabledForUsers() {
        return this._isAskMeEnabledForUsers;
    }
    /**
     * Gets the isCustomizedMessageEnabled property value. The isCustomizedMessageEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCustomizedMessageEnabled() {
        return this._isCustomizedMessageEnabled;
    }
    /**
     * Gets the isCustomizedMessageEnabledForPhishing property value. The isCustomizedMessageEnabledForPhishing property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCustomizedMessageEnabledForPhishing() {
        return this._isCustomizedMessageEnabledForPhishing;
    }
    /**
     * Gets the isCustomizedNotificationSenderEnabled property value. The isCustomizedNotificationSenderEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCustomizedNotificationSenderEnabled() {
        return this._isCustomizedNotificationSenderEnabled;
    }
    /**
     * Gets the isNeverReportEnabledForUsers property value. The isNeverReportEnabledForUsers property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsNeverReportEnabledForUsers() {
        return this._isNeverReportEnabledForUsers;
    }
    /**
     * Gets the isOrganizationBrandingEnabled property value. The isOrganizationBrandingEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsOrganizationBrandingEnabled() {
        return this._isOrganizationBrandingEnabled;
    }
    /**
     * Gets the isReportFromQuarantineEnabled property value. The isReportFromQuarantineEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsReportFromQuarantineEnabled() {
        return this._isReportFromQuarantineEnabled;
    }
    /**
     * Gets the isReportToCustomizedEmailAddressEnabled property value. The isReportToCustomizedEmailAddressEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsReportToCustomizedEmailAddressEnabled() {
        return this._isReportToCustomizedEmailAddressEnabled;
    }
    /**
     * Gets the isReportToMicrosoftEnabled property value. The isReportToMicrosoftEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsReportToMicrosoftEnabled() {
        return this._isReportToMicrosoftEnabled;
    }
    /**
     * Gets the isReviewEmailNotificationEnabled property value. The isReviewEmailNotificationEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsReviewEmailNotificationEnabled() {
        return this._isReviewEmailNotificationEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("customizedNotificationSenderEmailAddress", this.getCustomizedNotificationSenderEmailAddress());
        writer.writeStringValue("customizedReportRecipientEmailAddress", this.getCustomizedReportRecipientEmailAddress());
        writer.writeBooleanValue("isAlwaysReportEnabledForUsers", this.getIsAlwaysReportEnabledForUsers());
        writer.writeBooleanValue("isAskMeEnabledForUsers", this.getIsAskMeEnabledForUsers());
        writer.writeBooleanValue("isCustomizedMessageEnabled", this.getIsCustomizedMessageEnabled());
        writer.writeBooleanValue("isCustomizedMessageEnabledForPhishing", this.getIsCustomizedMessageEnabledForPhishing());
        writer.writeBooleanValue("isCustomizedNotificationSenderEnabled", this.getIsCustomizedNotificationSenderEnabled());
        writer.writeBooleanValue("isNeverReportEnabledForUsers", this.getIsNeverReportEnabledForUsers());
        writer.writeBooleanValue("isOrganizationBrandingEnabled", this.getIsOrganizationBrandingEnabled());
        writer.writeBooleanValue("isReportFromQuarantineEnabled", this.getIsReportFromQuarantineEnabled());
        writer.writeBooleanValue("isReportToCustomizedEmailAddressEnabled", this.getIsReportToCustomizedEmailAddressEnabled());
        writer.writeBooleanValue("isReportToMicrosoftEnabled", this.getIsReportToMicrosoftEnabled());
        writer.writeBooleanValue("isReviewEmailNotificationEnabled", this.getIsReviewEmailNotificationEnabled());
    }
    /**
     * Sets the customizedNotificationSenderEmailAddress property value. The customizedNotificationSenderEmailAddress property
     * @param value Value to set for the customizedNotificationSenderEmailAddress property.
     * @return a void
     */
    public void setCustomizedNotificationSenderEmailAddress(@javax.annotation.Nullable final String value) {
        this._customizedNotificationSenderEmailAddress = value;
    }
    /**
     * Sets the customizedReportRecipientEmailAddress property value. The customizedReportRecipientEmailAddress property
     * @param value Value to set for the customizedReportRecipientEmailAddress property.
     * @return a void
     */
    public void setCustomizedReportRecipientEmailAddress(@javax.annotation.Nullable final String value) {
        this._customizedReportRecipientEmailAddress = value;
    }
    /**
     * Sets the isAlwaysReportEnabledForUsers property value. The isAlwaysReportEnabledForUsers property
     * @param value Value to set for the isAlwaysReportEnabledForUsers property.
     * @return a void
     */
    public void setIsAlwaysReportEnabledForUsers(@javax.annotation.Nullable final Boolean value) {
        this._isAlwaysReportEnabledForUsers = value;
    }
    /**
     * Sets the isAskMeEnabledForUsers property value. The isAskMeEnabledForUsers property
     * @param value Value to set for the isAskMeEnabledForUsers property.
     * @return a void
     */
    public void setIsAskMeEnabledForUsers(@javax.annotation.Nullable final Boolean value) {
        this._isAskMeEnabledForUsers = value;
    }
    /**
     * Sets the isCustomizedMessageEnabled property value. The isCustomizedMessageEnabled property
     * @param value Value to set for the isCustomizedMessageEnabled property.
     * @return a void
     */
    public void setIsCustomizedMessageEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isCustomizedMessageEnabled = value;
    }
    /**
     * Sets the isCustomizedMessageEnabledForPhishing property value. The isCustomizedMessageEnabledForPhishing property
     * @param value Value to set for the isCustomizedMessageEnabledForPhishing property.
     * @return a void
     */
    public void setIsCustomizedMessageEnabledForPhishing(@javax.annotation.Nullable final Boolean value) {
        this._isCustomizedMessageEnabledForPhishing = value;
    }
    /**
     * Sets the isCustomizedNotificationSenderEnabled property value. The isCustomizedNotificationSenderEnabled property
     * @param value Value to set for the isCustomizedNotificationSenderEnabled property.
     * @return a void
     */
    public void setIsCustomizedNotificationSenderEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isCustomizedNotificationSenderEnabled = value;
    }
    /**
     * Sets the isNeverReportEnabledForUsers property value. The isNeverReportEnabledForUsers property
     * @param value Value to set for the isNeverReportEnabledForUsers property.
     * @return a void
     */
    public void setIsNeverReportEnabledForUsers(@javax.annotation.Nullable final Boolean value) {
        this._isNeverReportEnabledForUsers = value;
    }
    /**
     * Sets the isOrganizationBrandingEnabled property value. The isOrganizationBrandingEnabled property
     * @param value Value to set for the isOrganizationBrandingEnabled property.
     * @return a void
     */
    public void setIsOrganizationBrandingEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isOrganizationBrandingEnabled = value;
    }
    /**
     * Sets the isReportFromQuarantineEnabled property value. The isReportFromQuarantineEnabled property
     * @param value Value to set for the isReportFromQuarantineEnabled property.
     * @return a void
     */
    public void setIsReportFromQuarantineEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isReportFromQuarantineEnabled = value;
    }
    /**
     * Sets the isReportToCustomizedEmailAddressEnabled property value. The isReportToCustomizedEmailAddressEnabled property
     * @param value Value to set for the isReportToCustomizedEmailAddressEnabled property.
     * @return a void
     */
    public void setIsReportToCustomizedEmailAddressEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isReportToCustomizedEmailAddressEnabled = value;
    }
    /**
     * Sets the isReportToMicrosoftEnabled property value. The isReportToMicrosoftEnabled property
     * @param value Value to set for the isReportToMicrosoftEnabled property.
     * @return a void
     */
    public void setIsReportToMicrosoftEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isReportToMicrosoftEnabled = value;
    }
    /**
     * Sets the isReviewEmailNotificationEnabled property value. The isReviewEmailNotificationEnabled property
     * @param value Value to set for the isReviewEmailNotificationEnabled property.
     * @return a void
     */
    public void setIsReviewEmailNotificationEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isReviewEmailNotificationEnabled = value;
    }
}
