package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** A class containing the result of HasPayloadLinks action.  */
public class HasPayloadLinkResultItem implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Exception information indicates if check for this item was successful or not.Empty string for no error.  */
    private String _error;
    /** Indicate whether a payload has any link or not.  */
    private Boolean _hasLink;
    /** Key of the Payload, In the format of Guid.  */
    private String _payloadId;
    /** The reason where the link comes from.  */
    private java.util.List<DeviceAndAppManagementAssignmentSource> _sources;
    /**
     * Instantiates a new hasPayloadLinkResultItem and sets the default values.
     * @return a void
     */
    public HasPayloadLinkResultItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a hasPayloadLinkResultItem
     */
    @javax.annotation.Nonnull
    public static HasPayloadLinkResultItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HasPayloadLinkResultItem();
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
     * Gets the error property value. Exception information indicates if check for this item was successful or not.Empty string for no error.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getError() {
        return this._error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HasPayloadLinkResultItem currentObject = this;
        return new HashMap<>(4) {{
            this.put("error", (n) -> { currentObject.setError(n.getStringValue()); });
            this.put("hasLink", (n) -> { currentObject.setHasLink(n.getBooleanValue()); });
            this.put("payloadId", (n) -> { currentObject.setPayloadId(n.getStringValue()); });
            this.put("sources", (n) -> { currentObject.setSources(n.getCollectionOfEnumValues(DeviceAndAppManagementAssignmentSource.class)); });
        }};
    }
    /**
     * Gets the hasLink property value. Indicate whether a payload has any link or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasLink() {
        return this._hasLink;
    }
    /**
     * Gets the payloadId property value. Key of the Payload, In the format of Guid.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPayloadId() {
        return this._payloadId;
    }
    /**
     * Gets the sources property value. The reason where the link comes from.
     * @return a deviceAndAppManagementAssignmentSource
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceAndAppManagementAssignmentSource> getSources() {
        return this._sources;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("error", this.getError());
        writer.writeBooleanValue("hasLink", this.getHasLink());
        writer.writeStringValue("payloadId", this.getPayloadId());
        writer.writeCollectionOfEnumValues("sources", this.getSources());
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
     * Sets the error property value. Exception information indicates if check for this item was successful or not.Empty string for no error.
     * @param value Value to set for the error property.
     * @return a void
     */
    public void setError(@javax.annotation.Nullable final String value) {
        this._error = value;
    }
    /**
     * Sets the hasLink property value. Indicate whether a payload has any link or not.
     * @param value Value to set for the hasLink property.
     * @return a void
     */
    public void setHasLink(@javax.annotation.Nullable final Boolean value) {
        this._hasLink = value;
    }
    /**
     * Sets the payloadId property value. Key of the Payload, In the format of Guid.
     * @param value Value to set for the payloadId property.
     * @return a void
     */
    public void setPayloadId(@javax.annotation.Nullable final String value) {
        this._payloadId = value;
    }
    /**
     * Sets the sources property value. The reason where the link comes from.
     * @param value Value to set for the sources property.
     * @return a void
     */
    public void setSources(@javax.annotation.Nullable final java.util.List<DeviceAndAppManagementAssignmentSource> value) {
        this._sources = value;
    }
}
