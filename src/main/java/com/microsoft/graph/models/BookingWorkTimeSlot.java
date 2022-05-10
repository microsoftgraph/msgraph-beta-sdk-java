package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BookingWorkTimeSlot implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The time of the day when work stops. For example, 17:00:00.0000000. */
    private LocalTime _end;
    /** The time of the day when work starts. For example, 08:00:00.0000000. */
    private LocalTime _start;
    /**
     * Instantiates a new bookingWorkTimeSlot and sets the default values.
     * @return a void
     */
    public BookingWorkTimeSlot() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bookingWorkTimeSlot
     */
    @javax.annotation.Nonnull
    public static BookingWorkTimeSlot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingWorkTimeSlot();
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
     * Gets the end property value. The time of the day when work stops. For example, 17:00:00.0000000.
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getEnd() {
        return this._end;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BookingWorkTimeSlot currentObject = this;
        return new HashMap<>(2) {{
            this.put("end", (n) -> { currentObject.setEnd(n.getLocalTimeValue()); });
            this.put("start", (n) -> { currentObject.setStart(n.getLocalTimeValue()); });
        }};
    }
    /**
     * Gets the start property value. The time of the day when work starts. For example, 08:00:00.0000000.
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getStart() {
        return this._start;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLocalTimeValue("end", this.getEnd());
        writer.writeLocalTimeValue("start", this.getStart());
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
     * Sets the end property value. The time of the day when work stops. For example, 17:00:00.0000000.
     * @param value Value to set for the end property.
     * @return a void
     */
    public void setEnd(@javax.annotation.Nullable final LocalTime value) {
        this._end = value;
    }
    /**
     * Sets the start property value. The time of the day when work starts. For example, 08:00:00.0000000.
     * @param value Value to set for the start property.
     * @return a void
     */
    public void setStart(@javax.annotation.Nullable final LocalTime value) {
        this._start = value;
    }
}
