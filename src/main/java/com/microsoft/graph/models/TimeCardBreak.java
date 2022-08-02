package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TimeCardBreak implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** ID of the timeCardBreak. */
    private String _breakId;
    /** The start event of the timeCardBreak. */
    private TimeCardEvent _end;
    /** Notes about the timeCardBreak. */
    private ItemBody _notes;
    /** The OdataType property */
    private String _odataType;
    /** The start property */
    private TimeCardEvent _start;
    /**
     * Instantiates a new timeCardBreak and sets the default values.
     * @return a void
     */
    public TimeCardBreak() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.timeCardBreak");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a timeCardBreak
     */
    @javax.annotation.Nonnull
    public static TimeCardBreak createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimeCardBreak();
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
     * Gets the breakId property value. ID of the timeCardBreak.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBreakId() {
        return this._breakId;
    }
    /**
     * Gets the end property value. The start event of the timeCardBreak.
     * @return a timeCardEvent
     */
    @javax.annotation.Nullable
    public TimeCardEvent getEnd() {
        return this._end;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TimeCardBreak currentObject = this;
        return new HashMap<>(5) {{
            this.put("breakId", (n) -> { currentObject.setBreakId(n.getStringValue()); });
            this.put("end", (n) -> { currentObject.setEnd(n.getObjectValue(TimeCardEvent::createFromDiscriminatorValue)); });
            this.put("notes", (n) -> { currentObject.setNotes(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("start", (n) -> { currentObject.setStart(n.getObjectValue(TimeCardEvent::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the notes property value. Notes about the timeCardBreak.
     * @return a itemBody
     */
    @javax.annotation.Nullable
    public ItemBody getNotes() {
        return this._notes;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the start property value. The start property
     * @return a timeCardEvent
     */
    @javax.annotation.Nullable
    public TimeCardEvent getStart() {
        return this._start;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("breakId", this.getBreakId());
        writer.writeObjectValue("end", this.getEnd());
        writer.writeObjectValue("notes", this.getNotes());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("start", this.getStart());
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
     * Sets the breakId property value. ID of the timeCardBreak.
     * @param value Value to set for the breakId property.
     * @return a void
     */
    public void setBreakId(@javax.annotation.Nullable final String value) {
        this._breakId = value;
    }
    /**
     * Sets the end property value. The start event of the timeCardBreak.
     * @param value Value to set for the end property.
     * @return a void
     */
    public void setEnd(@javax.annotation.Nullable final TimeCardEvent value) {
        this._end = value;
    }
    /**
     * Sets the notes property value. Notes about the timeCardBreak.
     * @param value Value to set for the notes property.
     * @return a void
     */
    public void setNotes(@javax.annotation.Nullable final ItemBody value) {
        this._notes = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the start property value. The start property
     * @param value Value to set for the start property.
     * @return a void
     */
    public void setStart(@javax.annotation.Nullable final TimeCardEvent value) {
        this._start = value;
    }
}
