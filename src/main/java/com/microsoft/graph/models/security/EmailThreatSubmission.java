package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EmailThreatSubmission extends ThreatSubmission implements Parsable {
    /**
     * If the email is phishing simulation, this field will not be null.
     */
    private AttackSimulationInfo attackSimulationInfo;
    /**
     * Specifies the internet message id of the email being submitted. This information is present in the email header.
     */
    private String internetMessageId;
    /**
     * The original category of the submission. The possible values are: notJunk, spam, phishing, malware and unkownFutureValue.
     */
    private SubmissionCategory originalCategory;
    /**
     * Specifies the date and time stamp when the email was received.
     */
    private OffsetDateTime receivedDateTime;
    /**
     * Specifies the email address (in smtp format) of the recipient who received the email.
     */
    private String recipientEmailAddress;
    /**
     * Specifies the email address of the sender.
     */
    private String sender;
    /**
     * Specifies the IP address of the sender.
     */
    private String senderIP;
    /**
     * Specifies the subject of the email .
     */
    private String subject;
    /**
     * It is used to automatically add allows for the components such as URL, file, sender; which are deemed bad by Microsoft so that similar messages in the future can be allowed.
     */
    private TenantAllowOrBlockListAction tenantAllowOrBlockListAction;
    /**
     * Instantiates a new EmailThreatSubmission and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EmailThreatSubmission() {
        super();
        this.setOdataType("#microsoft.graph.security.emailThreatSubmission");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EmailThreatSubmission
     */
    @javax.annotation.Nonnull
    public static EmailThreatSubmission createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * Gets the attackSimulationInfo property value. If the email is phishing simulation, this field will not be null.
     * @return a attackSimulationInfo
     */
    @javax.annotation.Nullable
    public AttackSimulationInfo getAttackSimulationInfo() {
        return this.attackSimulationInfo;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("attackSimulationInfo", (n) -> { this.setAttackSimulationInfo(n.getObjectValue(AttackSimulationInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("internetMessageId", (n) -> { this.setInternetMessageId(n.getStringValue()); });
        deserializerMap.put("originalCategory", (n) -> { this.setOriginalCategory(n.getEnumValue(SubmissionCategory.class)); });
        deserializerMap.put("receivedDateTime", (n) -> { this.setReceivedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("recipientEmailAddress", (n) -> { this.setRecipientEmailAddress(n.getStringValue()); });
        deserializerMap.put("sender", (n) -> { this.setSender(n.getStringValue()); });
        deserializerMap.put("senderIP", (n) -> { this.setSenderIP(n.getStringValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        deserializerMap.put("tenantAllowOrBlockListAction", (n) -> { this.setTenantAllowOrBlockListAction(n.getObjectValue(TenantAllowOrBlockListAction::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the internetMessageId property value. Specifies the internet message id of the email being submitted. This information is present in the email header.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInternetMessageId() {
        return this.internetMessageId;
    }
    /**
     * Gets the originalCategory property value. The original category of the submission. The possible values are: notJunk, spam, phishing, malware and unkownFutureValue.
     * @return a submissionCategory
     */
    @javax.annotation.Nullable
    public SubmissionCategory getOriginalCategory() {
        return this.originalCategory;
    }
    /**
     * Gets the receivedDateTime property value. Specifies the date and time stamp when the email was received.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReceivedDateTime() {
        return this.receivedDateTime;
    }
    /**
     * Gets the recipientEmailAddress property value. Specifies the email address (in smtp format) of the recipient who received the email.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecipientEmailAddress() {
        return this.recipientEmailAddress;
    }
    /**
     * Gets the sender property value. Specifies the email address of the sender.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSender() {
        return this.sender;
    }
    /**
     * Gets the senderIP property value. Specifies the IP address of the sender.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSenderIP() {
        return this.senderIP;
    }
    /**
     * Gets the subject property value. Specifies the subject of the email .
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubject() {
        return this.subject;
    }
    /**
     * Gets the tenantAllowOrBlockListAction property value. It is used to automatically add allows for the components such as URL, file, sender; which are deemed bad by Microsoft so that similar messages in the future can be allowed.
     * @return a tenantAllowOrBlockListAction
     */
    @javax.annotation.Nullable
    public TenantAllowOrBlockListAction getTenantAllowOrBlockListAction() {
        return this.tenantAllowOrBlockListAction;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the attackSimulationInfo property value. If the email is phishing simulation, this field will not be null.
     * @param value Value to set for the attackSimulationInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttackSimulationInfo(@javax.annotation.Nullable final AttackSimulationInfo value) {
        this.attackSimulationInfo = value;
    }
    /**
     * Sets the internetMessageId property value. Specifies the internet message id of the email being submitted. This information is present in the email header.
     * @param value Value to set for the internetMessageId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInternetMessageId(@javax.annotation.Nullable final String value) {
        this.internetMessageId = value;
    }
    /**
     * Sets the originalCategory property value. The original category of the submission. The possible values are: notJunk, spam, phishing, malware and unkownFutureValue.
     * @param value Value to set for the originalCategory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOriginalCategory(@javax.annotation.Nullable final SubmissionCategory value) {
        this.originalCategory = value;
    }
    /**
     * Sets the receivedDateTime property value. Specifies the date and time stamp when the email was received.
     * @param value Value to set for the receivedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReceivedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.receivedDateTime = value;
    }
    /**
     * Sets the recipientEmailAddress property value. Specifies the email address (in smtp format) of the recipient who received the email.
     * @param value Value to set for the recipientEmailAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecipientEmailAddress(@javax.annotation.Nullable final String value) {
        this.recipientEmailAddress = value;
    }
    /**
     * Sets the sender property value. Specifies the email address of the sender.
     * @param value Value to set for the sender property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSender(@javax.annotation.Nullable final String value) {
        this.sender = value;
    }
    /**
     * Sets the senderIP property value. Specifies the IP address of the sender.
     * @param value Value to set for the senderIP property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSenderIP(@javax.annotation.Nullable final String value) {
        this.senderIP = value;
    }
    /**
     * Sets the subject property value. Specifies the subject of the email .
     * @param value Value to set for the subject property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubject(@javax.annotation.Nullable final String value) {
        this.subject = value;
    }
    /**
     * Sets the tenantAllowOrBlockListAction property value. It is used to automatically add allows for the components such as URL, file, sender; which are deemed bad by Microsoft so that similar messages in the future can be allowed.
     * @param value Value to set for the tenantAllowOrBlockListAction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantAllowOrBlockListAction(@javax.annotation.Nullable final TenantAllowOrBlockListAction value) {
        this.tenantAllowOrBlockListAction = value;
    }
}
