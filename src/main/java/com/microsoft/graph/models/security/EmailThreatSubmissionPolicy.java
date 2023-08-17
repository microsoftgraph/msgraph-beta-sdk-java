package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EmailThreatSubmissionPolicy extends Entity implements Parsable {
    /**
     * Specifies the email address of the sender from which email notifications will be sent to end users to inform them whether an email is spam, phish or clean. The default value is null. Optional for creation.
     */
    private String customizedNotificationSenderEmailAddress;
    /**
     * Specifies the destination where the reported messages from end users will land whenever they report something as phish, junk or not junk. The default value is null. Optional for creation.
     */
    private String customizedReportRecipientEmailAddress;
    /**
     * Indicates whether end users can report a message as spam, phish or junk directly without a confirmation(popup). The default value is true.  Optional for creation.
     */
    private Boolean isAlwaysReportEnabledForUsers;
    /**
     * Indicates whether end users can confirm using a popup before reporting messages as spam, phish or not junk. The default value is true.  Optional for creation.
     */
    private Boolean isAskMeEnabledForUsers;
    /**
     * Indicates whether the email notifications sent to end users to inform them if an email is phish, spam or junk is customized or not. The default value is false. Optional for creation.
     */
    private Boolean isCustomizedMessageEnabled;
    /**
     * If enabled, customized message only shows when email is reported as phishing. The default value is false. Optional for creation.
     */
    private Boolean isCustomizedMessageEnabledForPhishing;
    /**
     * Indicates whether to use the sender email address set using customizedNotificationSenderEmailAddress for sending email notifications to end users. The default value is false. Optional for creation.
     */
    private Boolean isCustomizedNotificationSenderEnabled;
    /**
     * Indicates whether end users can simply move the message from one folder to another based on the action of spam, phish or not junk without actually reporting it. The default value is true. Optional for creation.
     */
    private Boolean isNeverReportEnabledForUsers;
    /**
     * Indicates whether the branding logo should be used in the email notifications sent to end users. The default value is false. Optional for creation.
     */
    private Boolean isOrganizationBrandingEnabled;
    /**
     * Indicates whether end users can submit from the quarantine page. The default value is true. Optional for creation.
     */
    private Boolean isReportFromQuarantineEnabled;
    /**
     * Indicates whether emails reported by end users should be send to the custom mailbox configured using customizedReportRecipientEmailAddress.  The default value is false. Optional for creation.
     */
    private Boolean isReportToCustomizedEmailAddressEnabled;
    /**
     * If enabled, the email will be sent to Microsoft for analysis. The default value is false. Required for creation.
     */
    private Boolean isReportToMicrosoftEnabled;
    /**
     * Indicates whether an email notification is sent to the end user who reported the email when it has been reviewed by the admin. The default value is false. Optional for creation.
     */
    private Boolean isReviewEmailNotificationEnabled;
    /**
     * Instantiates a new emailThreatSubmissionPolicy and sets the default values.
     */
    public EmailThreatSubmissionPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a emailThreatSubmissionPolicy
     */
    @jakarta.annotation.Nonnull
    public static EmailThreatSubmissionPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmailThreatSubmissionPolicy();
    }
    /**
     * Gets the customizedNotificationSenderEmailAddress property value. Specifies the email address of the sender from which email notifications will be sent to end users to inform them whether an email is spam, phish or clean. The default value is null. Optional for creation.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCustomizedNotificationSenderEmailAddress() {
        return this.customizedNotificationSenderEmailAddress;
    }
    /**
     * Gets the customizedReportRecipientEmailAddress property value. Specifies the destination where the reported messages from end users will land whenever they report something as phish, junk or not junk. The default value is null. Optional for creation.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCustomizedReportRecipientEmailAddress() {
        return this.customizedReportRecipientEmailAddress;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customizedNotificationSenderEmailAddress", (n) -> { this.setCustomizedNotificationSenderEmailAddress(n.getStringValue()); });
        deserializerMap.put("customizedReportRecipientEmailAddress", (n) -> { this.setCustomizedReportRecipientEmailAddress(n.getStringValue()); });
        deserializerMap.put("isAlwaysReportEnabledForUsers", (n) -> { this.setIsAlwaysReportEnabledForUsers(n.getBooleanValue()); });
        deserializerMap.put("isAskMeEnabledForUsers", (n) -> { this.setIsAskMeEnabledForUsers(n.getBooleanValue()); });
        deserializerMap.put("isCustomizedMessageEnabled", (n) -> { this.setIsCustomizedMessageEnabled(n.getBooleanValue()); });
        deserializerMap.put("isCustomizedMessageEnabledForPhishing", (n) -> { this.setIsCustomizedMessageEnabledForPhishing(n.getBooleanValue()); });
        deserializerMap.put("isCustomizedNotificationSenderEnabled", (n) -> { this.setIsCustomizedNotificationSenderEnabled(n.getBooleanValue()); });
        deserializerMap.put("isNeverReportEnabledForUsers", (n) -> { this.setIsNeverReportEnabledForUsers(n.getBooleanValue()); });
        deserializerMap.put("isOrganizationBrandingEnabled", (n) -> { this.setIsOrganizationBrandingEnabled(n.getBooleanValue()); });
        deserializerMap.put("isReportFromQuarantineEnabled", (n) -> { this.setIsReportFromQuarantineEnabled(n.getBooleanValue()); });
        deserializerMap.put("isReportToCustomizedEmailAddressEnabled", (n) -> { this.setIsReportToCustomizedEmailAddressEnabled(n.getBooleanValue()); });
        deserializerMap.put("isReportToMicrosoftEnabled", (n) -> { this.setIsReportToMicrosoftEnabled(n.getBooleanValue()); });
        deserializerMap.put("isReviewEmailNotificationEnabled", (n) -> { this.setIsReviewEmailNotificationEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isAlwaysReportEnabledForUsers property value. Indicates whether end users can report a message as spam, phish or junk directly without a confirmation(popup). The default value is true.  Optional for creation.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAlwaysReportEnabledForUsers() {
        return this.isAlwaysReportEnabledForUsers;
    }
    /**
     * Gets the isAskMeEnabledForUsers property value. Indicates whether end users can confirm using a popup before reporting messages as spam, phish or not junk. The default value is true.  Optional for creation.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAskMeEnabledForUsers() {
        return this.isAskMeEnabledForUsers;
    }
    /**
     * Gets the isCustomizedMessageEnabled property value. Indicates whether the email notifications sent to end users to inform them if an email is phish, spam or junk is customized or not. The default value is false. Optional for creation.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCustomizedMessageEnabled() {
        return this.isCustomizedMessageEnabled;
    }
    /**
     * Gets the isCustomizedMessageEnabledForPhishing property value. If enabled, customized message only shows when email is reported as phishing. The default value is false. Optional for creation.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCustomizedMessageEnabledForPhishing() {
        return this.isCustomizedMessageEnabledForPhishing;
    }
    /**
     * Gets the isCustomizedNotificationSenderEnabled property value. Indicates whether to use the sender email address set using customizedNotificationSenderEmailAddress for sending email notifications to end users. The default value is false. Optional for creation.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCustomizedNotificationSenderEnabled() {
        return this.isCustomizedNotificationSenderEnabled;
    }
    /**
     * Gets the isNeverReportEnabledForUsers property value. Indicates whether end users can simply move the message from one folder to another based on the action of spam, phish or not junk without actually reporting it. The default value is true. Optional for creation.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsNeverReportEnabledForUsers() {
        return this.isNeverReportEnabledForUsers;
    }
    /**
     * Gets the isOrganizationBrandingEnabled property value. Indicates whether the branding logo should be used in the email notifications sent to end users. The default value is false. Optional for creation.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsOrganizationBrandingEnabled() {
        return this.isOrganizationBrandingEnabled;
    }
    /**
     * Gets the isReportFromQuarantineEnabled property value. Indicates whether end users can submit from the quarantine page. The default value is true. Optional for creation.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsReportFromQuarantineEnabled() {
        return this.isReportFromQuarantineEnabled;
    }
    /**
     * Gets the isReportToCustomizedEmailAddressEnabled property value. Indicates whether emails reported by end users should be send to the custom mailbox configured using customizedReportRecipientEmailAddress.  The default value is false. Optional for creation.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsReportToCustomizedEmailAddressEnabled() {
        return this.isReportToCustomizedEmailAddressEnabled;
    }
    /**
     * Gets the isReportToMicrosoftEnabled property value. If enabled, the email will be sent to Microsoft for analysis. The default value is false. Required for creation.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsReportToMicrosoftEnabled() {
        return this.isReportToMicrosoftEnabled;
    }
    /**
     * Gets the isReviewEmailNotificationEnabled property value. Indicates whether an email notification is sent to the end user who reported the email when it has been reviewed by the admin. The default value is false. Optional for creation.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsReviewEmailNotificationEnabled() {
        return this.isReviewEmailNotificationEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the customizedNotificationSenderEmailAddress property value. Specifies the email address of the sender from which email notifications will be sent to end users to inform them whether an email is spam, phish or clean. The default value is null. Optional for creation.
     * @param value Value to set for the customizedNotificationSenderEmailAddress property.
     */
    public void setCustomizedNotificationSenderEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.customizedNotificationSenderEmailAddress = value;
    }
    /**
     * Sets the customizedReportRecipientEmailAddress property value. Specifies the destination where the reported messages from end users will land whenever they report something as phish, junk or not junk. The default value is null. Optional for creation.
     * @param value Value to set for the customizedReportRecipientEmailAddress property.
     */
    public void setCustomizedReportRecipientEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.customizedReportRecipientEmailAddress = value;
    }
    /**
     * Sets the isAlwaysReportEnabledForUsers property value. Indicates whether end users can report a message as spam, phish or junk directly without a confirmation(popup). The default value is true.  Optional for creation.
     * @param value Value to set for the isAlwaysReportEnabledForUsers property.
     */
    public void setIsAlwaysReportEnabledForUsers(@jakarta.annotation.Nullable final Boolean value) {
        this.isAlwaysReportEnabledForUsers = value;
    }
    /**
     * Sets the isAskMeEnabledForUsers property value. Indicates whether end users can confirm using a popup before reporting messages as spam, phish or not junk. The default value is true.  Optional for creation.
     * @param value Value to set for the isAskMeEnabledForUsers property.
     */
    public void setIsAskMeEnabledForUsers(@jakarta.annotation.Nullable final Boolean value) {
        this.isAskMeEnabledForUsers = value;
    }
    /**
     * Sets the isCustomizedMessageEnabled property value. Indicates whether the email notifications sent to end users to inform them if an email is phish, spam or junk is customized or not. The default value is false. Optional for creation.
     * @param value Value to set for the isCustomizedMessageEnabled property.
     */
    public void setIsCustomizedMessageEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isCustomizedMessageEnabled = value;
    }
    /**
     * Sets the isCustomizedMessageEnabledForPhishing property value. If enabled, customized message only shows when email is reported as phishing. The default value is false. Optional for creation.
     * @param value Value to set for the isCustomizedMessageEnabledForPhishing property.
     */
    public void setIsCustomizedMessageEnabledForPhishing(@jakarta.annotation.Nullable final Boolean value) {
        this.isCustomizedMessageEnabledForPhishing = value;
    }
    /**
     * Sets the isCustomizedNotificationSenderEnabled property value. Indicates whether to use the sender email address set using customizedNotificationSenderEmailAddress for sending email notifications to end users. The default value is false. Optional for creation.
     * @param value Value to set for the isCustomizedNotificationSenderEnabled property.
     */
    public void setIsCustomizedNotificationSenderEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isCustomizedNotificationSenderEnabled = value;
    }
    /**
     * Sets the isNeverReportEnabledForUsers property value. Indicates whether end users can simply move the message from one folder to another based on the action of spam, phish or not junk without actually reporting it. The default value is true. Optional for creation.
     * @param value Value to set for the isNeverReportEnabledForUsers property.
     */
    public void setIsNeverReportEnabledForUsers(@jakarta.annotation.Nullable final Boolean value) {
        this.isNeverReportEnabledForUsers = value;
    }
    /**
     * Sets the isOrganizationBrandingEnabled property value. Indicates whether the branding logo should be used in the email notifications sent to end users. The default value is false. Optional for creation.
     * @param value Value to set for the isOrganizationBrandingEnabled property.
     */
    public void setIsOrganizationBrandingEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isOrganizationBrandingEnabled = value;
    }
    /**
     * Sets the isReportFromQuarantineEnabled property value. Indicates whether end users can submit from the quarantine page. The default value is true. Optional for creation.
     * @param value Value to set for the isReportFromQuarantineEnabled property.
     */
    public void setIsReportFromQuarantineEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isReportFromQuarantineEnabled = value;
    }
    /**
     * Sets the isReportToCustomizedEmailAddressEnabled property value. Indicates whether emails reported by end users should be send to the custom mailbox configured using customizedReportRecipientEmailAddress.  The default value is false. Optional for creation.
     * @param value Value to set for the isReportToCustomizedEmailAddressEnabled property.
     */
    public void setIsReportToCustomizedEmailAddressEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isReportToCustomizedEmailAddressEnabled = value;
    }
    /**
     * Sets the isReportToMicrosoftEnabled property value. If enabled, the email will be sent to Microsoft for analysis. The default value is false. Required for creation.
     * @param value Value to set for the isReportToMicrosoftEnabled property.
     */
    public void setIsReportToMicrosoftEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isReportToMicrosoftEnabled = value;
    }
    /**
     * Sets the isReviewEmailNotificationEnabled property value. Indicates whether an email notification is sent to the end user who reported the email when it has been reviewed by the admin. The default value is false. Optional for creation.
     * @param value Value to set for the isReviewEmailNotificationEnabled property.
     */
    public void setIsReviewEmailNotificationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isReviewEmailNotificationEnabled = value;
    }
}
