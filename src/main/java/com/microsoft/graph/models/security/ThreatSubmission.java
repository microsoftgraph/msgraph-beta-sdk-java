package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ThreatSubmission extends Entity implements Parsable {
    /** Specifies the admin review property which constitutes of who reviewed the user submission, when and what was it identified as. */
    private SubmissionAdminReview adminReview;
    /** The category property */
    private SubmissionCategory category;
    /** Specifies the source of the submission. The possible values are: microsoft,  other and unkownFutureValue. */
    private SubmissionClientSource clientSource;
    /** Specifies the type of content being submitted. The possible values are: email, url, file, app and unkownFutureValue. */
    private SubmissionContentType contentType;
    /** Specifies who submitted the email as a threat. Supports $filter = createdBy/email eq 'value'. */
    private SubmissionUserIdentity createdBy;
    /** Specifies when the threat submission was created. Supports $filter = createdDateTime ge 2022-01-01T00:00:00Z and createdDateTime lt 2022-01-02T00:00:00Z. */
    private OffsetDateTime createdDateTime;
    /** Specifies the result of the analysis performed by Microsoft. */
    private SubmissionResult result;
    /** Specifies the role of the submitter. Supports $filter = source eq 'value'. The possible values are: administrator,  user and unkownFutureValue. */
    private SubmissionSource source;
    /** Indicates whether the threat submission has been analyzed by Microsoft. Supports $filter = status eq 'value'. The possible values are: notStarted, running, succeeded, failed, skipped and unkownFutureValue. */
    private LongRunningOperationStatus status;
    /** Indicates the tenant id of the submitter. Not required when created using a POST operation. It is extracted from the token of the post API call. */
    private String tenantId;
    /**
     * Instantiates a new threatSubmission and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ThreatSubmission() {
        super();
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
                case "#microsoft.graph.security.emailContentThreatSubmission": return new EmailContentThreatSubmission();
                case "#microsoft.graph.security.emailThreatSubmission": return new EmailThreatSubmission();
                case "#microsoft.graph.security.emailUrlThreatSubmission": return new EmailUrlThreatSubmission();
                case "#microsoft.graph.security.fileContentThreatSubmission": return new FileContentThreatSubmission();
                case "#microsoft.graph.security.fileThreatSubmission": return new FileThreatSubmission();
                case "#microsoft.graph.security.fileUrlThreatSubmission": return new FileUrlThreatSubmission();
                case "#microsoft.graph.security.urlThreatSubmission": return new UrlThreatSubmission();
            }
        }
        return new ThreatSubmission();
    }
    /**
     * Gets the adminReview property value. Specifies the admin review property which constitutes of who reviewed the user submission, when and what was it identified as.
     * @return a submissionAdminReview
     */
    @javax.annotation.Nullable
    public SubmissionAdminReview getAdminReview() {
        return this.adminReview;
    }
    /**
     * Gets the category property value. The category property
     * @return a SubmissionCategory
     */
    @javax.annotation.Nullable
    public SubmissionCategory getCategory() {
        return this.category;
    }
    /**
     * Gets the clientSource property value. Specifies the source of the submission. The possible values are: microsoft,  other and unkownFutureValue.
     * @return a submissionClientSource
     */
    @javax.annotation.Nullable
    public SubmissionClientSource getClientSource() {
        return this.clientSource;
    }
    /**
     * Gets the contentType property value. Specifies the type of content being submitted. The possible values are: email, url, file, app and unkownFutureValue.
     * @return a submissionContentType
     */
    @javax.annotation.Nullable
    public SubmissionContentType getContentType() {
        return this.contentType;
    }
    /**
     * Gets the createdBy property value. Specifies who submitted the email as a threat. Supports $filter = createdBy/email eq 'value'.
     * @return a submissionUserIdentity
     */
    @javax.annotation.Nullable
    public SubmissionUserIdentity getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. Specifies when the threat submission was created. Supports $filter = createdDateTime ge 2022-01-01T00:00:00Z and createdDateTime lt 2022-01-02T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("adminReview", (n) -> { this.setAdminReview(n.getObjectValue(SubmissionAdminReview::createFromDiscriminatorValue)); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(SubmissionCategory.class)); });
        deserializerMap.put("clientSource", (n) -> { this.setClientSource(n.getEnumValue(SubmissionClientSource.class)); });
        deserializerMap.put("contentType", (n) -> { this.setContentType(n.getEnumValue(SubmissionContentType.class)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(SubmissionUserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("result", (n) -> { this.setResult(n.getObjectValue(SubmissionResult::createFromDiscriminatorValue)); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getEnumValue(SubmissionSource.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(LongRunningOperationStatus.class)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the result property value. Specifies the result of the analysis performed by Microsoft.
     * @return a submissionResult
     */
    @javax.annotation.Nullable
    public SubmissionResult getResult() {
        return this.result;
    }
    /**
     * Gets the source property value. Specifies the role of the submitter. Supports $filter = source eq 'value'. The possible values are: administrator,  user and unkownFutureValue.
     * @return a submissionSource
     */
    @javax.annotation.Nullable
    public SubmissionSource getSource() {
        return this.source;
    }
    /**
     * Gets the status property value. Indicates whether the threat submission has been analyzed by Microsoft. Supports $filter = status eq 'value'. The possible values are: notStarted, running, succeeded, failed, skipped and unkownFutureValue.
     * @return a longRunningOperationStatus
     */
    @javax.annotation.Nullable
    public LongRunningOperationStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the tenantId property value. Indicates the tenant id of the submitter. Not required when created using a POST operation. It is extracted from the token of the post API call.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
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
     * Sets the adminReview property value. Specifies the admin review property which constitutes of who reviewed the user submission, when and what was it identified as.
     * @param value Value to set for the adminReview property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdminReview(@javax.annotation.Nullable final SubmissionAdminReview value) {
        this.adminReview = value;
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategory(@javax.annotation.Nullable final SubmissionCategory value) {
        this.category = value;
    }
    /**
     * Sets the clientSource property value. Specifies the source of the submission. The possible values are: microsoft,  other and unkownFutureValue.
     * @param value Value to set for the clientSource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClientSource(@javax.annotation.Nullable final SubmissionClientSource value) {
        this.clientSource = value;
    }
    /**
     * Sets the contentType property value. Specifies the type of content being submitted. The possible values are: email, url, file, app and unkownFutureValue.
     * @param value Value to set for the contentType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentType(@javax.annotation.Nullable final SubmissionContentType value) {
        this.contentType = value;
    }
    /**
     * Sets the createdBy property value. Specifies who submitted the email as a threat. Supports $filter = createdBy/email eq 'value'.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final SubmissionUserIdentity value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. Specifies when the threat submission was created. Supports $filter = createdDateTime ge 2022-01-01T00:00:00Z and createdDateTime lt 2022-01-02T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the result property value. Specifies the result of the analysis performed by Microsoft.
     * @param value Value to set for the result property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResult(@javax.annotation.Nullable final SubmissionResult value) {
        this.result = value;
    }
    /**
     * Sets the source property value. Specifies the role of the submitter. Supports $filter = source eq 'value'. The possible values are: administrator,  user and unkownFutureValue.
     * @param value Value to set for the source property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSource(@javax.annotation.Nullable final SubmissionSource value) {
        this.source = value;
    }
    /**
     * Sets the status property value. Indicates whether the threat submission has been analyzed by Microsoft. Supports $filter = status eq 'value'. The possible values are: notStarted, running, succeeded, failed, skipped and unkownFutureValue.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final LongRunningOperationStatus value) {
        this.status = value;
    }
    /**
     * Sets the tenantId property value. Indicates the tenant id of the submitter. Not required when created using a POST operation. It is extracted from the token of the post API call.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this.tenantId = value;
    }
}
