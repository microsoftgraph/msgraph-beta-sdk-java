package com.microsoft.graph.models.security;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AttackSimulationInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The date and time of the attack simulation.
     */
    private OffsetDateTime attackSimDateTime;
    /**
     * The duration (in time) for the attack simulation.
     */
    private PeriodAndDuration attackSimDurationTime;
    /**
     * The activity ID for the attack simulation.
     */
    private UUID attackSimId;
    /**
     * The unique identifier for the user who got the attack simulation email.
     */
    private String attackSimUserId;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new AttackSimulationInfo and sets the default values.
     */
    public AttackSimulationInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AttackSimulationInfo
     */
    @jakarta.annotation.Nonnull
    public static AttackSimulationInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttackSimulationInfo();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the attackSimDateTime property value. The date and time of the attack simulation.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAttackSimDateTime() {
        return this.attackSimDateTime;
    }
    /**
     * Gets the attackSimDurationTime property value. The duration (in time) for the attack simulation.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getAttackSimDurationTime() {
        return this.attackSimDurationTime;
    }
    /**
     * Gets the attackSimId property value. The activity ID for the attack simulation.
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getAttackSimId() {
        return this.attackSimId;
    }
    /**
     * Gets the attackSimUserId property value. The unique identifier for the user who got the attack simulation email.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAttackSimUserId() {
        return this.attackSimUserId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("attackSimDateTime", (n) -> { this.setAttackSimDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("attackSimDurationTime", (n) -> { this.setAttackSimDurationTime(n.getPeriodAndDurationValue()); });
        deserializerMap.put("attackSimId", (n) -> { this.setAttackSimId(n.getUUIDValue()); });
        deserializerMap.put("attackSimUserId", (n) -> { this.setAttackSimUserId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("attackSimDateTime", this.getAttackSimDateTime());
        writer.writePeriodAndDurationValue("attackSimDurationTime", this.getAttackSimDurationTime());
        writer.writeUUIDValue("attackSimId", this.getAttackSimId());
        writer.writeStringValue("attackSimUserId", this.getAttackSimUserId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the attackSimDateTime property value. The date and time of the attack simulation.
     * @param value Value to set for the attackSimDateTime property.
     */
    public void setAttackSimDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.attackSimDateTime = value;
    }
    /**
     * Sets the attackSimDurationTime property value. The duration (in time) for the attack simulation.
     * @param value Value to set for the attackSimDurationTime property.
     */
    public void setAttackSimDurationTime(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.attackSimDurationTime = PeriodAndDuration.ofPeriodAndDuration(value);
    }
    /**
     * Sets the attackSimId property value. The activity ID for the attack simulation.
     * @param value Value to set for the attackSimId property.
     */
    public void setAttackSimId(@jakarta.annotation.Nullable final UUID value) {
        this.attackSimId = value;
    }
    /**
     * Sets the attackSimUserId property value. The unique identifier for the user who got the attack simulation email.
     * @param value Value to set for the attackSimUserId property.
     */
    public void setAttackSimUserId(@jakarta.annotation.Nullable final String value) {
        this.attackSimUserId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
