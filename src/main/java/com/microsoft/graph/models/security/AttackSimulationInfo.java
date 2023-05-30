package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class AttackSimulationInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The date and time of the attack simulation. */
    private OffsetDateTime attackSimDateTime;
    /** The duration (in time) for the attack simulation. */
    private Period attackSimDurationTime;
    /** The activity ID for the attack simulation. */
    private UUID attackSimId;
    /** The unique identifier for the user who got the attack simulation email. */
    private String attackSimUserId;
    /** The OdataType property */
    private String odataType;
    /**
     * Instantiates a new attackSimulationInfo and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.additionalData;
    }
    /**
     * Gets the attackSimDateTime property value. The date and time of the attack simulation.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAttackSimDateTime() {
        return this.attackSimDateTime;
    }
    /**
     * Gets the attackSimDurationTime property value. The duration (in time) for the attack simulation.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getAttackSimDurationTime() {
        return this.attackSimDurationTime;
    }
    /**
     * Gets the attackSimId property value. The activity ID for the attack simulation.
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getAttackSimId() {
        return this.attackSimId;
    }
    /**
     * Gets the attackSimUserId property value. The unique identifier for the user who got the attack simulation email.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAttackSimUserId() {
        return this.attackSimUserId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("attackSimDateTime", (n) -> { this.setAttackSimDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("attackSimDurationTime", (n) -> { this.setAttackSimDurationTime(n.getPeriodValue()); });
        deserializerMap.put("attackSimId", (n) -> { this.setAttackSimId(n.getUUIDValue()); });
        deserializerMap.put("attackSimUserId", (n) -> { this.setAttackSimUserId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("attackSimDateTime", this.getAttackSimDateTime());
        writer.writePeriodValue("attackSimDurationTime", this.getAttackSimDurationTime());
        writer.writeUUIDValue("attackSimId", this.getAttackSimId());
        writer.writeStringValue("attackSimUserId", this.getAttackSimUserId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the attackSimDateTime property value. The date and time of the attack simulation.
     * @param value Value to set for the attackSimDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttackSimDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.attackSimDateTime = value;
    }
    /**
     * Sets the attackSimDurationTime property value. The duration (in time) for the attack simulation.
     * @param value Value to set for the attackSimDurationTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttackSimDurationTime(@javax.annotation.Nullable final Period value) {
        this.attackSimDurationTime = value;
    }
    /**
     * Sets the attackSimId property value. The activity ID for the attack simulation.
     * @param value Value to set for the attackSimId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttackSimId(@javax.annotation.Nullable final UUID value) {
        this.attackSimId = value;
    }
    /**
     * Sets the attackSimUserId property value. The unique identifier for the user who got the attack simulation email.
     * @param value Value to set for the attackSimUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttackSimUserId(@javax.annotation.Nullable final String value) {
        this.attackSimUserId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
