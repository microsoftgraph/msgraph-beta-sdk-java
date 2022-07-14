package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AttackSimulationInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The attackSimDateTime property */
    private OffsetDateTime _attackSimDateTime;
    /** The attackSimDurationTime property */
    private Period _attackSimDurationTime;
    /** The attackSimId property */
    private String _attackSimId;
    /** The attackSimUserId property */
    private String _attackSimUserId;
    /**
     * Instantiates a new attackSimulationInfo and sets the default values.
     * @return a void
     */
    public AttackSimulationInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a attackSimulationInfo
     */
    @javax.annotation.Nonnull
    public static AttackSimulationInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttackSimulationInfo();
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
     * Gets the attackSimDateTime property value. The attackSimDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAttackSimDateTime() {
        return this._attackSimDateTime;
    }
    /**
     * Gets the attackSimDurationTime property value. The attackSimDurationTime property
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getAttackSimDurationTime() {
        return this._attackSimDurationTime;
    }
    /**
     * Gets the attackSimId property value. The attackSimId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAttackSimId() {
        return this._attackSimId;
    }
    /**
     * Gets the attackSimUserId property value. The attackSimUserId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAttackSimUserId() {
        return this._attackSimUserId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AttackSimulationInfo currentObject = this;
        return new HashMap<>(4) {{
            this.put("attackSimDateTime", (n) -> { currentObject.setAttackSimDateTime(n.getOffsetDateTimeValue()); });
            this.put("attackSimDurationTime", (n) -> { currentObject.setAttackSimDurationTime(n.getPeriodValue()); });
            this.put("attackSimId", (n) -> { currentObject.setAttackSimId(n.getStringValue()); });
            this.put("attackSimUserId", (n) -> { currentObject.setAttackSimUserId(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("attackSimDateTime", this.getAttackSimDateTime());
        writer.writePeriodValue("attackSimDurationTime", this.getAttackSimDurationTime());
        writer.writeStringValue("attackSimId", this.getAttackSimId());
        writer.writeStringValue("attackSimUserId", this.getAttackSimUserId());
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
     * Sets the attackSimDateTime property value. The attackSimDateTime property
     * @param value Value to set for the attackSimDateTime property.
     * @return a void
     */
    public void setAttackSimDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._attackSimDateTime = value;
    }
    /**
     * Sets the attackSimDurationTime property value. The attackSimDurationTime property
     * @param value Value to set for the attackSimDurationTime property.
     * @return a void
     */
    public void setAttackSimDurationTime(@javax.annotation.Nullable final Period value) {
        this._attackSimDurationTime = value;
    }
    /**
     * Sets the attackSimId property value. The attackSimId property
     * @param value Value to set for the attackSimId property.
     * @return a void
     */
    public void setAttackSimId(@javax.annotation.Nullable final String value) {
        this._attackSimId = value;
    }
    /**
     * Sets the attackSimUserId property value. The attackSimUserId property
     * @param value Value to set for the attackSimUserId property.
     * @return a void
     */
    public void setAttackSimUserId(@javax.annotation.Nullable final String value) {
        this._attackSimUserId = value;
    }
}
