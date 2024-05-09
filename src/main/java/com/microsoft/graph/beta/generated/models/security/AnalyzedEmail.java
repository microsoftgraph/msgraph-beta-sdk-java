package com.microsoft.graph.beta.models.security;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AnalyzedEmail extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AnalyzedEmail} and sets the default values.
     */
    public AnalyzedEmail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AnalyzedEmail}
     */
    @jakarta.annotation.Nonnull
    public static AnalyzedEmail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AnalyzedEmail();
    }
    /**
     * Gets the alertIds property value. A collection of values that contain the IDs of any alerts associated with the email.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAlertIds() {
        return this.backingStore.get("alertIds");
    }
    /**
     * Gets the attachments property value. A collection of the attachments in the email.
     * @return a {@link java.util.List<AnalyzedEmailAttachment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AnalyzedEmailAttachment> getAttachments() {
        return this.backingStore.get("attachments");
    }
    /**
     * Gets the attachmentsCount property value. The number of attachments in the email.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAttachmentsCount() {
        return this.backingStore.get("attachmentsCount");
    }
    /**
     * Gets the authenticationDetails property value. The authentication details associated with the email.
     * @return a {@link AnalyzedEmailAuthenticationDetail}
     */
    @jakarta.annotation.Nullable
    public AnalyzedEmailAuthenticationDetail getAuthenticationDetails() {
        return this.backingStore.get("authenticationDetails");
    }
    /**
     * Gets the bulkComplaintLevel property value. The bulk complaint level of the email. A higher level is more likely to be spam.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBulkComplaintLevel() {
        return this.backingStore.get("bulkComplaintLevel");
    }
    /**
     * Gets the contexts property value. Provides context of the email.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getContexts() {
        return this.backingStore.get("contexts");
    }
    /**
     * Gets the detectionMethods property value. The methods of detection used.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDetectionMethods() {
        return this.backingStore.get("detectionMethods");
    }
    /**
     * Gets the directionality property value. The direction of the emails. The possible values are: unknown, inbound, outbound, intraOrg, unknownFutureValue.
     * @return a {@link AntispamDirectionality}
     */
    @jakarta.annotation.Nullable
    public AntispamDirectionality getDirectionality() {
        return this.backingStore.get("directionality");
    }
    /**
     * Gets the distributionList property value. The distribution list details to which the email was sent.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDistributionList() {
        return this.backingStore.get("distributionList");
    }
    /**
     * Gets the emailClusterId property value. The identifier for the group of similar emails clustered based on heuristic analysis of their content.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmailClusterId() {
        return this.backingStore.get("emailClusterId");
    }
    /**
     * Gets the exchangeTransportRules property value. The name of the Exchange transport rules (ETRs) associated with the email.
     * @return a {@link java.util.List<AnalyzedEmailExchangeTransportRuleInfo>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AnalyzedEmailExchangeTransportRuleInfo> getExchangeTransportRules() {
        return this.backingStore.get("exchangeTransportRules");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alertIds", (n) -> { this.setAlertIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("attachments", (n) -> { this.setAttachments(n.getCollectionOfObjectValues(AnalyzedEmailAttachment::createFromDiscriminatorValue)); });
        deserializerMap.put("attachmentsCount", (n) -> { this.setAttachmentsCount(n.getIntegerValue()); });
        deserializerMap.put("authenticationDetails", (n) -> { this.setAuthenticationDetails(n.getObjectValue(AnalyzedEmailAuthenticationDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("bulkComplaintLevel", (n) -> { this.setBulkComplaintLevel(n.getStringValue()); });
        deserializerMap.put("contexts", (n) -> { this.setContexts(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("detectionMethods", (n) -> { this.setDetectionMethods(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("directionality", (n) -> { this.setDirectionality(n.getEnumValue(AntispamDirectionality::forValue)); });
        deserializerMap.put("distributionList", (n) -> { this.setDistributionList(n.getStringValue()); });
        deserializerMap.put("emailClusterId", (n) -> { this.setEmailClusterId(n.getStringValue()); });
        deserializerMap.put("exchangeTransportRules", (n) -> { this.setExchangeTransportRules(n.getCollectionOfObjectValues(AnalyzedEmailExchangeTransportRuleInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("internetMessageId", (n) -> { this.setInternetMessageId(n.getStringValue()); });
        deserializerMap.put("language", (n) -> { this.setLanguage(n.getStringValue()); });
        deserializerMap.put("latestDelivery", (n) -> { this.setLatestDelivery(n.getObjectValue(AnalyzedEmailDeliveryDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("loggedDateTime", (n) -> { this.setLoggedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("networkMessageId", (n) -> { this.setNetworkMessageId(n.getStringValue()); });
        deserializerMap.put("originalDelivery", (n) -> { this.setOriginalDelivery(n.getObjectValue(AnalyzedEmailDeliveryDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("overrideSources", (n) -> { this.setOverrideSources(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("phishConfidenceLevel", (n) -> { this.setPhishConfidenceLevel(n.getStringValue()); });
        deserializerMap.put("policy", (n) -> { this.setPolicy(n.getStringValue()); });
        deserializerMap.put("policyAction", (n) -> { this.setPolicyAction(n.getStringValue()); });
        deserializerMap.put("recipientEmailAddress", (n) -> { this.setRecipientEmailAddress(n.getStringValue()); });
        deserializerMap.put("returnPath", (n) -> { this.setReturnPath(n.getStringValue()); });
        deserializerMap.put("senderDetail", (n) -> { this.setSenderDetail(n.getObjectValue(AnalyzedEmailSenderDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("sizeInBytes", (n) -> { this.setSizeInBytes(n.getIntegerValue()); });
        deserializerMap.put("spamConfidenceLevel", (n) -> { this.setSpamConfidenceLevel(n.getStringValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        deserializerMap.put("threatTypes", (n) -> { this.setThreatTypes(n.getCollectionOfEnumValues(ThreatType::forValue)); });
        deserializerMap.put("urls", (n) -> { this.setUrls(n.getCollectionOfObjectValues(AnalyzedEmailUrl::createFromDiscriminatorValue)); });
        deserializerMap.put("urlsCount", (n) -> { this.setUrlsCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the internetMessageId property value. A public-facing identifier for the email that is sent. The message ID is in the format specified by RFC2822.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInternetMessageId() {
        return this.backingStore.get("internetMessageId");
    }
    /**
     * Gets the language property value. The detected language of the email content.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLanguage() {
        return this.backingStore.get("language");
    }
    /**
     * Gets the latestDelivery property value. The latest delivery details of the email.
     * @return a {@link AnalyzedEmailDeliveryDetail}
     */
    @jakarta.annotation.Nullable
    public AnalyzedEmailDeliveryDetail getLatestDelivery() {
        return this.backingStore.get("latestDelivery");
    }
    /**
     * Gets the loggedDateTime property value. Date-time when the email record was logged.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLoggedDateTime() {
        return this.backingStore.get("loggedDateTime");
    }
    /**
     * Gets the networkMessageId property value. An internal identifier for the email generated by Microsoft 365.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNetworkMessageId() {
        return this.backingStore.get("networkMessageId");
    }
    /**
     * Gets the originalDelivery property value. The original delivery details of the email.
     * @return a {@link AnalyzedEmailDeliveryDetail}
     */
    @jakarta.annotation.Nullable
    public AnalyzedEmailDeliveryDetail getOriginalDelivery() {
        return this.backingStore.get("originalDelivery");
    }
    /**
     * Gets the overrideSources property value. An aggregated list of all overrides with source on email.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOverrideSources() {
        return this.backingStore.get("overrideSources");
    }
    /**
     * Gets the phishConfidenceLevel property value. The phish confidence level associated with the email
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhishConfidenceLevel() {
        return this.backingStore.get("phishConfidenceLevel");
    }
    /**
     * Gets the policy property value. The action policy that took effect.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicy() {
        return this.backingStore.get("policy");
    }
    /**
     * Gets the policyAction property value. The action taken on the email based on the configured policy.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyAction() {
        return this.backingStore.get("policyAction");
    }
    /**
     * Gets the recipientEmailAddress property value. Contains the email address of the recipient.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecipientEmailAddress() {
        return this.backingStore.get("recipientEmailAddress");
    }
    /**
     * Gets the returnPath property value. A field that indicates where and how bounced emails are processed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReturnPath() {
        return this.backingStore.get("returnPath");
    }
    /**
     * Gets the senderDetail property value. Sender details of the email.
     * @return a {@link AnalyzedEmailSenderDetail}
     */
    @jakarta.annotation.Nullable
    public AnalyzedEmailSenderDetail getSenderDetail() {
        return this.backingStore.get("senderDetail");
    }
    /**
     * Gets the sizeInBytes property value. Size of the email in bytes.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSizeInBytes() {
        return this.backingStore.get("sizeInBytes");
    }
    /**
     * Gets the spamConfidenceLevel property value. Spam confidence of the email.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSpamConfidenceLevel() {
        return this.backingStore.get("spamConfidenceLevel");
    }
    /**
     * Gets the subject property value. Subject of the email.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.backingStore.get("subject");
    }
    /**
     * Gets the threatTypes property value. Indicates the threat types. The possible values are: unknown, spam, malware, phish, none, unknownFutureValue.
     * @return a {@link java.util.List<ThreatType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ThreatType> getThreatTypes() {
        return this.backingStore.get("threatTypes");
    }
    /**
     * Gets the urls property value. A collection of the URLs in the email.
     * @return a {@link java.util.List<AnalyzedEmailUrl>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AnalyzedEmailUrl> getUrls() {
        return this.backingStore.get("urls");
    }
    /**
     * Gets the urlsCount property value. The number of URLs in the email.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUrlsCount() {
        return this.backingStore.get("urlsCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("alertIds", this.getAlertIds());
        writer.writeCollectionOfObjectValues("attachments", this.getAttachments());
        writer.writeIntegerValue("attachmentsCount", this.getAttachmentsCount());
        writer.writeObjectValue("authenticationDetails", this.getAuthenticationDetails());
        writer.writeStringValue("bulkComplaintLevel", this.getBulkComplaintLevel());
        writer.writeCollectionOfPrimitiveValues("contexts", this.getContexts());
        writer.writeCollectionOfPrimitiveValues("detectionMethods", this.getDetectionMethods());
        writer.writeEnumValue("directionality", this.getDirectionality());
        writer.writeStringValue("distributionList", this.getDistributionList());
        writer.writeStringValue("emailClusterId", this.getEmailClusterId());
        writer.writeCollectionOfObjectValues("exchangeTransportRules", this.getExchangeTransportRules());
        writer.writeStringValue("internetMessageId", this.getInternetMessageId());
        writer.writeStringValue("language", this.getLanguage());
        writer.writeObjectValue("latestDelivery", this.getLatestDelivery());
        writer.writeOffsetDateTimeValue("loggedDateTime", this.getLoggedDateTime());
        writer.writeStringValue("networkMessageId", this.getNetworkMessageId());
        writer.writeObjectValue("originalDelivery", this.getOriginalDelivery());
        writer.writeCollectionOfPrimitiveValues("overrideSources", this.getOverrideSources());
        writer.writeStringValue("phishConfidenceLevel", this.getPhishConfidenceLevel());
        writer.writeStringValue("policy", this.getPolicy());
        writer.writeStringValue("policyAction", this.getPolicyAction());
        writer.writeStringValue("recipientEmailAddress", this.getRecipientEmailAddress());
        writer.writeStringValue("returnPath", this.getReturnPath());
        writer.writeObjectValue("senderDetail", this.getSenderDetail());
        writer.writeIntegerValue("sizeInBytes", this.getSizeInBytes());
        writer.writeStringValue("spamConfidenceLevel", this.getSpamConfidenceLevel());
        writer.writeStringValue("subject", this.getSubject());
        writer.writeCollectionOfEnumValues("threatTypes", this.getThreatTypes());
        writer.writeCollectionOfObjectValues("urls", this.getUrls());
        writer.writeIntegerValue("urlsCount", this.getUrlsCount());
    }
    /**
     * Sets the alertIds property value. A collection of values that contain the IDs of any alerts associated with the email.
     * @param value Value to set for the alertIds property.
     */
    public void setAlertIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("alertIds", value);
    }
    /**
     * Sets the attachments property value. A collection of the attachments in the email.
     * @param value Value to set for the attachments property.
     */
    public void setAttachments(@jakarta.annotation.Nullable final java.util.List<AnalyzedEmailAttachment> value) {
        this.backingStore.set("attachments", value);
    }
    /**
     * Sets the attachmentsCount property value. The number of attachments in the email.
     * @param value Value to set for the attachmentsCount property.
     */
    public void setAttachmentsCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("attachmentsCount", value);
    }
    /**
     * Sets the authenticationDetails property value. The authentication details associated with the email.
     * @param value Value to set for the authenticationDetails property.
     */
    public void setAuthenticationDetails(@jakarta.annotation.Nullable final AnalyzedEmailAuthenticationDetail value) {
        this.backingStore.set("authenticationDetails", value);
    }
    /**
     * Sets the bulkComplaintLevel property value. The bulk complaint level of the email. A higher level is more likely to be spam.
     * @param value Value to set for the bulkComplaintLevel property.
     */
    public void setBulkComplaintLevel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("bulkComplaintLevel", value);
    }
    /**
     * Sets the contexts property value. Provides context of the email.
     * @param value Value to set for the contexts property.
     */
    public void setContexts(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("contexts", value);
    }
    /**
     * Sets the detectionMethods property value. The methods of detection used.
     * @param value Value to set for the detectionMethods property.
     */
    public void setDetectionMethods(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("detectionMethods", value);
    }
    /**
     * Sets the directionality property value. The direction of the emails. The possible values are: unknown, inbound, outbound, intraOrg, unknownFutureValue.
     * @param value Value to set for the directionality property.
     */
    public void setDirectionality(@jakarta.annotation.Nullable final AntispamDirectionality value) {
        this.backingStore.set("directionality", value);
    }
    /**
     * Sets the distributionList property value. The distribution list details to which the email was sent.
     * @param value Value to set for the distributionList property.
     */
    public void setDistributionList(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("distributionList", value);
    }
    /**
     * Sets the emailClusterId property value. The identifier for the group of similar emails clustered based on heuristic analysis of their content.
     * @param value Value to set for the emailClusterId property.
     */
    public void setEmailClusterId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("emailClusterId", value);
    }
    /**
     * Sets the exchangeTransportRules property value. The name of the Exchange transport rules (ETRs) associated with the email.
     * @param value Value to set for the exchangeTransportRules property.
     */
    public void setExchangeTransportRules(@jakarta.annotation.Nullable final java.util.List<AnalyzedEmailExchangeTransportRuleInfo> value) {
        this.backingStore.set("exchangeTransportRules", value);
    }
    /**
     * Sets the internetMessageId property value. A public-facing identifier for the email that is sent. The message ID is in the format specified by RFC2822.
     * @param value Value to set for the internetMessageId property.
     */
    public void setInternetMessageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("internetMessageId", value);
    }
    /**
     * Sets the language property value. The detected language of the email content.
     * @param value Value to set for the language property.
     */
    public void setLanguage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("language", value);
    }
    /**
     * Sets the latestDelivery property value. The latest delivery details of the email.
     * @param value Value to set for the latestDelivery property.
     */
    public void setLatestDelivery(@jakarta.annotation.Nullable final AnalyzedEmailDeliveryDetail value) {
        this.backingStore.set("latestDelivery", value);
    }
    /**
     * Sets the loggedDateTime property value. Date-time when the email record was logged.
     * @param value Value to set for the loggedDateTime property.
     */
    public void setLoggedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("loggedDateTime", value);
    }
    /**
     * Sets the networkMessageId property value. An internal identifier for the email generated by Microsoft 365.
     * @param value Value to set for the networkMessageId property.
     */
    public void setNetworkMessageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("networkMessageId", value);
    }
    /**
     * Sets the originalDelivery property value. The original delivery details of the email.
     * @param value Value to set for the originalDelivery property.
     */
    public void setOriginalDelivery(@jakarta.annotation.Nullable final AnalyzedEmailDeliveryDetail value) {
        this.backingStore.set("originalDelivery", value);
    }
    /**
     * Sets the overrideSources property value. An aggregated list of all overrides with source on email.
     * @param value Value to set for the overrideSources property.
     */
    public void setOverrideSources(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("overrideSources", value);
    }
    /**
     * Sets the phishConfidenceLevel property value. The phish confidence level associated with the email
     * @param value Value to set for the phishConfidenceLevel property.
     */
    public void setPhishConfidenceLevel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("phishConfidenceLevel", value);
    }
    /**
     * Sets the policy property value. The action policy that took effect.
     * @param value Value to set for the policy property.
     */
    public void setPolicy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policy", value);
    }
    /**
     * Sets the policyAction property value. The action taken on the email based on the configured policy.
     * @param value Value to set for the policyAction property.
     */
    public void setPolicyAction(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyAction", value);
    }
    /**
     * Sets the recipientEmailAddress property value. Contains the email address of the recipient.
     * @param value Value to set for the recipientEmailAddress property.
     */
    public void setRecipientEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("recipientEmailAddress", value);
    }
    /**
     * Sets the returnPath property value. A field that indicates where and how bounced emails are processed.
     * @param value Value to set for the returnPath property.
     */
    public void setReturnPath(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("returnPath", value);
    }
    /**
     * Sets the senderDetail property value. Sender details of the email.
     * @param value Value to set for the senderDetail property.
     */
    public void setSenderDetail(@jakarta.annotation.Nullable final AnalyzedEmailSenderDetail value) {
        this.backingStore.set("senderDetail", value);
    }
    /**
     * Sets the sizeInBytes property value. Size of the email in bytes.
     * @param value Value to set for the sizeInBytes property.
     */
    public void setSizeInBytes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("sizeInBytes", value);
    }
    /**
     * Sets the spamConfidenceLevel property value. Spam confidence of the email.
     * @param value Value to set for the spamConfidenceLevel property.
     */
    public void setSpamConfidenceLevel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("spamConfidenceLevel", value);
    }
    /**
     * Sets the subject property value. Subject of the email.
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subject", value);
    }
    /**
     * Sets the threatTypes property value. Indicates the threat types. The possible values are: unknown, spam, malware, phish, none, unknownFutureValue.
     * @param value Value to set for the threatTypes property.
     */
    public void setThreatTypes(@jakarta.annotation.Nullable final java.util.List<ThreatType> value) {
        this.backingStore.set("threatTypes", value);
    }
    /**
     * Sets the urls property value. A collection of the URLs in the email.
     * @param value Value to set for the urls property.
     */
    public void setUrls(@jakarta.annotation.Nullable final java.util.List<AnalyzedEmailUrl> value) {
        this.backingStore.set("urls", value);
    }
    /**
     * Sets the urlsCount property value. The number of URLs in the email.
     * @param value Value to set for the urlsCount property.
     */
    public void setUrlsCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("urlsCount", value);
    }
}
