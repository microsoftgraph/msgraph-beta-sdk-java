package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** A complex type to represent the result of bulk driver action.  */
public class BulkDriverActionResult implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** List of driver Ids where the action is failed.  */
    private java.util.List<String> _failedDriverIds;
    /** List of driver Ids that are not found.  */
    private java.util.List<String> _notFoundDriverIds;
    /** List of driver Ids where the action is successful.  */
    private java.util.List<String> _successfulDriverIds;
    /**
     * Instantiates a new bulkDriverActionResult and sets the default values.
     * @return a void
     */
    public BulkDriverActionResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bulkDriverActionResult
     */
    @javax.annotation.Nonnull
    public static BulkDriverActionResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BulkDriverActionResult();
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
     * Gets the failedDriverIds property value. List of driver Ids where the action is failed.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getFailedDriverIds() {
        return this._failedDriverIds;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BulkDriverActionResult currentObject = this;
        return new HashMap<>(3) {{
            this.put("failedDriverIds", (n) -> { currentObject.setFailedDriverIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("notFoundDriverIds", (n) -> { currentObject.setNotFoundDriverIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("successfulDriverIds", (n) -> { currentObject.setSuccessfulDriverIds(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the notFoundDriverIds property value. List of driver Ids that are not found.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getNotFoundDriverIds() {
        return this._notFoundDriverIds;
    }
    /**
     * Gets the successfulDriverIds property value. List of driver Ids where the action is successful.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSuccessfulDriverIds() {
        return this._successfulDriverIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("failedDriverIds", this.getFailedDriverIds());
        writer.writeCollectionOfPrimitiveValues("notFoundDriverIds", this.getNotFoundDriverIds());
        writer.writeCollectionOfPrimitiveValues("successfulDriverIds", this.getSuccessfulDriverIds());
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
     * Sets the failedDriverIds property value. List of driver Ids where the action is failed.
     * @param value Value to set for the failedDriverIds property.
     * @return a void
     */
    public void setFailedDriverIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._failedDriverIds = value;
    }
    /**
     * Sets the notFoundDriverIds property value. List of driver Ids that are not found.
     * @param value Value to set for the notFoundDriverIds property.
     * @return a void
     */
    public void setNotFoundDriverIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._notFoundDriverIds = value;
    }
    /**
     * Sets the successfulDriverIds property value. List of driver Ids where the action is successful.
     * @param value Value to set for the successfulDriverIds property.
     * @return a void
     */
    public void setSuccessfulDriverIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._successfulDriverIds = value;
    }
}
