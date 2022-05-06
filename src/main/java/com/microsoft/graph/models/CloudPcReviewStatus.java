package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcReviewStatus implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The azureStorageAccountId property  */
    private String _azureStorageAccountId;
    /** The azureStorageAccountName property  */
    private String _azureStorageAccountName;
    /** The inReview property  */
    private Boolean _inReview;
    /** The restorePointDateTime property  */
    private OffsetDateTime _restorePointDateTime;
    /** The reviewStartDateTime property  */
    private OffsetDateTime _reviewStartDateTime;
    /** The subscriptionId property  */
    private String _subscriptionId;
    /** The subscriptionName property  */
    private String _subscriptionName;
    /** The userAccessLevel property  */
    private CloudPcUserAccessLevel _userAccessLevel;
    /**
     * Instantiates a new cloudPcReviewStatus and sets the default values.
     * @return a void
     */
    public CloudPcReviewStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcReviewStatus
     */
    @javax.annotation.Nonnull
    public static CloudPcReviewStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcReviewStatus();
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
     * Gets the azureStorageAccountId property value. The azureStorageAccountId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureStorageAccountId() {
        return this._azureStorageAccountId;
    }
    /**
     * Gets the azureStorageAccountName property value. The azureStorageAccountName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureStorageAccountName() {
        return this._azureStorageAccountName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPcReviewStatus currentObject = this;
        return new HashMap<>(8) {{
            this.put("azureStorageAccountId", (n) -> { currentObject.setAzureStorageAccountId(n.getStringValue()); });
            this.put("azureStorageAccountName", (n) -> { currentObject.setAzureStorageAccountName(n.getStringValue()); });
            this.put("inReview", (n) -> { currentObject.setInReview(n.getBooleanValue()); });
            this.put("restorePointDateTime", (n) -> { currentObject.setRestorePointDateTime(n.getOffsetDateTimeValue()); });
            this.put("reviewStartDateTime", (n) -> { currentObject.setReviewStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("subscriptionId", (n) -> { currentObject.setSubscriptionId(n.getStringValue()); });
            this.put("subscriptionName", (n) -> { currentObject.setSubscriptionName(n.getStringValue()); });
            this.put("userAccessLevel", (n) -> { currentObject.setUserAccessLevel(n.getEnumValue(CloudPcUserAccessLevel.class)); });
        }};
    }
    /**
     * Gets the inReview property value. The inReview property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getInReview() {
        return this._inReview;
    }
    /**
     * Gets the restorePointDateTime property value. The restorePointDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRestorePointDateTime() {
        return this._restorePointDateTime;
    }
    /**
     * Gets the reviewStartDateTime property value. The reviewStartDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReviewStartDateTime() {
        return this._reviewStartDateTime;
    }
    /**
     * Gets the subscriptionId property value. The subscriptionId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubscriptionId() {
        return this._subscriptionId;
    }
    /**
     * Gets the subscriptionName property value. The subscriptionName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubscriptionName() {
        return this._subscriptionName;
    }
    /**
     * Gets the userAccessLevel property value. The userAccessLevel property
     * @return a cloudPcUserAccessLevel
     */
    @javax.annotation.Nullable
    public CloudPcUserAccessLevel getUserAccessLevel() {
        return this._userAccessLevel;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("azureStorageAccountId", this.getAzureStorageAccountId());
        writer.writeStringValue("azureStorageAccountName", this.getAzureStorageAccountName());
        writer.writeBooleanValue("inReview", this.getInReview());
        writer.writeOffsetDateTimeValue("restorePointDateTime", this.getRestorePointDateTime());
        writer.writeOffsetDateTimeValue("reviewStartDateTime", this.getReviewStartDateTime());
        writer.writeStringValue("subscriptionId", this.getSubscriptionId());
        writer.writeStringValue("subscriptionName", this.getSubscriptionName());
        writer.writeEnumValue("userAccessLevel", this.getUserAccessLevel());
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
     * Sets the azureStorageAccountId property value. The azureStorageAccountId property
     * @param value Value to set for the azureStorageAccountId property.
     * @return a void
     */
    public void setAzureStorageAccountId(@javax.annotation.Nullable final String value) {
        this._azureStorageAccountId = value;
    }
    /**
     * Sets the azureStorageAccountName property value. The azureStorageAccountName property
     * @param value Value to set for the azureStorageAccountName property.
     * @return a void
     */
    public void setAzureStorageAccountName(@javax.annotation.Nullable final String value) {
        this._azureStorageAccountName = value;
    }
    /**
     * Sets the inReview property value. The inReview property
     * @param value Value to set for the inReview property.
     * @return a void
     */
    public void setInReview(@javax.annotation.Nullable final Boolean value) {
        this._inReview = value;
    }
    /**
     * Sets the restorePointDateTime property value. The restorePointDateTime property
     * @param value Value to set for the restorePointDateTime property.
     * @return a void
     */
    public void setRestorePointDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._restorePointDateTime = value;
    }
    /**
     * Sets the reviewStartDateTime property value. The reviewStartDateTime property
     * @param value Value to set for the reviewStartDateTime property.
     * @return a void
     */
    public void setReviewStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._reviewStartDateTime = value;
    }
    /**
     * Sets the subscriptionId property value. The subscriptionId property
     * @param value Value to set for the subscriptionId property.
     * @return a void
     */
    public void setSubscriptionId(@javax.annotation.Nullable final String value) {
        this._subscriptionId = value;
    }
    /**
     * Sets the subscriptionName property value. The subscriptionName property
     * @param value Value to set for the subscriptionName property.
     * @return a void
     */
    public void setSubscriptionName(@javax.annotation.Nullable final String value) {
        this._subscriptionName = value;
    }
    /**
     * Sets the userAccessLevel property value. The userAccessLevel property
     * @param value Value to set for the userAccessLevel property.
     * @return a void
     */
    public void setUserAccessLevel(@javax.annotation.Nullable final CloudPcUserAccessLevel value) {
        this._userAccessLevel = value;
    }
}
