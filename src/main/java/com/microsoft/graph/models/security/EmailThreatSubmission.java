package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EmailThreatSubmission extends ThreatSubmission implements Parsable {
    /** The attackSimulationInfo property */
    private AttackSimulationInfo _attackSimulationInfo;
    /** The internetMessageId property */
    private String _internetMessageId;
    /** The originalCategory property */
    private SubmissionCategory _originalCategory;
    /** The receivedDateTime property */
    private OffsetDateTime _receivedDateTime;
    /** The recipientEmailAddress property */
    private String _recipientEmailAddress;
    /** The sender property */
    private String _sender;
    /** The senderIP property */
    private String _senderIP;
    /** The subject property */
    private String _subject;
    /** The tenantAllowOrBlockListAction property */
    private TenantAllowOrBlockListAction _tenantAllowOrBlockListAction;
    /**
     * Instantiates a new EmailThreatSubmission and sets the default values.
     * @return a void
     */
    public EmailThreatSubmission() {
        super();
        this.setType("#microsoft.graph.security.emailThreatSubmission");
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
     * Gets the attackSimulationInfo property value. The attackSimulationInfo property
     * @return a attackSimulationInfo
     */
    @javax.annotation.Nullable
    public AttackSimulationInfo getAttackSimulationInfo() {
        return this._attackSimulationInfo;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EmailThreatSubmission currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("attackSimulationInfo", (n) -> { currentObject.setAttackSimulationInfo(n.getObjectValue(AttackSimulationInfo::createFromDiscriminatorValue)); });
            this.put("internetMessageId", (n) -> { currentObject.setInternetMessageId(n.getStringValue()); });
            this.put("originalCategory", (n) -> { currentObject.setOriginalCategory(n.getEnumValue(SubmissionCategory.class)); });
            this.put("receivedDateTime", (n) -> { currentObject.setReceivedDateTime(n.getOffsetDateTimeValue()); });
            this.put("recipientEmailAddress", (n) -> { currentObject.setRecipientEmailAddress(n.getStringValue()); });
            this.put("sender", (n) -> { currentObject.setSender(n.getStringValue()); });
            this.put("senderIP", (n) -> { currentObject.setSenderIP(n.getStringValue()); });
            this.put("subject", (n) -> { currentObject.setSubject(n.getStringValue()); });
            this.put("tenantAllowOrBlockListAction", (n) -> { currentObject.setTenantAllowOrBlockListAction(n.getObjectValue(TenantAllowOrBlockListAction::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the internetMessageId property value. The internetMessageId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInternetMessageId() {
        return this._internetMessageId;
    }
    /**
     * Gets the originalCategory property value. The originalCategory property
     * @return a submissionCategory
     */
    @javax.annotation.Nullable
    public SubmissionCategory getOriginalCategory() {
        return this._originalCategory;
    }
    /**
     * Gets the receivedDateTime property value. The receivedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReceivedDateTime() {
        return this._receivedDateTime;
    }
    /**
     * Gets the recipientEmailAddress property value. The recipientEmailAddress property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecipientEmailAddress() {
        return this._recipientEmailAddress;
    }
    /**
     * Gets the sender property value. The sender property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSender() {
        return this._sender;
    }
    /**
     * Gets the senderIP property value. The senderIP property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSenderIP() {
        return this._senderIP;
    }
    /**
     * Gets the subject property value. The subject property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubject() {
        return this._subject;
    }
    /**
     * Gets the tenantAllowOrBlockListAction property value. The tenantAllowOrBlockListAction property
     * @return a tenantAllowOrBlockListAction
     */
    @javax.annotation.Nullable
    public TenantAllowOrBlockListAction getTenantAllowOrBlockListAction() {
        return this._tenantAllowOrBlockListAction;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
     * Sets the attackSimulationInfo property value. The attackSimulationInfo property
     * @param value Value to set for the attackSimulationInfo property.
     * @return a void
     */
    public void setAttackSimulationInfo(@javax.annotation.Nullable final AttackSimulationInfo value) {
        this._attackSimulationInfo = value;
    }
    /**
     * Sets the internetMessageId property value. The internetMessageId property
     * @param value Value to set for the internetMessageId property.
     * @return a void
     */
    public void setInternetMessageId(@javax.annotation.Nullable final String value) {
        this._internetMessageId = value;
    }
    /**
     * Sets the originalCategory property value. The originalCategory property
     * @param value Value to set for the originalCategory property.
     * @return a void
     */
    public void setOriginalCategory(@javax.annotation.Nullable final SubmissionCategory value) {
        this._originalCategory = value;
    }
    /**
     * Sets the receivedDateTime property value. The receivedDateTime property
     * @param value Value to set for the receivedDateTime property.
     * @return a void
     */
    public void setReceivedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._receivedDateTime = value;
    }
    /**
     * Sets the recipientEmailAddress property value. The recipientEmailAddress property
     * @param value Value to set for the recipientEmailAddress property.
     * @return a void
     */
    public void setRecipientEmailAddress(@javax.annotation.Nullable final String value) {
        this._recipientEmailAddress = value;
    }
    /**
     * Sets the sender property value. The sender property
     * @param value Value to set for the sender property.
     * @return a void
     */
    public void setSender(@javax.annotation.Nullable final String value) {
        this._sender = value;
    }
    /**
     * Sets the senderIP property value. The senderIP property
     * @param value Value to set for the senderIP property.
     * @return a void
     */
    public void setSenderIP(@javax.annotation.Nullable final String value) {
        this._senderIP = value;
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     * @return a void
     */
    public void setSubject(@javax.annotation.Nullable final String value) {
        this._subject = value;
    }
    /**
     * Sets the tenantAllowOrBlockListAction property value. The tenantAllowOrBlockListAction property
     * @param value Value to set for the tenantAllowOrBlockListAction property.
     * @return a void
     */
    public void setTenantAllowOrBlockListAction(@javax.annotation.Nullable final TenantAllowOrBlockListAction value) {
        this._tenantAllowOrBlockListAction = value;
    }
}
