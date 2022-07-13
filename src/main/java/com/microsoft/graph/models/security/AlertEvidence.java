package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AlertEvidence implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The createdDateTime property */
    private OffsetDateTime _createdDateTime;
    /** The remediationStatus property */
    private EvidenceRemediationStatus _remediationStatus;
    /** The remediationStatusDetails property */
    private String _remediationStatusDetails;
    /** The roles property */
    private java.util.List<String> _roles;
    /** The tags property */
    private java.util.List<String> _tags;
    /** The type property */
    private String _type;
    /** The verdict property */
    private EvidenceVerdict _verdict;
    /**
     * Instantiates a new alertEvidence and sets the default values.
     * @return a void
     */
    public AlertEvidence() {
        this.setAdditionalData(new HashMap<>());
        this.setOdatatype("#microsoft.graph.security.alertEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a alertEvidence
     */
    @javax.annotation.Nonnull
    public static AlertEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.analyzedMessageEvidence": return new AnalyzedMessageEvidence();
                case "#microsoft.graph.security.cloudApplicationEvidence": return new CloudApplicationEvidence();
                case "#microsoft.graph.security.deviceEvidence": return new DeviceEvidence();
                case "#microsoft.graph.security.fileEvidence": return new FileEvidence();
                case "#microsoft.graph.security.ipEvidence": return new IpEvidence();
                case "#microsoft.graph.security.mailboxEvidence": return new MailboxEvidence();
                case "#microsoft.graph.security.mailClusterEvidence": return new MailClusterEvidence();
                case "#microsoft.graph.security.oauthApplicationEvidence": return new OauthApplicationEvidence();
                case "#microsoft.graph.security.processEvidence": return new ProcessEvidence();
                case "#microsoft.graph.security.registryKeyEvidence": return new RegistryKeyEvidence();
                case "#microsoft.graph.security.registryValueEvidence": return new RegistryValueEvidence();
                case "#microsoft.graph.security.securityGroupEvidence": return new SecurityGroupEvidence();
                case "#microsoft.graph.security.urlEvidence": return new UrlEvidence();
                case "#microsoft.graph.security.userEvidence": return new UserEvidence();
            }
        }
        return new AlertEvidence();
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
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AlertEvidence currentObject = this;
        return new HashMap<>(7) {{
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("remediationStatus", (n) -> { currentObject.setRemediationStatus(n.getEnumValue(EvidenceRemediationStatus.class)); });
            this.put("remediationStatusDetails", (n) -> { currentObject.setRemediationStatusDetails(n.getStringValue()); });
            this.put("roles", (n) -> { currentObject.setRoles(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("tags", (n) -> { currentObject.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdatatype(n.getStringValue()); });
            this.put("verdict", (n) -> { currentObject.setVerdict(n.getEnumValue(EvidenceVerdict.class)); });
        }};
    }
    /**
     * Gets the @odata.type property value. The type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdatatype() {
        return this._type;
    }
    /**
     * Gets the remediationStatus property value. The remediationStatus property
     * @return a evidenceRemediationStatus
     */
    @javax.annotation.Nullable
    public EvidenceRemediationStatus getRemediationStatus() {
        return this._remediationStatus;
    }
    /**
     * Gets the remediationStatusDetails property value. The remediationStatusDetails property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRemediationStatusDetails() {
        return this._remediationStatusDetails;
    }
    /**
     * Gets the roles property value. The roles property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoles() {
        return this._roles;
    }
    /**
     * Gets the tags property value. The tags property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTags() {
        return this._tags;
    }
    /**
     * Gets the verdict property value. The verdict property
     * @return a evidenceVerdict
     */
    @javax.annotation.Nullable
    public EvidenceVerdict getVerdict() {
        return this._verdict;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeEnumValue("remediationStatus", this.getRemediationStatus());
        writer.writeStringValue("remediationStatusDetails", this.getRemediationStatusDetails());
        writer.writeCollectionOfPrimitiveValues("roles", this.getRoles());
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
        writer.writeStringValue("@odata.type", this.getOdatatype());
        writer.writeEnumValue("verdict", this.getVerdict());
        writer.writeAdditionalData(this.getAdditionalData());
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
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setOdatatype(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
    /**
     * Sets the remediationStatus property value. The remediationStatus property
     * @param value Value to set for the remediationStatus property.
     * @return a void
     */
    public void setRemediationStatus(@javax.annotation.Nullable final EvidenceRemediationStatus value) {
        this._remediationStatus = value;
    }
    /**
     * Sets the remediationStatusDetails property value. The remediationStatusDetails property
     * @param value Value to set for the remediationStatusDetails property.
     * @return a void
     */
    public void setRemediationStatusDetails(@javax.annotation.Nullable final String value) {
        this._remediationStatusDetails = value;
    }
    /**
     * Sets the roles property value. The roles property
     * @param value Value to set for the roles property.
     * @return a void
     */
    public void setRoles(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roles = value;
    }
    /**
     * Sets the tags property value. The tags property
     * @param value Value to set for the tags property.
     * @return a void
     */
    public void setTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this._tags = value;
    }
    /**
     * Sets the verdict property value. The verdict property
     * @param value Value to set for the verdict property.
     * @return a void
     */
    public void setVerdict(@javax.annotation.Nullable final EvidenceVerdict value) {
        this._verdict = value;
    }
}
