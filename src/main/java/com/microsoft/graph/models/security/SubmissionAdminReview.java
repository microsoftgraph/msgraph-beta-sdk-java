package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SubmissionAdminReview implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new SubmissionAdminReview and sets the default values.
     */
    public SubmissionAdminReview() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SubmissionAdminReview
     */
    @jakarta.annotation.Nonnull
    public static SubmissionAdminReview createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubmissionAdminReview();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("reviewBy", (n) -> { this.setReviewBy(n.getStringValue()); });
        deserializerMap.put("reviewDateTime", (n) -> { this.setReviewDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("reviewResult", (n) -> { this.setReviewResult(n.getEnumValue(SubmissionResultCategory.class)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the reviewBy property value. Specifies who reviewed the email. The identification is an email ID or other identity strings.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getReviewBy() {
        return this.backingStore.get("reviewBy");
    }
    /**
     * Gets the reviewDateTime property value. Specifies the date time when the review occurred.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReviewDateTime() {
        return this.backingStore.get("reviewDateTime");
    }
    /**
     * Gets the reviewResult property value. Specifies what the review result was. The possible values are: notJunk, spam, phishing, malware, allowedByPolicy, blockedByPolicy, spoof, unknown, noResultAvailable, and unknownFutureValue.
     * @return a SubmissionResultCategory
     */
    @jakarta.annotation.Nullable
    public SubmissionResultCategory getReviewResult() {
        return this.backingStore.get("reviewResult");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("reviewBy", this.getReviewBy());
        writer.writeOffsetDateTimeValue("reviewDateTime", this.getReviewDateTime());
        writer.writeEnumValue("reviewResult", this.getReviewResult());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the reviewBy property value. Specifies who reviewed the email. The identification is an email ID or other identity strings.
     * @param value Value to set for the reviewBy property.
     */
    public void setReviewBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("reviewBy", value);
    }
    /**
     * Sets the reviewDateTime property value. Specifies the date time when the review occurred.
     * @param value Value to set for the reviewDateTime property.
     */
    public void setReviewDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("reviewDateTime", value);
    }
    /**
     * Sets the reviewResult property value. Specifies what the review result was. The possible values are: notJunk, spam, phishing, malware, allowedByPolicy, blockedByPolicy, spoof, unknown, noResultAvailable, and unknownFutureValue.
     * @param value Value to set for the reviewResult property.
     */
    public void setReviewResult(@jakarta.annotation.Nullable final SubmissionResultCategory value) {
        this.backingStore.set("reviewResult", value);
    }
}
