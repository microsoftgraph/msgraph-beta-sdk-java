package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BulkManagedDeviceActionResult implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Failed devices */
    private java.util.List<String> _failedDeviceIds;
    /** Not found devices */
    private java.util.List<String> _notFoundDeviceIds;
    /** Not supported devices */
    private java.util.List<String> _notSupportedDeviceIds;
    /** Successful devices */
    private java.util.List<String> _successfulDeviceIds;
    /**
     * Instantiates a new BulkManagedDeviceActionResult and sets the default values.
     * @return a void
     */
    public BulkManagedDeviceActionResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BulkManagedDeviceActionResult
     */
    @javax.annotation.Nonnull
    public static BulkManagedDeviceActionResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BulkManagedDeviceActionResult();
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
     * Gets the failedDeviceIds property value. Failed devices
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getFailedDeviceIds() {
        return this._failedDeviceIds;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BulkManagedDeviceActionResult currentObject = this;
        return new HashMap<>(4) {{
            this.put("failedDeviceIds", (n) -> { currentObject.setFailedDeviceIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("notFoundDeviceIds", (n) -> { currentObject.setNotFoundDeviceIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("notSupportedDeviceIds", (n) -> { currentObject.setNotSupportedDeviceIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("successfulDeviceIds", (n) -> { currentObject.setSuccessfulDeviceIds(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the notFoundDeviceIds property value. Not found devices
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getNotFoundDeviceIds() {
        return this._notFoundDeviceIds;
    }
    /**
     * Gets the notSupportedDeviceIds property value. Not supported devices
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getNotSupportedDeviceIds() {
        return this._notSupportedDeviceIds;
    }
    /**
     * Gets the successfulDeviceIds property value. Successful devices
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSuccessfulDeviceIds() {
        return this._successfulDeviceIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("failedDeviceIds", this.getFailedDeviceIds());
        writer.writeCollectionOfPrimitiveValues("notFoundDeviceIds", this.getNotFoundDeviceIds());
        writer.writeCollectionOfPrimitiveValues("notSupportedDeviceIds", this.getNotSupportedDeviceIds());
        writer.writeCollectionOfPrimitiveValues("successfulDeviceIds", this.getSuccessfulDeviceIds());
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
     * Sets the failedDeviceIds property value. Failed devices
     * @param value Value to set for the failedDeviceIds property.
     * @return a void
     */
    public void setFailedDeviceIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._failedDeviceIds = value;
    }
    /**
     * Sets the notFoundDeviceIds property value. Not found devices
     * @param value Value to set for the notFoundDeviceIds property.
     * @return a void
     */
    public void setNotFoundDeviceIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._notFoundDeviceIds = value;
    }
    /**
     * Sets the notSupportedDeviceIds property value. Not supported devices
     * @param value Value to set for the notSupportedDeviceIds property.
     * @return a void
     */
    public void setNotSupportedDeviceIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._notSupportedDeviceIds = value;
    }
    /**
     * Sets the successfulDeviceIds property value. Successful devices
     * @param value Value to set for the successfulDeviceIds property.
     * @return a void
     */
    public void setSuccessfulDeviceIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._successfulDeviceIds = value;
    }
}
