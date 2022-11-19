package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SubmissionAdminReview implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** Specifies who reviewed the email. The identification is an email ID or other identity strings. */
    private String _reviewBy;
    /** Specifies the date time when the review occurred. */
    private OffsetDateTime _reviewDateTime;
    /** Specifies what the review result was. The possible values are: notJunk, spam, phishing, malware, allowedByPolicy, blockedByPolicy, spoof, unknown, noResultAvailable, and unknownFutureValue. */
    private SubmissionResultCategory _reviewResult;
    /**
     * Instantiates a new submissionAdminReview and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SubmissionAdminReview() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.security.submissionAdminReview");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a submissionAdminReview
     */
    @javax.annotation.Nonnull
    public static SubmissionAdminReview createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubmissionAdminReview();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SubmissionAdminReview currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("reviewBy", (n) -> { currentObject.setReviewBy(n.getStringValue()); });
        deserializerMap.put("reviewDateTime", (n) -> { currentObject.setReviewDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("reviewResult", (n) -> { currentObject.setReviewResult(n.getEnumValue(SubmissionResultCategory.class)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the reviewBy property value. Specifies who reviewed the email. The identification is an email ID or other identity strings.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReviewBy() {
        return this._reviewBy;
    }
    /**
     * Gets the reviewDateTime property value. Specifies the date time when the review occurred.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReviewDateTime() {
        return this._reviewDateTime;
    }
    /**
     * Gets the reviewResult property value. Specifies what the review result was. The possible values are: notJunk, spam, phishing, malware, allowedByPolicy, blockedByPolicy, spoof, unknown, noResultAvailable, and unknownFutureValue.
     * @return a submissionResultCategory
     */
    @javax.annotation.Nullable
    public SubmissionResultCategory getReviewResult() {
        return this._reviewResult;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("reviewBy", this.getReviewBy());
        writer.writeOffsetDateTimeValue("reviewDateTime", this.getReviewDateTime());
        writer.writeEnumValue("reviewResult", this.getReviewResult());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the reviewBy property value. Specifies who reviewed the email. The identification is an email ID or other identity strings.
     * @param value Value to set for the reviewBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReviewBy(@javax.annotation.Nullable final String value) {
        this._reviewBy = value;
    }
    /**
     * Sets the reviewDateTime property value. Specifies the date time when the review occurred.
     * @param value Value to set for the reviewDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReviewDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._reviewDateTime = value;
    }
    /**
     * Sets the reviewResult property value. Specifies what the review result was. The possible values are: notJunk, spam, phishing, malware, allowedByPolicy, blockedByPolicy, spoof, unknown, noResultAvailable, and unknownFutureValue.
     * @param value Value to set for the reviewResult property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReviewResult(@javax.annotation.Nullable final SubmissionResultCategory value) {
        this._reviewResult = value;
    }
}
