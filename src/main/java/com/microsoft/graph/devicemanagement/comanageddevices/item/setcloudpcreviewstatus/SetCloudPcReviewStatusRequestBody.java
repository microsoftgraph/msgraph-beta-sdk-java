package microsoft.graph.devicemanagement.comanageddevices.item.setcloudpcreviewstatus;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.CloudPcReviewStatus;
/** Provides operations to call the setCloudPcReviewStatus method.  */
public class SetCloudPcReviewStatusRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The reviewStatus property  */
    private CloudPcReviewStatus _reviewStatus;
    /**
     * Instantiates a new setCloudPcReviewStatusRequestBody and sets the default values.
     * @return a void
     */
    public SetCloudPcReviewStatusRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a setCloudPcReviewStatusRequestBody
     */
    @javax.annotation.Nonnull
    public static SetCloudPcReviewStatusRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SetCloudPcReviewStatusRequestBody();
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
        final SetCloudPcReviewStatusRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("reviewStatus", (n) -> { currentObject.setReviewStatus(n.getObjectValue(CloudPcReviewStatus::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the reviewStatus property value. The reviewStatus property
     * @return a cloudPcReviewStatus
     */
    @javax.annotation.Nullable
    public CloudPcReviewStatus getReviewStatus() {
        return this._reviewStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("reviewStatus", this.getReviewStatus());
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
     * Sets the reviewStatus property value. The reviewStatus property
     * @param value Value to set for the reviewStatus property.
     * @return a void
     */
    public void setReviewStatus(@javax.annotation.Nullable final CloudPcReviewStatus value) {
        this._reviewStatus = value;
    }
}
