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
public class ItemActivityTimeSet implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The lastRecordedDateTime property  */
    private OffsetDateTime _lastRecordedDateTime;
    /** When the activity was observed to take place.  */
    private OffsetDateTime _observedDateTime;
    /** When the observation was recorded on the service.  */
    private OffsetDateTime _recordedDateTime;
    /**
     * Instantiates a new itemActivityTimeSet and sets the default values.
     * @return a void
     */
    public ItemActivityTimeSet() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a itemActivityTimeSet
     */
    @javax.annotation.Nonnull
    public static ItemActivityTimeSet createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemActivityTimeSet();
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
        final ItemActivityTimeSet currentObject = this;
        return new HashMap<>(3) {{
            this.put("lastRecordedDateTime", (n) -> { currentObject.setLastRecordedDateTime(n.getOffsetDateTimeValue()); });
            this.put("observedDateTime", (n) -> { currentObject.setObservedDateTime(n.getOffsetDateTimeValue()); });
            this.put("recordedDateTime", (n) -> { currentObject.setRecordedDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the lastRecordedDateTime property value. The lastRecordedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastRecordedDateTime() {
        return this._lastRecordedDateTime;
    }
    /**
     * Gets the observedDateTime property value. When the activity was observed to take place.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getObservedDateTime() {
        return this._observedDateTime;
    }
    /**
     * Gets the recordedDateTime property value. When the observation was recorded on the service.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRecordedDateTime() {
        return this._recordedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("lastRecordedDateTime", this.getLastRecordedDateTime());
        writer.writeOffsetDateTimeValue("observedDateTime", this.getObservedDateTime());
        writer.writeOffsetDateTimeValue("recordedDateTime", this.getRecordedDateTime());
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
     * Sets the lastRecordedDateTime property value. The lastRecordedDateTime property
     * @param value Value to set for the lastRecordedDateTime property.
     * @return a void
     */
    public void setLastRecordedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastRecordedDateTime = value;
    }
    /**
     * Sets the observedDateTime property value. When the activity was observed to take place.
     * @param value Value to set for the observedDateTime property.
     * @return a void
     */
    public void setObservedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._observedDateTime = value;
    }
    /**
     * Sets the recordedDateTime property value. When the observation was recorded on the service.
     * @param value Value to set for the recordedDateTime property.
     * @return a void
     */
    public void setRecordedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._recordedDateTime = value;
    }
}
