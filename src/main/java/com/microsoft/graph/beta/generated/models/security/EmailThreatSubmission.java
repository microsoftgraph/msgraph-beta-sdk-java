package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EmailThreatSubmission extends ThreatSubmission implements Parsable {
    /**
     * Instantiates a new EmailThreatSubmission and sets the default values.
     */
    public EmailThreatSubmission() {
        super();
        this.setOdataType("#microsoft.graph.security.emailThreatSubmission");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EmailThreatSubmission
     */
    @jakarta.annotation.Nonnull
    public static EmailThreatSubmission createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.emailContentThreatSubmission": return new EmailContentThreatSubmission();
                case "#microsoft.graph.security.emailUrlThreatSubmission": return new EmailUrlThreatSubmission();
            }
        }
        return new EmailThreatSubmission();
    }
    /**
     * Gets the attackSimulationInfo property value. If the email is phishing simulation, this field won't be null.
     * @return a AttackSimulationInfo
     */
    @jakarta.annotation.Nullable
    public AttackSimulationInfo getAttackSimulationInfo() {
        return this.backingStore.get("attackSimulationInfo");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("attackSimulationInfo", (n) -> { this.setAttackSimulationInfo(n.getObjectValue(AttackSimulationInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("internetMessageId", (n) -> { this.setInternetMessageId(n.getStringValue()); });
        deserializerMap.put("originalCategory", (n) -> { this.setOriginalCategory(n.getEnumValue(EmailThreatSubmissionOriginalCategory::forValue)); });
        deserializerMap.put("receivedDateTime", (n) -> { this.setReceivedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("recipientEmailAddress", (n) -> { this.setRecipientEmailAddress(n.getStringValue()); });
        deserializerMap.put("sender", (n) -> { this.setSender(n.getStringValue()); });
        deserializerMap.put("senderIP", (n) -> { this.setSenderIP(n.getStringValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        deserializerMap.put("tenantAllowOrBlockListAction", (n) -> { this.setTenantAllowOrBlockListAction(n.getObjectValue(TenantAllowOrBlockListAction::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the internetMessageId property value. Specifies the internet message ID of the email being submitted. This information is present in the email header.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInternetMessageId() {
        return this.backingStore.get("internetMessageId");
    }
    /**
     * Gets the originalCategory property value. The original category of the submission. The possible values are: notJunk, spam, phishing, malware and unkownFutureValue.
     * @return a EmailThreatSubmissionOriginalCategory
     */
    @jakarta.annotation.Nullable
    public EmailThreatSubmissionOriginalCategory getOriginalCategory() {
        return this.backingStore.get("originalCategory");
    }
    /**
     * Gets the receivedDateTime property value. Specifies the date and time stamp when the email was received.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReceivedDateTime() {
        return this.backingStore.get("receivedDateTime");
    }
    /**
     * Gets the recipientEmailAddress property value. Specifies the email address (in smtp format) of the recipient who received the email.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRecipientEmailAddress() {
        return this.backingStore.get("recipientEmailAddress");
    }
    /**
     * Gets the sender property value. Specifies the email address of the sender.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSender() {
        return this.backingStore.get("sender");
    }
    /**
     * Gets the senderIP property value. Specifies the IP address of the sender.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSenderIP() {
        return this.backingStore.get("senderIP");
    }
    /**
     * Gets the subject property value. Specifies the subject of the email.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.backingStore.get("subject");
    }
    /**
     * Gets the tenantAllowOrBlockListAction property value. It's used to automatically add allows for the components such as URL, file, sender; which are deemed bad by Microsoft so that similar messages in the future can be allowed.
     * @return a TenantAllowOrBlockListAction
     */
    @jakarta.annotation.Nullable
    public TenantAllowOrBlockListAction getTenantAllowOrBlockListAction() {
        return this.backingStore.get("tenantAllowOrBlockListAction");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("attackSimulationInfo", this.getAttackSimulationInfo());
        writer.writeStringValue("internetMessageId", this.getInternetMessageId());
        writer.writeEnumValue("originalCategory", this.getOriginalCategory());
        writer.writeOffsetDateTimeValue("receivedDateTime", this.getReceivedDateTime());
        writer.writeStringValue("recipientEmailAddress", this.getRecipientEmailAddress());
        writer.writeStringValue("sender", this.getSender());
        writer.writeStringValue("senderIP", this.getSenderIP());
        writer.writeStringValue("subject", this.getSubject());
        writer.writeObjectValue("tenantAllowOrBlockListAction", this.getTenantAllowOrBlockListAction());
    }
    /**
     * Sets the attackSimulationInfo property value. If the email is phishing simulation, this field won't be null.
     * @param value Value to set for the attackSimulationInfo property.
     */
    public void setAttackSimulationInfo(@jakarta.annotation.Nullable final AttackSimulationInfo value) {
        this.backingStore.set("attackSimulationInfo", value);
    }
    /**
     * Sets the internetMessageId property value. Specifies the internet message ID of the email being submitted. This information is present in the email header.
     * @param value Value to set for the internetMessageId property.
     */
    public void setInternetMessageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("internetMessageId", value);
    }
    /**
     * Sets the originalCategory property value. The original category of the submission. The possible values are: notJunk, spam, phishing, malware and unkownFutureValue.
     * @param value Value to set for the originalCategory property.
     */
    public void setOriginalCategory(@jakarta.annotation.Nullable final EmailThreatSubmissionOriginalCategory value) {
        this.backingStore.set("originalCategory", value);
    }
    /**
     * Sets the receivedDateTime property value. Specifies the date and time stamp when the email was received.
     * @param value Value to set for the receivedDateTime property.
     */
    public void setReceivedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("receivedDateTime", value);
    }
    /**
     * Sets the recipientEmailAddress property value. Specifies the email address (in smtp format) of the recipient who received the email.
     * @param value Value to set for the recipientEmailAddress property.
     */
    public void setRecipientEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("recipientEmailAddress", value);
    }
    /**
     * Sets the sender property value. Specifies the email address of the sender.
     * @param value Value to set for the sender property.
     */
    public void setSender(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sender", value);
    }
    /**
     * Sets the senderIP property value. Specifies the IP address of the sender.
     * @param value Value to set for the senderIP property.
     */
    public void setSenderIP(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("senderIP", value);
    }
    /**
     * Sets the subject property value. Specifies the subject of the email.
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subject", value);
    }
    /**
     * Sets the tenantAllowOrBlockListAction property value. It's used to automatically add allows for the components such as URL, file, sender; which are deemed bad by Microsoft so that similar messages in the future can be allowed.
     * @param value Value to set for the tenantAllowOrBlockListAction property.
     */
    public void setTenantAllowOrBlockListAction(@jakarta.annotation.Nullable final TenantAllowOrBlockListAction value) {
        this.backingStore.set("tenantAllowOrBlockListAction", value);
    }
}
