package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcLaunchInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The unique identifier of the Cloud PC. */
    private String _cloudPcId;
    /** The connect URL of the Cloud PC. */
    private String _cloudPcLaunchUrl;
    /**
     * Instantiates a new CloudPcLaunchInfo and sets the default values.
     * @return a void
     */
    public CloudPcLaunchInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcLaunchInfo
     */
    @javax.annotation.Nonnull
    public static CloudPcLaunchInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcLaunchInfo();
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
     * Gets the cloudPcId property value. The unique identifier of the Cloud PC.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudPcId() {
        return this._cloudPcId;
    }
    /**
     * Gets the cloudPcLaunchUrl property value. The connect URL of the Cloud PC.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudPcLaunchUrl() {
        return this._cloudPcLaunchUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPcLaunchInfo currentObject = this;
        return new HashMap<>(2) {{
            this.put("cloudPcId", (n) -> { currentObject.setCloudPcId(n.getStringValue()); });
            this.put("cloudPcLaunchUrl", (n) -> { currentObject.setCloudPcLaunchUrl(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cloudPcId", this.getCloudPcId());
        writer.writeStringValue("cloudPcLaunchUrl", this.getCloudPcLaunchUrl());
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
     * Sets the cloudPcId property value. The unique identifier of the Cloud PC.
     * @param value Value to set for the cloudPcId property.
     * @return a void
     */
    public void setCloudPcId(@javax.annotation.Nullable final String value) {
        this._cloudPcId = value;
    }
    /**
     * Sets the cloudPcLaunchUrl property value. The connect URL of the Cloud PC.
     * @param value Value to set for the cloudPcLaunchUrl property.
     * @return a void
     */
    public void setCloudPcLaunchUrl(@javax.annotation.Nullable final String value) {
        this._cloudPcLaunchUrl = value;
    }
}
