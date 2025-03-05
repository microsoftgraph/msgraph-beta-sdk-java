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
public class ThreatSubmission extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ThreatSubmission} and sets the default values.
     */
    public ThreatSubmission() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ThreatSubmission}
     */
    @jakarta.annotation.Nonnull
    public static ThreatSubmission createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
     * Gets the adminReview property value. Specifies the admin review property that constitutes of who reviewed the user submission, when and what was it identified as.
     * @return a {@link SubmissionAdminReview}
     */
    @jakarta.annotation.Nullable
    public SubmissionAdminReview getAdminReview() {
        return this.backingStore.get("adminReview");
    }
    /**
     * Gets the category property value. The category property
     * @return a {@link SubmissionCategory}
     */
    @jakarta.annotation.Nullable
    public SubmissionCategory getCategory() {
        return this.backingStore.get("category");
    }
    /**
     * Gets the clientSource property value. Specifies the source of the submission. The possible values are: microsoft, other, and unkownFutureValue.
     * @return a {@link SubmissionClientSource}
     */
    @jakarta.annotation.Nullable
    public SubmissionClientSource getClientSource() {
        return this.backingStore.get("clientSource");
    }
    /**
     * Gets the contentType property value. Specifies the type of content being submitted. The possible values are: email, url, file, app, and unkownFutureValue.
     * @return a {@link SubmissionContentType}
     */
    @jakarta.annotation.Nullable
    public SubmissionContentType getContentType() {
        return this.backingStore.get("contentType");
    }
    /**
     * Gets the createdBy property value. Specifies who submitted the email as a threat. Supports $filter = createdBy/email eq &apos;value&apos;.
     * @return a {@link SubmissionUserIdentity}
     */
    @jakarta.annotation.Nullable
    public SubmissionUserIdentity getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. Specifies when the threat submission was created. Supports $filter = createdDateTime ge 2022-01-01T00:00:00Z and createdDateTime lt 2022-01-02T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("adminReview", (n) -> { this.setAdminReview(n.getObjectValue(SubmissionAdminReview::createFromDiscriminatorValue)); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(SubmissionCategory::forValue)); });
        deserializerMap.put("clientSource", (n) -> { this.setClientSource(n.getEnumValue(SubmissionClientSource::forValue)); });
        deserializerMap.put("contentType", (n) -> { this.setContentType(n.getEnumValue(SubmissionContentType::forValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(SubmissionUserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("result", (n) -> { this.setResult(n.getObjectValue(SubmissionResult::createFromDiscriminatorValue)); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getEnumValue(SubmissionSource::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(LongRunningOperationStatus::forValue)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the result property value. Specifies the result of the analysis performed by Microsoft.
     * @return a {@link SubmissionResult}
     */
    @jakarta.annotation.Nullable
    public SubmissionResult getResult() {
        return this.backingStore.get("result");
    }
    /**
     * Gets the source property value. Specifies the role of the submitter. Supports $filter = source eq &apos;value&apos;. The possible values are: administrator,  user, and unkownFutureValue.
     * @return a {@link SubmissionSource}
     */
    @jakarta.annotation.Nullable
    public SubmissionSource getSource() {
        return this.backingStore.get("source");
    }
    /**
     * Gets the status property value. Indicates whether the threat submission has been analyzed by Microsoft. Supports $filter = status eq &apos;value&apos;. The possible values are: notStarted, running, succeeded, failed, skipped, and unkownFutureValue.
     * @return a {@link LongRunningOperationStatus}
     */
    @jakarta.annotation.Nullable
    public LongRunningOperationStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the tenantId property value. Indicates the tenant id of the submitter. Not required when created using a POST operation. It&apos;s extracted from the token of the post API call.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.backingStore.get("tenantId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the adminReview property value. Specifies the admin review property that constitutes of who reviewed the user submission, when and what was it identified as.
     * @param value Value to set for the adminReview property.
     */
    public void setAdminReview(@jakarta.annotation.Nullable final SubmissionAdminReview value) {
        this.backingStore.set("adminReview", value);
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final SubmissionCategory value) {
        this.backingStore.set("category", value);
    }
    /**
     * Sets the clientSource property value. Specifies the source of the submission. The possible values are: microsoft, other, and unkownFutureValue.
     * @param value Value to set for the clientSource property.
     */
    public void setClientSource(@jakarta.annotation.Nullable final SubmissionClientSource value) {
        this.backingStore.set("clientSource", value);
    }
    /**
     * Sets the contentType property value. Specifies the type of content being submitted. The possible values are: email, url, file, app, and unkownFutureValue.
     * @param value Value to set for the contentType property.
     */
    public void setContentType(@jakarta.annotation.Nullable final SubmissionContentType value) {
        this.backingStore.set("contentType", value);
    }
    /**
     * Sets the createdBy property value. Specifies who submitted the email as a threat. Supports $filter = createdBy/email eq &apos;value&apos;.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final SubmissionUserIdentity value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. Specifies when the threat submission was created. Supports $filter = createdDateTime ge 2022-01-01T00:00:00Z and createdDateTime lt 2022-01-02T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the result property value. Specifies the result of the analysis performed by Microsoft.
     * @param value Value to set for the result property.
     */
    public void setResult(@jakarta.annotation.Nullable final SubmissionResult value) {
        this.backingStore.set("result", value);
    }
    /**
     * Sets the source property value. Specifies the role of the submitter. Supports $filter = source eq &apos;value&apos;. The possible values are: administrator,  user, and unkownFutureValue.
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final SubmissionSource value) {
        this.backingStore.set("source", value);
    }
    /**
     * Sets the status property value. Indicates whether the threat submission has been analyzed by Microsoft. Supports $filter = status eq &apos;value&apos;. The possible values are: notStarted, running, succeeded, failed, skipped, and unkownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final LongRunningOperationStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the tenantId property value. Indicates the tenant id of the submitter. Not required when created using a POST operation. It&apos;s extracted from the token of the post API call.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
}
