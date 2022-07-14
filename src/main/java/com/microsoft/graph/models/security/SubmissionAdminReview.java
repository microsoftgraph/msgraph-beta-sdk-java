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
public class SubmissionAdminReview implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The reviewBy property */
    private String _reviewBy;
    /** The reviewDateTime property */
    private OffsetDateTime _reviewDateTime;
    /** The reviewResult property */
    private SubmissionResultCategory _reviewResult;
    /**
     * Instantiates a new submissionAdminReview and sets the default values.
     * @return a void
     */
    public SubmissionAdminReview() {
        this.setAdditionalData(new HashMap<>());
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
        return new HashMap<>(3) {{
            this.put("reviewBy", (n) -> { currentObject.setReviewBy(n.getStringValue()); });
            this.put("reviewDateTime", (n) -> { currentObject.setReviewDateTime(n.getOffsetDateTimeValue()); });
            this.put("reviewResult", (n) -> { currentObject.setReviewResult(n.getEnumValue(SubmissionResultCategory.class)); });
        }};
    }
    /**
     * Gets the reviewBy property value. The reviewBy property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReviewBy() {
        return this._reviewBy;
    }
    /**
     * Gets the reviewDateTime property value. The reviewDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReviewDateTime() {
        return this._reviewDateTime;
    }
    /**
     * Gets the reviewResult property value. The reviewResult property
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
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
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
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the reviewBy property value. The reviewBy property
     * @param value Value to set for the reviewBy property.
     * @return a void
     */
    public void setReviewBy(@javax.annotation.Nullable final String value) {
        this._reviewBy = value;
    }
    /**
     * Sets the reviewDateTime property value. The reviewDateTime property
     * @param value Value to set for the reviewDateTime property.
     * @return a void
     */
    public void setReviewDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._reviewDateTime = value;
    }
    /**
     * Sets the reviewResult property value. The reviewResult property
     * @param value Value to set for the reviewResult property.
     * @return a void
     */
    public void setReviewResult(@javax.annotation.Nullable final SubmissionResultCategory value) {
        this._reviewResult = value;
    }
}
