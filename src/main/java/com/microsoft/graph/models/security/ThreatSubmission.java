package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class ThreatSubmission extends Entity implements Parsable {
    /** The adminReview property */
    private SubmissionAdminReview _adminReview;
    /** The category property */
    private SubmissionCategory _category;
    /** The clientSource property */
    private SubmissionClientSource _clientSource;
    /** The contentType property */
    private SubmissionContentType _contentType;
    /** The createdBy property */
    private SubmissionUserIdentity _createdBy;
    /** The createdDateTime property */
    private OffsetDateTime _createdDateTime;
    /** The result property */
    private SubmissionResult _result;
    /** The source property */
    private SubmissionSource _source;
    /** The status property */
    private LongRunningOperationStatus _status;
    /** The tenantId property */
    private String _tenantId;
    /**
     * Instantiates a new threatSubmission and sets the default values.
     * @return a void
     */
    public ThreatSubmission() {
        super();
        this.setType("#microsoft.graph.security.threatSubmission");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a threatSubmission
     */
    @javax.annotation.Nonnull
    public static ThreatSubmission createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.emailThreatSubmission": return new EmailThreatSubmission();
                case "#microsoft.graph.security.fileThreatSubmission": return new FileThreatSubmission();
                case "#microsoft.graph.security.urlThreatSubmission": return new UrlThreatSubmission();
            }
        }
        return new ThreatSubmission();
    }
    /**
     * Gets the adminReview property value. The adminReview property
     * @return a submissionAdminReview
     */
    @javax.annotation.Nullable
    public SubmissionAdminReview getAdminReview() {
        return this._adminReview;
    }
    /**
     * Gets the category property value. The category property
     * @return a submissionCategory
     */
    @javax.annotation.Nullable
    public SubmissionCategory getCategory() {
        return this._category;
    }
    /**
     * Gets the clientSource property value. The clientSource property
     * @return a submissionClientSource
     */
    @javax.annotation.Nullable
    public SubmissionClientSource getClientSource() {
        return this._clientSource;
    }
    /**
     * Gets the contentType property value. The contentType property
     * @return a submissionContentType
     */
    @javax.annotation.Nullable
    public SubmissionContentType getContentType() {
        return this._contentType;
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a submissionUserIdentity
     */
    @javax.annotation.Nullable
    public SubmissionUserIdentity getCreatedBy() {
        return this._createdBy;
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
        final ThreatSubmission currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("adminReview", (n) -> { currentObject.setAdminReview(n.getObjectValue(SubmissionAdminReview::createFromDiscriminatorValue)); });
            this.put("category", (n) -> { currentObject.setCategory(n.getEnumValue(SubmissionCategory.class)); });
            this.put("clientSource", (n) -> { currentObject.setClientSource(n.getEnumValue(SubmissionClientSource.class)); });
            this.put("contentType", (n) -> { currentObject.setContentType(n.getEnumValue(SubmissionContentType.class)); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(SubmissionUserIdentity::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("result", (n) -> { currentObject.setResult(n.getObjectValue(SubmissionResult::createFromDiscriminatorValue)); });
            this.put("source", (n) -> { currentObject.setSource(n.getEnumValue(SubmissionSource.class)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(LongRunningOperationStatus.class)); });
            this.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the result property value. The result property
     * @return a submissionResult
     */
    @javax.annotation.Nullable
    public SubmissionResult getResult() {
        return this._result;
    }
    /**
     * Gets the source property value. The source property
     * @return a submissionSource
     */
    @javax.annotation.Nullable
    public SubmissionSource getSource() {
        return this._source;
    }
    /**
     * Gets the status property value. The status property
     * @return a longRunningOperationStatus
     */
    @javax.annotation.Nullable
    public LongRunningOperationStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("adminReview", this.getAdminReview());
        writer.writeEnumValue("category", this.getCategory());
        writer.writeEnumValue("clientSource", this.getClientSource());
        writer.writeEnumValue("contentType", this.getContentType());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("result", this.getResult());
        writer.writeEnumValue("source", this.getSource());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("tenantId", this.getTenantId());
    }
    /**
     * Sets the adminReview property value. The adminReview property
     * @param value Value to set for the adminReview property.
     * @return a void
     */
    public void setAdminReview(@javax.annotation.Nullable final SubmissionAdminReview value) {
        this._adminReview = value;
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     * @return a void
     */
    public void setCategory(@javax.annotation.Nullable final SubmissionCategory value) {
        this._category = value;
    }
    /**
     * Sets the clientSource property value. The clientSource property
     * @param value Value to set for the clientSource property.
     * @return a void
     */
    public void setClientSource(@javax.annotation.Nullable final SubmissionClientSource value) {
        this._clientSource = value;
    }
    /**
     * Sets the contentType property value. The contentType property
     * @param value Value to set for the contentType property.
     * @return a void
     */
    public void setContentType(@javax.annotation.Nullable final SubmissionContentType value) {
        this._contentType = value;
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final SubmissionUserIdentity value) {
        this._createdBy = value;
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
     * Sets the result property value. The result property
     * @param value Value to set for the result property.
     * @return a void
     */
    public void setResult(@javax.annotation.Nullable final SubmissionResult value) {
        this._result = value;
    }
    /**
     * Sets the source property value. The source property
     * @param value Value to set for the source property.
     * @return a void
     */
    public void setSource(@javax.annotation.Nullable final SubmissionSource value) {
        this._source = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final LongRunningOperationStatus value) {
        this._status = value;
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
}
