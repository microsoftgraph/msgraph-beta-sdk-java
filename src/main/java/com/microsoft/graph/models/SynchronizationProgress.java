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
public class SynchronizationProgress implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The numerator of a progress ratio; the number of units of changes already processed. */
    private Long _completedUnits;
    /** The OdataType property */
    private String _odataType;
    /** The time of a progress observation as an offset in minutes from UTC. */
    private OffsetDateTime _progressObservationDateTime;
    /** The denominator of a progress ratio; a number of units of changes to be processed to accomplish synchronization. */
    private Long _totalUnits;
    /** An optional description of the units. */
    private String _units;
    /**
     * Instantiates a new synchronizationProgress and sets the default values.
     * @return a void
     */
    public SynchronizationProgress() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.synchronizationProgress");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationProgress
     */
    @javax.annotation.Nonnull
    public static SynchronizationProgress createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationProgress();
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
     * Gets the completedUnits property value. The numerator of a progress ratio; the number of units of changes already processed.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCompletedUnits() {
        return this._completedUnits;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SynchronizationProgress currentObject = this;
        return new HashMap<>(5) {{
            this.put("completedUnits", (n) -> { currentObject.setCompletedUnits(n.getLongValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("progressObservationDateTime", (n) -> { currentObject.setProgressObservationDateTime(n.getOffsetDateTimeValue()); });
            this.put("totalUnits", (n) -> { currentObject.setTotalUnits(n.getLongValue()); });
            this.put("units", (n) -> { currentObject.setUnits(n.getStringValue()); });
        }};
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
     * Gets the progressObservationDateTime property value. The time of a progress observation as an offset in minutes from UTC.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getProgressObservationDateTime() {
        return this._progressObservationDateTime;
    }
    /**
     * Gets the totalUnits property value. The denominator of a progress ratio; a number of units of changes to be processed to accomplish synchronization.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getTotalUnits() {
        return this._totalUnits;
    }
    /**
     * Gets the units property value. An optional description of the units.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUnits() {
        return this._units;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("completedUnits", this.getCompletedUnits());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("progressObservationDateTime", this.getProgressObservationDateTime());
        writer.writeLongValue("totalUnits", this.getTotalUnits());
        writer.writeStringValue("units", this.getUnits());
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
     * Sets the completedUnits property value. The numerator of a progress ratio; the number of units of changes already processed.
     * @param value Value to set for the completedUnits property.
     * @return a void
     */
    public void setCompletedUnits(@javax.annotation.Nullable final Long value) {
        this._completedUnits = value;
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
     * Sets the progressObservationDateTime property value. The time of a progress observation as an offset in minutes from UTC.
     * @param value Value to set for the progressObservationDateTime property.
     * @return a void
     */
    public void setProgressObservationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._progressObservationDateTime = value;
    }
    /**
     * Sets the totalUnits property value. The denominator of a progress ratio; a number of units of changes to be processed to accomplish synchronization.
     * @param value Value to set for the totalUnits property.
     * @return a void
     */
    public void setTotalUnits(@javax.annotation.Nullable final Long value) {
        this._totalUnits = value;
    }
    /**
     * Sets the units property value. An optional description of the units.
     * @param value Value to set for the units property.
     * @return a void
     */
    public void setUnits(@javax.annotation.Nullable final String value) {
        this._units = value;
    }
}
